package com.nexterdigital.nextershop.pb.csv;

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
    comments = "Source: csv.proto")
public final class CsvServiceGrpc {

  private CsvServiceGrpc() {}

  public static final String SERVICE_NAME = "csv.v1.CsvService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nexterdigital.nextershop.pb.csv.Request,
      com.google.protobuf.Empty> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generate",
      requestType = com.nexterdigital.nextershop.pb.csv.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nexterdigital.nextershop.pb.csv.Request,
      com.google.protobuf.Empty> getGenerateMethod() {
    io.grpc.MethodDescriptor<com.nexterdigital.nextershop.pb.csv.Request, com.google.protobuf.Empty> getGenerateMethod;
    if ((getGenerateMethod = CsvServiceGrpc.getGenerateMethod) == null) {
      synchronized (CsvServiceGrpc.class) {
        if ((getGenerateMethod = CsvServiceGrpc.getGenerateMethod) == null) {
          CsvServiceGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<com.nexterdigital.nextershop.pb.csv.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nexterdigital.nextershop.pb.csv.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CsvServiceMethodDescriptorSupplier("generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CsvServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CsvServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CsvServiceStub>() {
        @java.lang.Override
        public CsvServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CsvServiceStub(channel, callOptions);
        }
      };
    return CsvServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CsvServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CsvServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CsvServiceBlockingStub>() {
        @java.lang.Override
        public CsvServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CsvServiceBlockingStub(channel, callOptions);
        }
      };
    return CsvServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CsvServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CsvServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CsvServiceFutureStub>() {
        @java.lang.Override
        public CsvServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CsvServiceFutureStub(channel, callOptions);
        }
      };
    return CsvServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CsvServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generate(com.nexterdigital.nextershop.pb.csv.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nexterdigital.nextershop.pb.csv.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_GENERATE)))
          .build();
    }
  }

  /**
   */
  public static final class CsvServiceStub extends io.grpc.stub.AbstractAsyncStub<CsvServiceStub> {
    private CsvServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CsvServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CsvServiceStub(channel, callOptions);
    }

    /**
     */
    public void generate(com.nexterdigital.nextershop.pb.csv.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CsvServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CsvServiceBlockingStub> {
    private CsvServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CsvServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CsvServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty generate(com.nexterdigital.nextershop.pb.csv.Request request) {
      return blockingUnaryCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CsvServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CsvServiceFutureStub> {
    private CsvServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CsvServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CsvServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> generate(
        com.nexterdigital.nextershop.pb.csv.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE = 0;

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
          serviceImpl.generate((com.nexterdigital.nextershop.pb.csv.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class CsvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CsvServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nexterdigital.nextershop.pb.csv.CsvProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CsvService");
    }
  }

  private static final class CsvServiceFileDescriptorSupplier
      extends CsvServiceBaseDescriptorSupplier {
    CsvServiceFileDescriptorSupplier() {}
  }

  private static final class CsvServiceMethodDescriptorSupplier
      extends CsvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CsvServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CsvServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CsvServiceFileDescriptorSupplier())
              .addMethod(getGenerateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
