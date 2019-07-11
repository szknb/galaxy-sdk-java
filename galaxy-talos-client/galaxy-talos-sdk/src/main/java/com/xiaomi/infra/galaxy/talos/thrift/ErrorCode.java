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

public enum ErrorCode implements libthrift091.TEnum {
  NO_ERROR(0),
  UNKNOWN(1),
  UNEXPECTED_ERROR(2),
  UNEXPECTED_MESSAGE_OFFSET(3),
  TOPIC_EXIST(4),
  TOPIC_NOT_EXIST(5),
  QUOTA_NOT_EXIST(6),
  LOCK_EXIST(7),
  LOCK_NOT_EXIST(8),
  LOCK_VALUE_NOT_EXPECTED(9),
  MESSAGE_MISSING(10),
  MESSAGE_INCOMPLETE(11),
  MESSAGE_INDEX_UNDESIRED_ERROR(12),
  MESSAGE_INDEX_NOT_EXIST(13),
  MESSAGE_OFFSET_OUT_OF_RANGE(14),
  INVALID_NAME_ERROR(15),
  INVALID_TOPIC_PARAMS(16),
  OPERATION_FAILED(17),
  HDFS_OPERATION_FAILED(18),
  HBASE_OPERATION_FAILED(19),
  ZOOKEEPER_OPERATION_FAILED(20),
  PARTITION_NOT_SERVING(21),
  PARTITION_NOT_EXIST(22),
  ZK_NODE_EXIST(23),
  ZK_NODE_NOT_EXIST(24),
  REST_SERVER_INIT_ERROR(25),
  INTERNAL_SERVER_ERROR(26),
  EXCESSIVE_PENDING_MESSAGE(27),
  PERMISSION_DENIED_ERROR(28),
  HDFS_FILE_NOT_EXIST(29),
  INVALID_AUTH_INFO(30),
  SUB_RESOURCE_NAME_EXIST(31),
  SUB_RESOURCE_NAME_NOT_EXIST(32),
  REQUEST_PROCESS_TIMEOUT(33),
  QUOTA_EXCEEDED(34),
  THROTTLE_REJECT_ERROR(35),
  QUOTA_AUTO_APPROVE_FAILED(36),
  HBASE_OPERATION_BLOCKED(37);

  private final int value;

  private ErrorCode(int value) {
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
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return NO_ERROR;
      case 1:
        return UNKNOWN;
      case 2:
        return UNEXPECTED_ERROR;
      case 3:
        return UNEXPECTED_MESSAGE_OFFSET;
      case 4:
        return TOPIC_EXIST;
      case 5:
        return TOPIC_NOT_EXIST;
      case 6:
        return QUOTA_NOT_EXIST;
      case 7:
        return LOCK_EXIST;
      case 8:
        return LOCK_NOT_EXIST;
      case 9:
        return LOCK_VALUE_NOT_EXPECTED;
      case 10:
        return MESSAGE_MISSING;
      case 11:
        return MESSAGE_INCOMPLETE;
      case 12:
        return MESSAGE_INDEX_UNDESIRED_ERROR;
      case 13:
        return MESSAGE_INDEX_NOT_EXIST;
      case 14:
        return MESSAGE_OFFSET_OUT_OF_RANGE;
      case 15:
        return INVALID_NAME_ERROR;
      case 16:
        return INVALID_TOPIC_PARAMS;
      case 17:
        return OPERATION_FAILED;
      case 18:
        return HDFS_OPERATION_FAILED;
      case 19:
        return HBASE_OPERATION_FAILED;
      case 20:
        return ZOOKEEPER_OPERATION_FAILED;
      case 21:
        return PARTITION_NOT_SERVING;
      case 22:
        return PARTITION_NOT_EXIST;
      case 23:
        return ZK_NODE_EXIST;
      case 24:
        return ZK_NODE_NOT_EXIST;
      case 25:
        return REST_SERVER_INIT_ERROR;
      case 26:
        return INTERNAL_SERVER_ERROR;
      case 27:
        return EXCESSIVE_PENDING_MESSAGE;
      case 28:
        return PERMISSION_DENIED_ERROR;
      case 29:
        return HDFS_FILE_NOT_EXIST;
      case 30:
        return INVALID_AUTH_INFO;
      case 31:
        return SUB_RESOURCE_NAME_EXIST;
      case 32:
        return SUB_RESOURCE_NAME_NOT_EXIST;
      case 33:
        return REQUEST_PROCESS_TIMEOUT;
      case 34:
        return QUOTA_EXCEEDED;
      case 35:
        return THROTTLE_REJECT_ERROR;
      case 36:
        return QUOTA_AUTO_APPROVE_FAILED;
      case 37:
        return HBASE_OPERATION_BLOCKED;
      default:
        return null;
    }
  }
}
