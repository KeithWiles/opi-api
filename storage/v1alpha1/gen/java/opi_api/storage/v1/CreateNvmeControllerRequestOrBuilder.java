// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface CreateNvmeControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNvmeControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeController field is set.
   */
  boolean hasNvmeController();
  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeController.
   */
  opi_api.storage.v1.NvmeController getNvmeController();
  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeControllerOrBuilder getNvmeControllerOrBuilder();

  /**
   * <code>string nvme_controller_id = 3;</code>
   * @return The nvmeControllerId.
   */
  java.lang.String getNvmeControllerId();
  /**
   * <code>string nvme_controller_id = 3;</code>
   * @return The bytes for nvmeControllerId.
   */
  com.google.protobuf.ByteString
      getNvmeControllerIdBytes();
}
