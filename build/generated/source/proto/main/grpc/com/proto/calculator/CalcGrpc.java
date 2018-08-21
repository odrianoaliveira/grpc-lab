package com.proto.calculator;

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
public final class CalcGrpc {

  private CalcGrpc() {}

  public static final String SERVICE_NAME = "calculator.Calc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAverageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> METHOD_AVERAGE = getAverageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getAverageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getAverageMethod() {
    return getAverageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest,
      com.proto.calculator.ComputeAverageResponse> getAverageMethodHelper() {
    io.grpc.MethodDescriptor<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse> getAverageMethod;
    if ((getAverageMethod = CalcGrpc.getAverageMethod) == null) {
      synchronized (CalcGrpc.class) {
        if ((getAverageMethod = CalcGrpc.getAverageMethod) == null) {
          CalcGrpc.getAverageMethod = getAverageMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.ComputeAverageRequest, com.proto.calculator.ComputeAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calculator.Calc", "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ComputeAverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalcMethodDescriptorSupplier("Average"))
                  .build();
          }
        }
     }
     return getAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalcStub newStub(io.grpc.Channel channel) {
    return new CalcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalcFutureStub(channel);
  }

  /**
   */
  public static abstract class CalcImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAverageMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.ComputeAverageRequest,
                com.proto.calculator.ComputeAverageResponse>(
                  this, METHODID_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class CalcStub extends io.grpc.stub.AbstractStub<CalcStub> {
    private CalcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalcBlockingStub extends io.grpc.stub.AbstractStub<CalcBlockingStub> {
    private CalcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class CalcFutureStub extends io.grpc.stub.AbstractStub<CalcFutureStub> {
    private CalcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalcFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalcImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<com.proto.calculator.ComputeAverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.CalcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calc");
    }
  }

  private static final class CalcFileDescriptorSupplier
      extends CalcBaseDescriptorSupplier {
    CalcFileDescriptorSupplier() {}
  }

  private static final class CalcMethodDescriptorSupplier
      extends CalcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalcMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalcFileDescriptorSupplier())
              .addMethod(getAverageMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
