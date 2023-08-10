// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface LogicalBridgeStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * operational state of a Logical Bridge
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LBOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for operStatus.
   */
  int getOperStatusValue();
  /**
   * <pre>
   * operational state of a Logical Bridge
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LBOperStatus oper_status = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operStatus.
   */
  opi_api.network.evpn_gw.v1alpha1.LBOperStatus getOperStatus();
}
