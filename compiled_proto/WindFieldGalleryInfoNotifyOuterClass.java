// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldGalleryInfoNotify.proto

package emu.grasscutter.net.proto;

public final class WindFieldGalleryInfoNotifyOuterClass {
  private WindFieldGalleryInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldGalleryInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldGalleryInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_EKMHMHJDHIL = 9;</code>
     * @return The unk3300EKMHMHJDHIL.
     */
    int getUnk3300EKMHMHJDHIL();

    /**
     * <code>uint32 Unk3300_GLNHBJJJINK = 4;</code>
     * @return The unk3300GLNHBJJJINK.
     */
    int getUnk3300GLNHBJJJINK();

    /**
     * <code>uint32 Unk3300_FFODAKMKGEK = 13;</code>
     * @return The unk3300FFODAKMKGEK.
     */
    int getUnk3300FFODAKMKGEK();

    /**
     * <code>uint32 Unk3300_OJHJPBCAONA = 1;</code>
     * @return The unk3300OJHJPBCAONA.
     */
    int getUnk3300OJHJPBCAONA();

    /**
     * <code>uint32 Unk3300_NBIBKFKOCFK = 5;</code>
     * @return The unk3300NBIBKFKOCFK.
     */
    int getUnk3300NBIBKFKOCFK();

    /**
     * <code>uint32 Unk3300_MMONPDMIEBN = 15;</code>
     * @return The unk3300MMONPDMIEBN.
     */
    int getUnk3300MMONPDMIEBN();

    /**
     * <code>uint32 Unk3300_GNJKOCLJFNM = 11;</code>
     * @return The unk3300GNJKOCLJFNM.
     */
    int getUnk3300GNJKOCLJFNM();

