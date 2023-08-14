// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List bgppeeraf response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse}
 */
public final class ListBGPPeerAfsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)
    ListBGPPeerAfsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBGPPeerAfsResponse.newBuilder() to construct.
  private ListBGPPeerAfsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBGPPeerAfsResponse() {
    bgppeeraf_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBGPPeerAfsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListBGPPeerAfsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bgppeeraf_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.BGPPeerAf>();
              mutable_bitField0_ |= 0x00000001;
            }
            bgppeeraf_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.BGPPeerAf.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        bgppeeraf_ = java.util.Collections.unmodifiableList(bgppeeraf_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListBGPPeerAfsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListBGPPeerAfsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.class, opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.Builder.class);
  }

  public static final int BGPPEERAF_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf> bgppeeraf_;
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf> getBgppeerafList() {
    return bgppeeraf_;
  }
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> 
      getBgppeerafOrBuilderList() {
    return bgppeeraf_;
  }
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  @java.lang.Override
  public int getBgppeerafCount() {
    return bgppeeraf_.size();
  }
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPPeerAf getBgppeeraf(int index) {
    return bgppeeraf_.get(index);
  }
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder getBgppeerafOrBuilder(
      int index) {
    return bgppeeraf_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < bgppeeraf_.size(); i++) {
      output.writeMessage(1, bgppeeraf_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bgppeeraf_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bgppeeraf_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse other = (opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse) obj;

    if (!getBgppeerafList()
        .equals(other.getBgppeerafList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getBgppeerafCount() > 0) {
      hash = (37 * hash) + BGPPEERAF_FIELD_NUMBER;
      hash = (53 * hash) + getBgppeerafList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse prototype) {
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
   * List bgppeeraf response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListBGPPeerAfsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListBGPPeerAfsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.class, opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.newBuilder()
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
        getBgppeerafFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bgppeerafBuilder_ == null) {
        bgppeeraf_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bgppeerafBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListBGPPeerAfsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse build() {
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse result = new opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse(this);
      int from_bitField0_ = bitField0_;
      if (bgppeerafBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bgppeeraf_ = java.util.Collections.unmodifiableList(bgppeeraf_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bgppeeraf_ = bgppeeraf_;
      } else {
        result.bgppeeraf_ = bgppeerafBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.getDefaultInstance()) return this;
      if (bgppeerafBuilder_ == null) {
        if (!other.bgppeeraf_.isEmpty()) {
          if (bgppeeraf_.isEmpty()) {
            bgppeeraf_ = other.bgppeeraf_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBgppeerafIsMutable();
            bgppeeraf_.addAll(other.bgppeeraf_);
          }
          onChanged();
        }
      } else {
        if (!other.bgppeeraf_.isEmpty()) {
          if (bgppeerafBuilder_.isEmpty()) {
            bgppeerafBuilder_.dispose();
            bgppeerafBuilder_ = null;
            bgppeeraf_ = other.bgppeeraf_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bgppeerafBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBgppeerafFieldBuilder() : null;
          } else {
            bgppeerafBuilder_.addAllMessages(other.bgppeeraf_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf> bgppeeraf_ =
      java.util.Collections.emptyList();
    private void ensureBgppeerafIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bgppeeraf_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.BGPPeerAf>(bgppeeraf_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> bgppeerafBuilder_;

    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf> getBgppeerafList() {
      if (bgppeerafBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bgppeeraf_);
      } else {
        return bgppeerafBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public int getBgppeerafCount() {
      if (bgppeerafBuilder_ == null) {
        return bgppeeraf_.size();
      } else {
        return bgppeerafBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf getBgppeeraf(int index) {
      if (bgppeerafBuilder_ == null) {
        return bgppeeraf_.get(index);
      } else {
        return bgppeerafBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder setBgppeeraf(
        int index, opi_api.network.cloud.v1alpha1.BGPPeerAf value) {
      if (bgppeerafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBgppeerafIsMutable();
        bgppeeraf_.set(index, value);
        onChanged();
      } else {
        bgppeerafBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder setBgppeeraf(
        int index, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder builderForValue) {
      if (bgppeerafBuilder_ == null) {
        ensureBgppeerafIsMutable();
        bgppeeraf_.set(index, builderForValue.build());
        onChanged();
      } else {
        bgppeerafBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder addBgppeeraf(opi_api.network.cloud.v1alpha1.BGPPeerAf value) {
      if (bgppeerafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBgppeerafIsMutable();
        bgppeeraf_.add(value);
        onChanged();
      } else {
        bgppeerafBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder addBgppeeraf(
        int index, opi_api.network.cloud.v1alpha1.BGPPeerAf value) {
      if (bgppeerafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBgppeerafIsMutable();
        bgppeeraf_.add(index, value);
        onChanged();
      } else {
        bgppeerafBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder addBgppeeraf(
        opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder builderForValue) {
      if (bgppeerafBuilder_ == null) {
        ensureBgppeerafIsMutable();
        bgppeeraf_.add(builderForValue.build());
        onChanged();
      } else {
        bgppeerafBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder addBgppeeraf(
        int index, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder builderForValue) {
      if (bgppeerafBuilder_ == null) {
        ensureBgppeerafIsMutable();
        bgppeeraf_.add(index, builderForValue.build());
        onChanged();
      } else {
        bgppeerafBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder addAllBgppeeraf(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.BGPPeerAf> values) {
      if (bgppeerafBuilder_ == null) {
        ensureBgppeerafIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bgppeeraf_);
        onChanged();
      } else {
        bgppeerafBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder clearBgppeeraf() {
      if (bgppeerafBuilder_ == null) {
        bgppeeraf_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bgppeerafBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public Builder removeBgppeeraf(int index) {
      if (bgppeerafBuilder_ == null) {
        ensureBgppeerafIsMutable();
        bgppeeraf_.remove(index);
        onChanged();
      } else {
        bgppeerafBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder getBgppeerafBuilder(
        int index) {
      return getBgppeerafFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder getBgppeerafOrBuilder(
        int index) {
      if (bgppeerafBuilder_ == null) {
        return bgppeeraf_.get(index);  } else {
        return bgppeerafBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> 
         getBgppeerafOrBuilderList() {
      if (bgppeerafBuilder_ != null) {
        return bgppeerafBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bgppeeraf_);
      }
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder addBgppeerafBuilder() {
      return getBgppeerafFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance());
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder addBgppeerafBuilder(
        int index) {
      return getBgppeerafFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance());
    }
    /**
     * <pre>
     * list of bgppeerafs
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder> 
         getBgppeerafBuilderList() {
      return getBgppeerafFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> 
        getBgppeerafFieldBuilder() {
      if (bgppeerafBuilder_ == null) {
        bgppeerafBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.BGPPeerAf, opi_api.network.cloud.v1alpha1.BGPPeerAf.Builder, opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder>(
                bgppeeraf_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bgppeeraf_ = null;
      }
      return bgppeerafBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)
  private static final opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBGPPeerAfsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListBGPPeerAfsResponse>() {
    @java.lang.Override
    public ListBGPPeerAfsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListBGPPeerAfsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListBGPPeerAfsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBGPPeerAfsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

