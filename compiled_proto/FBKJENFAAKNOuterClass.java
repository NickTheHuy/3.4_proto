// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FBKJENFAAKN.proto

package emu.grasscutter.net.proto;

public final class FBKJENFAAKNOuterClass {
  private FBKJENFAAKNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FBKJENFAAKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FBKJENFAAKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return A list containing the ehbfihcdoli.
     */
    java.util.List<java.lang.Integer> getEhbfihcdoliList();
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return The count of ehbfihcdoli.
     */
    int getEhbfihcdoliCount();
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @param index The index of the element to return.
     * @return The ehbfihcdoli at the given index.
     */
    int getEhbfihcdoli(int index);

    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> 
        getAvatarInfoListList();
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD getAvatarInfoList(int index);
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    int getAvatarInfoListCount();
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder> 
        getAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder getAvatarInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code FBKJENFAAKN}
   */
  public static final class FBKJENFAAKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FBKJENFAAKN)
      FBKJENFAAKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FBKJENFAAKN.newBuilder() to construct.
    private FBKJENFAAKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FBKJENFAAKN() {
      ehbfihcdoli_ = emptyIntList();
      avatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FBKJENFAAKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FBKJENFAAKN(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                avatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD>();
                mutable_bitField0_ |= 0x00000002;
              }
              avatarInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.parser(), extensionRegistry));
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ehbfihcdoli_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              ehbfihcdoli_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                ehbfihcdoli_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                ehbfihcdoli_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          ehbfihcdoli_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.internal_static_FBKJENFAAKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.internal_static_FBKJENFAAKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.class, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder.class);
    }

    public static final int EHBFIHCDOLI_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList ehbfihcdoli_;
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return A list containing the ehbfihcdoli.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEhbfihcdoliList() {
      return ehbfihcdoli_;
    }
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @return The count of ehbfihcdoli.
     */
    public int getEhbfihcdoliCount() {
      return ehbfihcdoli_.size();
    }
    /**
     * <code>repeated uint32 ehbfihcdoli = 12;</code>
     * @param index The index of the element to return.
     * @return The ehbfihcdoli at the given index.
     */
    public int getEhbfihcdoli(int index) {
      return ehbfihcdoli_.getInt(index);
    }
    private int ehbfihcdoliMemoizedSerializedSize = -1;

    public static final int AVATARINFOLIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> avatarInfoList_;
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> getAvatarInfoListList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder> 
        getAvatarInfoListOrBuilderList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    @java.lang.Override
    public int getAvatarInfoListCount() {
      return avatarInfoList_.size();
    }
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD getAvatarInfoList(int index) {
      return avatarInfoList_.get(index);
    }
    /**
     * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      return avatarInfoList_.get(index);
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
      getSerializedSize();
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        output.writeMessage(6, avatarInfoList_.get(i));
      }
      if (getEhbfihcdoliList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(ehbfihcdoliMemoizedSerializedSize);
      }
      for (int i = 0; i < ehbfihcdoli_.size(); i++) {
        output.writeUInt32NoTag(ehbfihcdoli_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, avatarInfoList_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < ehbfihcdoli_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(ehbfihcdoli_.getInt(i));
        }
        size += dataSize;
        if (!getEhbfihcdoliList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        ehbfihcdoliMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN other = (emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN) obj;

      if (!getEhbfihcdoliList()
          .equals(other.getEhbfihcdoliList())) return false;
      if (!getAvatarInfoListList()
          .equals(other.getAvatarInfoListList())) return false;
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
      if (getEhbfihcdoliCount() > 0) {
        hash = (37 * hash) + EHBFIHCDOLI_FIELD_NUMBER;
        hash = (53 * hash) + getEhbfihcdoliList().hashCode();
      }
      if (getAvatarInfoListCount() > 0) {
        hash = (37 * hash) + AVATARINFOLIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN prototype) {
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
     * Protobuf type {@code FBKJENFAAKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FBKJENFAAKN)
        emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.internal_static_FBKJENFAAKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.internal_static_FBKJENFAAKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.class, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.newBuilder()
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
          getAvatarInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ehbfihcdoli_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.internal_static_FBKJENFAAKN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN build() {
        emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN buildPartial() {
        emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN result = new emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          ehbfihcdoli_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ehbfihcdoli_ = ehbfihcdoli_;
        if (avatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.avatarInfoList_ = avatarInfoList_;
        } else {
          result.avatarInfoList_ = avatarInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN) {
          return mergeFrom((emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN other) {
        if (other == emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.getDefaultInstance()) return this;
        if (!other.ehbfihcdoli_.isEmpty()) {
          if (ehbfihcdoli_.isEmpty()) {
            ehbfihcdoli_ = other.ehbfihcdoli_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEhbfihcdoliIsMutable();
            ehbfihcdoli_.addAll(other.ehbfihcdoli_);
          }
          onChanged();
        }
        if (avatarInfoListBuilder_ == null) {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoList_.isEmpty()) {
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAvatarInfoListIsMutable();
              avatarInfoList_.addAll(other.avatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoListBuilder_.isEmpty()) {
              avatarInfoListBuilder_.dispose();
              avatarInfoListBuilder_ = null;
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              avatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarInfoListFieldBuilder() : null;
            } else {
              avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList ehbfihcdoli_ = emptyIntList();
      private void ensureEhbfihcdoliIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ehbfihcdoli_ = mutableCopy(ehbfihcdoli_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return A list containing the ehbfihcdoli.
       */
      public java.util.List<java.lang.Integer>
          getEhbfihcdoliList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(ehbfihcdoli_) : ehbfihcdoli_;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return The count of ehbfihcdoli.
       */
      public int getEhbfihcdoliCount() {
        return ehbfihcdoli_.size();
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param index The index of the element to return.
       * @return The ehbfihcdoli at the given index.
       */
      public int getEhbfihcdoli(int index) {
        return ehbfihcdoli_.getInt(index);
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param index The index to set the value at.
       * @param value The ehbfihcdoli to set.
       * @return This builder for chaining.
       */
      public Builder setEhbfihcdoli(
          int index, int value) {
        ensureEhbfihcdoliIsMutable();
        ehbfihcdoli_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param value The ehbfihcdoli to add.
       * @return This builder for chaining.
       */
      public Builder addEhbfihcdoli(int value) {
        ensureEhbfihcdoliIsMutable();
        ehbfihcdoli_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @param values The ehbfihcdoli to add.
       * @return This builder for chaining.
       */
      public Builder addAllEhbfihcdoli(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEhbfihcdoliIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ehbfihcdoli_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 ehbfihcdoli = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEhbfihcdoli() {
        ehbfihcdoli_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> avatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          avatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD>(avatarInfoList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder> avatarInfoListBuilder_;

      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> getAvatarInfoListList() {
        if (avatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        } else {
          return avatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public int getAvatarInfoListCount() {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.size();
        } else {
          return avatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD getAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);
        } else {
          return avatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder addAvatarInfoList(emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder addAvatarInfoList(
          emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder addAllAvatarInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD> values) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarInfoList_);
          onChanged();
        } else {
          avatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder clearAvatarInfoList() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public Builder removeAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.remove(index);
          onChanged();
        } else {
          avatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder getAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder getAvatarInfoListOrBuilder(
          int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);  } else {
          return avatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder> 
           getAvatarInfoListOrBuilderList() {
        if (avatarInfoListBuilder_ != null) {
          return avatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        }
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder addAvatarInfoListBuilder() {
        return getAvatarInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.getDefaultInstance());
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder addAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.getDefaultInstance());
      }
      /**
       * <code>repeated .EIBBNBEBHGD avatarInfoList = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder> 
           getAvatarInfoListBuilderList() {
        return getAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder> 
          getAvatarInfoListFieldBuilder() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGD.Builder, emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.EIBBNBEBHGDOrBuilder>(
                  avatarInfoList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          avatarInfoList_ = null;
        }
        return avatarInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FBKJENFAAKN)
    }

    // @@protoc_insertion_point(class_scope:FBKJENFAAKN)
    private static final emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN();
    }

    public static emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FBKJENFAAKN>
        PARSER = new com.google.protobuf.AbstractParser<FBKJENFAAKN>() {
      @java.lang.Override
      public FBKJENFAAKN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FBKJENFAAKN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FBKJENFAAKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FBKJENFAAKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FBKJENFAAKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FBKJENFAAKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FBKJENFAAKN.proto\032\021EIBBNBEBHGD.proto\"H" +
      "\n\013FBKJENFAAKN\022\023\n\013ehbfihcdoli\030\014 \003(\r\022$\n\016av" +
      "atarInfoList\030\006 \003(\0132\014.EIBBNBEBHGDB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.getDescriptor(),
        });
    internal_static_FBKJENFAAKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FBKJENFAAKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FBKJENFAAKN_descriptor,
        new java.lang.String[] { "Ehbfihcdoli", "AvatarInfoList", });
    emu.grasscutter.net.proto.EIBBNBEBHGDOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
