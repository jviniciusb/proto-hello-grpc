package proto.greeter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.0)",
    comments = "Source: greeter/v1/greeter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterServiceGrpc {

  private GreeterServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.greeter.v1.GreeterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = proto.greeter.v1.Greeter.HelloRequest.class,
      responseType = proto.greeter.v1.Greeter.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterServiceGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayHelloMethod = GreeterServiceGrpc.getSayHelloMethod) == null) {
          GreeterServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayHelloToStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloToStream",
      requestType = proto.greeter.v1.Greeter.HelloRequest.class,
      responseType = proto.greeter.v1.Greeter.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayHelloToStreamMethod() {
    io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply> getSayHelloToStreamMethod;
    if ((getSayHelloToStreamMethod = GreeterServiceGrpc.getSayHelloToStreamMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayHelloToStreamMethod = GreeterServiceGrpc.getSayHelloToStreamMethod) == null) {
          GreeterServiceGrpc.getSayHelloToStreamMethod = getSayHelloToStreamMethod =
              io.grpc.MethodDescriptor.<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloToStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayHelloToStream"))
              .build();
        }
      }
    }
    return getSayHelloToStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStreamHello",
      requestType = proto.greeter.v1.Greeter.HelloRequest.class,
      responseType = proto.greeter.v1.Greeter.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloMethod() {
    io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloMethod;
    if ((getSayStreamHelloMethod = GreeterServiceGrpc.getSayStreamHelloMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayStreamHelloMethod = GreeterServiceGrpc.getSayStreamHelloMethod) == null) {
          GreeterServiceGrpc.getSayStreamHelloMethod = getSayStreamHelloMethod =
              io.grpc.MethodDescriptor.<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStreamHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayStreamHello"))
              .build();
        }
      }
    }
    return getSayStreamHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloToStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStreamHelloToStream",
      requestType = proto.greeter.v1.Greeter.HelloRequest.class,
      responseType = proto.greeter.v1.Greeter.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest,
      proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloToStreamMethod() {
    io.grpc.MethodDescriptor<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply> getSayStreamHelloToStreamMethod;
    if ((getSayStreamHelloToStreamMethod = GreeterServiceGrpc.getSayStreamHelloToStreamMethod) == null) {
      synchronized (GreeterServiceGrpc.class) {
        if ((getSayStreamHelloToStreamMethod = GreeterServiceGrpc.getSayStreamHelloToStreamMethod) == null) {
          GreeterServiceGrpc.getSayStreamHelloToStreamMethod = getSayStreamHelloToStreamMethod =
              io.grpc.MethodDescriptor.<proto.greeter.v1.Greeter.HelloRequest, proto.greeter.v1.Greeter.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStreamHelloToStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.greeter.v1.Greeter.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterServiceMethodDescriptorSupplier("SayStreamHelloToStream"))
              .build();
        }
      }
    }
    return getSayStreamHelloToStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceStub>() {
        @java.lang.Override
        public GreeterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceStub(channel, callOptions);
        }
      };
    return GreeterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceBlockingStub>() {
        @java.lang.Override
        public GreeterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceBlockingStub(channel, callOptions);
        }
      };
    return GreeterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterServiceFutureStub>() {
        @java.lang.Override
        public GreeterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterServiceFutureStub(channel, callOptions);
        }
      };
    return GreeterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreeterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(proto.greeter.v1.Greeter.HelloRequest request,
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloRequest> sayHelloToStream(
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloToStreamMethod(), responseObserver);
    }

    /**
     */
    public void sayStreamHello(proto.greeter.v1.Greeter.HelloRequest request,
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayStreamHelloMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloRequest> sayStreamHelloToStream(
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayStreamHelloToStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.greeter.v1.Greeter.HelloRequest,
                proto.greeter.v1.Greeter.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloToStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                proto.greeter.v1.Greeter.HelloRequest,
                proto.greeter.v1.Greeter.HelloReply>(
                  this, METHODID_SAY_HELLO_TO_STREAM)))
          .addMethod(
            getSayStreamHelloMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                proto.greeter.v1.Greeter.HelloRequest,
                proto.greeter.v1.Greeter.HelloReply>(
                  this, METHODID_SAY_STREAM_HELLO)))
          .addMethod(
            getSayStreamHelloToStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                proto.greeter.v1.Greeter.HelloRequest,
                proto.greeter.v1.Greeter.HelloReply>(
                  this, METHODID_SAY_STREAM_HELLO_TO_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class GreeterServiceStub extends io.grpc.stub.AbstractAsyncStub<GreeterServiceStub> {
    private GreeterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(proto.greeter.v1.Greeter.HelloRequest request,
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloRequest> sayHelloToStream(
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayHelloToStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sayStreamHello(proto.greeter.v1.Greeter.HelloRequest request,
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayStreamHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloRequest> sayStreamHelloToStream(
        io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayStreamHelloToStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreeterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterServiceBlockingStub> {
    private GreeterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.greeter.v1.Greeter.HelloReply sayHello(proto.greeter.v1.Greeter.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<proto.greeter.v1.Greeter.HelloReply> sayStreamHello(
        proto.greeter.v1.Greeter.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayStreamHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreeterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterServiceFutureStub> {
    private GreeterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.greeter.v1.Greeter.HelloReply> sayHello(
        proto.greeter.v1.Greeter.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_STREAM_HELLO = 1;
  private static final int METHODID_SAY_HELLO_TO_STREAM = 2;
  private static final int METHODID_SAY_STREAM_HELLO_TO_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((proto.greeter.v1.Greeter.HelloRequest) request,
              (io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_STREAM_HELLO:
          serviceImpl.sayStreamHello((proto.greeter.v1.Greeter.HelloRequest) request,
              (io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply>) responseObserver);
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
        case METHODID_SAY_HELLO_TO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloToStream(
              (io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply>) responseObserver);
        case METHODID_SAY_STREAM_HELLO_TO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayStreamHelloToStream(
              (io.grpc.stub.StreamObserver<proto.greeter.v1.Greeter.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.greeter.v1.Greeter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreeterService");
    }
  }

  private static final class GreeterServiceFileDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier {
    GreeterServiceFileDescriptorSupplier() {}
  }

  private static final class GreeterServiceMethodDescriptorSupplier
      extends GreeterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloToStreamMethod())
              .addMethod(getSayStreamHelloMethod())
              .addMethod(getSayStreamHelloToStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