    /**
     * <code>uint32 Unk3300_GNKCFHMDOHJ = 3;</code>
     * @return The unk3300GNKCFHMDOHJ.
     */
    int getUnk3300GNKCFHMDOHJ();
  }
  /**
   * <pre>
   *enum JOCNCDOAALP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5573;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code WindFieldGalleryInfoNotify}
   */
  public static final class WindFieldGalleryInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldGalleryInfoNotify)
      WindFieldGalleryInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldGalleryInfoNotify.newBuilder() to construct.
    private WindFieldGalleryInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldGalleryInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldGalleryInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldGalleryInfoNotify(
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

              unk3300OJHJPBCAONA_ = input.readUInt32();
              break;
            }
            case 24: {

              unk3300GNKCFHMDOHJ_ = input.readUInt32();
              break;
            }
            case 32: {

              unk3300GLNHBJJJINK_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3300NBIBKFKOCFK_ = input.readUInt32();
              break;
            }
            case 72: {

              unk3300EKMHMHJDHIL_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300GNJKOCLJFNM_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3300FFODAKMKGEK_ = input.readUInt32();
              break;
            }
            case 120: {

              unk3300MMONPDMIEBN_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.Builder.class);
    }

    public static final int UNK3300_EKMHMHJDHIL_FIELD_NUMBER = 9;
    private int unk3300EKMHMHJDHIL_;
    /**
     * <code>uint32 Unk3300_EKMHMHJDHIL = 9;</code>
     * @return The unk3300EKMHMHJDHIL.
     */
    @java.lang.Override
    public int getUnk3300EKMHMHJDHIL() {
      return unk3300EKMHMHJDHIL_;
    }

    public static final int UNK3300_GLNHBJJJINK_FIELD_NUMBER = 4;
    private int unk3300GLNHBJJJINK_;
    /**
     * <code>uint32 Unk3300_GLNHBJJJINK = 4;</code>
     * @return The unk3300GLNHBJJJINK.
     */
    @java.lang.Override
    public int getUnk3300GLNHBJJJINK() {
      return unk3300GLNHBJJJINK_;
    }

    public static final int UNK3300_FFODAKMKGEK_FIELD_NUMBER = 13;
    private int unk3300FFODAKMKGEK_;
    /**
     * <code>uint32 Unk3300_FFODAKMKGEK = 13;</code>
     * @return The unk3300FFODAKMKGEK.
     */
    @java.lang.Override
    public int getUnk3300FFODAKMKGEK() {
      return unk3300FFODAKMKGEK_;
    }

    public static final int UNK3300_OJHJPBCAONA_FIELD_NUMBER = 1;
    private int unk3300OJHJPBCAONA_;
    /**
     * <code>uint32 Unk3300_OJHJPBCAONA = 1;</code>
     * @return The unk3300OJHJPBCAONA.
     */
    @java.lang.Override
    public int getUnk3300OJHJPBCAONA() {
      return unk3300OJHJPBCAONA_;
    }

    public static final int UNK3300_NBIBKFKOCFK_FIELD_NUMBER = 5;
    private int unk3300NBIBKFKOCFK_;
    /**
     * <code>uint32 Unk3300_NBIBKFKOCFK = 5;</code>
     * @return The unk3300NBIBKFKOCFK.
     */
    @java.lang.Override
    public int getUnk3300NBIBKFKOCFK() {
      return unk3300NBIBKFKOCFK_;
    }

    public static final int UNK3300_MMONPDMIEBN_FIELD_NUMBER = 15;
    private int unk3300MMONPDMIEBN_;
    /**
     * <code>uint32 Unk3300_MMONPDMIEBN = 15;</code>
     * @return The unk3300MMONPDMIEBN.
     */
    @java.lang.Override
    public int getUnk3300MMONPDMIEBN() {
      return unk3300MMONPDMIEBN_;
    }

    public static final int UNK3300_GNJKOCLJFNM_FIELD_NUMBER = 11;
    private int unk3300GNJKOCLJFNM_;
    /**
     * <code>uint32 Unk3300_GNJKOCLJFNM = 11;</code>
     * @return The unk3300GNJKOCLJFNM.
     */
    @java.lang.Override
    public int getUnk3300GNJKOCLJFNM() {
      return unk3300GNJKOCLJFNM_;
    }

    public static final int UNK3300_GNKCFHMDOHJ_FIELD_NUMBER = 3;
    private int unk3300GNKCFHMDOHJ_;
    /**
     * <code>uint32 Unk3300_GNKCFHMDOHJ = 3;</code>
     * @return The unk3300GNKCFHMDOHJ.
     */
    @java.lang.Override
    public int getUnk3300GNKCFHMDOHJ() {
      return unk3300GNKCFHMDOHJ_;
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
      if (unk3300OJHJPBCAONA_ != 0) {
        output.writeUInt32(1, unk3300OJHJPBCAONA_);
      }
      if (unk3300GNKCFHMDOHJ_ != 0) {
        output.writeUInt32(3, unk3300GNKCFHMDOHJ_);
      }
      if (unk3300GLNHBJJJINK_ != 0) {
        output.writeUInt32(4, unk3300GLNHBJJJINK_);
      }
      if (unk3300NBIBKFKOCFK_ != 0) {
        output.writeUInt32(5, unk3300NBIBKFKOCFK_);
      }
      if (unk3300EKMHMHJDHIL_ != 0) {
        output.writeUInt32(9, unk3300EKMHMHJDHIL_);
      }
      if (unk3300GNJKOCLJFNM_ != 0) {
        output.writeUInt32(11, unk3300GNJKOCLJFNM_);
      }
      if (unk3300FFODAKMKGEK_ != 0) {
        output.writeUInt32(13, unk3300FFODAKMKGEK_);
      }
      if (unk3300MMONPDMIEBN_ != 0) {
        output.writeUInt32(15, unk3300MMONPDMIEBN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300OJHJPBCAONA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300OJHJPBCAONA_);
      }
      if (unk3300GNKCFHMDOHJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300GNKCFHMDOHJ_);
      }
      if (unk3300GLNHBJJJINK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300GLNHBJJJINK_);
      }
      if (unk3300NBIBKFKOCFK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300NBIBKFKOCFK_);
      }
      if (unk3300EKMHMHJDHIL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3300EKMHMHJDHIL_);
      }
      if (unk3300GNJKOCLJFNM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300GNJKOCLJFNM_);
      }
      if (unk3300FFODAKMKGEK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300FFODAKMKGEK_);
      }
      if (unk3300MMONPDMIEBN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300MMONPDMIEBN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify other = (emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify) obj;

      if (getUnk3300EKMHMHJDHIL()
          != other.getUnk3300EKMHMHJDHIL()) return false;
      if (getUnk3300GLNHBJJJINK()
          != other.getUnk3300GLNHBJJJINK()) return false;
      if (getUnk3300FFODAKMKGEK()
          != other.getUnk3300FFODAKMKGEK()) return false;
      if (getUnk3300OJHJPBCAONA()
          != other.getUnk3300OJHJPBCAONA()) return false;
      if (getUnk3300NBIBKFKOCFK()
          != other.getUnk3300NBIBKFKOCFK()) return false;
      if (getUnk3300MMONPDMIEBN()
          != other.getUnk3300MMONPDMIEBN()) return false;
      if (getUnk3300GNJKOCLJFNM()
          != other.getUnk3300GNJKOCLJFNM()) return false;
      if (getUnk3300GNKCFHMDOHJ()
          != other.getUnk3300GNKCFHMDOHJ()) return false;
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
      hash = (37 * hash) + UNK3300_EKMHMHJDHIL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EKMHMHJDHIL();
      hash = (37 * hash) + UNK3300_GLNHBJJJINK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GLNHBJJJINK();
      hash = (37 * hash) + UNK3300_FFODAKMKGEK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FFODAKMKGEK();
      hash = (37 * hash) + UNK3300_OJHJPBCAONA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300OJHJPBCAONA();
      hash = (37 * hash) + UNK3300_NBIBKFKOCFK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NBIBKFKOCFK();
      hash = (37 * hash) + UNK3300_MMONPDMIEBN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MMONPDMIEBN();
      hash = (37 * hash) + UNK3300_GNJKOCLJFNM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GNJKOCLJFNM();
      hash = (37 * hash) + UNK3300_GNKCFHMDOHJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GNKCFHMDOHJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify prototype) {
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
     *enum JOCNCDOAALP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5573;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code WindFieldGalleryInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldGalleryInfoNotify)
        emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.class, emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.newBuilder()
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
        unk3300EKMHMHJDHIL_ = 0;

        unk3300GLNHBJJJINK_ = 0;

        unk3300FFODAKMKGEK_ = 0;

        unk3300OJHJPBCAONA_ = 0;

        unk3300NBIBKFKOCFK_ = 0;

        unk3300MMONPDMIEBN_ = 0;

        unk3300GNJKOCLJFNM_ = 0;

        unk3300GNKCFHMDOHJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify build() {
        emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify buildPartial() {
        emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify result = new emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify(this);
        result.unk3300EKMHMHJDHIL_ = unk3300EKMHMHJDHIL_;
        result.unk3300GLNHBJJJINK_ = unk3300GLNHBJJJINK_;
        result.unk3300FFODAKMKGEK_ = unk3300FFODAKMKGEK_;
        result.unk3300OJHJPBCAONA_ = unk3300OJHJPBCAONA_;
        result.unk3300NBIBKFKOCFK_ = unk3300NBIBKFKOCFK_;
        result.unk3300MMONPDMIEBN_ = unk3300MMONPDMIEBN_;
        result.unk3300GNJKOCLJFNM_ = unk3300GNJKOCLJFNM_;
        result.unk3300GNKCFHMDOHJ_ = unk3300GNKCFHMDOHJ_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify other) {
        if (other == emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.getDefaultInstance()) return this;
        if (other.getUnk3300EKMHMHJDHIL() != 0) {
          setUnk3300EKMHMHJDHIL(other.getUnk3300EKMHMHJDHIL());
        }
        if (other.getUnk3300GLNHBJJJINK() != 0) {
          setUnk3300GLNHBJJJINK(other.getUnk3300GLNHBJJJINK());
        }
        if (other.getUnk3300FFODAKMKGEK() != 0) {
          setUnk3300FFODAKMKGEK(other.getUnk3300FFODAKMKGEK());
        }
        if (other.getUnk3300OJHJPBCAONA() != 0) {
          setUnk3300OJHJPBCAONA(other.getUnk3300OJHJPBCAONA());
        }
        if (other.getUnk3300NBIBKFKOCFK() != 0) {
          setUnk3300NBIBKFKOCFK(other.getUnk3300NBIBKFKOCFK());
        }
        if (other.getUnk3300MMONPDMIEBN() != 0) {
          setUnk3300MMONPDMIEBN(other.getUnk3300MMONPDMIEBN());
        }
        if (other.getUnk3300GNJKOCLJFNM() != 0) {
          setUnk3300GNJKOCLJFNM(other.getUnk3300GNJKOCLJFNM());
        }
        if (other.getUnk3300GNKCFHMDOHJ() != 0) {
          setUnk3300GNKCFHMDOHJ(other.getUnk3300GNKCFHMDOHJ());
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
        emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300EKMHMHJDHIL_ ;
      /**
       * <code>uint32 Unk3300_EKMHMHJDHIL = 9;</code>
       * @return The unk3300EKMHMHJDHIL.
       */
      @java.lang.Override
      public int getUnk3300EKMHMHJDHIL() {
        return unk3300EKMHMHJDHIL_;
      }
      /**
       * <code>uint32 Unk3300_EKMHMHJDHIL = 9;</code>
       * @param value The unk3300EKMHMHJDHIL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EKMHMHJDHIL(int value) {
        
        unk3300EKMHMHJDHIL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EKMHMHJDHIL = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EKMHMHJDHIL() {
        
        unk3300EKMHMHJDHIL_ = 0;
        onChanged();
        return this;
      }

      private int unk3300GLNHBJJJINK_ ;
      /**
       * <code>uint32 Unk3300_GLNHBJJJINK = 4;</code>
       * @return The unk3300GLNHBJJJINK.
       */
      @java.lang.Override
      public int getUnk3300GLNHBJJJINK() {
        return unk3300GLNHBJJJINK_;
      }
      /**
       * <code>uint32 Unk3300_GLNHBJJJINK = 4;</code>
       * @param value The unk3300GLNHBJJJINK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GLNHBJJJINK(int value) {
        
        unk3300GLNHBJJJINK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GLNHBJJJINK = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GLNHBJJJINK() {
        
        unk3300GLNHBJJJINK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FFODAKMKGEK_ ;
      /**
       * <code>uint32 Unk3300_FFODAKMKGEK = 13;</code>
       * @return The unk3300FFODAKMKGEK.
       */
      @java.lang.Override
      public int getUnk3300FFODAKMKGEK() {
        return unk3300FFODAKMKGEK_;
      }
      /**
       * <code>uint32 Unk3300_FFODAKMKGEK = 13;</code>
       * @param value The unk3300FFODAKMKGEK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FFODAKMKGEK(int value) {
        
        unk3300FFODAKMKGEK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FFODAKMKGEK = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FFODAKMKGEK() {
        
        unk3300FFODAKMKGEK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300OJHJPBCAONA_ ;
      /**
       * <code>uint32 Unk3300_OJHJPBCAONA = 1;</code>
       * @return The unk3300OJHJPBCAONA.
       */
      @java.lang.Override
      public int getUnk3300OJHJPBCAONA() {
        return unk3300OJHJPBCAONA_;
      }
      /**
       * <code>uint32 Unk3300_OJHJPBCAONA = 1;</code>
       * @param value The unk3300OJHJPBCAONA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300OJHJPBCAONA(int value) {
        
        unk3300OJHJPBCAONA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_OJHJPBCAONA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300OJHJPBCAONA() {
        
        unk3300OJHJPBCAONA_ = 0;
        onChanged();
        return this;
      }

      private int unk3300NBIBKFKOCFK_ ;
      /**
       * <code>uint32 Unk3300_NBIBKFKOCFK = 5;</code>
       * @return The unk3300NBIBKFKOCFK.
       */
      @java.lang.Override
      public int getUnk3300NBIBKFKOCFK() {
        return unk3300NBIBKFKOCFK_;
      }
      /**
       * <code>uint32 Unk3300_NBIBKFKOCFK = 5;</code>
       * @param value The unk3300NBIBKFKOCFK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NBIBKFKOCFK(int value) {
        
        unk3300NBIBKFKOCFK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NBIBKFKOCFK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NBIBKFKOCFK() {
        
        unk3300NBIBKFKOCFK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MMONPDMIEBN_ ;
      /**
       * <code>uint32 Unk3300_MMONPDMIEBN = 15;</code>
       * @return The unk3300MMONPDMIEBN.
       */
      @java.lang.Override
      public int getUnk3300MMONPDMIEBN() {
        return unk3300MMONPDMIEBN_;
      }
      /**
       * <code>uint32 Unk3300_MMONPDMIEBN = 15;</code>
       * @param value The unk3300MMONPDMIEBN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MMONPDMIEBN(int value) {
        
        unk3300MMONPDMIEBN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MMONPDMIEBN = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MMONPDMIEBN() {
        
        unk3300MMONPDMIEBN_ = 0;
        onChanged();
        return this;
      }

      private int unk3300GNJKOCLJFNM_ ;
      /**
       * <code>uint32 Unk3300_GNJKOCLJFNM = 11;</code>
       * @return The unk3300GNJKOCLJFNM.
       */
      @java.lang.Override
      public int getUnk3300GNJKOCLJFNM() {
        return unk3300GNJKOCLJFNM_;
      }
      /**
       * <code>uint32 Unk3300_GNJKOCLJFNM = 11;</code>
       * @param value The unk3300GNJKOCLJFNM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GNJKOCLJFNM(int value) {
        
        unk3300GNJKOCLJFNM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GNJKOCLJFNM = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GNJKOCLJFNM() {
        
        unk3300GNJKOCLJFNM_ = 0;
        onChanged();
        return this;
      }

      private int unk3300GNKCFHMDOHJ_ ;
      /**
       * <code>uint32 Unk3300_GNKCFHMDOHJ = 3;</code>
       * @return The unk3300GNKCFHMDOHJ.
       */
      @java.lang.Override
      public int getUnk3300GNKCFHMDOHJ() {
        return unk3300GNKCFHMDOHJ_;
      }
      /**
       * <code>uint32 Unk3300_GNKCFHMDOHJ = 3;</code>
       * @param value The unk3300GNKCFHMDOHJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GNKCFHMDOHJ(int value) {
        
        unk3300GNKCFHMDOHJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GNKCFHMDOHJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GNKCFHMDOHJ() {
        
        unk3300GNKCFHMDOHJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldGalleryInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WindFieldGalleryInfoNotify)
    private static final emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify();
    }

    public static emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldGalleryInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldGalleryInfoNotify>() {
      @java.lang.Override
      public WindFieldGalleryInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldGalleryInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldGalleryInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldGalleryInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldGalleryInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldGalleryInfoNotify.proto\"\204\002\n\032W" +
      "indFieldGalleryInfoNotify\022\033\n\023Unk3300_EKM" +
      "HMHJDHIL\030\t \001(\r\022\033\n\023Unk3300_GLNHBJJJINK\030\004 " +
      "\001(\r\022\033\n\023Unk3300_FFODAKMKGEK\030\r \001(\r\022\033\n\023Unk3" +
      "300_OJHJPBCAONA\030\001 \001(\r\022\033\n\023Unk3300_NBIBKFK" +
      "OCFK\030\005 \001(\r\022\033\n\023Unk3300_MMONPDMIEBN\030\017 \001(\r\022" +
      "\033\n\023Unk3300_GNJKOCLJFNM\030\013 \001(\r\022\033\n\023Unk3300_" +
      "GNKCFHMDOHJ\030\003 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindFieldGalleryInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldGalleryInfoNotify_descriptor,
        new java.lang.String[] { "Unk3300EKMHMHJDHIL", "Unk3300GLNHBJJJINK", "Unk3300FFODAKMKGEK", "Unk3300OJHJPBCAONA", "Unk3300NBIBKFKOCFK", "Unk3300MMONPDMIEBN", "Unk3300GNJKOCLJFNM", "Unk3300GNKCFHMDOHJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
