package com.nexterdigital.nextershop.pb.uploadedfile;

import static com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: uploaded_file.proto")
public final class ReactorUploadedFileServiceGrpc {
    private ReactorUploadedFileServiceGrpc() {}

    public static ReactorUploadedFileServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorUploadedFileServiceStub(channel);
    }

    public static final class ReactorUploadedFileServiceStub extends io.grpc.stub.AbstractStub<ReactorUploadedFileServiceStub> {
        private UploadedFileServiceGrpc.UploadedFileServiceStub delegateStub;

        private ReactorUploadedFileServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = UploadedFileServiceGrpc.newStub(channel);
        }

        private ReactorUploadedFileServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = UploadedFileServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorUploadedFileServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorUploadedFileServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> init(reactor.core.publisher.Mono<com.google.protobuf.Empty> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::init, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> init(com.google.protobuf.Empty reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::init, getCallOptions());
        }

    }

    public static abstract class UploadedFileServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> init(reactor.core.publisher.Mono<com.google.protobuf.Empty> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getInitMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.google.protobuf.Empty,
                                            com.nexterdigital.nextershop.pb.uploadedfile.Response>(
                                            this, METHODID_INIT)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_INIT = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final UploadedFileServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(UploadedFileServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_INIT:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.google.protobuf.Empty) request,
                            (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.Response>) responseObserver,
                            serviceImpl::init);
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
