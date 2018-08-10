package tech.adriano.grpc.prime.client;

import com.proto.greet.PrimeRequest;
import com.proto.greet.PrimeResponse;
import com.proto.greet.PrimeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * Created by adriano on 10/08/18.
 *
 * @author Adriano Oliveira
 */

public class PrimeClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC prime client");

        ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50051")
                .usePlaintext()
                .build();

        PrimeServiceGrpc.PrimeServiceBlockingStub primeClient = PrimeServiceGrpc.newBlockingStub(channel);

        Iterator<PrimeResponse> response = primeClient.prime(PrimeRequest.newBuilder().setNumber(120).build());

        response.forEachRemaining(primeResponse -> System.out.println(primeResponse.getResult()));

        System.out.println("shutdown");
        channel.shutdown();
    }
}
