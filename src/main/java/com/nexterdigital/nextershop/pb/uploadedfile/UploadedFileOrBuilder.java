// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: uploaded_file.proto

package com.nexterdigital.nextershop.pb.uploadedfile;

public interface UploadedFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uploadedfile.v1.UploadedFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string source = 2;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <code>string source = 2;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>uint64 created_at = 3;</code>
   * @return The createdAt.
   */
  long getCreatedAt();

  /**
   * <code>uint64 updated_at = 4;</code>
   * @return The updatedAt.
   */
  long getUpdatedAt();
}