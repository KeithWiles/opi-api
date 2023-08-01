// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface VirtioScsiLunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.VirtioScsiLun)
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
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   * @return Whether the targetId field is set.
   */
  boolean hasTargetId();
  /**
   * <pre>
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   * @return The targetId.
   */
  opi_api.common.v1.ObjectKey getTargetId();
  /**
   * <pre>
   * The target that this LUN is in
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey target_id = 2;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getTargetIdOrBuilder();

  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   * @return Whether the volumeId field is set.
   */
  boolean hasVolumeId();
  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   * @return The volumeId.
   */
  opi_api.common.v1.ObjectKey getVolumeId();
  /**
   * <pre>
   * The middle/back-end volume for this LLUN
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 3;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder();
}
