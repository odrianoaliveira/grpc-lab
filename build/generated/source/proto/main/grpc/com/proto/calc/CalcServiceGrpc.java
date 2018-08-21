package com.proto.calc;

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
    comments = "Source: calc/calc.proto")
public final class CalcServiceGrpc {

  private CalcServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAverageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.proto.calc.ComputeAverageRequest,
      com.proto.calc.ComputeAverageResponse> METHOD_AVERAGE = getAverageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.ComputeAverageRequest,
      com.proto.calc.ComputeAverageResponse> getAverageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.proto.calc.ComputeAverageRequest,
      com.proto.calc.ComputeAverageResponse> getAverageMethod() {
    return getAverageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.proto.calc.ComputeAverageRequest,
      com.proto.calc.ComputeAverageResponse> getAverageMethodHelper() {
    io.grpc.MethodDescriptor<com.proto.calc.ComputeAverageRequest, com.proto.calc.ComputeAverageResponse> getAverageMethod;
    if ((getAverageMethod = CalcServiceGrpc.getAverageMethod) == null) {
      synchronized (CalcServiceGrpc.class) {
        if ((getAverageMethod = CalcServiceGrpc.getAverageMethod) == null) {
          CalcServiceGrpc.getAverageMethod = getAverageMethod = 
              io.grpc.MethodDescriptor.<com.proto.calc.ComputeAverageRequest, com.proto.calc.ComputeAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.CalcService", "average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.ComputeAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.ComputeAverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalcServiceMethodDescriptorSupplier("average"))
                  .build();
          }
        }
     }
     return getAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalcServiceStub newStub(io.grpc.Channel channel) {
    return new CalcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.ComputeAverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calc.ComputeAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAverageMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calc.ComputeAverageRequest,
                com.proto.calc.ComputeAverageResponse>(
                  this, METHODID_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class CalcServiceStub extends io.grpc.stub.AbstractStub<CalcServiceStub> {
    private CalcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.ComputeAverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calc.ComputeAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalcServiceBlockingStub extends io.grpc.stub.AbstractStub<CalcServiceBlockingStub> {
    private CalcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class CalcServiceFutureStub extends io.grpc.stub.AbstractStub<CalcServiceFutureStub> {
    private CalcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.calc.ComputeAverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calc.Calc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalcService");
    }
  }

  private static final class CalcServiceFileDescriptorSupplier
      extends CalcServiceBaseDescriptorSupplier {
    CalcServiceFileDescriptorSupplier() {}
  }

  private static final class CalcServiceMethodDescriptorSupplier
      extends CalcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalcServiceFileDescriptorSupplier())
              .addMethod(getAverageMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
