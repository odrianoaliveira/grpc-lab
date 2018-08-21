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

    }
}
