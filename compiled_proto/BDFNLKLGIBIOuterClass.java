// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BDFNLKLGIBI.proto

package emu.grasscutter.net.proto;

public final class BDFNLKLGIBIOuterClass {
  private BDFNLKLGIBIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BDFNLKLGIBIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BDFNLKLGIBI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 value = 1;</code>
     * @return The value.
     */
    long getValue();
  }
  /**
   * Protobuf type {@code BDFNLKLGIBI}
   */
  public static final class BDFNLKLGIBI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BDFNLKLGIBI)
      BDFNLKLGIBIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BDFNLKLGIBI.newBuilder() to construct.
    private BDFNLKLGIBI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BDFNLKLGIBI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BDFNLKLGIBI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BDFNLKLGIBI(
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

              value_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.internal_static_BDFNLKLGIBI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.internal_static_BDFNLKLGIBI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.class, emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;
    /**
     * <code>uint64 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
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
      if (value_ != 0L) {
        output.writeUInt64(1, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, value_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI other = (emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI) obj;

      if (getValue()
          != other.getValue()) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getValue());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI prototype) {
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
     * Protobuf type {@code BDFNLKLGIBI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BDFNLKLGIBI)
        emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.internal_static_BDFNLKLGIBI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.internal_static_BDFNLKLGIBI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.class, emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.newBuilder()
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
        value_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.internal_static_BDFNLKLGIBI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI build() {
        emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI buildPartial() {
        emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI result = new emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI(this);
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI) {
          return mergeFrom((emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI other) {
        if (other == emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI.getDefaultInstance()) return this;
        if (other.getValue() != 0L) {
          setValue(other.getValue());
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
        emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long value_ ;
      /**
       * <code>uint64 value = 1;</code>
       * @return The value.
       */
      @java.lang.Override
      public long getValue() {
        return value_;
      }
      /**
       * <code>uint64 value = 1;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(long value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:BDFNLKLGIBI)
    }

    // @@protoc_insertion_point(class_scope:BDFNLKLGIBI)
    private static final emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI();
    }

    public static emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BDFNLKLGIBI>
        PARSER = new com.google.protobuf.AbstractParser<BDFNLKLGIBI>() {
      @java.lang.Override
      public BDFNLKLGIBI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BDFNLKLGIBI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BDFNLKLGIBI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BDFNLKLGIBI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BDFNLKLGIBIOuterClass.BDFNLKLGIBI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BDFNLKLGIBI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BDFNLKLGIBI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BDFNLKLGIBI.proto\"\034\n\013BDFNLKLGIBI\022\r\n\005va" +
      "lue\030\001 \001(\004B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BDFNLKLGIBI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BDFNLKLGIBI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BDFNLKLGIBI_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
