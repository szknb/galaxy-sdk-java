/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-5-20")
public class RenewResponse implements libthrift091.TBase<RenewResponse, RenewResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RenewResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RenewResponse");

  private static final libthrift091.protocol.TField HEARTBEAT_SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("heartbeatSuccess", libthrift091.protocol.TType.BOOL, (short)1);
  private static final libthrift091.protocol.TField FAILED_PARTITION_LIST_FIELD_DESC = new libthrift091.protocol.TField("failedPartitionList", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RenewResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RenewResponseTupleSchemeFactory());
  }

  /**
   * renew worker heartbeat result
   * 
   */
  public boolean heartbeatSuccess; // required
  /**
   * renew serving partitions failed
   * 
   */
  public List<Integer> failedPartitionList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * renew worker heartbeat result
     * 
     */
    HEARTBEAT_SUCCESS((short)1, "heartbeatSuccess"),
    /**
     * renew serving partitions failed
     * 
     */
    FAILED_PARTITION_LIST((short)2, "failedPartitionList");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEARTBEAT_SUCCESS
          return HEARTBEAT_SUCCESS;
        case 2: // FAILED_PARTITION_LIST
          return FAILED_PARTITION_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HEARTBEATSUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEARTBEAT_SUCCESS, new libthrift091.meta_data.FieldMetaData("heartbeatSuccess", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FAILED_PARTITION_LIST, new libthrift091.meta_data.FieldMetaData("failedPartitionList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RenewResponse.class, metaDataMap);
  }

  public RenewResponse() {
  }

  public RenewResponse(
    boolean heartbeatSuccess,
    List<Integer> failedPartitionList)
  {
    this();
    this.heartbeatSuccess = heartbeatSuccess;
    setHeartbeatSuccessIsSet(true);
    this.failedPartitionList = failedPartitionList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RenewResponse(RenewResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.heartbeatSuccess = other.heartbeatSuccess;
    if (other.isSetFailedPartitionList()) {
      List<Integer> __this__failedPartitionList = new ArrayList<Integer>(other.failedPartitionList);
      this.failedPartitionList = __this__failedPartitionList;
    }
  }

  public RenewResponse deepCopy() {
    return new RenewResponse(this);
  }

  @Override
  public void clear() {
    setHeartbeatSuccessIsSet(false);
    this.heartbeatSuccess = false;
    this.failedPartitionList = null;
  }

  /**
   * renew worker heartbeat result
   * 
   */
  public boolean isHeartbeatSuccess() {
    return this.heartbeatSuccess;
  }

  /**
   * renew worker heartbeat result
   * 
   */
  public RenewResponse setHeartbeatSuccess(boolean heartbeatSuccess) {
    this.heartbeatSuccess = heartbeatSuccess;
    setHeartbeatSuccessIsSet(true);
    return this;
  }

  public void unsetHeartbeatSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEARTBEATSUCCESS_ISSET_ID);
  }

  /** Returns true if field heartbeatSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetHeartbeatSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __HEARTBEATSUCCESS_ISSET_ID);
  }

  public void setHeartbeatSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEARTBEATSUCCESS_ISSET_ID, value);
  }

  public int getFailedPartitionListSize() {
    return (this.failedPartitionList == null) ? 0 : this.failedPartitionList.size();
  }

  public java.util.Iterator<Integer> getFailedPartitionListIterator() {
    return (this.failedPartitionList == null) ? null : this.failedPartitionList.iterator();
  }

  public void addToFailedPartitionList(int elem) {
    if (this.failedPartitionList == null) {
      this.failedPartitionList = new ArrayList<Integer>();
    }
    this.failedPartitionList.add(elem);
  }

  /**
   * renew serving partitions failed
   * 
   */
  public List<Integer> getFailedPartitionList() {
    return this.failedPartitionList;
  }

  /**
   * renew serving partitions failed
   * 
   */
  public RenewResponse setFailedPartitionList(List<Integer> failedPartitionList) {
    this.failedPartitionList = failedPartitionList;
    return this;
  }

  public void unsetFailedPartitionList() {
    this.failedPartitionList = null;
  }

  /** Returns true if field failedPartitionList is set (has been assigned a value) and false otherwise */
  public boolean isSetFailedPartitionList() {
    return this.failedPartitionList != null;
  }

  public void setFailedPartitionListIsSet(boolean value) {
    if (!value) {
      this.failedPartitionList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEARTBEAT_SUCCESS:
      if (value == null) {
        unsetHeartbeatSuccess();
      } else {
        setHeartbeatSuccess((Boolean)value);
      }
      break;

    case FAILED_PARTITION_LIST:
      if (value == null) {
        unsetFailedPartitionList();
      } else {
        setFailedPartitionList((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEARTBEAT_SUCCESS:
      return Boolean.valueOf(isHeartbeatSuccess());

    case FAILED_PARTITION_LIST:
      return getFailedPartitionList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEARTBEAT_SUCCESS:
      return isSetHeartbeatSuccess();
    case FAILED_PARTITION_LIST:
      return isSetFailedPartitionList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RenewResponse)
      return this.equals((RenewResponse)that);
    return false;
  }

  public boolean equals(RenewResponse that) {
    if (that == null)
      return false;

    boolean this_present_heartbeatSuccess = true;
    boolean that_present_heartbeatSuccess = true;
    if (this_present_heartbeatSuccess || that_present_heartbeatSuccess) {
      if (!(this_present_heartbeatSuccess && that_present_heartbeatSuccess))
        return false;
      if (this.heartbeatSuccess != that.heartbeatSuccess)
        return false;
    }

    boolean this_present_failedPartitionList = true && this.isSetFailedPartitionList();
    boolean that_present_failedPartitionList = true && that.isSetFailedPartitionList();
    if (this_present_failedPartitionList || that_present_failedPartitionList) {
      if (!(this_present_failedPartitionList && that_present_failedPartitionList))
        return false;
      if (!this.failedPartitionList.equals(that.failedPartitionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_heartbeatSuccess = true;
    list.add(present_heartbeatSuccess);
    if (present_heartbeatSuccess)
      list.add(heartbeatSuccess);

    boolean present_failedPartitionList = true && (isSetFailedPartitionList());
    list.add(present_failedPartitionList);
    if (present_failedPartitionList)
      list.add(failedPartitionList);

    return list.hashCode();
  }

  @Override
  public int compareTo(RenewResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHeartbeatSuccess()).compareTo(other.isSetHeartbeatSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeartbeatSuccess()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.heartbeatSuccess, other.heartbeatSuccess);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailedPartitionList()).compareTo(other.isSetFailedPartitionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailedPartitionList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.failedPartitionList, other.failedPartitionList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RenewResponse(");
    boolean first = true;

    sb.append("heartbeatSuccess:");
    sb.append(this.heartbeatSuccess);
    first = false;
    if (!first) sb.append(", ");
    sb.append("failedPartitionList:");
    if (this.failedPartitionList == null) {
      sb.append("null");
    } else {
      sb.append(this.failedPartitionList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'heartbeatSuccess' because it's a primitive and you chose the non-beans generator.
    if (failedPartitionList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'failedPartitionList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RenewResponseStandardSchemeFactory implements SchemeFactory {
    public RenewResponseStandardScheme getScheme() {
      return new RenewResponseStandardScheme();
    }
  }

  private static class RenewResponseStandardScheme extends StandardScheme<RenewResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, RenewResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEARTBEAT_SUCCESS
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.heartbeatSuccess = iprot.readBool();
              struct.setHeartbeatSuccessIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FAILED_PARTITION_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list24 = iprot.readListBegin();
                struct.failedPartitionList = new ArrayList<Integer>(_list24.size);
                int _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readI32();
                  struct.failedPartitionList.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setFailedPartitionListIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHeartbeatSuccess()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'heartbeatSuccess' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, RenewResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HEARTBEAT_SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.heartbeatSuccess);
      oprot.writeFieldEnd();
      if (struct.failedPartitionList != null) {
        oprot.writeFieldBegin(FAILED_PARTITION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, struct.failedPartitionList.size()));
          for (int _iter27 : struct.failedPartitionList)
          {
            oprot.writeI32(_iter27);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RenewResponseTupleSchemeFactory implements SchemeFactory {
    public RenewResponseTupleScheme getScheme() {
      return new RenewResponseTupleScheme();
    }
  }

  private static class RenewResponseTupleScheme extends TupleScheme<RenewResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RenewResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.heartbeatSuccess);
      {
        oprot.writeI32(struct.failedPartitionList.size());
        for (int _iter28 : struct.failedPartitionList)
        {
          oprot.writeI32(_iter28);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RenewResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.heartbeatSuccess = iprot.readBool();
      struct.setHeartbeatSuccessIsSet(true);
      {
        libthrift091.protocol.TList _list29 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
        struct.failedPartitionList = new ArrayList<Integer>(_list29.size);
        int _elem30;
        for (int _i31 = 0; _i31 < _list29.size; ++_i31)
        {
          _elem30 = iprot.readI32();
          struct.failedPartitionList.add(_elem30);
        }
      }
      struct.setFailedPartitionListIsSet(true);
    }
  }

}

