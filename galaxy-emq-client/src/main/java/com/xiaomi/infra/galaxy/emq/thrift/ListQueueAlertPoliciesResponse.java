/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-8-22")
public class ListQueueAlertPoliciesResponse implements libthrift091.TBase<ListQueueAlertPoliciesResponse, ListQueueAlertPoliciesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListQueueAlertPoliciesResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListQueueAlertPoliciesResponse");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField ALERT_POLICIES_FIELD_DESC = new libthrift091.protocol.TField("alertPolicies", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListQueueAlertPoliciesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListQueueAlertPoliciesResponseTupleSchemeFactory());
  }

  /**
   * Queue name;
   *  
   */
  public String queueName; // required
  /**
   * Alert policy list;
   *  
   */
  public List<AlertPolicy> alertPolicies; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue name;
     *  
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * Alert policy list;
     *  
     */
    ALERT_POLICIES((short)2, "alertPolicies");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // ALERT_POLICIES
          return ALERT_POLICIES;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALERT_POLICIES, new libthrift091.meta_data.FieldMetaData("alertPolicies", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, AlertPolicy.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListQueueAlertPoliciesResponse.class, metaDataMap);
  }

  public ListQueueAlertPoliciesResponse() {
  }

  public ListQueueAlertPoliciesResponse(
    String queueName,
    List<AlertPolicy> alertPolicies)
  {
    this();
    this.queueName = queueName;
    this.alertPolicies = alertPolicies;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListQueueAlertPoliciesResponse(ListQueueAlertPoliciesResponse other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetAlertPolicies()) {
      List<AlertPolicy> __this__alertPolicies = new ArrayList<AlertPolicy>(other.alertPolicies.size());
      for (AlertPolicy other_element : other.alertPolicies) {
        __this__alertPolicies.add(new AlertPolicy(other_element));
      }
      this.alertPolicies = __this__alertPolicies;
    }
  }

  public ListQueueAlertPoliciesResponse deepCopy() {
    return new ListQueueAlertPoliciesResponse(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.alertPolicies = null;
  }

  /**
   * Queue name;
   *  
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * Queue name;
   *  
   */
  public ListQueueAlertPoliciesResponse setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public int getAlertPoliciesSize() {
    return (this.alertPolicies == null) ? 0 : this.alertPolicies.size();
  }

  public java.util.Iterator<AlertPolicy> getAlertPoliciesIterator() {
    return (this.alertPolicies == null) ? null : this.alertPolicies.iterator();
  }

  public void addToAlertPolicies(AlertPolicy elem) {
    if (this.alertPolicies == null) {
      this.alertPolicies = new ArrayList<AlertPolicy>();
    }
    this.alertPolicies.add(elem);
  }

  /**
   * Alert policy list;
   *  
   */
  public List<AlertPolicy> getAlertPolicies() {
    return this.alertPolicies;
  }

  /**
   * Alert policy list;
   *  
   */
  public ListQueueAlertPoliciesResponse setAlertPolicies(List<AlertPolicy> alertPolicies) {
    this.alertPolicies = alertPolicies;
    return this;
  }

  public void unsetAlertPolicies() {
    this.alertPolicies = null;
  }

  /** Returns true if field alertPolicies is set (has been assigned a value) and false otherwise */
  public boolean isSetAlertPolicies() {
    return this.alertPolicies != null;
  }

  public void setAlertPoliciesIsSet(boolean value) {
    if (!value) {
      this.alertPolicies = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case ALERT_POLICIES:
      if (value == null) {
        unsetAlertPolicies();
      } else {
        setAlertPolicies((List<AlertPolicy>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case ALERT_POLICIES:
      return getAlertPolicies();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case ALERT_POLICIES:
      return isSetAlertPolicies();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListQueueAlertPoliciesResponse)
      return this.equals((ListQueueAlertPoliciesResponse)that);
    return false;
  }

  public boolean equals(ListQueueAlertPoliciesResponse that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_alertPolicies = true && this.isSetAlertPolicies();
    boolean that_present_alertPolicies = true && that.isSetAlertPolicies();
    if (this_present_alertPolicies || that_present_alertPolicies) {
      if (!(this_present_alertPolicies && that_present_alertPolicies))
        return false;
      if (!this.alertPolicies.equals(that.alertPolicies))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_alertPolicies = true && (isSetAlertPolicies());
    list.add(present_alertPolicies);
    if (present_alertPolicies)
      list.add(alertPolicies);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListQueueAlertPoliciesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlertPolicies()).compareTo(other.isSetAlertPolicies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlertPolicies()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.alertPolicies, other.alertPolicies);
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
    StringBuilder sb = new StringBuilder("ListQueueAlertPoliciesResponse(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alertPolicies:");
    if (this.alertPolicies == null) {
      sb.append("null");
    } else {
      sb.append(this.alertPolicies);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (alertPolicies == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'alertPolicies' was not present! Struct: " + toString());
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ListQueueAlertPoliciesResponseStandardSchemeFactory implements SchemeFactory {
    public ListQueueAlertPoliciesResponseStandardScheme getScheme() {
      return new ListQueueAlertPoliciesResponseStandardScheme();
    }
  }

  private static class ListQueueAlertPoliciesResponseStandardScheme extends StandardScheme<ListQueueAlertPoliciesResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListQueueAlertPoliciesResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALERT_POLICIES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list0 = iprot.readListBegin();
                struct.alertPolicies = new ArrayList<AlertPolicy>(_list0.size);
                AlertPolicy _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new AlertPolicy();
                  _elem1.read(iprot);
                  struct.alertPolicies.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setAlertPoliciesIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, ListQueueAlertPoliciesResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.alertPolicies != null) {
        oprot.writeFieldBegin(ALERT_POLICIES_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.alertPolicies.size()));
          for (AlertPolicy _iter3 : struct.alertPolicies)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListQueueAlertPoliciesResponseTupleSchemeFactory implements SchemeFactory {
    public ListQueueAlertPoliciesResponseTupleScheme getScheme() {
      return new ListQueueAlertPoliciesResponseTupleScheme();
    }
  }

  private static class ListQueueAlertPoliciesResponseTupleScheme extends TupleScheme<ListQueueAlertPoliciesResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListQueueAlertPoliciesResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      {
        oprot.writeI32(struct.alertPolicies.size());
        for (AlertPolicy _iter4 : struct.alertPolicies)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListQueueAlertPoliciesResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      {
        libthrift091.protocol.TList _list5 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.alertPolicies = new ArrayList<AlertPolicy>(_list5.size);
        AlertPolicy _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new AlertPolicy();
          _elem6.read(iprot);
          struct.alertPolicies.add(_elem6);
        }
      }
      struct.setAlertPoliciesIsSet(true);
    }
  }

}

