// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SyncSnapShot.proto

package emu.grasscutter.net.proto;

public final class SyncSnapShotOuterClass {
  private SyncSnapShotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SyncSnapShotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SyncSnapShot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     * @return Whether the bllachfilmo field is set.
     */
    boolean hasBllachfilmo();
    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     * @return The bllachfilmo.
     */
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getBllachfilmo();
    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     */
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getBllachfilmoOrBuilder();
  }
  /**
   * Protobuf type {@code SyncSnapShot}
   */
  public static final class SyncSnapShot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SyncSnapShot)
      SyncSnapShotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SyncSnapShot.newBuilder() to construct.
    private SyncSnapShot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SyncSnapShot() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SyncSnapShot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SyncSnapShot(
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
            case 26: {
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder subBuilder = null;
              if (bllachfilmo_ != null) {
                subBuilder = bllachfilmo_.toBuilder();
              }
              bllachfilmo_ = input.readMessage(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bllachfilmo_);
                bllachfilmo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.SyncSnapShotOuterClass.internal_static_SyncSnapShot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SyncSnapShotOuterClass.internal_static_SyncSnapShot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.class, emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.Builder.class);
    }

    public static final int BLLACHFILMO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot bllachfilmo_;
    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     * @return Whether the bllachfilmo field is set.
     */
    @java.lang.Override
    public boolean hasBllachfilmo() {
      return bllachfilmo_ != null;
    }
    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     * @return The bllachfilmo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getBllachfilmo() {
      return bllachfilmo_ == null ? emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : bllachfilmo_;
    }
    /**
     * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getBllachfilmoOrBuilder() {
      return getBllachfilmo();
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
      if (bllachfilmo_ != null) {
        output.writeMessage(3, getBllachfilmo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bllachfilmo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getBllachfilmo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot other = (emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot) obj;

      if (hasBllachfilmo() != other.hasBllachfilmo()) return false;
      if (hasBllachfilmo()) {
        if (!getBllachfilmo()
            .equals(other.getBllachfilmo())) return false;
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
      if (hasBllachfilmo()) {
        hash = (37 * hash) + BLLACHFILMO_FIELD_NUMBER;
        hash = (53 * hash) + getBllachfilmo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot prototype) {
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
     * Protobuf type {@code SyncSnapShot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SyncSnapShot)
        emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SyncSnapShotOuterClass.internal_static_SyncSnapShot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SyncSnapShotOuterClass.internal_static_SyncSnapShot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.class, emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.newBuilder()
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
        if (bllachfilmoBuilder_ == null) {
          bllachfilmo_ = null;
        } else {
          bllachfilmo_ = null;
          bllachfilmoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SyncSnapShotOuterClass.internal_static_SyncSnapShot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot build() {
        emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot buildPartial() {
        emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot result = new emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot(this);
        if (bllachfilmoBuilder_ == null) {
          result.bllachfilmo_ = bllachfilmo_;
        } else {
          result.bllachfilmo_ = bllachfilmoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot) {
          return mergeFrom((emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot other) {
        if (other == emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot.getDefaultInstance()) return this;
        if (other.hasBllachfilmo()) {
          mergeBllachfilmo(other.getBllachfilmo());
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
        emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot bllachfilmo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder> bllachfilmoBuilder_;
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       * @return Whether the bllachfilmo field is set.
       */
      public boolean hasBllachfilmo() {
        return bllachfilmoBuilder_ != null || bllachfilmo_ != null;
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       * @return The bllachfilmo.
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getBllachfilmo() {
        if (bllachfilmoBuilder_ == null) {
          return bllachfilmo_ == null ? emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : bllachfilmo_;
        } else {
          return bllachfilmoBuilder_.getMessage();
        }
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public Builder setBllachfilmo(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot value) {
        if (bllachfilmoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bllachfilmo_ = value;
          onChanged();
        } else {
          bllachfilmoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public Builder setBllachfilmo(
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder builderForValue) {
        if (bllachfilmoBuilder_ == null) {
          bllachfilmo_ = builderForValue.build();
          onChanged();
        } else {
          bllachfilmoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public Builder mergeBllachfilmo(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot value) {
        if (bllachfilmoBuilder_ == null) {
          if (bllachfilmo_ != null) {
            bllachfilmo_ =
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.newBuilder(bllachfilmo_).mergeFrom(value).buildPartial();
          } else {
            bllachfilmo_ = value;
          }
          onChanged();
        } else {
          bllachfilmoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public Builder clearBllachfilmo() {
        if (bllachfilmoBuilder_ == null) {
          bllachfilmo_ = null;
          onChanged();
        } else {
          bllachfilmo_ = null;
          bllachfilmoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder getBllachfilmoBuilder() {
        
        onChanged();
        return getBllachfilmoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getBllachfilmoOrBuilder() {
        if (bllachfilmoBuilder_ != null) {
          return bllachfilmoBuilder_.getMessageOrBuilder();
        } else {
          return bllachfilmo_ == null ?
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : bllachfilmo_;
        }
      }
      /**
       * <code>.BreakoutSnapShot bllachfilmo = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder> 
          getBllachfilmoFieldBuilder() {
        if (bllachfilmoBuilder_ == null) {
          bllachfilmoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder>(
                  getBllachfilmo(),
                  getParentForChildren(),
                  isClean());
          bllachfilmo_ = null;
        }
        return bllachfilmoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SyncSnapShot)
    }

    // @@protoc_insertion_point(class_scope:SyncSnapShot)
    private static final emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot();
    }

    public static emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SyncSnapShot>
        PARSER = new com.google.protobuf.AbstractParser<SyncSnapShot>() {
      @java.lang.Override
      public SyncSnapShot parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SyncSnapShot(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SyncSnapShot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SyncSnapShot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SyncSnapShotOuterClass.SyncSnapShot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncSnapShot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SyncSnapShot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SyncSnapShot.proto\032\026BreakoutSnapShot.p" +
      "roto\"6\n\014SyncSnapShot\022&\n\013bllachfilmo\030\003 \001(" +
      "\0132\021.BreakoutSnapShotB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.getDescriptor(),
        });
    internal_static_SyncSnapShot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncSnapShot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SyncSnapShot_descriptor,
        new java.lang.String[] { "Bllachfilmo", });
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
