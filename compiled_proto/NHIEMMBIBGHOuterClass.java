// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NHIEMMBIBGH.proto

package emu.grasscutter.net.proto;

public final class NHIEMMBIBGHOuterClass {
  private NHIEMMBIBGHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NHIEMMBIBGHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NHIEMMBIBGH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>float mbbjimmgikj = 2;</code>
     * @return The mbbjimmgikj.
     */
    float getMbbjimmgikj();

    /**
     * <code>float dkdecebeebb = 14;</code>
     * @return The dkdecebeebb.
     */
    float getDkdecebeebb();

    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    boolean hasEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     * @return The eknhofiihcl.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder();

    /**
     * <code>float speed = 6;</code>
     * @return The speed.
     */
    float getSpeed();
  }
  /**
   * Protobuf type {@code NHIEMMBIBGH}
   */
  public static final class NHIEMMBIBGH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NHIEMMBIBGH)
      NHIEMMBIBGHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NHIEMMBIBGH.newBuilder() to construct.
    private NHIEMMBIBGH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NHIEMMBIBGH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NHIEMMBIBGH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NHIEMMBIBGH(
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

              mbbjimmgikj_ = input.readFloat();
              break;
            }
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 53: {

              speed_ = input.readFloat();
              break;
            }
            case 98: {
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
            case 117: {

              dkdecebeebb_ = input.readFloat();
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
      return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.internal_static_NHIEMMBIBGH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.internal_static_NHIEMMBIBGH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.class, emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int MBBJIMMGIKJ_FIELD_NUMBER = 2;
    private float mbbjimmgikj_;
    /**
     * <code>float mbbjimmgikj = 2;</code>
     * @return The mbbjimmgikj.
     */
    @java.lang.Override
    public float getMbbjimmgikj() {
      return mbbjimmgikj_;
    }

    public static final int DKDECEBEEBB_FIELD_NUMBER = 14;
    private float dkdecebeebb_;
    /**
     * <code>float dkdecebeebb = 14;</code>
     * @return The dkdecebeebb.
     */
    @java.lang.Override
    public float getDkdecebeebb() {
      return dkdecebeebb_;
    }

    public static final int EKNHOFIIHCL_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    @java.lang.Override
    public boolean hasEknhofiihcl() {
      return eknhofiihcl_ != null;
    }
    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     * @return The eknhofiihcl.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl() {
      return eknhofiihcl_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : eknhofiihcl_;
    }
    /**
     * <code>.Vector eknhofiihcl = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder() {
      return getEknhofiihcl();
    }

    public static final int SPEED_FIELD_NUMBER = 6;
    private float speed_;
    /**
     * <code>float speed = 6;</code>
     * @return The speed.
     */
    @java.lang.Override
    public float getSpeed() {
      return speed_;
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
      if (mbbjimmgikj_ != 0F) {
        output.writeFloat(2, mbbjimmgikj_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (speed_ != 0F) {
        output.writeFloat(6, speed_);
      }
      if (eknhofiihcl_ != null) {
        output.writeMessage(12, getEknhofiihcl());
      }
      if (dkdecebeebb_ != 0F) {
        output.writeFloat(14, dkdecebeebb_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mbbjimmgikj_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, mbbjimmgikj_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (speed_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, speed_);
      }
      if (eknhofiihcl_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getEknhofiihcl());
      }
      if (dkdecebeebb_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, dkdecebeebb_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH other = (emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (java.lang.Float.floatToIntBits(getMbbjimmgikj())
          != java.lang.Float.floatToIntBits(
              other.getMbbjimmgikj())) return false;
      if (java.lang.Float.floatToIntBits(getDkdecebeebb())
          != java.lang.Float.floatToIntBits(
              other.getDkdecebeebb())) return false;
      if (hasEknhofiihcl() != other.hasEknhofiihcl()) return false;
      if (hasEknhofiihcl()) {
        if (!getEknhofiihcl()
            .equals(other.getEknhofiihcl())) return false;
      }
      if (java.lang.Float.floatToIntBits(getSpeed())
          != java.lang.Float.floatToIntBits(
              other.getSpeed())) return false;
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + MBBJIMMGIKJ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMbbjimmgikj());
      hash = (37 * hash) + DKDECEBEEBB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDkdecebeebb());
      if (hasEknhofiihcl()) {
        hash = (37 * hash) + EKNHOFIIHCL_FIELD_NUMBER;
        hash = (53 * hash) + getEknhofiihcl().hashCode();
      }
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSpeed());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH prototype) {
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
     * Protobuf type {@code NHIEMMBIBGH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NHIEMMBIBGH)
        emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.internal_static_NHIEMMBIBGH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.internal_static_NHIEMMBIBGH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.class, emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.newBuilder()
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
        entityId_ = 0;

        mbbjimmgikj_ = 0F;

        dkdecebeebb_ = 0F;

        if (eknhofiihclBuilder_ == null) {
          eknhofiihcl_ = null;
        } else {
          eknhofiihcl_ = null;
          eknhofiihclBuilder_ = null;
        }
        speed_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.internal_static_NHIEMMBIBGH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH build() {
        emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH buildPartial() {
        emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH result = new emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH(this);
        result.entityId_ = entityId_;
        result.mbbjimmgikj_ = mbbjimmgikj_;
        result.dkdecebeebb_ = dkdecebeebb_;
        if (eknhofiihclBuilder_ == null) {
          result.eknhofiihcl_ = eknhofiihcl_;
        } else {
          result.eknhofiihcl_ = eknhofiihclBuilder_.build();
        }
        result.speed_ = speed_;
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
        if (other instanceof emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH) {
          return mergeFrom((emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH other) {
        if (other == emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getMbbjimmgikj() != 0F) {
          setMbbjimmgikj(other.getMbbjimmgikj());
        }
        if (other.getDkdecebeebb() != 0F) {
          setDkdecebeebb(other.getDkdecebeebb());
        }
        if (other.hasEknhofiihcl()) {
          mergeEknhofiihcl(other.getEknhofiihcl());
        }
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
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
        emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private float mbbjimmgikj_ ;
      /**
       * <code>float mbbjimmgikj = 2;</code>
       * @return The mbbjimmgikj.
       */
      @java.lang.Override
      public float getMbbjimmgikj() {
        return mbbjimmgikj_;
      }
      /**
       * <code>float mbbjimmgikj = 2;</code>
       * @param value The mbbjimmgikj to set.
       * @return This builder for chaining.
       */
      public Builder setMbbjimmgikj(float value) {
        
        mbbjimmgikj_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float mbbjimmgikj = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMbbjimmgikj() {
        
        mbbjimmgikj_ = 0F;
        onChanged();
        return this;
      }

      private float dkdecebeebb_ ;
      /**
       * <code>float dkdecebeebb = 14;</code>
       * @return The dkdecebeebb.
       */
      @java.lang.Override
      public float getDkdecebeebb() {
        return dkdecebeebb_;
      }
      /**
       * <code>float dkdecebeebb = 14;</code>
       * @param value The dkdecebeebb to set.
       * @return This builder for chaining.
       */
      public Builder setDkdecebeebb(float value) {
        
        dkdecebeebb_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float dkdecebeebb = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDkdecebeebb() {
        
        dkdecebeebb_ = 0F;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> eknhofiihclBuilder_;
      /**
       * <code>.Vector eknhofiihcl = 12;</code>
       * @return Whether the eknhofiihcl field is set.
       */
      public boolean hasEknhofiihcl() {
        return eknhofiihclBuilder_ != null || eknhofiihcl_ != null;
      }
      /**
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getEknhofiihclBuilder() {
        
        onChanged();
        return getEknhofiihclFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector eknhofiihcl = 12;</code>
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
       * <code>.Vector eknhofiihcl = 12;</code>
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

      private float speed_ ;
      /**
       * <code>float speed = 6;</code>
       * @return The speed.
       */
      @java.lang.Override
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 6;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(float value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        
        speed_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:NHIEMMBIBGH)
    }

    // @@protoc_insertion_point(class_scope:NHIEMMBIBGH)
    private static final emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH();
    }

    public static emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NHIEMMBIBGH>
        PARSER = new com.google.protobuf.AbstractParser<NHIEMMBIBGH>() {
      @java.lang.Override
      public NHIEMMBIBGH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NHIEMMBIBGH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NHIEMMBIBGH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NHIEMMBIBGH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NHIEMMBIBGHOuterClass.NHIEMMBIBGH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NHIEMMBIBGH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NHIEMMBIBGH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NHIEMMBIBGH.proto\032\014Vector.proto\"v\n\013NHI" +
      "EMMBIBGH\022\020\n\010entityId\030\005 \001(\r\022\023\n\013mbbjimmgik" +
      "j\030\002 \001(\002\022\023\n\013dkdecebeebb\030\016 \001(\002\022\034\n\013eknhofii" +
      "hcl\030\014 \001(\0132\007.Vector\022\r\n\005speed\030\006 \001(\002B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_NHIEMMBIBGH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NHIEMMBIBGH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NHIEMMBIBGH_descriptor,
        new java.lang.String[] { "EntityId", "Mbbjimmgikj", "Dkdecebeebb", "Eknhofiihcl", "Speed", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
