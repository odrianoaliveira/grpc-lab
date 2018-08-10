package com.proto.greet;

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
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: prime/prime.proto")
public final class PrimeServiceGrpc {

  private PrimeServiceGrpc() {}

  public static final String SERVICE_NAME = "prime.PrimeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPrimeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.proto.greet.PrimeRequest,
      com.proto.greet.PrimeResponse> METHOD_PRIME = getPrimeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.PrimeRequest,
      com.proto.greet.PrimeResponse> getPrimeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.proto.greet.PrimeRequest,
      com.proto.greet.PrimeResponse> getPrimeMethod() {
    return getPrimeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.proto.greet.PrimeRequest,
      com.proto.greet.PrimeResponse> getPrimeMethodHelper() {
    io.grpc.MethodDescriptor<com.proto.greet.PrimeRequest, com.proto.greet.PrimeResponse> getPrimeMethod;
    if ((getPrimeMethod = PrimeServiceGrpc.getPrimeMethod) == null) {
      synchronized (PrimeServiceGrpc.class) {
        if ((getPrimeMethod = PrimeServiceGrpc.getPrimeMethod) == null) {
          PrimeServiceGrpc.getPrimeMethod = getPrimeMethod = 
              io.grpc.MethodDescriptor.<com.proto.greet.PrimeRequest, com.proto.greet.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "prime.PrimeService", "prime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.PrimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrimeServiceMethodDescriptorSupplier("prime"))
                  .build();
          }
        }
     }
     return getPrimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeServiceStub newStub(io.grpc.Channel channel) {
    return new PrimeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrimeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrimeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PrimeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void prime(com.proto.greet.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.PrimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimeMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrimeMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.PrimeRequest,
                com.proto.greet.PrimeResponse>(
                  this, METHODID_PRIME)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeServiceStub extends io.grpc.stub.AbstractStub<PrimeServiceStub> {
    private PrimeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeServiceStub(channel, callOptions);
    }

    /**
     */
    public void prime(com.proto.greet.PrimeRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.PrimeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrimeMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeServiceBlockingStub extends io.grpc.stub.AbstractStub<PrimeServiceBlockingStub> {
    private PrimeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.greet.PrimeResponse> prime(
        com.proto.greet.PrimeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrimeMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeServiceFutureStub extends io.grpc.stub.AbstractStub<PrimeServiceFutureStub> {
    private PrimeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PRIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRIME:
          serviceImpl.prime((com.proto.greet.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.PrimeResponse>) responseObserver);
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

  private static abstract class PrimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Prime.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeService");
    }
  }

  private static final class PrimeServiceFileDescriptorSupplier
      extends PrimeServiceBaseDescriptorSupplier {
    PrimeServiceFileDescriptorSupplier() {}
  }

  private static final class PrimeServiceMethodDescriptorSupplier
      extends PrimeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeServiceFileDescriptorSupplier())
              .addMethod(getPrimeMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
