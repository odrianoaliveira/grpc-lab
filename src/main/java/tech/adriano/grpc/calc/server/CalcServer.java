package tech.adriano.grpc.calc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Created by adriano on 21/08/18.
 *
 * @author Adriano Oliveira
 */


public class CalcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Calc gRPC Server");
        Server server = ServerBuilder.forPort(50051)
                .addService(new CalcServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime()
                .addShutdownHook(new Thread(() -> {
                    System.out.println("Received shutdown request");
                    server.shutdown();
                    System.out.println("Successfully stop the server");
                }));

        System.out.println("Awaiting connections...");
        server.awaitTermination();
    }
}
