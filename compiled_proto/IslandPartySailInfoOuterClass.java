// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartySailInfo.proto

package emu.grasscutter.net.proto;

public final class IslandPartySailInfoOuterClass {
  private IslandPartySailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartySailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartySailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GalleryStartSource startSource = 1;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource startSource = 1;</code>
     * @return The startSource.
     */
    emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>uint32 Unk3300_MJOIIJIBAHF = 5;</code>
     * @return The unk3300MJOIIJIBAHF.
     */
    int getUnk3300MJOIIJIBAHF();

    /**
     * <code>uint32 Unk3300_MJHMCAPGBIK = 11;</code>
     * @return The unk3300MJHMCAPGBIK.
     */
    int getUnk3300MJHMCAPGBIK();

    /**
     * <code>.IslandPartySailStage stage = 14;</code>
     * @return The enum numeric value on the wire for stage.
     */
    int getStageValue();
    /**
     * <code>.IslandPartySailStage stage = 14;</code>
     * @return The stage.
     */
    emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage getStage();

    /**
     * <code>uint32 Unk3300_HCJGDHEMBLM = 7;</code>
     * @return The unk3300HCJGDHEMBLM.
     */
    int getUnk3300HCJGDHEMBLM();

    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>uint32 Unk3300_PFCJODGNDCI = 8;</code>
     * @return The unk3300PFCJODGNDCI.
     */
    int getUnk3300PFCJODGNDCI();
  }
  /**
   * Protobuf type {@code IslandPartySailInfo}
   */
  public static final class IslandPartySailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartySailInfo)
      IslandPartySailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartySailInfo.newBuilder() to construct.
    private IslandPartySailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartySailInfo() {
      startSource_ = 0;
      stage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartySailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IslandPartySailInfo(
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
              int rawValue = input.readEnum();

              startSource_ = rawValue;
              break;
            }
            case 40: {

              unk3300MJOIIJIBAHF_ = input.readUInt32();
              break;
            }
            case 56: {

              unk3300HCJGDHEMBLM_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3300PFCJODGNDCI_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300MJHMCAPGBIK_ = input.readUInt32();
              break;
            }
            case 104: {

              coin_ = input.readUInt32();
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              stage_ = rawValue;
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
      return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.internal_static_IslandPartySailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.internal_static_IslandPartySailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.class, emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.Builder.class);
    }

    public static final int STARTSOURCE_FIELD_NUMBER = 1;
    private int startSource_;
    /**
     * <code>.GalleryStartSource startSource = 1;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource startSource = 1;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
      return result == null ? emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int UNK3300_MJOIIJIBAHF_FIELD_NUMBER = 5;
    private int unk3300MJOIIJIBAHF_;
    /**
     * <code>uint32 Unk3300_MJOIIJIBAHF = 5;</code>
     * @return The unk3300MJOIIJIBAHF.
     */
    @java.lang.Override
    public int getUnk3300MJOIIJIBAHF() {
      return unk3300MJOIIJIBAHF_;
    }

    public static final int UNK3300_MJHMCAPGBIK_FIELD_NUMBER = 11;
    private int unk3300MJHMCAPGBIK_;
    /**
     * <code>uint32 Unk3300_MJHMCAPGBIK = 11;</code>
     * @return The unk3300MJHMCAPGBIK.
     */
    @java.lang.Override
    public int getUnk3300MJHMCAPGBIK() {
      return unk3300MJHMCAPGBIK_;
    }

    public static final int STAGE_FIELD_NUMBER = 14;
    private int stage_;
    /**
     * <code>.IslandPartySailStage stage = 14;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.IslandPartySailStage stage = 14;</code>
     * @return The stage.
     */
    @java.lang.Override public emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
      return result == null ? emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
    }

    public static final int UNK3300_HCJGDHEMBLM_FIELD_NUMBER = 7;
    private int unk3300HCJGDHEMBLM_;
    /**
     * <code>uint32 Unk3300_HCJGDHEMBLM = 7;</code>
     * @return The unk3300HCJGDHEMBLM.
     */
    @java.lang.Override
    public int getUnk3300HCJGDHEMBLM() {
      return unk3300HCJGDHEMBLM_;
    }

    public static final int COIN_FIELD_NUMBER = 13;
    private int coin_;
    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int UNK3300_PFCJODGNDCI_FIELD_NUMBER = 8;
    private int unk3300PFCJODGNDCI_;
    /**
     * <code>uint32 Unk3300_PFCJODGNDCI = 8;</code>
     * @return The unk3300PFCJODGNDCI.
     */
    @java.lang.Override
    public int getUnk3300PFCJODGNDCI() {
      return unk3300PFCJODGNDCI_;
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
      if (startSource_ != emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        output.writeEnum(1, startSource_);
      }
      if (unk3300MJOIIJIBAHF_ != 0) {
        output.writeUInt32(5, unk3300MJOIIJIBAHF_);
      }
      if (unk3300HCJGDHEMBLM_ != 0) {
        output.writeUInt32(7, unk3300HCJGDHEMBLM_);
      }
      if (unk3300PFCJODGNDCI_ != 0) {
        output.writeUInt32(8, unk3300PFCJODGNDCI_);
      }
      if (unk3300MJHMCAPGBIK_ != 0) {
        output.writeUInt32(11, unk3300MJHMCAPGBIK_);
      }
      if (coin_ != 0) {
        output.writeUInt32(13, coin_);
      }
      if (stage_ != emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        output.writeEnum(14, stage_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startSource_ != emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, startSource_);
      }
      if (unk3300MJOIIJIBAHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300MJOIIJIBAHF_);
      }
      if (unk3300HCJGDHEMBLM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300HCJGDHEMBLM_);
      }
      if (unk3300PFCJODGNDCI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300PFCJODGNDCI_);
      }
      if (unk3300MJHMCAPGBIK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300MJHMCAPGBIK_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, coin_);
      }
      if (stage_ != emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, stage_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo other = (emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo) obj;

      if (startSource_ != other.startSource_) return false;
      if (getUnk3300MJOIIJIBAHF()
          != other.getUnk3300MJOIIJIBAHF()) return false;
      if (getUnk3300MJHMCAPGBIK()
          != other.getUnk3300MJHMCAPGBIK()) return false;
      if (stage_ != other.stage_) return false;
      if (getUnk3300HCJGDHEMBLM()
          != other.getUnk3300HCJGDHEMBLM()) return false;
      if (getCoin()
          != other.getCoin()) return false;
      if (getUnk3300PFCJODGNDCI()
          != other.getUnk3300PFCJODGNDCI()) return false;
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
      hash = (37 * hash) + STARTSOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + UNK3300_MJOIIJIBAHF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MJOIIJIBAHF();
      hash = (37 * hash) + UNK3300_MJHMCAPGBIK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MJHMCAPGBIK();
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + stage_;
      hash = (37 * hash) + UNK3300_HCJGDHEMBLM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HCJGDHEMBLM();
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + UNK3300_PFCJODGNDCI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300PFCJODGNDCI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo prototype) {
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
     * Protobuf type {@code IslandPartySailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartySailInfo)
        emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.internal_static_IslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.internal_static_IslandPartySailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.class, emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.newBuilder()
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
        startSource_ = 0;

        unk3300MJOIIJIBAHF_ = 0;

        unk3300MJHMCAPGBIK_ = 0;

        stage_ = 0;

        unk3300HCJGDHEMBLM_ = 0;

        coin_ = 0;

        unk3300PFCJODGNDCI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.internal_static_IslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo build() {
        emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo buildPartial() {
        emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo result = new emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo(this);
        result.startSource_ = startSource_;
        result.unk3300MJOIIJIBAHF_ = unk3300MJOIIJIBAHF_;
        result.unk3300MJHMCAPGBIK_ = unk3300MJHMCAPGBIK_;
        result.stage_ = stage_;
        result.unk3300HCJGDHEMBLM_ = unk3300HCJGDHEMBLM_;
        result.coin_ = coin_;
        result.unk3300PFCJODGNDCI_ = unk3300PFCJODGNDCI_;
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
        if (other instanceof emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo other) {
        if (other == emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo.getDefaultInstance()) return this;
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getUnk3300MJOIIJIBAHF() != 0) {
          setUnk3300MJOIIJIBAHF(other.getUnk3300MJOIIJIBAHF());
        }
        if (other.getUnk3300MJHMCAPGBIK() != 0) {
          setUnk3300MJHMCAPGBIK(other.getUnk3300MJHMCAPGBIK());
        }
        if (other.stage_ != 0) {
          setStageValue(other.getStageValue());
        }
        if (other.getUnk3300HCJGDHEMBLM() != 0) {
          setUnk3300HCJGDHEMBLM(other.getUnk3300HCJGDHEMBLM());
        }
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.getUnk3300PFCJODGNDCI() != 0) {
          setUnk3300PFCJODGNDCI(other.getUnk3300PFCJODGNDCI());
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
        emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource startSource = 1;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource startSource = 1;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        
        startSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource startSource = 1;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
        return result == null ? emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource startSource = 1;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource startSource = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        
        startSource_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MJOIIJIBAHF_ ;
      /**
       * <code>uint32 Unk3300_MJOIIJIBAHF = 5;</code>
       * @return The unk3300MJOIIJIBAHF.
       */
      @java.lang.Override
      public int getUnk3300MJOIIJIBAHF() {
        return unk3300MJOIIJIBAHF_;
      }
      /**
       * <code>uint32 Unk3300_MJOIIJIBAHF = 5;</code>
       * @param value The unk3300MJOIIJIBAHF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MJOIIJIBAHF(int value) {
        
        unk3300MJOIIJIBAHF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MJOIIJIBAHF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MJOIIJIBAHF() {
        
        unk3300MJOIIJIBAHF_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MJHMCAPGBIK_ ;
      /**
       * <code>uint32 Unk3300_MJHMCAPGBIK = 11;</code>
       * @return The unk3300MJHMCAPGBIK.
       */
      @java.lang.Override
      public int getUnk3300MJHMCAPGBIK() {
        return unk3300MJHMCAPGBIK_;
      }
      /**
       * <code>uint32 Unk3300_MJHMCAPGBIK = 11;</code>
       * @param value The unk3300MJHMCAPGBIK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MJHMCAPGBIK(int value) {
        
        unk3300MJHMCAPGBIK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MJHMCAPGBIK = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MJHMCAPGBIK() {
        
        unk3300MJHMCAPGBIK_ = 0;
        onChanged();
        return this;
      }

      private int stage_ = 0;
      /**
       * <code>.IslandPartySailStage stage = 14;</code>
       * @return The enum numeric value on the wire for stage.
       */
      @java.lang.Override public int getStageValue() {
        return stage_;
      }
      /**
       * <code>.IslandPartySailStage stage = 14;</code>
       * @param value The enum numeric value on the wire for stage to set.
       * @return This builder for chaining.
       */
      public Builder setStageValue(int value) {
        
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 14;</code>
       * @return The stage.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
        return result == null ? emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
      }
      /**
       * <code>.IslandPartySailStage stage = 14;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(emu.grasscutter.net.proto.IslandPartySailStageOuterClass.IslandPartySailStage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        
        stage_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HCJGDHEMBLM_ ;
      /**
       * <code>uint32 Unk3300_HCJGDHEMBLM = 7;</code>
       * @return The unk3300HCJGDHEMBLM.
       */
      @java.lang.Override
      public int getUnk3300HCJGDHEMBLM() {
        return unk3300HCJGDHEMBLM_;
      }
      /**
       * <code>uint32 Unk3300_HCJGDHEMBLM = 7;</code>
       * @param value The unk3300HCJGDHEMBLM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HCJGDHEMBLM(int value) {
        
        unk3300HCJGDHEMBLM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HCJGDHEMBLM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HCJGDHEMBLM() {
        
        unk3300HCJGDHEMBLM_ = 0;
        onChanged();
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 13;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int unk3300PFCJODGNDCI_ ;
      /**
       * <code>uint32 Unk3300_PFCJODGNDCI = 8;</code>
       * @return The unk3300PFCJODGNDCI.
       */
      @java.lang.Override
      public int getUnk3300PFCJODGNDCI() {
        return unk3300PFCJODGNDCI_;
      }
      /**
       * <code>uint32 Unk3300_PFCJODGNDCI = 8;</code>
       * @param value The unk3300PFCJODGNDCI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300PFCJODGNDCI(int value) {
        
        unk3300PFCJODGNDCI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_PFCJODGNDCI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300PFCJODGNDCI() {
        
        unk3300PFCJODGNDCI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IslandPartySailInfo)
    }

    // @@protoc_insertion_point(class_scope:IslandPartySailInfo)
    private static final emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo();
    }

    public static emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartySailInfo>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartySailInfo>() {
      @java.lang.Override
      public IslandPartySailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IslandPartySailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IslandPartySailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartySailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartySailInfoOuterClass.IslandPartySailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartySailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartySailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031IslandPartySailInfo.proto\032\030GalleryStar" +
      "tSource.proto\032\032IslandPartySailStage.prot" +
      "o\"\347\001\n\023IslandPartySailInfo\022(\n\013startSource" +
      "\030\001 \001(\0162\023.GalleryStartSource\022\033\n\023Unk3300_M" +
      "JOIIJIBAHF\030\005 \001(\r\022\033\n\023Unk3300_MJHMCAPGBIK\030" +
      "\013 \001(\r\022$\n\005stage\030\016 \001(\0162\025.IslandPartySailSt" +
      "age\022\033\n\023Unk3300_HCJGDHEMBLM\030\007 \001(\r\022\014\n\004coin" +
      "\030\r \001(\r\022\033\n\023Unk3300_PFCJODGNDCI\030\010 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GalleryStartSourceOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.IslandPartySailStageOuterClass.getDescriptor(),
        });
    internal_static_IslandPartySailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartySailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartySailInfo_descriptor,
        new java.lang.String[] { "StartSource", "Unk3300MJOIIJIBAHF", "Unk3300MJHMCAPGBIK", "Stage", "Unk3300HCJGDHEMBLM", "Coin", "Unk3300PFCJODGNDCI", });
    emu.grasscutter.net.proto.GalleryStartSourceOuterClass.getDescriptor();
    emu.grasscutter.net.proto.IslandPartySailStageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}