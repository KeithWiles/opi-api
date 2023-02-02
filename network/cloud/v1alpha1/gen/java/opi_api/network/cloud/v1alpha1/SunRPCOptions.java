// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * SunRPC ALG specific options
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.SunRPCOptions}
 */
public final class SunRPCOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.SunRPCOptions)
    SunRPCOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SunRPCOptions.newBuilder() to construct.
  private SunRPCOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SunRPCOptions() {
    programId_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SunRPCOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SunRPCOptions(
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
              programId_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            programId_.add(input.readBytes());
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        programId_ = java.util.Collections.unmodifiableList(programId_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SunRPCOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SunRPCOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.SunRPCOptions.class, opi_api.network.cloud.v1alpha1.SunRPCOptions.Builder.class);
  }

  public static final int PROGRAM_ID_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> programId_;
  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @return A list containing the programId.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getProgramIdList() {
    return programId_;
  }
  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @return The count of programId.
   */
  public int getProgramIdCount() {
    return programId_.size();
  }
  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @param index The index of the element to return.
   * @return The programId at the given index.
   */
  public com.google.protobuf.ByteString getProgramId(int index) {
    return programId_.get(index);
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
    for (int i = 0; i < programId_.size(); i++) {
      output.writeBytes(1, programId_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < programId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(programId_.get(i));
      }
      size += dataSize;
      size += 1 * getProgramIdList().size();
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.SunRPCOptions)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.SunRPCOptions other = (opi_api.network.cloud.v1alpha1.SunRPCOptions) obj;

    if (!getProgramIdList()
        .equals(other.getProgramIdList())) return false;
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
    if (getProgramIdCount() > 0) {
      hash = (37 * hash) + PROGRAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProgramIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.SunRPCOptions parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.SunRPCOptions prototype) {
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
   * SunRPC ALG specific options
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.SunRPCOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.SunRPCOptions)
      opi_api.network.cloud.v1alpha1.SunRPCOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SunRPCOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SunRPCOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.SunRPCOptions.class, opi_api.network.cloud.v1alpha1.SunRPCOptions.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.SunRPCOptions.newBuilder()
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
      programId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.NetworkPolicyProto.internal_static_opi_api_network_cloud_v1alpha1_SunRPCOptions_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SunRPCOptions getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.SunRPCOptions.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SunRPCOptions build() {
      opi_api.network.cloud.v1alpha1.SunRPCOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.SunRPCOptions buildPartial() {
      opi_api.network.cloud.v1alpha1.SunRPCOptions result = new opi_api.network.cloud.v1alpha1.SunRPCOptions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        programId_ = java.util.Collections.unmodifiableList(programId_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.programId_ = programId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.SunRPCOptions) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.SunRPCOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.SunRPCOptions other) {
      if (other == opi_api.network.cloud.v1alpha1.SunRPCOptions.getDefaultInstance()) return this;
      if (!other.programId_.isEmpty()) {
        if (programId_.isEmpty()) {
          programId_ = other.programId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProgramIdIsMutable();
          programId_.addAll(other.programId_);
        }
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
      opi_api.network.cloud.v1alpha1.SunRPCOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.SunRPCOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> programId_ = java.util.Collections.emptyList();
    private void ensureProgramIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        programId_ = new java.util.ArrayList<com.google.protobuf.ByteString>(programId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @return A list containing the programId.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getProgramIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(programId_) : programId_;
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @return The count of programId.
     */
    public int getProgramIdCount() {
      return programId_.size();
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @param index The index of the element to return.
     * @return The programId at the given index.
     */
    public com.google.protobuf.ByteString getProgramId(int index) {
      return programId_.get(index);
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The programId to set.
     * @return This builder for chaining.
     */
    public Builder setProgramId(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProgramIdIsMutable();
      programId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @param value The programId to add.
     * @return This builder for chaining.
     */
    public Builder addProgramId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProgramIdIsMutable();
      programId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @param values The programId to add.
     * @return This builder for chaining.
     */
    public Builder addAllProgramId(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureProgramIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, programId_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * RPC program identifiers
     * </pre>
     *
     * <code>repeated bytes program_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgramId() {
      programId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.SunRPCOptions)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SunRPCOptions)
  private static final opi_api.network.cloud.v1alpha1.SunRPCOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.SunRPCOptions();
  }

  public static opi_api.network.cloud.v1alpha1.SunRPCOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SunRPCOptions>
      PARSER = new com.google.protobuf.AbstractParser<SunRPCOptions>() {
    @java.lang.Override
    public SunRPCOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SunRPCOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SunRPCOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SunRPCOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.SunRPCOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
