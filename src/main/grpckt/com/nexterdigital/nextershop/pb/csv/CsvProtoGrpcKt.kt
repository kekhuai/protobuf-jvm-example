package com.nexterdigital.nextershop.pb.csv

import com.nexterdigital.nextershop.pb.csv.CsvServiceGrpc.getServiceDescriptor
import com.nexterdigital.nextershop.pb.uploadedfile.UploadedFile
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for csv.v1.CsvService.
 */
object CsvServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = CsvServiceGrpc.getServiceDescriptor()

  val generateMethod: MethodDescriptor<Request, UploadedFile>
    @JvmStatic
    get() = CsvServiceGrpc.getGenerateMethod()

  /**
   * A stub for issuing RPCs to a(n) csv.v1.CsvService service as suspending coroutines.
   */
  @StubFor(CsvServiceGrpc::class)
  class CsvServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<CsvServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CsvServiceCoroutineStub =
        CsvServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun generate(request: Request): UploadedFile = unaryRpc(
      channel,
      CsvServiceGrpc.getGenerateMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the csv.v1.CsvService service based on Kotlin coroutines.
   */
  abstract class CsvServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for csv.v1.CsvService.generate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun generate(request: Request): UploadedFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method csv.v1.CsvService.generate is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CsvServiceGrpc.getGenerateMethod(),
      implementation = ::generate
    )).build()
  }
}
