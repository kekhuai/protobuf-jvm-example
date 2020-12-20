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

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> create(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.CreateRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::create, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> readBy(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::readBy, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> readOne(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::readOne, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> create(com.nexterdigital.nextershop.pb.uploadedfile.CreateRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::create, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> readBy(com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::readBy, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> readOne(com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::readOne, getCallOptions());
        }

    }

    public static abstract class UploadedFileServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> create(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.CreateRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.Response> readBy(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> readOne(reactor.core.publisher.Mono<com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getCreateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.nexterdigital.nextershop.pb.uploadedfile.CreateRequest,
                                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>(
                                            this, METHODID_CREATE)))
                    .addMethod(
                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getReadByMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest,
                                            com.nexterdigital.nextershop.pb.uploadedfile.Response>(
                                            this, METHODID_READ_BY)))
                    .addMethod(
                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getReadOneMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest,
                                            com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>(
                                            this, METHODID_READ_ONE)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_CREATE = 0;
    public static final int METHODID_READ_BY = 1;
    public static final int METHODID_READ_ONE = 2;

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
                case METHODID_CREATE:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.nexterdigital.nextershop.pb.uploadedfile.CreateRequest) request,
                            (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>) responseObserver,
                            serviceImpl::create);
                    break;
                case METHODID_READ_BY:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest) request,
                            (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.Response>) responseObserver,
                            serviceImpl::readBy);
                    break;
                case METHODID_READ_ONE:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.nexterdigital.nextershop.pb.uploadedfile.QueryRequest) request,
                            (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>) responseObserver,
                            serviceImpl::readOne);
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
