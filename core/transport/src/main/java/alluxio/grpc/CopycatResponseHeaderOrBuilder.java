// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/copycat.proto

package alluxio.grpc;

public interface CopycatResponseHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.copycat.CopycatResponseHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 requestId = 1;</code>
   */
  boolean hasRequestId();
  /**
   * <code>optional int64 requestId = 1;</code>
   */
  long getRequestId();

  /**
   * <code>optional bool failed = 2;</code>
   */
  boolean hasFailed();
  /**
   * <code>optional bool failed = 2;</code>
   */
  boolean getFailed();
}
