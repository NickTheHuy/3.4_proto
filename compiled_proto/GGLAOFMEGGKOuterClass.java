// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GGLAOFMEGGK.proto

package emu.grasscutter.net.proto;

public final class GGLAOFMEGGKOuterClass {
  private GGLAOFMEGGKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GGLAOFMEGGK}
   */
  public enum GGLAOFMEGGK
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GGLAOFMEGGK_NONE = 0;</code>
     */
    GGLAOFMEGGK_NONE(0),
    /**
     * <code>speed = 1;</code>
     */
    speed(1),
    /**
     * <code>NLKFKAOKKGB = 2;</code>
     */
    NLKFKAOKKGB(2),
    /**
     * <code>AOMJCNMNCDB = 3;</code>
     */
    AOMJCNMNCDB(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GGLAOFMEGGK_NONE = 0;</code>
     */
    public static final int GGLAOFMEGGK_NONE_VALUE = 0;
    /**
     * <code>speed = 1;</code>
     */
    public static final int speed_VALUE = 1;
    /**
     * <code>NLKFKAOKKGB = 2;</code>
     */
    public static final int NLKFKAOKKGB_VALUE = 2;
    /**
     * <code>AOMJCNMNCDB = 3;</code>
     */
    public static final int AOMJCNMNCDB_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GGLAOFMEGGK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GGLAOFMEGGK forNumber(int value) {
      switch (value) {
        case 0: return GGLAOFMEGGK_NONE;
        case 1: return speed;
        case 2: return NLKFKAOKKGB;
        case 3: return AOMJCNMNCDB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GGLAOFMEGGK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GGLAOFMEGGK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GGLAOFMEGGK>() {
            public GGLAOFMEGGK findValueByNumber(int number) {
              return GGLAOFMEGGK.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GGLAOFMEGGKOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GGLAOFMEGGK[] VALUES = values();

    public static GGLAOFMEGGK valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GGLAOFMEGGK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GGLAOFMEGGK)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GGLAOFMEGGK.proto*P\n\013GGLAOFMEGGK\022\024\n\020GG" +
      "LAOFMEGGK_NONE\020\000\022\t\n\005speed\020\001\022\017\n\013NLKFKAOKK" +
      "GB\020\002\022\017\n\013AOMJCNMNCDB\020\003B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
