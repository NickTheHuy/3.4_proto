// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainEnterDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class TeamChainEnterDungeonRspOuterClass {
  private TeamChainEnterDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainEnterDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainEnterDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> 
        getTeamInfoListList();
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getTeamInfoList(int index);
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    int getTeamInfoListCount();
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder> 
        getTeamInfoListOrBuilderList();
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder getTeamInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 stageId = 13;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    int getDifficulty();
  }
  /**
   * <pre>
   *enum DLBLCLBKJFH {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 21568;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code TeamChainEnterDungeonRsp}
   */
  public static final class TeamChainEnterDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainEnterDungeonRsp)
      TeamChainEnterDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainEnterDungeonRsp.newBuilder() to construct.
    private TeamChainEnterDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainEnterDungeonRsp() {
      teamInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainEnterDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamChainEnterDungeonRsp(
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
            case 16: {

              difficulty_ = input.readUInt32();
              break;
            }
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN>();
                mutable_bitField0_ |= 0x00000001;
              }
              teamInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.parser(), extensionRegistry));
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.internal_static_TeamChainEnterDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.internal_static_TeamChainEnterDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.class, emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.Builder.class);
    }

    public static final int TEAMINFOLIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> teamInfoList_;
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> getTeamInfoListList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder> 
        getTeamInfoListOrBuilderList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    @java.lang.Override
    public int getTeamInfoListCount() {
      return teamInfoList_.size();
    }
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getTeamInfoList(int index) {
      return teamInfoList_.get(index);
    }
    /**
     * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder getTeamInfoListOrBuilder(
        int index) {
      return teamInfoList_.get(index);
    }

    public static final int STAGEID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stageId = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 2;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(2, difficulty_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        output.writeMessage(11, teamInfoList_.get(i));
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, difficulty_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, teamInfoList_.get(i));
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp other = (emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp) obj;

      if (!getTeamInfoListList()
          .equals(other.getTeamInfoListList())) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
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
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp prototype) {
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
     *enum DLBLCLBKJFH {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 21568;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code TeamChainEnterDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainEnterDungeonRsp)
        emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.internal_static_TeamChainEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.internal_static_TeamChainEnterDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.class, emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.newBuilder()
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
        stageId_ = 0;

        difficulty_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.internal_static_TeamChainEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp build() {
        emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp buildPartial() {
        emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp result = new emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp(this);
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
        result.stageId_ = stageId_;
        result.difficulty_ = difficulty_;
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
        if (other instanceof emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp other) {
        if (other == emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp.getDefaultInstance()) return this;
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
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
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
        emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> teamInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN>(teamInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder> teamInfoListBuilder_;

      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> getTeamInfoListList() {
        if (teamInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        } else {
          return teamInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public int getTeamInfoListCount() {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.size();
        } else {
          return teamInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN getTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);
        } else {
          return teamInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN value) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder builderForValue) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder addTeamInfoList(emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN value) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN value) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder addTeamInfoList(
          emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder builderForValue) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder builderForValue) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public Builder addAllTeamInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN> values) {
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
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
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder getTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder getTeamInfoListOrBuilder(
          int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);  } else {
          return teamInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder> 
           getTeamInfoListOrBuilderList() {
        if (teamInfoListBuilder_ != null) {
          return teamInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        }
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder addTeamInfoListBuilder() {
        return getTeamInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.getDefaultInstance());
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder addTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.getDefaultInstance());
      }
      /**
       * <code>repeated .FBKJENFAAKN teamInfoList = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder> 
           getTeamInfoListBuilderList() {
        return getTeamInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder> 
          getTeamInfoListFieldBuilder() {
        if (teamInfoListBuilder_ == null) {
          teamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKN.Builder, emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.FBKJENFAAKNOrBuilder>(
                  teamInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamInfoList_ = null;
        }
        return teamInfoListBuilder_;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TeamChainEnterDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:TeamChainEnterDungeonRsp)
    private static final emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp();
    }

    public static emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainEnterDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainEnterDungeonRsp>() {
      @java.lang.Override
      public TeamChainEnterDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamChainEnterDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamChainEnterDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainEnterDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainEnterDungeonRspOuterClass.TeamChainEnterDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainEnterDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainEnterDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TeamChainEnterDungeonRsp.proto\032\021FBKJEN" +
      "FAAKN.proto\"c\n\030TeamChainEnterDungeonRsp\022" +
      "\"\n\014teamInfoList\030\013 \003(\0132\014.FBKJENFAAKN\022\017\n\007s" +
      "tageId\030\r \001(\r\022\022\n\ndifficulty\030\002 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.getDescriptor(),
        });
    internal_static_TeamChainEnterDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainEnterDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainEnterDungeonRsp_descriptor,
        new java.lang.String[] { "TeamInfoList", "StageId", "Difficulty", });
    emu.grasscutter.net.proto.FBKJENFAAKNOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
