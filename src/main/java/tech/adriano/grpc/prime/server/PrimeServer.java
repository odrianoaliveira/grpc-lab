package tech.adriano.grpc.prime.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Created by adriano on 10/08/18.
 *
 * @author Adriano Oliveira
 */

public class PrimeServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Prime gRPC Server");

        Server server = ServerBuilder.forPort(50051)
                .addService(new PrimeServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime()
                .addShutdownHook(new Thread(() -> {
                    System.out.println("Received Shutdown Request");
                    server.shutdown();
                    System.out.println("Successfully stop the server");
                }));

        System.out.println("Awaiting connections...");
        server.awaitTermination();
    }
}
