// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BMAPKBNNAGD.proto

package emu.grasscutter.net.proto;

public final class BMAPKBNNAGDOuterClass {
  private BMAPKBNNAGDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BMAPKBNNAGDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BMAPKBNNAGD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     * @return Whether the mpfmoiobaad field is set.
     */
    boolean hasMpfmoiobaad();
    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     * @return The mpfmoiobaad.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getMpfmoiobaad();
    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMpfmoiobaadOrBuilder();

    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    boolean hasEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     * @return The eknhofiihcl.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder();
  }
  /**
   * Protobuf type {@code BMAPKBNNAGD}
   */
  public static final class BMAPKBNNAGD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BMAPKBNNAGD)
      BMAPKBNNAGDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BMAPKBNNAGD.newBuilder() to construct.
    private BMAPKBNNAGD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BMAPKBNNAGD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BMAPKBNNAGD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BMAPKBNNAGD(
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
            case 18: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (mpfmoiobaad_ != null) {
                subBuilder = mpfmoiobaad_.toBuilder();
              }
              mpfmoiobaad_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mpfmoiobaad_);
                mpfmoiobaad_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (eknhofiihcl_ != null) {
                subBuilder = eknhofiihcl_.toBuilder();
              }
              eknhofiihcl_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(eknhofiihcl_);
                eknhofiihcl_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.internal_static_BMAPKBNNAGD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.internal_static_BMAPKBNNAGD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.class, emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.Builder.class);
    }

    public static final int MPFMOIOBAAD_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector mpfmoiobaad_;
    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     * @return Whether the mpfmoiobaad field is set.
     */
    @java.lang.Override
    public boolean hasMpfmoiobaad() {
      return mpfmoiobaad_ != null;
    }
    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     * @return The mpfmoiobaad.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getMpfmoiobaad() {
      return mpfmoiobaad_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mpfmoiobaad_;
    }
    /**
     * <code>.Vector mpfmoiobaad = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMpfmoiobaadOrBuilder() {
      return getMpfmoiobaad();
    }

    public static final int EKNHOFIIHCL_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    @java.lang.Override
    public boolean hasEknhofiihcl() {
      return eknhofiihcl_ != null;
    }
    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     * @return The eknhofiihcl.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl() {
      return eknhofiihcl_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : eknhofiihcl_;
    }
    /**
     * <code>.Vector eknhofiihcl = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder() {
      return getEknhofiihcl();
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
      if (mpfmoiobaad_ != null) {
        output.writeMessage(2, getMpfmoiobaad());
      }
      if (eknhofiihcl_ != null) {
        output.writeMessage(4, getEknhofiihcl());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpfmoiobaad_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMpfmoiobaad());
      }
      if (eknhofiihcl_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getEknhofiihcl());
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
      if (!(obj instanceof emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD other = (emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD) obj;

      if (hasMpfmoiobaad() != other.hasMpfmoiobaad()) return false;
      if (hasMpfmoiobaad()) {
        if (!getMpfmoiobaad()
            .equals(other.getMpfmoiobaad())) return false;
      }
      if (hasEknhofiihcl() != other.hasEknhofiihcl()) return false;
      if (hasEknhofiihcl()) {
        if (!getEknhofiihcl()
            .equals(other.getEknhofiihcl())) return false;
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
      if (hasMpfmoiobaad()) {
        hash = (37 * hash) + MPFMOIOBAAD_FIELD_NUMBER;
        hash = (53 * hash) + getMpfmoiobaad().hashCode();
      }
      if (hasEknhofiihcl()) {
        hash = (37 * hash) + EKNHOFIIHCL_FIELD_NUMBER;
        hash = (53 * hash) + getEknhofiihcl().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD prototype) {
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
     * Protobuf type {@code BMAPKBNNAGD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BMAPKBNNAGD)
        emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.internal_static_BMAPKBNNAGD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.internal_static_BMAPKBNNAGD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.class, emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.newBuilder()
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
        if (mpfmoiobaadBuilder_ == null) {
          mpfmoiobaad_ = null;
        } else {
          mpfmoiobaad_ = null;
          mpfmoiobaadBuilder_ = null;
        }
        if (eknhofiihclBuilder_ == null) {
          eknhofiihcl_ = null;
        } else {
          eknhofiihcl_ = null;
          eknhofiihclBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.internal_static_BMAPKBNNAGD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD build() {
        emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD buildPartial() {
        emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD result = new emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD(this);
        if (mpfmoiobaadBuilder_ == null) {
          result.mpfmoiobaad_ = mpfmoiobaad_;
        } else {
          result.mpfmoiobaad_ = mpfmoiobaadBuilder_.build();
        }
        if (eknhofiihclBuilder_ == null) {
          result.eknhofiihcl_ = eknhofiihcl_;
        } else {
          result.eknhofiihcl_ = eknhofiihclBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD) {
          return mergeFrom((emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD other) {
        if (other == emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD.getDefaultInstance()) return this;
        if (other.hasMpfmoiobaad()) {
          mergeMpfmoiobaad(other.getMpfmoiobaad());
        }
        if (other.hasEknhofiihcl()) {
          mergeEknhofiihcl(other.getEknhofiihcl());
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
        emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector mpfmoiobaad_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> mpfmoiobaadBuilder_;
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       * @return Whether the mpfmoiobaad field is set.
       */
      public boolean hasMpfmoiobaad() {
        return mpfmoiobaadBuilder_ != null || mpfmoiobaad_ != null;
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       * @return The mpfmoiobaad.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getMpfmoiobaad() {
        if (mpfmoiobaadBuilder_ == null) {
          return mpfmoiobaad_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mpfmoiobaad_;
        } else {
          return mpfmoiobaadBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public Builder setMpfmoiobaad(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mpfmoiobaadBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mpfmoiobaad_ = value;
          onChanged();
        } else {
          mpfmoiobaadBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public Builder setMpfmoiobaad(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (mpfmoiobaadBuilder_ == null) {
          mpfmoiobaad_ = builderForValue.build();
          onChanged();
        } else {
          mpfmoiobaadBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public Builder mergeMpfmoiobaad(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (mpfmoiobaadBuilder_ == null) {
          if (mpfmoiobaad_ != null) {
            mpfmoiobaad_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(mpfmoiobaad_).mergeFrom(value).buildPartial();
          } else {
            mpfmoiobaad_ = value;
          }
          onChanged();
        } else {
          mpfmoiobaadBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public Builder clearMpfmoiobaad() {
        if (mpfmoiobaadBuilder_ == null) {
          mpfmoiobaad_ = null;
          onChanged();
        } else {
          mpfmoiobaad_ = null;
          mpfmoiobaadBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getMpfmoiobaadBuilder() {
        
        onChanged();
        return getMpfmoiobaadFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMpfmoiobaadOrBuilder() {
        if (mpfmoiobaadBuilder_ != null) {
          return mpfmoiobaadBuilder_.getMessageOrBuilder();
        } else {
          return mpfmoiobaad_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : mpfmoiobaad_;
        }
      }
      /**
       * <code>.Vector mpfmoiobaad = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getMpfmoiobaadFieldBuilder() {
        if (mpfmoiobaadBuilder_ == null) {
          mpfmoiobaadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getMpfmoiobaad(),
                  getParentForChildren(),
                  isClean());
          mpfmoiobaad_ = null;
        }
        return mpfmoiobaadBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> eknhofiihclBuilder_;
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       * @return Whether the eknhofiihcl field is set.
       */
      public boolean hasEknhofiihcl() {
        return eknhofiihclBuilder_ != null || eknhofiihcl_ != null;
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       * @return The eknhofiihcl.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl() {
        if (eknhofiihclBuilder_ == null) {
          return eknhofiihcl_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : eknhofiihcl_;
        } else {
          return eknhofiihclBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public Builder setEknhofiihcl(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (eknhofiihclBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eknhofiihcl_ = value;
          onChanged();
        } else {
          eknhofiihclBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public Builder setEknhofiihcl(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (eknhofiihclBuilder_ == null) {
          eknhofiihcl_ = builderForValue.build();
          onChanged();
        } else {
          eknhofiihclBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public Builder mergeEknhofiihcl(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (eknhofiihclBuilder_ == null) {
          if (eknhofiihcl_ != null) {
            eknhofiihcl_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(eknhofiihcl_).mergeFrom(value).buildPartial();
          } else {
            eknhofiihcl_ = value;
          }
          onChanged();
        } else {
          eknhofiihclBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public Builder clearEknhofiihcl() {
        if (eknhofiihclBuilder_ == null) {
          eknhofiihcl_ = null;
          onChanged();
        } else {
          eknhofiihcl_ = null;
          eknhofiihclBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getEknhofiihclBuilder() {
        
        onChanged();
        return getEknhofiihclFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder() {
        if (eknhofiihclBuilder_ != null) {
          return eknhofiihclBuilder_.getMessageOrBuilder();
        } else {
          return eknhofiihcl_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : eknhofiihcl_;
        }
      }
      /**
       * <code>.Vector eknhofiihcl = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getEknhofiihclFieldBuilder() {
        if (eknhofiihclBuilder_ == null) {
          eknhofiihclBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getEknhofiihcl(),
                  getParentForChildren(),
                  isClean());
          eknhofiihcl_ = null;
        }
        return eknhofiihclBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BMAPKBNNAGD)
    }

    // @@protoc_insertion_point(class_scope:BMAPKBNNAGD)
    private static final emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD();
    }

    public static emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BMAPKBNNAGD>
        PARSER = new com.google.protobuf.AbstractParser<BMAPKBNNAGD>() {
      @java.lang.Override
      public BMAPKBNNAGD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BMAPKBNNAGD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BMAPKBNNAGD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BMAPKBNNAGD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BMAPKBNNAGDOuterClass.BMAPKBNNAGD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BMAPKBNNAGD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BMAPKBNNAGD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BMAPKBNNAGD.proto\032\014Vector.proto\"I\n\013BMA" +
      "PKBNNAGD\022\034\n\013mpfmoiobaad\030\002 \001(\0132\007.Vector\022\034" +
      "\n\013eknhofiihcl\030\004 \001(\0132\007.VectorB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_BMAPKBNNAGD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BMAPKBNNAGD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BMAPKBNNAGD_descriptor,
        new java.lang.String[] { "Mpfmoiobaad", "Eknhofiihcl", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
