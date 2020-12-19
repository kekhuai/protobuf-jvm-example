package com.nexterdigital.nextershop.pb.uploadedfile

import com.google.protobuf.Empty
import com.nexterdigital.nextershop.pb.uploadedfile.UploadedFileServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for uploadedfile.v1.UploadedFileService.
 */
object UploadedFileServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = UploadedFileServiceGrpc.getServiceDescriptor()

  val initMethod: MethodDescriptor<Empty, UploadedFile>
    @JvmStatic
    get() = UploadedFileServiceGrpc.getInitMethod()

  /**
   * A stub for issuing RPCs to a(n) uploadedfile.v1.UploadedFileService service as suspending
   * coroutines.
   */
  @StubFor(UploadedFileServiceGrpc::class)
  class UploadedFileServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<UploadedFileServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UploadedFileServiceCoroutineStub
        = UploadedFileServiceCoroutineStub(channel, callOptions)

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
    suspend fun init(request: Empty): UploadedFile = unaryRpc(
      channel,
      UploadedFileServiceGrpc.getInitMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the uploadedfile.v1.UploadedFileService service based on Kotlin
   * coroutines.
   */
  abstract class UploadedFileServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for uploadedfile.v1.UploadedFileService.init.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun init(request: Empty): UploadedFile = throw
        StatusException(UNIMPLEMENTED.withDescription("Method uploadedfile.v1.UploadedFileService.init is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UploadedFileServiceGrpc.getInitMethod(),
      implementation = ::init
    )).build()
  }
}
