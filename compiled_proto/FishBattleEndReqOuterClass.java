// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishBattleEndReq.proto

package emu.grasscutter.net.proto;

public final class FishBattleEndReqOuterClass {
  private FishBattleEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishBattleEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishBattleEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FishBattleResult battleResult = 11;</code>
     * @return The enum numeric value on the wire for battleResult.
     */
    int getBattleResultValue();
    /**
     * <code>.FishBattleResult battleResult = 11;</code>
     * @return The battleResult.
     */
    emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult();

    /**
     * <code>uint32 maxBonusTime = 10;</code>
     * @return The maxBonusTime.
     */
    int getMaxBonusTime();

    /**
     * <code>bool isAlwaysBonus = 5;</code>
     * @return The isAlwaysBonus.
     */
    boolean getIsAlwaysBonus();
  }
  /**
   * <pre>
   *enum JCIOFMDHFDP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5837;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code FishBattleEndReq}
   */
  public static final class FishBattleEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishBattleEndReq)
      FishBattleEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishBattleEndReq.newBuilder() to construct.
    private FishBattleEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishBattleEndReq() {
      battleResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishBattleEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishBattleEndReq(
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
            case 40: {

              isAlwaysBonus_ = input.readBool();
              break;
            }
            case 80: {

              maxBonusTime_ = input.readUInt32();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              battleResult_ = rawValue;
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
      return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.class, emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.Builder.class);
    }

    public static final int BATTLERESULT_FIELD_NUMBER = 11;
    private int battleResult_;
    /**
     * <code>.FishBattleResult battleResult = 11;</code>
     * @return The enum numeric value on the wire for battleResult.
     */
    @java.lang.Override public int getBattleResultValue() {
      return battleResult_;
    }
    /**
     * <code>.FishBattleResult battleResult = 11;</code>
     * @return The battleResult.
     */
    @java.lang.Override public emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult result = emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.valueOf(battleResult_);
      return result == null ? emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.UNRECOGNIZED : result;
    }

    public static final int MAXBONUSTIME_FIELD_NUMBER = 10;
    private int maxBonusTime_;
    /**
     * <code>uint32 maxBonusTime = 10;</code>
     * @return The maxBonusTime.
     */
    @java.lang.Override
    public int getMaxBonusTime() {
      return maxBonusTime_;
    }

    public static final int ISALWAYSBONUS_FIELD_NUMBER = 5;
    private boolean isAlwaysBonus_;
    /**
     * <code>bool isAlwaysBonus = 5;</code>
     * @return The isAlwaysBonus.
     */
    @java.lang.Override
    public boolean getIsAlwaysBonus() {
      return isAlwaysBonus_;
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
      if (isAlwaysBonus_ != false) {
        output.writeBool(5, isAlwaysBonus_);
      }
      if (maxBonusTime_ != 0) {
        output.writeUInt32(10, maxBonusTime_);
      }
      if (battleResult_ != emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.FISH_BATTLE_RESULT_NONE.getNumber()) {
        output.writeEnum(11, battleResult_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAlwaysBonus_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isAlwaysBonus_);
      }
      if (maxBonusTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, maxBonusTime_);
      }
      if (battleResult_ != emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.FISH_BATTLE_RESULT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, battleResult_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq other = (emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) obj;

      if (battleResult_ != other.battleResult_) return false;
      if (getMaxBonusTime()
          != other.getMaxBonusTime()) return false;
      if (getIsAlwaysBonus()
          != other.getIsAlwaysBonus()) return false;
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
      hash = (37 * hash) + BATTLERESULT_FIELD_NUMBER;
      hash = (53 * hash) + battleResult_;
      hash = (37 * hash) + MAXBONUSTIME_FIELD_NUMBER;
      hash = (53 * hash) + getMaxBonusTime();
      hash = (37 * hash) + ISALWAYSBONUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlwaysBonus());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq prototype) {
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
     *enum JCIOFMDHFDP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5837;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code FishBattleEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishBattleEndReq)
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.class, emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.newBuilder()
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
        battleResult_ = 0;

        maxBonusTime_ = 0;

        isAlwaysBonus_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.internal_static_FishBattleEndReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq build() {
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq buildPartial() {
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq result = new emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq(this);
        result.battleResult_ = battleResult_;
        result.maxBonusTime_ = maxBonusTime_;
        result.isAlwaysBonus_ = isAlwaysBonus_;
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
        if (other instanceof emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) {
          return mergeFrom((emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq other) {
        if (other == emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq.getDefaultInstance()) return this;
        if (other.battleResult_ != 0) {
          setBattleResultValue(other.getBattleResultValue());
        }
        if (other.getMaxBonusTime() != 0) {
          setMaxBonusTime(other.getMaxBonusTime());
        }
        if (other.getIsAlwaysBonus() != false) {
          setIsAlwaysBonus(other.getIsAlwaysBonus());
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
        emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int battleResult_ = 0;
      /**
       * <code>.FishBattleResult battleResult = 11;</code>
       * @return The enum numeric value on the wire for battleResult.
       */
      @java.lang.Override public int getBattleResultValue() {
        return battleResult_;
      }
      /**
       * <code>.FishBattleResult battleResult = 11;</code>
       * @param value The enum numeric value on the wire for battleResult to set.
       * @return This builder for chaining.
       */
      public Builder setBattleResultValue(int value) {
        
        battleResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FishBattleResult battleResult = 11;</code>
       * @return The battleResult.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult getBattleResult() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult result = emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.valueOf(battleResult_);
        return result == null ? emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult.UNRECOGNIZED : result;
      }
      /**
       * <code>.FishBattleResult battleResult = 11;</code>
       * @param value The battleResult to set.
       * @return This builder for chaining.
       */
      public Builder setBattleResult(emu.grasscutter.net.proto.FishBattleResultOuterClass.FishBattleResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        battleResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FishBattleResult battleResult = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBattleResult() {
        
        battleResult_ = 0;
        onChanged();
        return this;
      }

      private int maxBonusTime_ ;
      /**
       * <code>uint32 maxBonusTime = 10;</code>
       * @return The maxBonusTime.
       */
      @java.lang.Override
      public int getMaxBonusTime() {
        return maxBonusTime_;
      }
      /**
       * <code>uint32 maxBonusTime = 10;</code>
       * @param value The maxBonusTime to set.
       * @return This builder for chaining.
       */
      public Builder setMaxBonusTime(int value) {
        
        maxBonusTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 maxBonusTime = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxBonusTime() {
        
        maxBonusTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isAlwaysBonus_ ;
      /**
       * <code>bool isAlwaysBonus = 5;</code>
       * @return The isAlwaysBonus.
       */
      @java.lang.Override
      public boolean getIsAlwaysBonus() {
        return isAlwaysBonus_;
      }
      /**
       * <code>bool isAlwaysBonus = 5;</code>
       * @param value The isAlwaysBonus to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlwaysBonus(boolean value) {
        
        isAlwaysBonus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAlwaysBonus = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlwaysBonus() {
        
        isAlwaysBonus_ = false;
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


      // @@protoc_insertion_point(builder_scope:FishBattleEndReq)
    }

    // @@protoc_insertion_point(class_scope:FishBattleEndReq)
    private static final emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq();
    }

    public static emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishBattleEndReq>
        PARSER = new com.google.protobuf.AbstractParser<FishBattleEndReq>() {
      @java.lang.Override
      public FishBattleEndReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishBattleEndReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishBattleEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishBattleEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishBattleEndReqOuterClass.FishBattleEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishBattleEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishBattleEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FishBattleEndReq.proto\032\026FishBattleResu" +
      "lt.proto\"h\n\020FishBattleEndReq\022\'\n\014battleRe" +
      "sult\030\013 \001(\0162\021.FishBattleResult\022\024\n\014maxBonu" +
      "sTime\030\n \001(\r\022\025\n\risAlwaysBonus\030\005 \001(\010B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FishBattleResultOuterClass.getDescriptor(),
        });
    internal_static_FishBattleEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishBattleEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishBattleEndReq_descriptor,
        new java.lang.String[] { "BattleResult", "MaxBonusTime", "IsAlwaysBonus", });
    emu.grasscutter.net.proto.FishBattleResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
