// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * (-- api-linter: core::0135::request-unknown-fields=disabled
 *     aip.dev/not-precedent: We really need "vport_id" because is used as key
 *     for the retrieve operation. --)
 * GetBridgePortRequest structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest}
 */
public final class GetBridgePortRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)
    GetBridgePortRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBridgePortRequest.newBuilder() to construct.
  private GetBridgePortRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBridgePortRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBridgePortRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBridgePortRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            vportId_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_GetBridgePortRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_GetBridgePortRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.class, opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.Builder.class);
  }

  public static final int VPORT_ID_FIELD_NUMBER = 1;
  private int vportId_;
  /**
   * <pre>
   * The vport id of the bridge port to retrieve
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vport_id cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 vport_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vportId.
   */
  @java.lang.Override
  public int getVportId() {
    return vportId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (vportId_ != 0) {
      output.writeUInt32(1, vportId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vportId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, vportId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest other = (opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest) obj;

    if (getVportId()
        != other.getVportId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VPORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVportId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * (-- api-linter: core::0135::request-unknown-fields=disabled
   *     aip.dev/not-precedent: We really need "vport_id" because is used as key
   *     for the retrieve operation. --)
   * GetBridgePortRequest structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)
      opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_GetBridgePortRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_GetBridgePortRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.class, opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      vportId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_GetBridgePortRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest build() {
      opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest result = new opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest(this);
      result.vportId_ = vportId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest.getDefaultInstance()) return this;
      if (other.getVportId() != 0) {
        setVportId(other.getVportId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int vportId_ ;
    /**
     * <pre>
     * The vport id of the bridge port to retrieve
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vport_id cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vport_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The vportId.
     */
    @java.lang.Override
    public int getVportId() {
      return vportId_;
    }
    /**
     * <pre>
     * The vport id of the bridge port to retrieve
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vport_id cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vport_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The vportId to set.
     * @return This builder for chaining.
     */
    public Builder setVportId(int value) {
      
      vportId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vport id of the bridge port to retrieve
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vport_id cannot be negative number. --)
     * </pre>
     *
     * <code>uint32 vport_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVportId() {
      
      vportId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest)
  private static final opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest();
  }

  public static opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBridgePortRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetBridgePortRequest>() {
    @java.lang.Override
    public GetBridgePortRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBridgePortRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBridgePortRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBridgePortRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.GetBridgePortRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
