package tech.adriano.grpc.prime.server;

import com.proto.greet.PrimeRequest;
import com.proto.greet.PrimeResponse;
import com.proto.greet.PrimeServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * Created by adriano on 10/08/18.
 *
 * @author Adriano Oliveira
 */

public class PrimeServiceImpl extends PrimeServiceGrpc.PrimeServiceImplBase {

    @Override
    public void prime(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        int num = request.getNumber();

        // PrimeNumberDecomposition
        int k = 2;
        while (num > 1) {
            if (num % k == 0) {
                responseObserver.onNext(PrimeResponse.newBuilder().setResult(String.valueOf(k)).build());
                num = num / k;
            } else {
                k = k + 1;
            }
        }

        responseObserver.onCompleted();
    }
}
