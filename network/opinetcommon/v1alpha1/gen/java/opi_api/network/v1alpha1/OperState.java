// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

/**
 * <pre>
 * Operational State Enumeration
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.v1alpha1.OperState}
 */
public enum OperState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPER_STATE_UNSPECIFIED = 0;</code>
   */
  OPER_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * Operational Up
   * </pre>
   *
   * <code>OPER_STATE_UP = 2;</code>
   */
  OPER_STATE_UP(2),
  /**
   * <pre>
   * Operational Down
   * </pre>
   *
   * <code>OPER_STATE_DOWN = 3;</code>
   */
  OPER_STATE_DOWN(3),
  /**
   * <pre>
   * Operational Testing
   * </pre>
   *
   * <code>OPER_STATE_TESTING = 4;</code>
   */
  OPER_STATE_TESTING(4),
  /**
   * <pre>
   * Unknown
   * </pre>
   *
   * <code>OPER_STATE_UNKNOWN = 5;</code>
   */
  OPER_STATE_UNKNOWN(5),
  /**
   * <pre>
   * Dormant
   * </pre>
   *
   * <code>OPER_STATE_DORMANT = 6;</code>
   */
  OPER_STATE_DORMANT(6),
  /**
   * <pre>
   * Not Present
   * </pre>
   *
   * <code>OPER_STATE_NOT_PRESENT = 7;</code>
   */
  OPER_STATE_NOT_PRESENT(7),
  /**
   * <pre>
   * Lower Layer Down
   * </pre>
   *
   * <code>OPER_STATE_LOWER_LAYER_DOWN = 8;</code>
   */
  OPER_STATE_LOWER_LAYER_DOWN(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPER_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int OPER_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Operational Up
   * </pre>
   *
   * <code>OPER_STATE_UP = 2;</code>
   */
  public static final int OPER_STATE_UP_VALUE = 2;
  /**
   * <pre>
   * Operational Down
   * </pre>
   *
   * <code>OPER_STATE_DOWN = 3;</code>
   */
  public static final int OPER_STATE_DOWN_VALUE = 3;
  /**
   * <pre>
   * Operational Testing
   * </pre>
   *
   * <code>OPER_STATE_TESTING = 4;</code>
   */
  public static final int OPER_STATE_TESTING_VALUE = 4;
  /**
   * <pre>
   * Unknown
   * </pre>
   *
   * <code>OPER_STATE_UNKNOWN = 5;</code>
   */
  public static final int OPER_STATE_UNKNOWN_VALUE = 5;
  /**
   * <pre>
   * Dormant
   * </pre>
   *
   * <code>OPER_STATE_DORMANT = 6;</code>
   */
  public static final int OPER_STATE_DORMANT_VALUE = 6;
  /**
   * <pre>
   * Not Present
   * </pre>
   *
   * <code>OPER_STATE_NOT_PRESENT = 7;</code>
   */
  public static final int OPER_STATE_NOT_PRESENT_VALUE = 7;
  /**
   * <pre>
   * Lower Layer Down
   * </pre>
   *
   * <code>OPER_STATE_LOWER_LAYER_DOWN = 8;</code>
   */
  public static final int OPER_STATE_LOWER_LAYER_DOWN_VALUE = 8;


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
  public static OperState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperState forNumber(int value) {
    switch (value) {
      case 0: return OPER_STATE_UNSPECIFIED;
      case 2: return OPER_STATE_UP;
      case 3: return OPER_STATE_DOWN;
      case 4: return OPER_STATE_TESTING;
      case 5: return OPER_STATE_UNKNOWN;
      case 6: return OPER_STATE_DORMANT;
      case 7: return OPER_STATE_NOT_PRESENT;
      case 8: return OPER_STATE_LOWER_LAYER_DOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OperState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperState>() {
          public OperState findValueByNumber(int number) {
            return OperState.forNumber(number);
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
    return opi_api.network.v1alpha1.OpenconfigInterfacesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final OperState[] VALUES = values();

  public static OperState valueOf(
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

  private OperState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.v1alpha1.OperState)
}
