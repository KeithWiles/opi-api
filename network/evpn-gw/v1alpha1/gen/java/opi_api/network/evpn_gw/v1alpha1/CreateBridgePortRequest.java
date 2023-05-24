// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * CreateBridgePortRequest structure
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest}
 */
public final class CreateBridgePortRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)
    CreateBridgePortRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBridgePortRequest.newBuilder() to construct.
  private CreateBridgePortRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBridgePortRequest() {
    bridgePortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBridgePortRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateBridgePortRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            bridgePortId_ = s;
            break;
          }
          case 18: {
            opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder subBuilder = null;
            if (bridgePort_ != null) {
              subBuilder = bridgePort_.toBuilder();
            }
            bridgePort_ = input.readMessage(opi_api.network.evpn_gw.v1alpha1.BridgePort.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bridgePort_);
              bridgePort_ = subBuilder.buildPartial();
            }

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
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateBridgePortRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateBridgePortRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.Builder.class);
  }

  public static final int BRIDGE_PORT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object bridgePortId_;
  /**
   * <pre>
   * The ID to use for the bridge port, which will become the final component of
   * the bridge port's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string bridge_port_id = 1;</code>
   * @return The bridgePortId.
   */
  @java.lang.Override
  public java.lang.String getBridgePortId() {
    java.lang.Object ref = bridgePortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bridgePortId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to use for the bridge port, which will become the final component of
   * the bridge port's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string bridge_port_id = 1;</code>
   * @return The bytes for bridgePortId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBridgePortIdBytes() {
    java.lang.Object ref = bridgePortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bridgePortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRIDGE_PORT_FIELD_NUMBER = 2;
  private opi_api.network.evpn_gw.v1alpha1.BridgePort bridgePort_;
  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bridgePort field is set.
   */
  @java.lang.Override
  public boolean hasBridgePort() {
    return bridgePort_ != null;
  }
  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bridgePort.
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.BridgePort getBridgePort() {
    return bridgePort_ == null ? opi_api.network.evpn_gw.v1alpha1.BridgePort.getDefaultInstance() : bridgePort_;
  }
  /**
   * <pre>
   * The bridge port to create
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder getBridgePortOrBuilder() {
    return getBridgePort();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgePortId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bridgePortId_);
    }
    if (bridgePort_ != null) {
      output.writeMessage(2, getBridgePort());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bridgePortId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bridgePortId_);
    }
    if (bridgePort_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBridgePort());
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest other = (opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest) obj;

    if (!getBridgePortId()
        .equals(other.getBridgePortId())) return false;
    if (hasBridgePort() != other.hasBridgePort()) return false;
    if (hasBridgePort()) {
      if (!getBridgePort()
          .equals(other.getBridgePort())) return false;
    }
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
    hash = (37 * hash) + BRIDGE_PORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBridgePortId().hashCode();
    if (hasBridgePort()) {
      hash = (37 * hash) + BRIDGE_PORT_FIELD_NUMBER;
      hash = (53 * hash) + getBridgePort().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest prototype) {
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
   * CreateBridgePortRequest structure
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)
      opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateBridgePortRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateBridgePortRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.class, opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.newBuilder()
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
      bridgePortId_ = "";

      if (bridgePortBuilder_ == null) {
        bridgePort_ = null;
      } else {
        bridgePort_ = null;
        bridgePortBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_CreateBridgePortRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest build() {
      opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest result = new opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest(this);
      result.bridgePortId_ = bridgePortId_;
      if (bridgePortBuilder_ == null) {
        result.bridgePort_ = bridgePort_;
      } else {
        result.bridgePort_ = bridgePortBuilder_.build();
      }
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest.getDefaultInstance()) return this;
      if (!other.getBridgePortId().isEmpty()) {
        bridgePortId_ = other.bridgePortId_;
        onChanged();
      }
      if (other.hasBridgePort()) {
        mergeBridgePort(other.getBridgePort());
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
      opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bridgePortId_ = "";
    /**
     * <pre>
     * The ID to use for the bridge port, which will become the final component of
     * the bridge port's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string bridge_port_id = 1;</code>
     * @return The bridgePortId.
     */
    public java.lang.String getBridgePortId() {
      java.lang.Object ref = bridgePortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bridgePortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the bridge port, which will become the final component of
     * the bridge port's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string bridge_port_id = 1;</code>
     * @return The bytes for bridgePortId.
     */
    public com.google.protobuf.ByteString
        getBridgePortIdBytes() {
      java.lang.Object ref = bridgePortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bridgePortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the bridge port, which will become the final component of
     * the bridge port's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string bridge_port_id = 1;</code>
     * @param value The bridgePortId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgePortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bridgePortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the bridge port, which will become the final component of
     * the bridge port's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string bridge_port_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBridgePortId() {
      
      bridgePortId_ = getDefaultInstance().getBridgePortId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the bridge port, which will become the final component of
     * the bridge port's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string bridge_port_id = 1;</code>
     * @param value The bytes for bridgePortId to set.
     * @return This builder for chaining.
     */
    public Builder setBridgePortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bridgePortId_ = value;
      onChanged();
      return this;
    }

    private opi_api.network.evpn_gw.v1alpha1.BridgePort bridgePort_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.BridgePort, opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder, opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder> bridgePortBuilder_;
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the bridgePort field is set.
     */
    public boolean hasBridgePort() {
      return bridgePortBuilder_ != null || bridgePort_ != null;
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bridgePort.
     */
    public opi_api.network.evpn_gw.v1alpha1.BridgePort getBridgePort() {
      if (bridgePortBuilder_ == null) {
        return bridgePort_ == null ? opi_api.network.evpn_gw.v1alpha1.BridgePort.getDefaultInstance() : bridgePort_;
      } else {
        return bridgePortBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBridgePort(opi_api.network.evpn_gw.v1alpha1.BridgePort value) {
      if (bridgePortBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bridgePort_ = value;
        onChanged();
      } else {
        bridgePortBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBridgePort(
        opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder builderForValue) {
      if (bridgePortBuilder_ == null) {
        bridgePort_ = builderForValue.build();
        onChanged();
      } else {
        bridgePortBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeBridgePort(opi_api.network.evpn_gw.v1alpha1.BridgePort value) {
      if (bridgePortBuilder_ == null) {
        if (bridgePort_ != null) {
          bridgePort_ =
            opi_api.network.evpn_gw.v1alpha1.BridgePort.newBuilder(bridgePort_).mergeFrom(value).buildPartial();
        } else {
          bridgePort_ = value;
        }
        onChanged();
      } else {
        bridgePortBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBridgePort() {
      if (bridgePortBuilder_ == null) {
        bridgePort_ = null;
        onChanged();
      } else {
        bridgePort_ = null;
        bridgePortBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder getBridgePortBuilder() {
      
      onChanged();
      return getBridgePortFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder getBridgePortOrBuilder() {
      if (bridgePortBuilder_ != null) {
        return bridgePortBuilder_.getMessageOrBuilder();
      } else {
        return bridgePort_ == null ?
            opi_api.network.evpn_gw.v1alpha1.BridgePort.getDefaultInstance() : bridgePort_;
      }
    }
    /**
     * <pre>
     * The bridge port to create
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.evpn_gw.v1alpha1.BridgePort, opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder, opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder> 
        getBridgePortFieldBuilder() {
      if (bridgePortBuilder_ == null) {
        bridgePortBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.evpn_gw.v1alpha1.BridgePort, opi_api.network.evpn_gw.v1alpha1.BridgePort.Builder, opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder>(
                getBridgePort(),
                getParentForChildren(),
                isClean());
        bridgePort_ = null;
      }
      return bridgePortBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest)
  private static final opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest();
  }

  public static opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBridgePortRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateBridgePortRequest>() {
    @java.lang.Override
    public CreateBridgePortRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateBridgePortRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateBridgePortRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBridgePortRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.CreateBridgePortRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

