// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: uploaded_file.proto

package com.nexterdigital.nextershop.pb.uploadedfile;

public final class UploadedFileProto {
  private UploadedFileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uploadedfile_v1_UploadedFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uploadedfile_v1_UploadedFile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023uploaded_file.proto\022\017uploadedfile.v1\032\033" +
      "google/protobuf/empty.proto\"R\n\014UploadedF" +
      "ile\022\n\n\002id\030\001 \001(\t\022\016\n\006source\030\002 \001(\t\022\022\n\ncreat" +
      "ed_at\030\003 \001(\004\022\022\n\nupdated_at\030\004 \001(\0042V\n\023Uploa" +
      "dedFileService\022?\n\004init\022\026.google.protobuf" +
      ".Empty\032\035.uploadedfile.v1.UploadedFile\"\000B" +
      "C\n,com.nexterdigital.nextershop.pb.uploa" +
      "dedfileB\021UploadedFileProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_uploadedfile_v1_UploadedFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_uploadedfile_v1_UploadedFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uploadedfile_v1_UploadedFile_descriptor,
        new java.lang.String[] { "Id", "Source", "CreatedAt", "UpdatedAt", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
