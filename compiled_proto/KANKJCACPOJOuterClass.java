// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KANKJCACPOJ.proto

package emu.grasscutter.net.proto;

public final class KANKJCACPOJOuterClass {
  private KANKJCACPOJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KANKJCACPOJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KANKJCACPOJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool omgkbbbfjli = 13;</code>
     * @return The omgkbbbfjli.
     */
    boolean getOmgkbbbfjli();

    /**
     * <code>float gookfcglmjd = 2;</code>
     * @return The gookfcglmjd.
     */
    float getGookfcglmjd();

    /**
     * <code>float oidmkpmeonj = 6;</code>
     * @return The oidmkpmeonj.
     */
    float getOidmkpmeonj();

    /**
     * <code>uint32 avatarId = 7;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>string bleallaejce = 5;</code>
     * @return The bleallaejce.
     */
    java.lang.String getBleallaejce();
    /**
     * <code>string bleallaejce = 5;</code>
     * @return The bytes for bleallaejce.
     */
    com.google.protobuf.ByteString
        getBleallaejceBytes();

    /**
     * <code>float dfadhemafpn = 3;</code>
     * @return The dfadhemafpn.
     */
    float getDfadhemafpn();
  }
  /**
   * Protobuf type {@code KANKJCACPOJ}
   */
  public static final class KANKJCACPOJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KANKJCACPOJ)
      KANKJCACPOJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KANKJCACPOJ.newBuilder() to construct.
    private KANKJCACPOJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KANKJCACPOJ() {
      bleallaejce_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KANKJCACPOJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KANKJCACPOJ(
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
            case 21: {

              gookfcglmjd_ = input.readFloat();
              break;
            }
            case 29: {

              dfadhemafpn_ = input.readFloat();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              bleallaejce_ = s;
              break;
            }
            case 53: {

              oidmkpmeonj_ = input.readFloat();
              break;
            }
            case 56: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 104: {

              omgkbbbfjli_ = input.readBool();
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
      return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.internal_static_KANKJCACPOJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.internal_static_KANKJCACPOJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.class, emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.Builder.class);
    }

    public static final int OMGKBBBFJLI_FIELD_NUMBER = 13;
    private boolean omgkbbbfjli_;
    /**
     * <code>bool omgkbbbfjli = 13;</code>
     * @return The omgkbbbfjli.
     */
    @java.lang.Override
    public boolean getOmgkbbbfjli() {
      return omgkbbbfjli_;
    }

    public static final int GOOKFCGLMJD_FIELD_NUMBER = 2;
    private float gookfcglmjd_;
    /**
     * <code>float gookfcglmjd = 2;</code>
     * @return The gookfcglmjd.
     */
    @java.lang.Override
    public float getGookfcglmjd() {
      return gookfcglmjd_;
    }

    public static final int OIDMKPMEONJ_FIELD_NUMBER = 6;
    private float oidmkpmeonj_;
    /**
     * <code>float oidmkpmeonj = 6;</code>
     * @return The oidmkpmeonj.
     */
    @java.lang.Override
    public float getOidmkpmeonj() {
      return oidmkpmeonj_;
    }

    public static final int AVATARID_FIELD_NUMBER = 7;
    private int avatarId_;
    /**
     * <code>uint32 avatarId = 7;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int BLEALLAEJCE_FIELD_NUMBER = 5;
    private volatile java.lang.Object bleallaejce_;
    /**
     * <code>string bleallaejce = 5;</code>
     * @return The bleallaejce.
     */
    @java.lang.Override
    public java.lang.String getBleallaejce() {
      java.lang.Object ref = bleallaejce_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bleallaejce_ = s;
        return s;
      }
    }
    /**
     * <code>string bleallaejce = 5;</code>
     * @return The bytes for bleallaejce.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBleallaejceBytes() {
      java.lang.Object ref = bleallaejce_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bleallaejce_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DFADHEMAFPN_FIELD_NUMBER = 3;
    private float dfadhemafpn_;
    /**
     * <code>float dfadhemafpn = 3;</code>
     * @return The dfadhemafpn.
     */
    @java.lang.Override
    public float getDfadhemafpn() {
      return dfadhemafpn_;
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
      if (gookfcglmjd_ != 0F) {
        output.writeFloat(2, gookfcglmjd_);
      }
      if (dfadhemafpn_ != 0F) {
        output.writeFloat(3, dfadhemafpn_);
      }
      if (!getBleallaejceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bleallaejce_);
      }
      if (oidmkpmeonj_ != 0F) {
        output.writeFloat(6, oidmkpmeonj_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(7, avatarId_);
      }
      if (omgkbbbfjli_ != false) {
        output.writeBool(13, omgkbbbfjli_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gookfcglmjd_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, gookfcglmjd_);
      }
      if (dfadhemafpn_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, dfadhemafpn_);
      }
      if (!getBleallaejceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bleallaejce_);
      }
      if (oidmkpmeonj_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, oidmkpmeonj_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, avatarId_);
      }
      if (omgkbbbfjli_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, omgkbbbfjli_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ other = (emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ) obj;

      if (getOmgkbbbfjli()
          != other.getOmgkbbbfjli()) return false;
      if (java.lang.Float.floatToIntBits(getGookfcglmjd())
          != java.lang.Float.floatToIntBits(
              other.getGookfcglmjd())) return false;
      if (java.lang.Float.floatToIntBits(getOidmkpmeonj())
          != java.lang.Float.floatToIntBits(
              other.getOidmkpmeonj())) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (!getBleallaejce()
          .equals(other.getBleallaejce())) return false;
      if (java.lang.Float.floatToIntBits(getDfadhemafpn())
          != java.lang.Float.floatToIntBits(
              other.getDfadhemafpn())) return false;
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
      hash = (37 * hash) + OMGKBBBFJLI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOmgkbbbfjli());
      hash = (37 * hash) + GOOKFCGLMJD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getGookfcglmjd());
      hash = (37 * hash) + OIDMKPMEONJ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOidmkpmeonj());
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + BLEALLAEJCE_FIELD_NUMBER;
      hash = (53 * hash) + getBleallaejce().hashCode();
      hash = (37 * hash) + DFADHEMAFPN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDfadhemafpn());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ prototype) {
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
     * Protobuf type {@code KANKJCACPOJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KANKJCACPOJ)
        emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.internal_static_KANKJCACPOJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.internal_static_KANKJCACPOJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.class, emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.newBuilder()
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
        omgkbbbfjli_ = false;

        gookfcglmjd_ = 0F;

        oidmkpmeonj_ = 0F;

        avatarId_ = 0;

        bleallaejce_ = "";

        dfadhemafpn_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.internal_static_KANKJCACPOJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ build() {
        emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ buildPartial() {
        emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ result = new emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ(this);
        result.omgkbbbfjli_ = omgkbbbfjli_;
        result.gookfcglmjd_ = gookfcglmjd_;
        result.oidmkpmeonj_ = oidmkpmeonj_;
        result.avatarId_ = avatarId_;
        result.bleallaejce_ = bleallaejce_;
        result.dfadhemafpn_ = dfadhemafpn_;
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
        if (other instanceof emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ) {
          return mergeFrom((emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ other) {
        if (other == emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ.getDefaultInstance()) return this;
        if (other.getOmgkbbbfjli() != false) {
          setOmgkbbbfjli(other.getOmgkbbbfjli());
        }
        if (other.getGookfcglmjd() != 0F) {
          setGookfcglmjd(other.getGookfcglmjd());
        }
        if (other.getOidmkpmeonj() != 0F) {
          setOidmkpmeonj(other.getOidmkpmeonj());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (!other.getBleallaejce().isEmpty()) {
          bleallaejce_ = other.bleallaejce_;
          onChanged();
        }
        if (other.getDfadhemafpn() != 0F) {
          setDfadhemafpn(other.getDfadhemafpn());
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
        emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean omgkbbbfjli_ ;
      /**
       * <code>bool omgkbbbfjli = 13;</code>
       * @return The omgkbbbfjli.
       */
      @java.lang.Override
      public boolean getOmgkbbbfjli() {
        return omgkbbbfjli_;
      }
      /**
       * <code>bool omgkbbbfjli = 13;</code>
       * @param value The omgkbbbfjli to set.
       * @return This builder for chaining.
       */
      public Builder setOmgkbbbfjli(boolean value) {
        
        omgkbbbfjli_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool omgkbbbfjli = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOmgkbbbfjli() {
        
        omgkbbbfjli_ = false;
        onChanged();
        return this;
      }

      private float gookfcglmjd_ ;
      /**
       * <code>float gookfcglmjd = 2;</code>
       * @return The gookfcglmjd.
       */
      @java.lang.Override
      public float getGookfcglmjd() {
        return gookfcglmjd_;
      }
      /**
       * <code>float gookfcglmjd = 2;</code>
       * @param value The gookfcglmjd to set.
       * @return This builder for chaining.
       */
      public Builder setGookfcglmjd(float value) {
        
        gookfcglmjd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float gookfcglmjd = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGookfcglmjd() {
        
        gookfcglmjd_ = 0F;
        onChanged();
        return this;
      }

      private float oidmkpmeonj_ ;
      /**
       * <code>float oidmkpmeonj = 6;</code>
       * @return The oidmkpmeonj.
       */
      @java.lang.Override
      public float getOidmkpmeonj() {
        return oidmkpmeonj_;
      }
      /**
       * <code>float oidmkpmeonj = 6;</code>
       * @param value The oidmkpmeonj to set.
       * @return This builder for chaining.
       */
      public Builder setOidmkpmeonj(float value) {
        
        oidmkpmeonj_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float oidmkpmeonj = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOidmkpmeonj() {
        
        oidmkpmeonj_ = 0F;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 7;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 7;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object bleallaejce_ = "";
      /**
       * <code>string bleallaejce = 5;</code>
       * @return The bleallaejce.
       */
      public java.lang.String getBleallaejce() {
        java.lang.Object ref = bleallaejce_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          bleallaejce_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string bleallaejce = 5;</code>
       * @return The bytes for bleallaejce.
       */
      public com.google.protobuf.ByteString
          getBleallaejceBytes() {
        java.lang.Object ref = bleallaejce_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          bleallaejce_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string bleallaejce = 5;</code>
       * @param value The bleallaejce to set.
       * @return This builder for chaining.
       */
      public Builder setBleallaejce(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        bleallaejce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string bleallaejce = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBleallaejce() {
        
        bleallaejce_ = getDefaultInstance().getBleallaejce();
        onChanged();
        return this;
      }
      /**
       * <code>string bleallaejce = 5;</code>
       * @param value The bytes for bleallaejce to set.
       * @return This builder for chaining.
       */
      public Builder setBleallaejceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        bleallaejce_ = value;
        onChanged();
        return this;
      }

      private float dfadhemafpn_ ;
      /**
       * <code>float dfadhemafpn = 3;</code>
       * @return The dfadhemafpn.
       */
      @java.lang.Override
      public float getDfadhemafpn() {
        return dfadhemafpn_;
      }
      /**
       * <code>float dfadhemafpn = 3;</code>
       * @param value The dfadhemafpn to set.
       * @return This builder for chaining.
       */
      public Builder setDfadhemafpn(float value) {
        
        dfadhemafpn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float dfadhemafpn = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDfadhemafpn() {
        
        dfadhemafpn_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:KANKJCACPOJ)
    }

    // @@protoc_insertion_point(class_scope:KANKJCACPOJ)
    private static final emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ();
    }

    public static emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KANKJCACPOJ>
        PARSER = new com.google.protobuf.AbstractParser<KANKJCACPOJ>() {
      @java.lang.Override
      public KANKJCACPOJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KANKJCACPOJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KANKJCACPOJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KANKJCACPOJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KANKJCACPOJOuterClass.KANKJCACPOJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KANKJCACPOJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KANKJCACPOJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KANKJCACPOJ.proto\"\210\001\n\013KANKJCACPOJ\022\023\n\013o" +
      "mgkbbbfjli\030\r \001(\010\022\023\n\013gookfcglmjd\030\002 \001(\002\022\023\n" +
      "\013oidmkpmeonj\030\006 \001(\002\022\020\n\010avatarId\030\007 \001(\r\022\023\n\013" +
      "bleallaejce\030\005 \001(\t\022\023\n\013dfadhemafpn\030\003 \001(\002B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KANKJCACPOJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KANKJCACPOJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KANKJCACPOJ_descriptor,
        new java.lang.String[] { "Omgkbbbfjli", "Gookfcglmjd", "Oidmkpmeonj", "AvatarId", "Bleallaejce", "Dfadhemafpn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}