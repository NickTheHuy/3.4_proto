// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DENJLLKHOMJ.proto

package emu.grasscutter.net.proto;

public final class DENJLLKHOMJOuterClass {
  private DENJLLKHOMJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DENJLLKHOMJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DENJLLKHOMJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    boolean hasEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     * @return The eknhofiihcl.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl();
    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder();

    /**
     * <code>uint32 entityId = 13;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     * @return Whether the boedpkfedkp field is set.
     */
    boolean hasBoedpkfedkp();
    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     * @return The boedpkfedkp.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getBoedpkfedkp();
    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBoedpkfedkpOrBuilder();
  }
  /**
   * Protobuf type {@code DENJLLKHOMJ}
   */
  public static final class DENJLLKHOMJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DENJLLKHOMJ)
      DENJLLKHOMJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DENJLLKHOMJ.newBuilder() to construct.
    private DENJLLKHOMJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DENJLLKHOMJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DENJLLKHOMJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DENJLLKHOMJ(
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
            case 58: {
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
            case 74: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (boedpkfedkp_ != null) {
                subBuilder = boedpkfedkp_.toBuilder();
              }
              boedpkfedkp_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(boedpkfedkp_);
                boedpkfedkp_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {

              entityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.internal_static_DENJLLKHOMJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.internal_static_DENJLLKHOMJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.class, emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.Builder.class);
    }

    public static final int EKNHOFIIHCL_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     * @return Whether the eknhofiihcl field is set.
     */
    @java.lang.Override
    public boolean hasEknhofiihcl() {
      return eknhofiihcl_ != null;
    }
    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     * @return The eknhofiihcl.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getEknhofiihcl() {
      return eknhofiihcl_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : eknhofiihcl_;
    }
    /**
     * <code>.Vector eknhofiihcl = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getEknhofiihclOrBuilder() {
      return getEknhofiihcl();
    }

    public static final int ENTITYID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entityId = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int BOEDPKFEDKP_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector boedpkfedkp_;
    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     * @return Whether the boedpkfedkp field is set.
     */
    @java.lang.Override
    public boolean hasBoedpkfedkp() {
      return boedpkfedkp_ != null;
    }
    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     * @return The boedpkfedkp.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getBoedpkfedkp() {
      return boedpkfedkp_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : boedpkfedkp_;
    }
    /**
     * <code>.Vector boedpkfedkp = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBoedpkfedkpOrBuilder() {
      return getBoedpkfedkp();
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
      if (eknhofiihcl_ != null) {
        output.writeMessage(7, getEknhofiihcl());
      }
      if (boedpkfedkp_ != null) {
        output.writeMessage(9, getBoedpkfedkp());
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eknhofiihcl_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getEknhofiihcl());
      }
      if (boedpkfedkp_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getBoedpkfedkp());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ other = (emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ) obj;

      if (hasEknhofiihcl() != other.hasEknhofiihcl()) return false;
      if (hasEknhofiihcl()) {
        if (!getEknhofiihcl()
            .equals(other.getEknhofiihcl())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasBoedpkfedkp() != other.hasBoedpkfedkp()) return false;
      if (hasBoedpkfedkp()) {
        if (!getBoedpkfedkp()
            .equals(other.getBoedpkfedkp())) return false;
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
      if (hasEknhofiihcl()) {
        hash = (37 * hash) + EKNHOFIIHCL_FIELD_NUMBER;
        hash = (53 * hash) + getEknhofiihcl().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasBoedpkfedkp()) {
        hash = (37 * hash) + BOEDPKFEDKP_FIELD_NUMBER;
        hash = (53 * hash) + getBoedpkfedkp().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ prototype) {
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
     * Protobuf type {@code DENJLLKHOMJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DENJLLKHOMJ)
        emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.internal_static_DENJLLKHOMJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.internal_static_DENJLLKHOMJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.class, emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.newBuilder()
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
        if (eknhofiihclBuilder_ == null) {
          eknhofiihcl_ = null;
        } else {
          eknhofiihcl_ = null;
          eknhofiihclBuilder_ = null;
        }
        entityId_ = 0;

        if (boedpkfedkpBuilder_ == null) {
          boedpkfedkp_ = null;
        } else {
          boedpkfedkp_ = null;
          boedpkfedkpBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.internal_static_DENJLLKHOMJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ build() {
        emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ buildPartial() {
        emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ result = new emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ(this);
        if (eknhofiihclBuilder_ == null) {
          result.eknhofiihcl_ = eknhofiihcl_;
        } else {
          result.eknhofiihcl_ = eknhofiihclBuilder_.build();
        }
        result.entityId_ = entityId_;
        if (boedpkfedkpBuilder_ == null) {
          result.boedpkfedkp_ = boedpkfedkp_;
        } else {
          result.boedpkfedkp_ = boedpkfedkpBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ) {
          return mergeFrom((emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ other) {
        if (other == emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ.getDefaultInstance()) return this;
        if (other.hasEknhofiihcl()) {
          mergeEknhofiihcl(other.getEknhofiihcl());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasBoedpkfedkp()) {
          mergeBoedpkfedkp(other.getBoedpkfedkp());
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
        emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector eknhofiihcl_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> eknhofiihclBuilder_;
      /**
       * <code>.Vector eknhofiihcl = 7;</code>
       * @return Whether the eknhofiihcl field is set.
       */
      public boolean hasEknhofiihcl() {
        return eknhofiihclBuilder_ != null || eknhofiihcl_ != null;
      }
      /**
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getEknhofiihclBuilder() {
        
        onChanged();
        return getEknhofiihclFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector eknhofiihcl = 7;</code>
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
       * <code>.Vector eknhofiihcl = 7;</code>
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

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector boedpkfedkp_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> boedpkfedkpBuilder_;
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       * @return Whether the boedpkfedkp field is set.
       */
      public boolean hasBoedpkfedkp() {
        return boedpkfedkpBuilder_ != null || boedpkfedkp_ != null;
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       * @return The boedpkfedkp.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getBoedpkfedkp() {
        if (boedpkfedkpBuilder_ == null) {
          return boedpkfedkp_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : boedpkfedkp_;
        } else {
          return boedpkfedkpBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public Builder setBoedpkfedkp(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (boedpkfedkpBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          boedpkfedkp_ = value;
          onChanged();
        } else {
          boedpkfedkpBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public Builder setBoedpkfedkp(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (boedpkfedkpBuilder_ == null) {
          boedpkfedkp_ = builderForValue.build();
          onChanged();
        } else {
          boedpkfedkpBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public Builder mergeBoedpkfedkp(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (boedpkfedkpBuilder_ == null) {
          if (boedpkfedkp_ != null) {
            boedpkfedkp_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(boedpkfedkp_).mergeFrom(value).buildPartial();
          } else {
            boedpkfedkp_ = value;
          }
          onChanged();
        } else {
          boedpkfedkpBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public Builder clearBoedpkfedkp() {
        if (boedpkfedkpBuilder_ == null) {
          boedpkfedkp_ = null;
          onChanged();
        } else {
          boedpkfedkp_ = null;
          boedpkfedkpBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getBoedpkfedkpBuilder() {
        
        onChanged();
        return getBoedpkfedkpFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getBoedpkfedkpOrBuilder() {
        if (boedpkfedkpBuilder_ != null) {
          return boedpkfedkpBuilder_.getMessageOrBuilder();
        } else {
          return boedpkfedkp_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : boedpkfedkp_;
        }
      }
      /**
       * <code>.Vector boedpkfedkp = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getBoedpkfedkpFieldBuilder() {
        if (boedpkfedkpBuilder_ == null) {
          boedpkfedkpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getBoedpkfedkp(),
                  getParentForChildren(),
                  isClean());
          boedpkfedkp_ = null;
        }
        return boedpkfedkpBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DENJLLKHOMJ)
    }

    // @@protoc_insertion_point(class_scope:DENJLLKHOMJ)
    private static final emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ();
    }

    public static emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DENJLLKHOMJ>
        PARSER = new com.google.protobuf.AbstractParser<DENJLLKHOMJ>() {
      @java.lang.Override
      public DENJLLKHOMJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DENJLLKHOMJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DENJLLKHOMJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DENJLLKHOMJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DENJLLKHOMJOuterClass.DENJLLKHOMJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DENJLLKHOMJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DENJLLKHOMJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DENJLLKHOMJ.proto\032\014Vector.proto\"[\n\013DEN" +
      "JLLKHOMJ\022\034\n\013eknhofiihcl\030\007 \001(\0132\007.Vector\022\020" +
      "\n\010entityId\030\r \001(\r\022\034\n\013boedpkfedkp\030\t \001(\0132\007." +
      "VectorB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_DENJLLKHOMJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DENJLLKHOMJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DENJLLKHOMJ_descriptor,
        new java.lang.String[] { "Eknhofiihcl", "EntityId", "Boedpkfedkp", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
