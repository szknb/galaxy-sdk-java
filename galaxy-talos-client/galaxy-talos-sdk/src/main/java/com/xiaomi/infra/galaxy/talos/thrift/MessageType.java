/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum MessageType implements libthrift091.TEnum {
  BINARY(1);

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageType findByValue(int value) { 
    switch (value) {
      case 1:
        return BINARY;
      default:
        return null;
    }
  }
}