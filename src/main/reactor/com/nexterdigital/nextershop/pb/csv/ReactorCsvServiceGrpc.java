package com.nexterdigital.nextershop.pb.csv;

import static com.nexterdigital.nextershop.pb.csv.CsvServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: csv.proto")
public final class ReactorCsvServiceGrpc {
    private ReactorCsvServiceGrpc() {}

    public static ReactorCsvServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorCsvServiceStub(channel);
    }

    public static final class ReactorCsvServiceStub extends io.grpc.stub.AbstractStub<ReactorCsvServiceStub> {
        private CsvServiceGrpc.CsvServiceStub delegateStub;

        private ReactorCsvServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = CsvServiceGrpc.newStub(channel);
        }

        private ReactorCsvServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = CsvServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorCsvServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorCsvServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> generate(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.csv.Request> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::generate, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> generate(com.nexterdigital.nextershop.pb.csv.Request reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::generate, getCallOptions());
        }

    }

    public static abstract class CsvServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> generate(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.csv.Request> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.nexterdigital.nextershop.pb.csv.CsvServiceGrpc.getGenerateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.nexterdigital.nextershop.pb.csv.Request,
                                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>(
                                            this, METHODID_GENERATE)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_GENERATE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final CsvServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(CsvServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GENERATE:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.nexterdigital.nextershop.pb.csv.Request) request,
                            (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>) responseObserver,
                            serviceImpl::generate);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
