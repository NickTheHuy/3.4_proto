// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POEDEDPKGPH.proto

package emu.grasscutter.net.proto;

public final class POEDEDPKGPHOuterClass {
  private POEDEDPKGPHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface POEDEDPKGPHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:POEDEDPKGPH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> 
        getBlnaldeiekjList();
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI getBlnaldeiekj(int index);
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    int getBlnaldeiekjCount();
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder> 
        getBlnaldeiekjOrBuilderList();
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder getBlnaldeiekjOrBuilder(
        int index);

    /**
     * <code>string createTime = 2;</code>
     * @return The createTime.
     */
    java.lang.String getCreateTime();
    /**
     * <code>string createTime = 2;</code>
     * @return The bytes for createTime.
     */
    com.google.protobuf.ByteString
        getCreateTimeBytes();
  }
  /**
   * Protobuf type {@code POEDEDPKGPH}
   */
  public static final class POEDEDPKGPH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:POEDEDPKGPH)
      POEDEDPKGPHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use POEDEDPKGPH.newBuilder() to construct.
    private POEDEDPKGPH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private POEDEDPKGPH() {
      blnaldeiekj_ = java.util.Collections.emptyList();
      createTime_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new POEDEDPKGPH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private POEDEDPKGPH(
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
                blnaldeiekj_ = new java.util.ArrayList<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI>();
                mutable_bitField0_ |= 0x00000001;
              }
              blnaldeiekj_.add(
                  input.readMessage(emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.parser(), extensionRegistry));
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              createTime_ = s;
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
          blnaldeiekj_ = java.util.Collections.unmodifiableList(blnaldeiekj_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.internal_static_POEDEDPKGPH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.internal_static_POEDEDPKGPH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.class, emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.Builder.class);
    }

    public static final int BLNALDEIEKJ_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> blnaldeiekj_;
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> getBlnaldeiekjList() {
      return blnaldeiekj_;
    }
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder> 
        getBlnaldeiekjOrBuilderList() {
      return blnaldeiekj_;
    }
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    @java.lang.Override
    public int getBlnaldeiekjCount() {
      return blnaldeiekj_.size();
    }
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI getBlnaldeiekj(int index) {
      return blnaldeiekj_.get(index);
    }
    /**
     * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder getBlnaldeiekjOrBuilder(
        int index) {
      return blnaldeiekj_.get(index);
    }

    public static final int CREATETIME_FIELD_NUMBER = 2;
    private volatile java.lang.Object createTime_;
    /**
     * <code>string createTime = 2;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      }
    }
    /**
     * <code>string createTime = 2;</code>
     * @return The bytes for createTime.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
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
      for (int i = 0; i < blnaldeiekj_.size(); i++) {
        output.writeMessage(1, blnaldeiekj_.get(i));
      }
      if (!getCreateTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, createTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < blnaldeiekj_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, blnaldeiekj_.get(i));
      }
      if (!getCreateTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, createTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH other = (emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH) obj;

      if (!getBlnaldeiekjList()
          .equals(other.getBlnaldeiekjList())) return false;
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
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
      if (getBlnaldeiekjCount() > 0) {
        hash = (37 * hash) + BLNALDEIEKJ_FIELD_NUMBER;
        hash = (53 * hash) + getBlnaldeiekjList().hashCode();
      }
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH prototype) {
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
     * Protobuf type {@code POEDEDPKGPH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:POEDEDPKGPH)
        emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.internal_static_POEDEDPKGPH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.internal_static_POEDEDPKGPH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.class, emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.newBuilder()
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
          getBlnaldeiekjFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (blnaldeiekjBuilder_ == null) {
          blnaldeiekj_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          blnaldeiekjBuilder_.clear();
        }
        createTime_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.internal_static_POEDEDPKGPH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH build() {
        emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH buildPartial() {
        emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH result = new emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH(this);
        int from_bitField0_ = bitField0_;
        if (blnaldeiekjBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            blnaldeiekj_ = java.util.Collections.unmodifiableList(blnaldeiekj_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.blnaldeiekj_ = blnaldeiekj_;
        } else {
          result.blnaldeiekj_ = blnaldeiekjBuilder_.build();
        }
        result.createTime_ = createTime_;
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
        if (other instanceof emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH) {
          return mergeFrom((emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH other) {
        if (other == emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH.getDefaultInstance()) return this;
        if (blnaldeiekjBuilder_ == null) {
          if (!other.blnaldeiekj_.isEmpty()) {
            if (blnaldeiekj_.isEmpty()) {
              blnaldeiekj_ = other.blnaldeiekj_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBlnaldeiekjIsMutable();
              blnaldeiekj_.addAll(other.blnaldeiekj_);
            }
            onChanged();
          }
        } else {
          if (!other.blnaldeiekj_.isEmpty()) {
            if (blnaldeiekjBuilder_.isEmpty()) {
              blnaldeiekjBuilder_.dispose();
              blnaldeiekjBuilder_ = null;
              blnaldeiekj_ = other.blnaldeiekj_;
              bitField0_ = (bitField0_ & ~0x00000001);
              blnaldeiekjBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBlnaldeiekjFieldBuilder() : null;
            } else {
              blnaldeiekjBuilder_.addAllMessages(other.blnaldeiekj_);
            }
          }
        }
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
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
        emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> blnaldeiekj_ =
        java.util.Collections.emptyList();
      private void ensureBlnaldeiekjIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          blnaldeiekj_ = new java.util.ArrayList<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI>(blnaldeiekj_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder> blnaldeiekjBuilder_;

      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> getBlnaldeiekjList() {
        if (blnaldeiekjBuilder_ == null) {
          return java.util.Collections.unmodifiableList(blnaldeiekj_);
        } else {
          return blnaldeiekjBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public int getBlnaldeiekjCount() {
        if (blnaldeiekjBuilder_ == null) {
          return blnaldeiekj_.size();
        } else {
          return blnaldeiekjBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI getBlnaldeiekj(int index) {
        if (blnaldeiekjBuilder_ == null) {
          return blnaldeiekj_.get(index);
        } else {
          return blnaldeiekjBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder setBlnaldeiekj(
          int index, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI value) {
        if (blnaldeiekjBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.set(index, value);
          onChanged();
        } else {
          blnaldeiekjBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder setBlnaldeiekj(
          int index, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder builderForValue) {
        if (blnaldeiekjBuilder_ == null) {
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.set(index, builderForValue.build());
          onChanged();
        } else {
          blnaldeiekjBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder addBlnaldeiekj(emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI value) {
        if (blnaldeiekjBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.add(value);
          onChanged();
        } else {
          blnaldeiekjBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder addBlnaldeiekj(
          int index, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI value) {
        if (blnaldeiekjBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.add(index, value);
          onChanged();
        } else {
          blnaldeiekjBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder addBlnaldeiekj(
          emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder builderForValue) {
        if (blnaldeiekjBuilder_ == null) {
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.add(builderForValue.build());
          onChanged();
        } else {
          blnaldeiekjBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder addBlnaldeiekj(
          int index, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder builderForValue) {
        if (blnaldeiekjBuilder_ == null) {
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.add(index, builderForValue.build());
          onChanged();
        } else {
          blnaldeiekjBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder addAllBlnaldeiekj(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI> values) {
        if (blnaldeiekjBuilder_ == null) {
          ensureBlnaldeiekjIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, blnaldeiekj_);
          onChanged();
        } else {
          blnaldeiekjBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder clearBlnaldeiekj() {
        if (blnaldeiekjBuilder_ == null) {
          blnaldeiekj_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          blnaldeiekjBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public Builder removeBlnaldeiekj(int index) {
        if (blnaldeiekjBuilder_ == null) {
          ensureBlnaldeiekjIsMutable();
          blnaldeiekj_.remove(index);
          onChanged();
        } else {
          blnaldeiekjBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder getBlnaldeiekjBuilder(
          int index) {
        return getBlnaldeiekjFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder getBlnaldeiekjOrBuilder(
          int index) {
        if (blnaldeiekjBuilder_ == null) {
          return blnaldeiekj_.get(index);  } else {
          return blnaldeiekjBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder> 
           getBlnaldeiekjOrBuilderList() {
        if (blnaldeiekjBuilder_ != null) {
          return blnaldeiekjBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(blnaldeiekj_);
        }
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder addBlnaldeiekjBuilder() {
        return getBlnaldeiekjFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.getDefaultInstance());
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder addBlnaldeiekjBuilder(
          int index) {
        return getBlnaldeiekjFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.getDefaultInstance());
      }
      /**
       * <code>repeated .MGKFOCKHAHI blnaldeiekj = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder> 
           getBlnaldeiekjBuilderList() {
        return getBlnaldeiekjFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder> 
          getBlnaldeiekjFieldBuilder() {
        if (blnaldeiekjBuilder_ == null) {
          blnaldeiekjBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHI.Builder, emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.MGKFOCKHAHIOrBuilder>(
                  blnaldeiekj_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          blnaldeiekj_ = null;
        }
        return blnaldeiekjBuilder_;
      }

      private java.lang.Object createTime_ = "";
      /**
       * <code>string createTime = 2;</code>
       * @return The createTime.
       */
      public java.lang.String getCreateTime() {
        java.lang.Object ref = createTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          createTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string createTime = 2;</code>
       * @return The bytes for createTime.
       */
      public com.google.protobuf.ByteString
          getCreateTimeBytes() {
        java.lang.Object ref = createTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          createTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string createTime = 2;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = getDefaultInstance().getCreateTime();
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 2;</code>
       * @param value The bytes for createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        createTime_ = value;
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


      // @@protoc_insertion_point(builder_scope:POEDEDPKGPH)
    }

    // @@protoc_insertion_point(class_scope:POEDEDPKGPH)
    private static final emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH();
    }

    public static emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<POEDEDPKGPH>
        PARSER = new com.google.protobuf.AbstractParser<POEDEDPKGPH>() {
      @java.lang.Override
      public POEDEDPKGPH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new POEDEDPKGPH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<POEDEDPKGPH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<POEDEDPKGPH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.POEDEDPKGPHOuterClass.POEDEDPKGPH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POEDEDPKGPH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POEDEDPKGPH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021POEDEDPKGPH.proto\032\021MGKFOCKHAHI.proto\"D" +
      "\n\013POEDEDPKGPH\022!\n\013blnaldeiekj\030\001 \003(\0132\014.MGK" +
      "FOCKHAHI\022\022\n\ncreateTime\030\002 \001(\tB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.getDescriptor(),
        });
    internal_static_POEDEDPKGPH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POEDEDPKGPH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POEDEDPKGPH_descriptor,
        new java.lang.String[] { "Blnaldeiekj", "CreateTime", });
    emu.grasscutter.net.proto.MGKFOCKHAHIOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
