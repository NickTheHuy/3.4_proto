// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HBMJGJEADEH.proto

package emu.grasscutter.net.proto;

public final class HBMJGJEADEHOuterClass {
  private HBMJGJEADEHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HBMJGJEADEHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HBMJGJEADEH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float lfpempoopmd = 2;</code>
     * @return The lfpempoopmd.
     */
    float getLfpempoopmd();

    /**
     * <code>float dfadhemafpn = 8;</code>
     * @return The dfadhemafpn.
     */
    float getDfadhemafpn();

    /**
     * <code>bool ibbkobjieeg = 12;</code>
     * @return The ibbkobjieeg.
     */
    boolean getIbbkobjieeg();

    /**
     * <code>float gookfcglmjd = 13;</code>
     * @return The gookfcglmjd.
     */
    float getGookfcglmjd();

    /**
     * <code>uint32 bhgooledknh = 15;</code>
     * @return The bhgooledknh.
     */
    int getBhgooledknh();

    /**
     * <code>uint32 ilodbmpgegj = 1;</code>
     * @return The ilodbmpgegj.
     */
    int getIlodbmpgegj();
  }
  /**
   * Protobuf type {@code HBMJGJEADEH}
   */
  public static final class HBMJGJEADEH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HBMJGJEADEH)
      HBMJGJEADEHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HBMJGJEADEH.newBuilder() to construct.
    private HBMJGJEADEH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HBMJGJEADEH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HBMJGJEADEH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HBMJGJEADEH(
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

              ilodbmpgegj_ = input.readUInt32();
              break;
            }
            case 21: {

              lfpempoopmd_ = input.readFloat();
              break;
            }
            case 69: {

              dfadhemafpn_ = input.readFloat();
              break;
            }
            case 96: {

              ibbkobjieeg_ = input.readBool();
              break;
            }
            case 109: {

              gookfcglmjd_ = input.readFloat();
              break;
            }
            case 120: {

              bhgooledknh_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.internal_static_HBMJGJEADEH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.internal_static_HBMJGJEADEH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.class, emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.Builder.class);
    }

    public static final int LFPEMPOOPMD_FIELD_NUMBER = 2;
    private float lfpempoopmd_;
    /**
     * <code>float lfpempoopmd = 2;</code>
     * @return The lfpempoopmd.
     */
    @java.lang.Override
    public float getLfpempoopmd() {
      return lfpempoopmd_;
    }

    public static final int DFADHEMAFPN_FIELD_NUMBER = 8;
    private float dfadhemafpn_;
    /**
     * <code>float dfadhemafpn = 8;</code>
     * @return The dfadhemafpn.
     */
    @java.lang.Override
    public float getDfadhemafpn() {
      return dfadhemafpn_;
    }

    public static final int IBBKOBJIEEG_FIELD_NUMBER = 12;
    private boolean ibbkobjieeg_;
    /**
     * <code>bool ibbkobjieeg = 12;</code>
     * @return The ibbkobjieeg.
     */
    @java.lang.Override
    public boolean getIbbkobjieeg() {
      return ibbkobjieeg_;
    }

    public static final int GOOKFCGLMJD_FIELD_NUMBER = 13;
    private float gookfcglmjd_;
    /**
     * <code>float gookfcglmjd = 13;</code>
     * @return The gookfcglmjd.
     */
    @java.lang.Override
    public float getGookfcglmjd() {
      return gookfcglmjd_;
    }

    public static final int BHGOOLEDKNH_FIELD_NUMBER = 15;
    private int bhgooledknh_;
    /**
     * <code>uint32 bhgooledknh = 15;</code>
     * @return The bhgooledknh.
     */
    @java.lang.Override
    public int getBhgooledknh() {
      return bhgooledknh_;
    }

    public static final int ILODBMPGEGJ_FIELD_NUMBER = 1;
    private int ilodbmpgegj_;
    /**
     * <code>uint32 ilodbmpgegj = 1;</code>
     * @return The ilodbmpgegj.
     */
    @java.lang.Override
    public int getIlodbmpgegj() {
      return ilodbmpgegj_;
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
      if (ilodbmpgegj_ != 0) {
        output.writeUInt32(1, ilodbmpgegj_);
      }
      if (lfpempoopmd_ != 0F) {
        output.writeFloat(2, lfpempoopmd_);
      }
      if (dfadhemafpn_ != 0F) {
        output.writeFloat(8, dfadhemafpn_);
      }
      if (ibbkobjieeg_ != false) {
        output.writeBool(12, ibbkobjieeg_);
      }
      if (gookfcglmjd_ != 0F) {
        output.writeFloat(13, gookfcglmjd_);
      }
      if (bhgooledknh_ != 0) {
        output.writeUInt32(15, bhgooledknh_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ilodbmpgegj_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, ilodbmpgegj_);
      }
      if (lfpempoopmd_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, lfpempoopmd_);
      }
      if (dfadhemafpn_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(8, dfadhemafpn_);
      }
      if (ibbkobjieeg_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, ibbkobjieeg_);
      }
      if (gookfcglmjd_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, gookfcglmjd_);
      }
      if (bhgooledknh_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, bhgooledknh_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH other = (emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH) obj;

      if (java.lang.Float.floatToIntBits(getLfpempoopmd())
          != java.lang.Float.floatToIntBits(
              other.getLfpempoopmd())) return false;
      if (java.lang.Float.floatToIntBits(getDfadhemafpn())
          != java.lang.Float.floatToIntBits(
              other.getDfadhemafpn())) return false;
      if (getIbbkobjieeg()
          != other.getIbbkobjieeg()) return false;
      if (java.lang.Float.floatToIntBits(getGookfcglmjd())
          != java.lang.Float.floatToIntBits(
              other.getGookfcglmjd())) return false;
      if (getBhgooledknh()
          != other.getBhgooledknh()) return false;
      if (getIlodbmpgegj()
          != other.getIlodbmpgegj()) return false;
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
      hash = (37 * hash) + LFPEMPOOPMD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLfpempoopmd());
      hash = (37 * hash) + DFADHEMAFPN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDfadhemafpn());
      hash = (37 * hash) + IBBKOBJIEEG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIbbkobjieeg());
      hash = (37 * hash) + GOOKFCGLMJD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getGookfcglmjd());
      hash = (37 * hash) + BHGOOLEDKNH_FIELD_NUMBER;
      hash = (53 * hash) + getBhgooledknh();
      hash = (37 * hash) + ILODBMPGEGJ_FIELD_NUMBER;
      hash = (53 * hash) + getIlodbmpgegj();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH prototype) {
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
     * Protobuf type {@code HBMJGJEADEH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HBMJGJEADEH)
        emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.internal_static_HBMJGJEADEH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.internal_static_HBMJGJEADEH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.class, emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.newBuilder()
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
        lfpempoopmd_ = 0F;

        dfadhemafpn_ = 0F;

        ibbkobjieeg_ = false;

        gookfcglmjd_ = 0F;

        bhgooledknh_ = 0;

        ilodbmpgegj_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.internal_static_HBMJGJEADEH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH build() {
        emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH buildPartial() {
        emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH result = new emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH(this);
        result.lfpempoopmd_ = lfpempoopmd_;
        result.dfadhemafpn_ = dfadhemafpn_;
        result.ibbkobjieeg_ = ibbkobjieeg_;
        result.gookfcglmjd_ = gookfcglmjd_;
        result.bhgooledknh_ = bhgooledknh_;
        result.ilodbmpgegj_ = ilodbmpgegj_;
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
        if (other instanceof emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH) {
          return mergeFrom((emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH other) {
        if (other == emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH.getDefaultInstance()) return this;
        if (other.getLfpempoopmd() != 0F) {
          setLfpempoopmd(other.getLfpempoopmd());
        }
        if (other.getDfadhemafpn() != 0F) {
          setDfadhemafpn(other.getDfadhemafpn());
        }
        if (other.getIbbkobjieeg() != false) {
          setIbbkobjieeg(other.getIbbkobjieeg());
        }
        if (other.getGookfcglmjd() != 0F) {
          setGookfcglmjd(other.getGookfcglmjd());
        }
        if (other.getBhgooledknh() != 0) {
          setBhgooledknh(other.getBhgooledknh());
        }
        if (other.getIlodbmpgegj() != 0) {
          setIlodbmpgegj(other.getIlodbmpgegj());
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
        emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float lfpempoopmd_ ;
      /**
       * <code>float lfpempoopmd = 2;</code>
       * @return The lfpempoopmd.
       */
      @java.lang.Override
      public float getLfpempoopmd() {
        return lfpempoopmd_;
      }
      /**
       * <code>float lfpempoopmd = 2;</code>
       * @param value The lfpempoopmd to set.
       * @return This builder for chaining.
       */
      public Builder setLfpempoopmd(float value) {
        
        lfpempoopmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float lfpempoopmd = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLfpempoopmd() {
        
        lfpempoopmd_ = 0F;
        onChanged();
        return this;
      }

      private float dfadhemafpn_ ;
      /**
       * <code>float dfadhemafpn = 8;</code>
       * @return The dfadhemafpn.
       */
      @java.lang.Override
      public float getDfadhemafpn() {
        return dfadhemafpn_;
      }
      /**
       * <code>float dfadhemafpn = 8;</code>
       * @param value The dfadhemafpn to set.
       * @return This builder for chaining.
       */
      public Builder setDfadhemafpn(float value) {
        
        dfadhemafpn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float dfadhemafpn = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDfadhemafpn() {
        
        dfadhemafpn_ = 0F;
        onChanged();
        return this;
      }

      private boolean ibbkobjieeg_ ;
      /**
       * <code>bool ibbkobjieeg = 12;</code>
       * @return The ibbkobjieeg.
       */
      @java.lang.Override
      public boolean getIbbkobjieeg() {
        return ibbkobjieeg_;
      }
      /**
       * <code>bool ibbkobjieeg = 12;</code>
       * @param value The ibbkobjieeg to set.
       * @return This builder for chaining.
       */
      public Builder setIbbkobjieeg(boolean value) {
        
        ibbkobjieeg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ibbkobjieeg = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIbbkobjieeg() {
        
        ibbkobjieeg_ = false;
        onChanged();
        return this;
      }

      private float gookfcglmjd_ ;
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @return The gookfcglmjd.
       */
      @java.lang.Override
      public float getGookfcglmjd() {
        return gookfcglmjd_;
      }
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @param value The gookfcglmjd to set.
       * @return This builder for chaining.
       */
      public Builder setGookfcglmjd(float value) {
        
        gookfcglmjd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float gookfcglmjd = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGookfcglmjd() {
        
        gookfcglmjd_ = 0F;
        onChanged();
        return this;
      }

      private int bhgooledknh_ ;
      /**
       * <code>uint32 bhgooledknh = 15;</code>
       * @return The bhgooledknh.
       */
      @java.lang.Override
      public int getBhgooledknh() {
        return bhgooledknh_;
      }
      /**
       * <code>uint32 bhgooledknh = 15;</code>
       * @param value The bhgooledknh to set.
       * @return This builder for chaining.
       */
      public Builder setBhgooledknh(int value) {
        
        bhgooledknh_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bhgooledknh = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBhgooledknh() {
        
        bhgooledknh_ = 0;
        onChanged();
        return this;
      }

      private int ilodbmpgegj_ ;
      /**
       * <code>uint32 ilodbmpgegj = 1;</code>
       * @return The ilodbmpgegj.
       */
      @java.lang.Override
      public int getIlodbmpgegj() {
        return ilodbmpgegj_;
      }
      /**
       * <code>uint32 ilodbmpgegj = 1;</code>
       * @param value The ilodbmpgegj to set.
       * @return This builder for chaining.
       */
      public Builder setIlodbmpgegj(int value) {
        
        ilodbmpgegj_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ilodbmpgegj = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIlodbmpgegj() {
        
        ilodbmpgegj_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HBMJGJEADEH)
    }

    // @@protoc_insertion_point(class_scope:HBMJGJEADEH)
    private static final emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH();
    }

    public static emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HBMJGJEADEH>
        PARSER = new com.google.protobuf.AbstractParser<HBMJGJEADEH>() {
      @java.lang.Override
      public HBMJGJEADEH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HBMJGJEADEH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HBMJGJEADEH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HBMJGJEADEH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HBMJGJEADEHOuterClass.HBMJGJEADEH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HBMJGJEADEH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HBMJGJEADEH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HBMJGJEADEH.proto\"\213\001\n\013HBMJGJEADEH\022\023\n\013l" +
      "fpempoopmd\030\002 \001(\002\022\023\n\013dfadhemafpn\030\010 \001(\002\022\023\n" +
      "\013ibbkobjieeg\030\014 \001(\010\022\023\n\013gookfcglmjd\030\r \001(\002\022" +
      "\023\n\013bhgooledknh\030\017 \001(\r\022\023\n\013ilodbmpgegj\030\001 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HBMJGJEADEH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HBMJGJEADEH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HBMJGJEADEH_descriptor,
        new java.lang.String[] { "Lfpempoopmd", "Dfadhemafpn", "Ibbkobjieeg", "Gookfcglmjd", "Bhgooledknh", "Ilodbmpgegj", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
