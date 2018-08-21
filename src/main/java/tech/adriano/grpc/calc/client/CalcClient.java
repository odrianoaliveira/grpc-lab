package tech.adriano.grpc.calc.client;

import com.proto.calc.CalcServiceGrpc;
import com.proto.calc.ComputeAverageRequest;
import com.proto.calc.ComputeAverageResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by adriano on 21/08/18.
 *
 * @author Adriano Oliveira
 */

public class CalcClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC Calc client");

        ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50051")
                .usePlaintext()
                .build();

        CountDownLatch latch = new CountDownLatch(1);

        CalcServiceGrpc.CalcServiceStub client  =CalcServiceGrpc.newStub(channel);
        StreamObserver<ComputeAverageRequest> requestObserver = client.average(new StreamObserver<ComputeAverageResponse>() {
            @Override
            public void onNext(ComputeAverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println(value.getAverage());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed the average calculation");
                latch.countDown();
            }
        });

        for (int i = 1; i <= 100; i++){
            requestObserver.onNext(ComputeAverageRequest.newBuilder()
                    .setNumber(i)
                    .build());
        }

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        channel.shutdown();
    }
}
