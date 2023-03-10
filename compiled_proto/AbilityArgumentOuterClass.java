// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityArgument.proto

package emu.grasscutter.net.proto;

public final class AbilityArgumentOuterClass {
  private AbilityArgumentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityArgumentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityArgument)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 int_arg = 11;</code>
     * @return The intArg.
     */
    int getIntArg();

    /**
     * <code>float float_arg = 2;</code>
     * @return The floatArg.
     */
    float getFloatArg();

    /**
     * <code>string str_arg = 8;</code>
     * @return The strArg.
     */
    java.lang.String getStrArg();
    /**
     * <code>string str_arg = 8;</code>
     * @return The bytes for strArg.
     */
    com.google.protobuf.ByteString
        getStrArgBytes();

    public emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.ArgCase getArgCase();
  }
  /**
   * Protobuf type {@code AbilityArgument}
   */
  public static final class AbilityArgument extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityArgument)
      AbilityArgumentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityArgument.newBuilder() to construct.
    private AbilityArgument(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityArgument() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityArgument();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityArgument(
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
              argCase_ = 2;
              arg_ = input.readFloat();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();
              argCase_ = 8;
              arg_ = s;
              break;
            }
            case 88: {
              argCase_ = 11;
              arg_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AbilityArgumentOuterClass.internal_static_AbilityArgument_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityArgumentOuterClass.internal_static_AbilityArgument_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.class, emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.Builder.class);
    }

    private int argCase_ = 0;
    private java.lang.Object arg_;
    public enum ArgCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      INT_ARG(11),
      FLOAT_ARG(2),
      STR_ARG(8),
      ARG_NOT_SET(0);
      private final int value;
      private ArgCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ArgCase valueOf(int value) {
        return forNumber(value);
      }

      public static ArgCase forNumber(int value) {
        switch (value) {
          case 11: return INT_ARG;
          case 2: return FLOAT_ARG;
          case 8: return STR_ARG;
          case 0: return ARG_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ArgCase
    getArgCase() {
      return ArgCase.forNumber(
          argCase_);
    }

    public static final int INT_ARG_FIELD_NUMBER = 11;
    /**
     * <code>uint32 int_arg = 11;</code>
     * @return The intArg.
     */
    @java.lang.Override
    public int getIntArg() {
      if (argCase_ == 11) {
        return (java.lang.Integer) arg_;
      }
      return 0;
    }

    public static final int FLOAT_ARG_FIELD_NUMBER = 2;
    /**
     * <code>float float_arg = 2;</code>
     * @return The floatArg.
     */
    @java.lang.Override
    public float getFloatArg() {
      if (argCase_ == 2) {
        return (java.lang.Float) arg_;
      }
      return 0F;
    }

    public static final int STR_ARG_FIELD_NUMBER = 8;
    /**
     * <code>string str_arg = 8;</code>
     * @return The strArg.
     */
    public java.lang.String getStrArg() {
      java.lang.Object ref = "";
      if (argCase_ == 8) {
        ref = arg_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (argCase_ == 8) {
          arg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string str_arg = 8;</code>
     * @return The bytes for strArg.
     */
    public com.google.protobuf.ByteString
        getStrArgBytes() {
      java.lang.Object ref = "";
      if (argCase_ == 8) {
        ref = arg_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (argCase_ == 8) {
          arg_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (argCase_ == 2) {
        output.writeFloat(
            2, (float)((java.lang.Float) arg_));
      }
      if (argCase_ == 8) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, arg_);
      }
      if (argCase_ == 11) {
        output.writeUInt32(
            11, (int)((java.lang.Integer) arg_));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (argCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(
              2, (float)((java.lang.Float) arg_));
      }
      if (argCase_ == 8) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, arg_);
      }
      if (argCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              11, (int)((java.lang.Integer) arg_));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument other = (emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument) obj;

      if (!getArgCase().equals(other.getArgCase())) return false;
      switch (argCase_) {
        case 11:
          if (getIntArg()
              != other.getIntArg()) return false;
          break;
        case 2:
          if (java.lang.Float.floatToIntBits(getFloatArg())
              != java.lang.Float.floatToIntBits(
                  other.getFloatArg())) return false;
          break;
        case 8:
          if (!getStrArg()
              .equals(other.getStrArg())) return false;
          break;
        case 0:
        default:
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
      switch (argCase_) {
        case 11:
          hash = (37 * hash) + INT_ARG_FIELD_NUMBER;
          hash = (53 * hash) + getIntArg();
          break;
        case 2:
          hash = (37 * hash) + FLOAT_ARG_FIELD_NUMBER;
          hash = (53 * hash) + java.lang.Float.floatToIntBits(
              getFloatArg());
          break;
        case 8:
          hash = (37 * hash) + STR_ARG_FIELD_NUMBER;
          hash = (53 * hash) + getStrArg().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument prototype) {
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
     * Protobuf type {@code AbilityArgument}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityArgument)
        emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgumentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityArgumentOuterClass.internal_static_AbilityArgument_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityArgumentOuterClass.internal_static_AbilityArgument_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.class, emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.newBuilder()
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
        argCase_ = 0;
        arg_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityArgumentOuterClass.internal_static_AbilityArgument_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument build() {
        emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument buildPartial() {
        emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument result = new emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument(this);
        if (argCase_ == 11) {
          result.arg_ = arg_;
        }
        if (argCase_ == 2) {
          result.arg_ = arg_;
        }
        if (argCase_ == 8) {
          result.arg_ = arg_;
        }
        result.argCase_ = argCase_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument other) {
        if (other == emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument.getDefaultInstance()) return this;
        switch (other.getArgCase()) {
          case INT_ARG: {
            setIntArg(other.getIntArg());
            break;
          }
          case FLOAT_ARG: {
            setFloatArg(other.getFloatArg());
            break;
          }
          case STR_ARG: {
            argCase_ = 8;
            arg_ = other.arg_;
            onChanged();
            break;
          }
          case ARG_NOT_SET: {
            break;
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
        emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int argCase_ = 0;
      private java.lang.Object arg_;
      public ArgCase
          getArgCase() {
        return ArgCase.forNumber(
            argCase_);
      }

      public Builder clearArg() {
        argCase_ = 0;
        arg_ = null;
        onChanged();
        return this;
      }


      /**
       * <code>uint32 int_arg = 11;</code>
       * @return The intArg.
       */
      public int getIntArg() {
        if (argCase_ == 11) {
          return (java.lang.Integer) arg_;
        }
        return 0;
      }
      /**
       * <code>uint32 int_arg = 11;</code>
       * @param value The intArg to set.
       * @return This builder for chaining.
       */
      public Builder setIntArg(int value) {
        argCase_ = 11;
        arg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 int_arg = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntArg() {
        if (argCase_ == 11) {
          argCase_ = 0;
          arg_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>float float_arg = 2;</code>
       * @return The floatArg.
       */
      public float getFloatArg() {
        if (argCase_ == 2) {
          return (java.lang.Float) arg_;
        }
        return 0F;
      }
      /**
       * <code>float float_arg = 2;</code>
       * @param value The floatArg to set.
       * @return This builder for chaining.
       */
      public Builder setFloatArg(float value) {
        argCase_ = 2;
        arg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float float_arg = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloatArg() {
        if (argCase_ == 2) {
          argCase_ = 0;
          arg_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>string str_arg = 8;</code>
       * @return The strArg.
       */
      @java.lang.Override
      public java.lang.String getStrArg() {
        java.lang.Object ref = "";
        if (argCase_ == 8) {
          ref = arg_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (argCase_ == 8) {
            arg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string str_arg = 8;</code>
       * @return The bytes for strArg.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getStrArgBytes() {
        java.lang.Object ref = "";
        if (argCase_ == 8) {
          ref = arg_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (argCase_ == 8) {
            arg_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string str_arg = 8;</code>
       * @param value The strArg to set.
       * @return This builder for chaining.
       */
      public Builder setStrArg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  argCase_ = 8;
        arg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string str_arg = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrArg() {
        if (argCase_ == 8) {
          argCase_ = 0;
          arg_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string str_arg = 8;</code>
       * @param value The bytes for strArg to set.
       * @return This builder for chaining.
       */
      public Builder setStrArgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        argCase_ = 8;
        arg_ = value;
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


      // @@protoc_insertion_point(builder_scope:AbilityArgument)
    }

    // @@protoc_insertion_point(class_scope:AbilityArgument)
    private static final emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument();
    }

    public static emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityArgument>
        PARSER = new com.google.protobuf.AbstractParser<AbilityArgument>() {
      @java.lang.Override
      public AbilityArgument parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityArgument(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityArgument> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityArgument> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityArgumentOuterClass.AbilityArgument getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityArgument_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityArgument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AbilityArgument.proto\"S\n\017AbilityArgume" +
      "nt\022\021\n\007int_arg\030\013 \001(\rH\000\022\023\n\tfloat_arg\030\002 \001(\002" +
      "H\000\022\021\n\007str_arg\030\010 \001(\tH\000B\005\n\003argB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityArgument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityArgument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityArgument_descriptor,
        new java.lang.String[] { "IntArg", "FloatArg", "StrArg", "Arg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
