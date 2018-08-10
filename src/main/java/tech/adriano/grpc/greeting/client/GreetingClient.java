package tech.adriano.grpc.greeting.client;

import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Created by adriano on 07/08/18.
 *
 * @author Adriano Oliveira
 */

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:50051")
//                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);
//
//        Greeting greeting = Greeting.newBuilder()
//                .setFirstName("Adriano")
//                .setLastName("Oliveira")
//                .build();
//
//        GreetRequest greetRequest = GreetRequest.newBuilder()
//                .setGreeting(greeting)
//                .build();
//
//        GreetResponse response = greetClient.greet(greetRequest);
//
//        System.out.println(response.getResult());

        //Server streaming
        GreetManyTimesRequest request = GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Adriano").build())
                .build();

        greetClient.greetManyTimes(request)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });

        channel.shutdown();
    }
}
