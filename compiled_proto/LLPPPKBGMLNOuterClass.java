// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LLPPPKBGMLN.proto

package emu.grasscutter.net.proto;

public final class LLPPPKBGMLNOuterClass {
  private LLPPPKBGMLNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LLPPPKBGMLNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LLPPPKBGMLN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ijfdcpilpno = 14;</code>
     * @return The ijfdcpilpno.
     */
    int getIjfdcpilpno();
  }
  /**
   * Protobuf type {@code LLPPPKBGMLN}
   */
  public static final class LLPPPKBGMLN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LLPPPKBGMLN)
      LLPPPKBGMLNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LLPPPKBGMLN.newBuilder() to construct.
    private LLPPPKBGMLN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LLPPPKBGMLN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LLPPPKBGMLN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LLPPPKBGMLN(
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
            case 112: {

              ijfdcpilpno_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.internal_static_LLPPPKBGMLN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.internal_static_LLPPPKBGMLN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.class, emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.Builder.class);
    }

    public static final int IJFDCPILPNO_FIELD_NUMBER = 14;
    private int ijfdcpilpno_;
    /**
     * <code>uint32 ijfdcpilpno = 14;</code>
     * @return The ijfdcpilpno.
     */
    @java.lang.Override
    public int getIjfdcpilpno() {
      return ijfdcpilpno_;
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
      if (ijfdcpilpno_ != 0) {
        output.writeUInt32(14, ijfdcpilpno_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ijfdcpilpno_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, ijfdcpilpno_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN other = (emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN) obj;

      if (getIjfdcpilpno()
          != other.getIjfdcpilpno()) return false;
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
      hash = (37 * hash) + IJFDCPILPNO_FIELD_NUMBER;
      hash = (53 * hash) + getIjfdcpilpno();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN prototype) {
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
     * Protobuf type {@code LLPPPKBGMLN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LLPPPKBGMLN)
        emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.internal_static_LLPPPKBGMLN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.internal_static_LLPPPKBGMLN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.class, emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.newBuilder()
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
        ijfdcpilpno_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.internal_static_LLPPPKBGMLN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN build() {
        emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN buildPartial() {
        emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN result = new emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN(this);
        result.ijfdcpilpno_ = ijfdcpilpno_;
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
        if (other instanceof emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN) {
          return mergeFrom((emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN other) {
        if (other == emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN.getDefaultInstance()) return this;
        if (other.getIjfdcpilpno() != 0) {
          setIjfdcpilpno(other.getIjfdcpilpno());
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
        emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ijfdcpilpno_ ;
      /**
       * <code>uint32 ijfdcpilpno = 14;</code>
       * @return The ijfdcpilpno.
       */
      @java.lang.Override
      public int getIjfdcpilpno() {
        return ijfdcpilpno_;
      }
      /**
       * <code>uint32 ijfdcpilpno = 14;</code>
       * @param value The ijfdcpilpno to set.
       * @return This builder for chaining.
       */
      public Builder setIjfdcpilpno(int value) {
        
        ijfdcpilpno_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ijfdcpilpno = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIjfdcpilpno() {
        
        ijfdcpilpno_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LLPPPKBGMLN)
    }

    // @@protoc_insertion_point(class_scope:LLPPPKBGMLN)
    private static final emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN();
    }

    public static emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LLPPPKBGMLN>
        PARSER = new com.google.protobuf.AbstractParser<LLPPPKBGMLN>() {
      @java.lang.Override
      public LLPPPKBGMLN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LLPPPKBGMLN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LLPPPKBGMLN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LLPPPKBGMLN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LLPPPKBGMLNOuterClass.LLPPPKBGMLN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LLPPPKBGMLN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LLPPPKBGMLN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LLPPPKBGMLN.proto\"\"\n\013LLPPPKBGMLN\022\023\n\013ij" +
      "fdcpilpno\030\016 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LLPPPKBGMLN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LLPPPKBGMLN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LLPPPKBGMLN_descriptor,
        new java.lang.String[] { "Ijfdcpilpno", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
