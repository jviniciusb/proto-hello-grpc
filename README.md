# proto-hello-grpc

This is a simple PoC project that holds protobuf files for a gRPC service and uses [buf CLI](https://buf.build/product/cli/) and CirlceCI for linting and verifying for breaking changes in the protobuf definitions.

The current CircleCI configuration runs the verifications for every commit pushed in any branch against the current protobuf definitions in the main branch.
