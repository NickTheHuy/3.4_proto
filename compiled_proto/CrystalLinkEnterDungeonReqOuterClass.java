// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkEnterDungeonReq.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkEnterDungeonReqOuterClass {
  private CrystalLinkEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> 
        getTeamInfoListList();
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo getTeamInfoList(int index);
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    int getTeamInfoListCount();
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList();
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 levelId = 8;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 difficultyId = 4;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   *enum CLAELIDGHLP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8110;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code CrystalLinkEnterDungeonReq}
   */
  public static final class CrystalLinkEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkEnterDungeonReq)
      CrystalLinkEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkEnterDungeonReq.newBuilder() to construct.
    private CrystalLinkEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkEnterDungeonReq() {
      teamInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CrystalLinkEnterDungeonReq(
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

              difficultyId_ = input.readUInt32();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              teamInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.parser(), extensionRegistry));
              break;
            }
            case 64: {

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
          teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.internal_static_CrystalLinkEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.internal_static_CrystalLinkEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.class, emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.Builder.class);
    }

    public static final int TEAMINFOLIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> teamInfoList_;
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> getTeamInfoListList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    @java.lang.Override
    public int getTeamInfoListCount() {
      return teamInfoList_.size();
    }
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo getTeamInfoList(int index) {
      return teamInfoList_.get(index);
    }
    /**
     * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index) {
      return teamInfoList_.get(index);
    }

    public static final int LEVELID_FIELD_NUMBER = 8;
    private int levelId_;
    /**
     * <code>uint32 levelId = 8;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int DIFFICULTYID_FIELD_NUMBER = 4;
    private int difficultyId_;
    /**
     * <code>uint32 difficultyId = 4;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (difficultyId_ != 0) {
        output.writeUInt32(4, difficultyId_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        output.writeMessage(7, teamInfoList_.get(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(8, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, difficultyId_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, teamInfoList_.get(i));
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq other = (emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq) obj;

      if (!getTeamInfoListList()
          .equals(other.getTeamInfoListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      if (getTeamInfoListCount() > 0) {
        hash = (37 * hash) + TEAMINFOLIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamInfoListList().hashCode();
      }
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + DIFFICULTYID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq prototype) {
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
     *enum CLAELIDGHLP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8110;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code CrystalLinkEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkEnterDungeonReq)
        emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.internal_static_CrystalLinkEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.internal_static_CrystalLinkEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.class, emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.newBuilder()
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
          getTeamInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          teamInfoListBuilder_.clear();
        }
        levelId_ = 0;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.internal_static_CrystalLinkEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq build() {
        emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq buildPartial() {
        emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq result = new emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq(this);
        int from_bitField0_ = bitField0_;
        if (teamInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamInfoList_ = teamInfoList_;
        } else {
          result.teamInfoList_ = teamInfoListBuilder_.build();
        }
        result.levelId_ = levelId_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq other) {
        if (other == emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq.getDefaultInstance()) return this;
        if (teamInfoListBuilder_ == null) {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoList_.isEmpty()) {
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamInfoListIsMutable();
              teamInfoList_.addAll(other.teamInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoListBuilder_.isEmpty()) {
              teamInfoListBuilder_.dispose();
              teamInfoListBuilder_ = null;
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamInfoListFieldBuilder() : null;
            } else {
              teamInfoListBuilder_.addAllMessages(other.teamInfoList_);
            }
          }
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> teamInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo>(teamInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder> teamInfoListBuilder_;

      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> getTeamInfoListList() {
        if (teamInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        } else {
          return teamInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public int getTeamInfoListCount() {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.size();
        } else {
          return teamInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo getTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);
        } else {
          return teamInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder addTeamInfoList(emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder addTeamInfoList(
          emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder addAllTeamInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo> values) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamInfoList_);
          onChanged();
        } else {
          teamInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder clearTeamInfoList() {
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public Builder removeTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.remove(index);
          onChanged();
        } else {
          teamInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder getTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder getTeamInfoListOrBuilder(
          int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);  } else {
          return teamInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder> 
           getTeamInfoListOrBuilderList() {
        if (teamInfoListBuilder_ != null) {
          return teamInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        }
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder addTeamInfoListBuilder() {
        return getTeamInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder addTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CrystalLinkTeamInfo teamInfoList = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder> 
           getTeamInfoListBuilderList() {
        return getTeamInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder> 
          getTeamInfoListFieldBuilder() {
        if (teamInfoListBuilder_ == null) {
          teamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfo.Builder, emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.CrystalLinkTeamInfoOrBuilder>(
                  teamInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamInfoList_ = null;
        }
        return teamInfoListBuilder_;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 8;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 8;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficultyId = 4;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficultyId = 4;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficultyId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkEnterDungeonReq)
    private static final emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq();
    }

    public static emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkEnterDungeonReq>() {
      @java.lang.Override
      public CrystalLinkEnterDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CrystalLinkEnterDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CrystalLinkEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkEnterDungeonReqOuterClass.CrystalLinkEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n CrystalLinkEnterDungeonReq.proto\032\031Crys" +
      "talLinkTeamInfo.proto\"o\n\032CrystalLinkEnte" +
      "rDungeonReq\022*\n\014teamInfoList\030\007 \003(\0132\024.Crys" +
      "talLinkTeamInfo\022\017\n\007levelId\030\010 \001(\r\022\024\n\014diff" +
      "icultyId\030\004 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.getDescriptor(),
        });
    internal_static_CrystalLinkEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkEnterDungeonReq_descriptor,
        new java.lang.String[] { "TeamInfoList", "LevelId", "DifficultyId", });
    emu.grasscutter.net.proto.CrystalLinkTeamInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}