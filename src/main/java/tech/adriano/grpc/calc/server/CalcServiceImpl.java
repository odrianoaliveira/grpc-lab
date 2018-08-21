package tech.adriano.grpc.calc.server;

import com.proto.calc.CalcServiceGrpc;
import com.proto.calc.ComputeAverageRequest;
import com.proto.calc.ComputeAverageResponse;
import io.grpc.stub.StreamObserver;

/**
 * Created by adriano on 21/08/18.
 *
 * @author Adriano Oliveira
 */

public class CalcServiceImpl extends CalcServiceGrpc.CalcServiceImplBase {

    @Override
    public StreamObserver<ComputeAverageRequest> average(StreamObserver<ComputeAverageResponse> responseObserver) {
        return new StreamObserver<ComputeAverageRequest>() {
            private int count;
            private int sum;

            @Override
            public void onNext(ComputeAverageRequest value) {
                sum += value.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable t) {
                System.err.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                double avg = sum / count;
                responseObserver.onNext(ComputeAverageResponse.newBuilder().setAverage(avg).build());
                responseObserver.onCompleted();
            }
        };
    }
}
