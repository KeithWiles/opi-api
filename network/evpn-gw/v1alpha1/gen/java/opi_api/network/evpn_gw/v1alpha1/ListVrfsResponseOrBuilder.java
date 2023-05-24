// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface ListVrfsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.ListVrfsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of all the vrfs
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.Vrf vrfs = 1;</code>
   */
  java.util.List<opi_api.network.evpn_gw.v1alpha1.Vrf> 
      getVrfsList();
  /**
   * <pre>
   * List of all the vrfs
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.Vrf vrfs = 1;</code>
   */
  opi_api.network.evpn_gw.v1alpha1.Vrf getVrfs(int index);
  /**
   * <pre>
   * List of all the vrfs
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.Vrf vrfs = 1;</code>
   */
  int getVrfsCount();
  /**
   * <pre>
   * List of all the vrfs
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.Vrf vrfs = 1;</code>
   */
  java.util.List<? extends opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder> 
      getVrfsOrBuilderList();
  /**
   * <pre>
   * List of all the vrfs
   * </pre>
   *
   * <code>repeated .opi_api.network.evpn_gw.v1alpha1.Vrf vrfs = 1;</code>
   */
  opi_api.network.evpn_gw.v1alpha1.VrfOrBuilder getVrfsOrBuilder(
      int index);

  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Next page token of list response
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
