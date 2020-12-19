package com.nexterdigital.nextershop.pb.uploadedfile;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: uploaded_file.proto")
public final class UploadedFileServiceGrpc {

  private UploadedFileServiceGrpc() {}

  public static final String SERVICE_NAME = "uploadedfile.v1.UploadedFileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "init",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> getInitMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> getInitMethod;
    if ((getInitMethod = UploadedFileServiceGrpc.getInitMethod) == null) {
      synchronized (UploadedFileServiceGrpc.class) {
        if ((getInitMethod = UploadedFileServiceGrpc.getInitMethod) == null) {
          UploadedFileServiceGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile.getDefaultInstance()))
              .setSchemaDescriptor(new UploadedFileServiceMethodDescriptorSupplier("init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadedFileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceStub>() {
        @java.lang.Override
        public UploadedFileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadedFileServiceStub(channel, callOptions);
        }
      };
    return UploadedFileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadedFileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceBlockingStub>() {
        @java.lang.Override
        public UploadedFileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadedFileServiceBlockingStub(channel, callOptions);
        }
      };
    return UploadedFileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploadedFileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadedFileServiceFutureStub>() {
        @java.lang.Override
        public UploadedFileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadedFileServiceFutureStub(channel, callOptions);
        }
      };
    return UploadedFileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UploadedFileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void init(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> responseObserver) {
      asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>(
                  this, METHODID_INIT)))
          .build();
    }
  }

  /**
   */
  public static final class UploadedFileServiceStub extends io.grpc.stub.AbstractAsyncStub<UploadedFileServiceStub> {
    private UploadedFileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadedFileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadedFileServiceStub(channel, callOptions);
    }

    /**
     */
    public void init(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UploadedFileServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UploadedFileServiceBlockingStub> {
    private UploadedFileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadedFileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadedFileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile init(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UploadedFileServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UploadedFileServiceFutureStub> {
    private UploadedFileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploadedFileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadedFileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile> init(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;

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
          serviceImpl.init((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UploadedFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploadedFileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploadedFileService");
    }
  }

  private static final class UploadedFileServiceFileDescriptorSupplier
      extends UploadedFileServiceBaseDescriptorSupplier {
    UploadedFileServiceFileDescriptorSupplier() {}
  }

  private static final class UploadedFileServiceMethodDescriptorSupplier
      extends UploadedFileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploadedFileServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UploadedFileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploadedFileServiceFileDescriptorSupplier())
              .addMethod(getInitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
