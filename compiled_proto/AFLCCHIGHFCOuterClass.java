// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AFLCCHIGHFC.proto

package emu.grasscutter.net.proto;

public final class AFLCCHIGHFCOuterClass {
  private AFLCCHIGHFCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AFLCCHIGHFCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AFLCCHIGHFC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 fekdaediiel = 1;</code>
     * @return The fekdaediiel.
     */
    int getFekdaediiel();

    /**
     * <code>int32 ocjodgafcna = 2;</code>
     * @return The ocjodgafcna.
     */
    int getOcjodgafcna();

    /**
     * <code>int32 paamjmeflfp = 3;</code>
     * @return The paamjmeflfp.
     */
    int getPaamjmeflfp();

    /**
     * <code>int32 lolngckkkek = 4;</code>
     * @return The lolngckkkek.
     */
    int getLolngckkkek();

    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> 
        getNkifjffiglbList();
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO getNkifjffiglb(int index);
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    int getNkifjffiglbCount();
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder> 
        getNkifjffiglbOrBuilderList();
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder getNkifjffiglbOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code AFLCCHIGHFC}
   */
  public static final class AFLCCHIGHFC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AFLCCHIGHFC)
      AFLCCHIGHFCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AFLCCHIGHFC.newBuilder() to construct.
    private AFLCCHIGHFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AFLCCHIGHFC() {
      nkifjffiglb_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AFLCCHIGHFC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AFLCCHIGHFC(
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
            case 8: {

              fekdaediiel_ = input.readInt32();
              break;
            }
            case 16: {

              ocjodgafcna_ = input.readInt32();
              break;
            }
            case 24: {

              paamjmeflfp_ = input.readInt32();
              break;
            }
            case 32: {

              lolngckkkek_ = input.readInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nkifjffiglb_ = new java.util.ArrayList<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO>();
                mutable_bitField0_ |= 0x00000001;
              }
              nkifjffiglb_.add(
                  input.readMessage(emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.parser(), extensionRegistry));
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
          nkifjffiglb_ = java.util.Collections.unmodifiableList(nkifjffiglb_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.internal_static_AFLCCHIGHFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.internal_static_AFLCCHIGHFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.class, emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.Builder.class);
    }

    public static final int FEKDAEDIIEL_FIELD_NUMBER = 1;
    private int fekdaediiel_;
    /**
     * <code>int32 fekdaediiel = 1;</code>
     * @return The fekdaediiel.
     */
    @java.lang.Override
    public int getFekdaediiel() {
      return fekdaediiel_;
    }

    public static final int OCJODGAFCNA_FIELD_NUMBER = 2;
    private int ocjodgafcna_;
    /**
     * <code>int32 ocjodgafcna = 2;</code>
     * @return The ocjodgafcna.
     */
    @java.lang.Override
    public int getOcjodgafcna() {
      return ocjodgafcna_;
    }

    public static final int PAAMJMEFLFP_FIELD_NUMBER = 3;
    private int paamjmeflfp_;
    /**
     * <code>int32 paamjmeflfp = 3;</code>
     * @return The paamjmeflfp.
     */
    @java.lang.Override
    public int getPaamjmeflfp() {
      return paamjmeflfp_;
    }

    public static final int LOLNGCKKKEK_FIELD_NUMBER = 4;
    private int lolngckkkek_;
    /**
     * <code>int32 lolngckkkek = 4;</code>
     * @return The lolngckkkek.
     */
    @java.lang.Override
    public int getLolngckkkek() {
      return lolngckkkek_;
    }

    public static final int NKIFJFFIGLB_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> nkifjffiglb_;
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> getNkifjffiglbList() {
      return nkifjffiglb_;
    }
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder> 
        getNkifjffiglbOrBuilderList() {
      return nkifjffiglb_;
    }
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    @java.lang.Override
    public int getNkifjffiglbCount() {
      return nkifjffiglb_.size();
    }
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO getNkifjffiglb(int index) {
      return nkifjffiglb_.get(index);
    }
    /**
     * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder getNkifjffiglbOrBuilder(
        int index) {
      return nkifjffiglb_.get(index);
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
      if (fekdaediiel_ != 0) {
        output.writeInt32(1, fekdaediiel_);
      }
      if (ocjodgafcna_ != 0) {
        output.writeInt32(2, ocjodgafcna_);
      }
      if (paamjmeflfp_ != 0) {
        output.writeInt32(3, paamjmeflfp_);
      }
      if (lolngckkkek_ != 0) {
        output.writeInt32(4, lolngckkkek_);
      }
      for (int i = 0; i < nkifjffiglb_.size(); i++) {
        output.writeMessage(5, nkifjffiglb_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fekdaediiel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, fekdaediiel_);
      }
      if (ocjodgafcna_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ocjodgafcna_);
      }
      if (paamjmeflfp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, paamjmeflfp_);
      }
      if (lolngckkkek_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, lolngckkkek_);
      }
      for (int i = 0; i < nkifjffiglb_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, nkifjffiglb_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC other = (emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC) obj;

      if (getFekdaediiel()
          != other.getFekdaediiel()) return false;
      if (getOcjodgafcna()
          != other.getOcjodgafcna()) return false;
      if (getPaamjmeflfp()
          != other.getPaamjmeflfp()) return false;
      if (getLolngckkkek()
          != other.getLolngckkkek()) return false;
      if (!getNkifjffiglbList()
          .equals(other.getNkifjffiglbList())) return false;
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
      hash = (37 * hash) + FEKDAEDIIEL_FIELD_NUMBER;
      hash = (53 * hash) + getFekdaediiel();
      hash = (37 * hash) + OCJODGAFCNA_FIELD_NUMBER;
      hash = (53 * hash) + getOcjodgafcna();
      hash = (37 * hash) + PAAMJMEFLFP_FIELD_NUMBER;
      hash = (53 * hash) + getPaamjmeflfp();
      hash = (37 * hash) + LOLNGCKKKEK_FIELD_NUMBER;
      hash = (53 * hash) + getLolngckkkek();
      if (getNkifjffiglbCount() > 0) {
        hash = (37 * hash) + NKIFJFFIGLB_FIELD_NUMBER;
        hash = (53 * hash) + getNkifjffiglbList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC prototype) {
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
     * Protobuf type {@code AFLCCHIGHFC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AFLCCHIGHFC)
        emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.internal_static_AFLCCHIGHFC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.internal_static_AFLCCHIGHFC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.class, emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.newBuilder()
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
          getNkifjffiglbFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fekdaediiel_ = 0;

        ocjodgafcna_ = 0;

        paamjmeflfp_ = 0;

        lolngckkkek_ = 0;

        if (nkifjffiglbBuilder_ == null) {
          nkifjffiglb_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nkifjffiglbBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.internal_static_AFLCCHIGHFC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC build() {
        emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC buildPartial() {
        emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC result = new emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC(this);
        int from_bitField0_ = bitField0_;
        result.fekdaediiel_ = fekdaediiel_;
        result.ocjodgafcna_ = ocjodgafcna_;
        result.paamjmeflfp_ = paamjmeflfp_;
        result.lolngckkkek_ = lolngckkkek_;
        if (nkifjffiglbBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nkifjffiglb_ = java.util.Collections.unmodifiableList(nkifjffiglb_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nkifjffiglb_ = nkifjffiglb_;
        } else {
          result.nkifjffiglb_ = nkifjffiglbBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC) {
          return mergeFrom((emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC other) {
        if (other == emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC.getDefaultInstance()) return this;
        if (other.getFekdaediiel() != 0) {
          setFekdaediiel(other.getFekdaediiel());
        }
        if (other.getOcjodgafcna() != 0) {
          setOcjodgafcna(other.getOcjodgafcna());
        }
        if (other.getPaamjmeflfp() != 0) {
          setPaamjmeflfp(other.getPaamjmeflfp());
        }
        if (other.getLolngckkkek() != 0) {
          setLolngckkkek(other.getLolngckkkek());
        }
        if (nkifjffiglbBuilder_ == null) {
          if (!other.nkifjffiglb_.isEmpty()) {
            if (nkifjffiglb_.isEmpty()) {
              nkifjffiglb_ = other.nkifjffiglb_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNkifjffiglbIsMutable();
              nkifjffiglb_.addAll(other.nkifjffiglb_);
            }
            onChanged();
          }
        } else {
          if (!other.nkifjffiglb_.isEmpty()) {
            if (nkifjffiglbBuilder_.isEmpty()) {
              nkifjffiglbBuilder_.dispose();
              nkifjffiglbBuilder_ = null;
              nkifjffiglb_ = other.nkifjffiglb_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nkifjffiglbBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNkifjffiglbFieldBuilder() : null;
            } else {
              nkifjffiglbBuilder_.addAllMessages(other.nkifjffiglb_);
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
        emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int fekdaediiel_ ;
      /**
       * <code>int32 fekdaediiel = 1;</code>
       * @return The fekdaediiel.
       */
      @java.lang.Override
      public int getFekdaediiel() {
        return fekdaediiel_;
      }
      /**
       * <code>int32 fekdaediiel = 1;</code>
       * @param value The fekdaediiel to set.
       * @return This builder for chaining.
       */
      public Builder setFekdaediiel(int value) {
        
        fekdaediiel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 fekdaediiel = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFekdaediiel() {
        
        fekdaediiel_ = 0;
        onChanged();
        return this;
      }

      private int ocjodgafcna_ ;
      /**
       * <code>int32 ocjodgafcna = 2;</code>
       * @return The ocjodgafcna.
       */
      @java.lang.Override
      public int getOcjodgafcna() {
        return ocjodgafcna_;
      }
      /**
       * <code>int32 ocjodgafcna = 2;</code>
       * @param value The ocjodgafcna to set.
       * @return This builder for chaining.
       */
      public Builder setOcjodgafcna(int value) {
        
        ocjodgafcna_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ocjodgafcna = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOcjodgafcna() {
        
        ocjodgafcna_ = 0;
        onChanged();
        return this;
      }

      private int paamjmeflfp_ ;
      /**
       * <code>int32 paamjmeflfp = 3;</code>
       * @return The paamjmeflfp.
       */
      @java.lang.Override
      public int getPaamjmeflfp() {
        return paamjmeflfp_;
      }
      /**
       * <code>int32 paamjmeflfp = 3;</code>
       * @param value The paamjmeflfp to set.
       * @return This builder for chaining.
       */
      public Builder setPaamjmeflfp(int value) {
        
        paamjmeflfp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 paamjmeflfp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPaamjmeflfp() {
        
        paamjmeflfp_ = 0;
        onChanged();
        return this;
      }

      private int lolngckkkek_ ;
      /**
       * <code>int32 lolngckkkek = 4;</code>
       * @return The lolngckkkek.
       */
      @java.lang.Override
      public int getLolngckkkek() {
        return lolngckkkek_;
      }
      /**
       * <code>int32 lolngckkkek = 4;</code>
       * @param value The lolngckkkek to set.
       * @return This builder for chaining.
       */
      public Builder setLolngckkkek(int value) {
        
        lolngckkkek_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 lolngckkkek = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLolngckkkek() {
        
        lolngckkkek_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> nkifjffiglb_ =
        java.util.Collections.emptyList();
      private void ensureNkifjffiglbIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nkifjffiglb_ = new java.util.ArrayList<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO>(nkifjffiglb_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder> nkifjffiglbBuilder_;

      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> getNkifjffiglbList() {
        if (nkifjffiglbBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nkifjffiglb_);
        } else {
          return nkifjffiglbBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public int getNkifjffiglbCount() {
        if (nkifjffiglbBuilder_ == null) {
          return nkifjffiglb_.size();
        } else {
          return nkifjffiglbBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO getNkifjffiglb(int index) {
        if (nkifjffiglbBuilder_ == null) {
          return nkifjffiglb_.get(index);
        } else {
          return nkifjffiglbBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder setNkifjffiglb(
          int index, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO value) {
        if (nkifjffiglbBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.set(index, value);
          onChanged();
        } else {
          nkifjffiglbBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder setNkifjffiglb(
          int index, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder builderForValue) {
        if (nkifjffiglbBuilder_ == null) {
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.set(index, builderForValue.build());
          onChanged();
        } else {
          nkifjffiglbBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder addNkifjffiglb(emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO value) {
        if (nkifjffiglbBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.add(value);
          onChanged();
        } else {
          nkifjffiglbBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder addNkifjffiglb(
          int index, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO value) {
        if (nkifjffiglbBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.add(index, value);
          onChanged();
        } else {
          nkifjffiglbBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder addNkifjffiglb(
          emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder builderForValue) {
        if (nkifjffiglbBuilder_ == null) {
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.add(builderForValue.build());
          onChanged();
        } else {
          nkifjffiglbBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder addNkifjffiglb(
          int index, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder builderForValue) {
        if (nkifjffiglbBuilder_ == null) {
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.add(index, builderForValue.build());
          onChanged();
        } else {
          nkifjffiglbBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder addAllNkifjffiglb(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO> values) {
        if (nkifjffiglbBuilder_ == null) {
          ensureNkifjffiglbIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nkifjffiglb_);
          onChanged();
        } else {
          nkifjffiglbBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder clearNkifjffiglb() {
        if (nkifjffiglbBuilder_ == null) {
          nkifjffiglb_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nkifjffiglbBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public Builder removeNkifjffiglb(int index) {
        if (nkifjffiglbBuilder_ == null) {
          ensureNkifjffiglbIsMutable();
          nkifjffiglb_.remove(index);
          onChanged();
        } else {
          nkifjffiglbBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder getNkifjffiglbBuilder(
          int index) {
        return getNkifjffiglbFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder getNkifjffiglbOrBuilder(
          int index) {
        if (nkifjffiglbBuilder_ == null) {
          return nkifjffiglb_.get(index);  } else {
          return nkifjffiglbBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder> 
           getNkifjffiglbOrBuilderList() {
        if (nkifjffiglbBuilder_ != null) {
          return nkifjffiglbBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nkifjffiglb_);
        }
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder addNkifjffiglbBuilder() {
        return getNkifjffiglbFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.getDefaultInstance());
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder addNkifjffiglbBuilder(
          int index) {
        return getNkifjffiglbFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.getDefaultInstance());
      }
      /**
       * <code>repeated .KIEHIGCKOHO nkifjffiglb = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder> 
           getNkifjffiglbBuilderList() {
        return getNkifjffiglbFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder> 
          getNkifjffiglbFieldBuilder() {
        if (nkifjffiglbBuilder_ == null) {
          nkifjffiglbBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHO.Builder, emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.KIEHIGCKOHOOrBuilder>(
                  nkifjffiglb_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nkifjffiglb_ = null;
        }
        return nkifjffiglbBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AFLCCHIGHFC)
    }

    // @@protoc_insertion_point(class_scope:AFLCCHIGHFC)
    private static final emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC();
    }

    public static emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AFLCCHIGHFC>
        PARSER = new com.google.protobuf.AbstractParser<AFLCCHIGHFC>() {
      @java.lang.Override
      public AFLCCHIGHFC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AFLCCHIGHFC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AFLCCHIGHFC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AFLCCHIGHFC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AFLCCHIGHFCOuterClass.AFLCCHIGHFC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AFLCCHIGHFC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AFLCCHIGHFC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AFLCCHIGHFC.proto\032\021KIEHIGCKOHO.proto\"\204" +
      "\001\n\013AFLCCHIGHFC\022\023\n\013fekdaediiel\030\001 \001(\005\022\023\n\013o" +
      "cjodgafcna\030\002 \001(\005\022\023\n\013paamjmeflfp\030\003 \001(\005\022\023\n" +
      "\013lolngckkkek\030\004 \001(\005\022!\n\013nkifjffiglb\030\005 \003(\0132" +
      "\014.KIEHIGCKOHOB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.getDescriptor(),
        });
    internal_static_AFLCCHIGHFC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AFLCCHIGHFC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AFLCCHIGHFC_descriptor,
        new java.lang.String[] { "Fekdaediiel", "Ocjodgafcna", "Paamjmeflfp", "Lolngckkkek", "Nkifjffiglb", });
    emu.grasscutter.net.proto.KIEHIGCKOHOOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
