// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DJLDJFDPBEI.proto

package emu.grasscutter.net.proto;

public final class DJLDJFDPBEIOuterClass {
  private DJLDJFDPBEIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DJLDJFDPBEI}
   */
  public enum DJLDJFDPBEI
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DJLDJFDPBEI_NONE = 0;</code>
     */
    DJLDJFDPBEI_NONE(0),
    /**
     * <code>CDFMIMCCFKH = 1;</code>
     */
    CDFMIMCCFKH(1),
    /**
     * <code>FIIEHMIEFKF = 2;</code>
     */
    FIIEHMIEFKF(2),
    /**
     * <code>EFEBEKMCOAN = 3;</code>
     */
    EFEBEKMCOAN(3),
    /**
     * <code>GNPNHKCKDHL = 4;</code>
     */
    GNPNHKCKDHL(4),
    /**
     * <code>DIHJPJCKIAP = 5;</code>
     */
    DIHJPJCKIAP(5),
    /**
     * <code>JJOIEEDMABA = 6;</code>
     */
    JJOIEEDMABA(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DJLDJFDPBEI_NONE = 0;</code>
     */
    public static final int DJLDJFDPBEI_NONE_VALUE = 0;
    /**
     * <code>CDFMIMCCFKH = 1;</code>
     */
    public static final int CDFMIMCCFKH_VALUE = 1;
    /**
     * <code>FIIEHMIEFKF = 2;</code>
     */
    public static final int FIIEHMIEFKF_VALUE = 2;
    /**
     * <code>EFEBEKMCOAN = 3;</code>
     */
    public static final int EFEBEKMCOAN_VALUE = 3;
    /**
     * <code>GNPNHKCKDHL = 4;</code>
     */
    public static final int GNPNHKCKDHL_VALUE = 4;
    /**
     * <code>DIHJPJCKIAP = 5;</code>
     */
    public static final int DIHJPJCKIAP_VALUE = 5;
    /**
     * <code>JJOIEEDMABA = 6;</code>
     */
    public static final int JJOIEEDMABA_VALUE = 6;


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
    public static DJLDJFDPBEI valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DJLDJFDPBEI forNumber(int value) {
      switch (value) {
        case 0: return DJLDJFDPBEI_NONE;
        case 1: return CDFMIMCCFKH;
        case 2: return FIIEHMIEFKF;
        case 3: return EFEBEKMCOAN;
        case 4: return GNPNHKCKDHL;
        case 5: return DIHJPJCKIAP;
        case 6: return JJOIEEDMABA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DJLDJFDPBEI>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DJLDJFDPBEI> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DJLDJFDPBEI>() {
            public DJLDJFDPBEI findValueByNumber(int number) {
              return DJLDJFDPBEI.forNumber(number);
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
      return emu.grasscutter.net.proto.DJLDJFDPBEIOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DJLDJFDPBEI[] VALUES = values();

    public static DJLDJFDPBEI valueOf(
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

    private DJLDJFDPBEI(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DJLDJFDPBEI)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DJLDJFDPBEI.proto*\211\001\n\013DJLDJFDPBEI\022\024\n\020D" +
      "JLDJFDPBEI_NONE\020\000\022\017\n\013CDFMIMCCFKH\020\001\022\017\n\013FI" +
      "IEHMIEFKF\020\002\022\017\n\013EFEBEKMCOAN\020\003\022\017\n\013GNPNHKCK" +
      "DHL\020\004\022\017\n\013DIHJPJCKIAP\020\005\022\017\n\013JJOIEEDMABA\020\006B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
