// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeNamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeNamespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 2;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 2;</code>
   * @return The spec.
   */
  opi_api.storage.v1.NvmeNamespaceSpec getSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 2;</code>
   */
  opi_api.storage.v1.NvmeNamespaceSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 3;</code>
   * @return The status.
   */
  opi_api.storage.v1.NvmeNamespaceStatus getStatus();
  /**
   * <pre>
   * status holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 3;</code>
   */
  opi_api.storage.v1.NvmeNamespaceStatusOrBuilder getStatusOrBuilder();
}
