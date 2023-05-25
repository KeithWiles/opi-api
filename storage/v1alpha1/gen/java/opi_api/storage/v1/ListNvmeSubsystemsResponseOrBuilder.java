// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface ListNvmeSubsystemsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListNvmeSubsystemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NvmeSubsystem nvme_subsystems = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NvmeSubsystem> 
      getNvmeSubsystemsList();
  /**
   * <code>repeated .opi_api.storage.v1.NvmeSubsystem nvme_subsystems = 1;</code>
   */
  opi_api.storage.v1.NvmeSubsystem getNvmeSubsystems(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NvmeSubsystem nvme_subsystems = 1;</code>
   */
  int getNvmeSubsystemsCount();
  /**
   * <code>repeated .opi_api.storage.v1.NvmeSubsystem nvme_subsystems = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NvmeSubsystemOrBuilder> 
      getNvmeSubsystemsOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NvmeSubsystem nvme_subsystems = 1;</code>
   */
  opi_api.storage.v1.NvmeSubsystemOrBuilder getNvmeSubsystemsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
