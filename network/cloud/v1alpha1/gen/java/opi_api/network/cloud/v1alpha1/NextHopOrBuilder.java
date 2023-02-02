// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nexthop.proto

package opi_api.network.cloud.v1alpha1;

public interface NextHopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.NextHop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopSpec spec = 1;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.NextHopSpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopSpec spec = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.NextHopSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopStatus status = 2;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.NextHopStatus getStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHopStatus status = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.NextHopStatusOrBuilder getStatusOrBuilder();
}