// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface ListNvmePathsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListNvmePathsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NvmePath nvme_paths = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NvmePath> 
      getNvmePathsList();
  /**
   * <code>repeated .opi_api.storage.v1.NvmePath nvme_paths = 1;</code>
   */
  opi_api.storage.v1.NvmePath getNvmePaths(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NvmePath nvme_paths = 1;</code>
   */
  int getNvmePathsCount();
  /**
   * <code>repeated .opi_api.storage.v1.NvmePath nvme_paths = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NvmePathOrBuilder> 
      getNvmePathsOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NvmePath nvme_paths = 1;</code>
   */
  opi_api.storage.v1.NvmePathOrBuilder getNvmePathsOrBuilder(
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