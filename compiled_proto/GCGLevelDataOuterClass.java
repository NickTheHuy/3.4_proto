// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelData.proto

package emu.grasscutter.net.proto;

public final class GCGLevelDataOuterClass {
  private GCGLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @return A list containing the adobcdcfbpn.
     */
    java.util.List<java.lang.Integer> getAdobcdcfbpnList();
    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @return The count of adobcdcfbpn.
     */
    int getAdobcdcfbpnCount();
    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @param index The index of the element to return.
     * @return The adobcdcfbpn at the given index.
     */
    int getAdobcdcfbpn(int index);
  }
  /**
   * Protobuf type {@code GCGLevelData}
   */
  public static final class GCGLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGLevelData)
      GCGLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGLevelData.newBuilder() to construct.
    private GCGLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGLevelData() {
      adobcdcfbpn_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGLevelData(
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                adobcdcfbpn_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              adobcdcfbpn_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                adobcdcfbpn_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                adobcdcfbpn_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
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
          adobcdcfbpn_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGLevelDataOuterClass.internal_static_GCGLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGLevelDataOuterClass.internal_static_GCGLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.class, emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.Builder.class);
    }

    public static final int LEVELID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 levelId = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int ADOBCDCFBPN_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList adobcdcfbpn_;
    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @return A list containing the adobcdcfbpn.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAdobcdcfbpnList() {
      return adobcdcfbpn_;
    }
    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @return The count of adobcdcfbpn.
     */
    public int getAdobcdcfbpnCount() {
      return adobcdcfbpn_.size();
    }
    /**
     * <code>repeated uint32 adobcdcfbpn = 4;</code>
     * @param index The index of the element to return.
     * @return The adobcdcfbpn at the given index.
     */
    public int getAdobcdcfbpn(int index) {
      return adobcdcfbpn_.getInt(index);
    }
    private int adobcdcfbpnMemoizedSerializedSize = -1;

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
      if (getAdobcdcfbpnList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(adobcdcfbpnMemoizedSerializedSize);
      }
      for (int i = 0; i < adobcdcfbpn_.size(); i++) {
        output.writeUInt32NoTag(adobcdcfbpn_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
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
        for (int i = 0; i < adobcdcfbpn_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(adobcdcfbpn_.getInt(i));
        }
        size += dataSize;
        if (!getAdobcdcfbpnList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        adobcdcfbpnMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData other = (emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getAdobcdcfbpnList()
          .equals(other.getAdobcdcfbpnList())) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getAdobcdcfbpnCount() > 0) {
        hash = (37 * hash) + ADOBCDCFBPN_FIELD_NUMBER;
        hash = (53 * hash) + getAdobcdcfbpnList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData prototype) {
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
     * Protobuf type {@code GCGLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLevelData)
        emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGLevelDataOuterClass.internal_static_GCGLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGLevelDataOuterClass.internal_static_GCGLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.class, emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.newBuilder()
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
        levelId_ = 0;

        adobcdcfbpn_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGLevelDataOuterClass.internal_static_GCGLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData build() {
        emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData buildPartial() {
        emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData result = new emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData(this);
        int from_bitField0_ = bitField0_;
        result.levelId_ = levelId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          adobcdcfbpn_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adobcdcfbpn_ = adobcdcfbpn_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData) {
          return mergeFrom((emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData other) {
        if (other == emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.adobcdcfbpn_.isEmpty()) {
          if (adobcdcfbpn_.isEmpty()) {
            adobcdcfbpn_ = other.adobcdcfbpn_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdobcdcfbpnIsMutable();
            adobcdcfbpn_.addAll(other.adobcdcfbpn_);
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
        emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList adobcdcfbpn_ = emptyIntList();
      private void ensureAdobcdcfbpnIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          adobcdcfbpn_ = mutableCopy(adobcdcfbpn_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @return A list containing the adobcdcfbpn.
       */
      public java.util.List<java.lang.Integer>
          getAdobcdcfbpnList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(adobcdcfbpn_) : adobcdcfbpn_;
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @return The count of adobcdcfbpn.
       */
      public int getAdobcdcfbpnCount() {
        return adobcdcfbpn_.size();
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @param index The index of the element to return.
       * @return The adobcdcfbpn at the given index.
       */
      public int getAdobcdcfbpn(int index) {
        return adobcdcfbpn_.getInt(index);
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @param index The index to set the value at.
       * @param value The adobcdcfbpn to set.
       * @return This builder for chaining.
       */
      public Builder setAdobcdcfbpn(
          int index, int value) {
        ensureAdobcdcfbpnIsMutable();
        adobcdcfbpn_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @param value The adobcdcfbpn to add.
       * @return This builder for chaining.
       */
      public Builder addAdobcdcfbpn(int value) {
        ensureAdobcdcfbpnIsMutable();
        adobcdcfbpn_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @param values The adobcdcfbpn to add.
       * @return This builder for chaining.
       */
      public Builder addAllAdobcdcfbpn(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAdobcdcfbpnIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, adobcdcfbpn_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 adobcdcfbpn = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAdobcdcfbpn() {
        adobcdcfbpn_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGLevelData)
    }

    // @@protoc_insertion_point(class_scope:GCGLevelData)
    private static final emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData();
    }

    public static emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGLevelData>
        PARSER = new com.google.protobuf.AbstractParser<GCGLevelData>() {
      @java.lang.Override
      public GCGLevelData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGLevelData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGLevelDataOuterClass.GCGLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GCGLevelData.proto\"4\n\014GCGLevelData\022\017\n\007" +
      "levelId\030\r \001(\r\022\023\n\013adobcdcfbpn\030\004 \003(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLevelData_descriptor,
        new java.lang.String[] { "LevelId", "Adobcdcfbpn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
