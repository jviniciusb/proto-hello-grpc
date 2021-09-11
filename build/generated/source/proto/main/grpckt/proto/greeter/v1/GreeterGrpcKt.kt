package proto.greeter.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ClientCalls.clientStreamingRpc
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.clientStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import proto.greeter.v1.GreeterServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for proto.greeter.v1.GreeterService.
 */
object GreeterServiceGrpcKt {
  const val SERVICE_NAME: String = GreeterServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = GreeterServiceGrpc.getServiceDescriptor()

  val sayHelloMethod: MethodDescriptor<Greeter.HelloRequest, Greeter.HelloReply>
    @JvmStatic
    get() = GreeterServiceGrpc.getSayHelloMethod()

  val sayHelloToStreamMethod: MethodDescriptor<Greeter.HelloRequest, Greeter.HelloReply>
    @JvmStatic
    get() = GreeterServiceGrpc.getSayHelloToStreamMethod()

  val sayStreamHelloMethod: MethodDescriptor<Greeter.HelloRequest, Greeter.HelloReply>
    @JvmStatic
    get() = GreeterServiceGrpc.getSayStreamHelloMethod()

  val sayStreamHelloToStreamMethod: MethodDescriptor<Greeter.HelloRequest, Greeter.HelloReply>
    @JvmStatic
    get() = GreeterServiceGrpc.getSayStreamHelloToStreamMethod()

  /**
   * A stub for issuing RPCs to a(n) proto.greeter.v1.GreeterService service as suspending
   * coroutines.
   */
  @StubFor(GreeterServiceGrpc::class)
  class GreeterServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<GreeterServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GreeterServiceCoroutineStub =
        GreeterServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun sayHello(request: Greeter.HelloRequest): Greeter.HelloReply = unaryRpc(
      channel,
      GreeterServiceGrpc.getSayHelloMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * This function collects the [Flow] of requests.  If the server terminates the RPC
     * for any reason before collection of requests is complete, the collection of requests
     * will be cancelled.  If the collection of requests completes exceptionally for any other
     * reason, the RPC will be cancelled for that reason and this method will throw that
     * exception.
     *
     * @param requests A [Flow] of request messages.
     *
     * @return The single response from the server.
     */
    suspend fun sayHelloToStream(requests: Flow<Greeter.HelloRequest>): Greeter.HelloReply =
        clientStreamingRpc(
      channel,
      GreeterServiceGrpc.getSayHelloToStreamMethod(),
      requests,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun sayStreamHello(request: Greeter.HelloRequest): Flow<Greeter.HelloReply> =
        serverStreamingRpc(
      channel,
      GreeterServiceGrpc.getSayStreamHelloMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun sayStreamHelloToStream(requests: Flow<Greeter.HelloRequest>): Flow<Greeter.HelloReply> =
        bidiStreamingRpc(
      channel,
      GreeterServiceGrpc.getSayStreamHelloToStreamMethod(),
      requests,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the proto.greeter.v1.GreeterService service based on Kotlin
   * coroutines.
   */
  abstract class GreeterServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for proto.greeter.v1.GreeterService.SayHello.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun sayHello(request: Greeter.HelloRequest): Greeter.HelloReply = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.greeter.v1.GreeterService.SayHello is unimplemented"))

    /**
     * Returns the response to an RPC for proto.greeter.v1.GreeterService.SayHelloToStream.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    open suspend fun sayHelloToStream(requests: Flow<Greeter.HelloRequest>): Greeter.HelloReply =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.greeter.v1.GreeterService.SayHelloToStream is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for proto.greeter.v1.GreeterService.SayStreamHello.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun sayStreamHello(request: Greeter.HelloRequest): Flow<Greeter.HelloReply> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.greeter.v1.GreeterService.SayStreamHello is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * proto.greeter.v1.GreeterService.SayStreamHelloToStream.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    open fun sayStreamHelloToStream(requests: Flow<Greeter.HelloRequest>): Flow<Greeter.HelloReply>
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method proto.greeter.v1.GreeterService.SayStreamHelloToStream is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GreeterServiceGrpc.getSayHelloMethod(),
      implementation = ::sayHello
    ))
      .addMethod(clientStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GreeterServiceGrpc.getSayHelloToStreamMethod(),
      implementation = ::sayHelloToStream
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GreeterServiceGrpc.getSayStreamHelloMethod(),
      implementation = ::sayStreamHello
    ))
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GreeterServiceGrpc.getSayStreamHelloToStreamMethod(),
      implementation = ::sayStreamHelloToStream
    )).build()
  }
}
