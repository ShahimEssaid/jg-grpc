package com.essaid.grpc.tims.v0;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: essaid/grpc/tims/v0/tims.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TimsGrpc {

  private TimsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "essaid.grpc.tims.v0.Tims";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.essaid.grpc.tims.v0.TimsMsg.PathRequest,
      com.essaid.grpc.tims.v0.TimsMsg.Path> getN3CPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "N3CPaths",
      requestType = com.essaid.grpc.tims.v0.TimsMsg.PathRequest.class,
      responseType = com.essaid.grpc.tims.v0.TimsMsg.Path.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.essaid.grpc.tims.v0.TimsMsg.PathRequest,
      com.essaid.grpc.tims.v0.TimsMsg.Path> getN3CPathsMethod() {
    io.grpc.MethodDescriptor<com.essaid.grpc.tims.v0.TimsMsg.PathRequest, com.essaid.grpc.tims.v0.TimsMsg.Path> getN3CPathsMethod;
    if ((getN3CPathsMethod = TimsGrpc.getN3CPathsMethod) == null) {
      synchronized (TimsGrpc.class) {
        if ((getN3CPathsMethod = TimsGrpc.getN3CPathsMethod) == null) {
          TimsGrpc.getN3CPathsMethod = getN3CPathsMethod =
              io.grpc.MethodDescriptor.<com.essaid.grpc.tims.v0.TimsMsg.PathRequest, com.essaid.grpc.tims.v0.TimsMsg.Path>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "N3CPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.essaid.grpc.tims.v0.TimsMsg.PathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.essaid.grpc.tims.v0.TimsMsg.Path.getDefaultInstance()))
              .setSchemaDescriptor(new TimsMethodDescriptorSupplier("N3CPaths"))
              .build();
        }
      }
    }
    return getN3CPathsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimsStub>() {
        @java.lang.Override
        public TimsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimsStub(channel, callOptions);
        }
      };
    return TimsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimsBlockingStub>() {
        @java.lang.Override
        public TimsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimsBlockingStub(channel, callOptions);
        }
      };
    return TimsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimsFutureStub>() {
        @java.lang.Override
        public TimsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimsFutureStub(channel, callOptions);
        }
      };
    return TimsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void n3CPaths(com.essaid.grpc.tims.v0.TimsMsg.PathRequest request,
        io.grpc.stub.StreamObserver<com.essaid.grpc.tims.v0.TimsMsg.Path> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getN3CPathsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tims.
   */
  public static abstract class TimsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TimsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tims.
   */
  public static final class TimsStub
      extends io.grpc.stub.AbstractAsyncStub<TimsStub> {
    private TimsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimsStub(channel, callOptions);
    }

    /**
     */
    public void n3CPaths(com.essaid.grpc.tims.v0.TimsMsg.PathRequest request,
        io.grpc.stub.StreamObserver<com.essaid.grpc.tims.v0.TimsMsg.Path> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getN3CPathsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tims.
   */
  public static final class TimsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TimsBlockingStub> {
    private TimsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.essaid.grpc.tims.v0.TimsMsg.Path> n3CPaths(
        com.essaid.grpc.tims.v0.TimsMsg.PathRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getN3CPathsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tims.
   */
  public static final class TimsFutureStub
      extends io.grpc.stub.AbstractFutureStub<TimsFutureStub> {
    private TimsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_N3CPATHS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_N3CPATHS:
          serviceImpl.n3CPaths((com.essaid.grpc.tims.v0.TimsMsg.PathRequest) request,
              (io.grpc.stub.StreamObserver<com.essaid.grpc.tims.v0.TimsMsg.Path>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getN3CPathsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.essaid.grpc.tims.v0.TimsMsg.PathRequest,
              com.essaid.grpc.tims.v0.TimsMsg.Path>(
                service, METHODID_N3CPATHS)))
        .build();
  }

  private static abstract class TimsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.essaid.grpc.tims.v0.TimsMsg.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tims");
    }
  }

  private static final class TimsFileDescriptorSupplier
      extends TimsBaseDescriptorSupplier {
    TimsFileDescriptorSupplier() {}
  }

  private static final class TimsMethodDescriptorSupplier
      extends TimsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TimsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TimsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimsFileDescriptorSupplier())
              .addMethod(getN3CPathsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
