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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-7-6")
public class CopyQueueRequest implements libthrift091.TBase<CopyQueueRequest, CopyQueueRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CopyQueueRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CopyQueueRequest");

  private static final libthrift091.protocol.TField QUEUE_META_FIELD_DESC = new libthrift091.protocol.TField("queueMeta", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CopyQueueRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CopyQueueRequestTupleSchemeFactory());
  }

  public QueueMeta queueMeta; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    QUEUE_META((short)1, "queueMeta");

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
        case 1: // QUEUE_META
          return QUEUE_META;
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
    tmpMap.put(_Fields.QUEUE_META, new libthrift091.meta_data.FieldMetaData("queueMeta", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, QueueMeta.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CopyQueueRequest.class, metaDataMap);
  }

  public CopyQueueRequest() {
  }

  public CopyQueueRequest(
    QueueMeta queueMeta)
  {
    this();
    this.queueMeta = queueMeta;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CopyQueueRequest(CopyQueueRequest other) {
    if (other.isSetQueueMeta()) {
      this.queueMeta = new QueueMeta(other.queueMeta);
    }
  }

  public CopyQueueRequest deepCopy() {
    return new CopyQueueRequest(this);
  }

  @Override
  public void clear() {
    this.queueMeta = null;
  }

  public QueueMeta getQueueMeta() {
    return this.queueMeta;
  }

  public CopyQueueRequest setQueueMeta(QueueMeta queueMeta) {
    this.queueMeta = queueMeta;
    return this;
  }

  public void unsetQueueMeta() {
    this.queueMeta = null;
  }

  /** Returns true if field queueMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueMeta() {
    return this.queueMeta != null;
  }

  public void setQueueMetaIsSet(boolean value) {
    if (!value) {
      this.queueMeta = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_META:
      if (value == null) {
        unsetQueueMeta();
      } else {
        setQueueMeta((QueueMeta)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_META:
      return getQueueMeta();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_META:
      return isSetQueueMeta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CopyQueueRequest)
      return this.equals((CopyQueueRequest)that);
    return false;
  }

  public boolean equals(CopyQueueRequest that) {
    if (that == null)
      return false;

    boolean this_present_queueMeta = true && this.isSetQueueMeta();
    boolean that_present_queueMeta = true && that.isSetQueueMeta();
    if (this_present_queueMeta || that_present_queueMeta) {
      if (!(this_present_queueMeta && that_present_queueMeta))
        return false;
      if (!this.queueMeta.equals(that.queueMeta))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueMeta = true && (isSetQueueMeta());
    list.add(present_queueMeta);
    if (present_queueMeta)
      list.add(queueMeta);

    return list.hashCode();
  }

  @Override
  public int compareTo(CopyQueueRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueMeta()).compareTo(other.isSetQueueMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueMeta()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueMeta, other.queueMeta);
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
    StringBuilder sb = new StringBuilder("CopyQueueRequest(");
    boolean first = true;

    sb.append("queueMeta:");
    if (this.queueMeta == null) {
      sb.append("null");
    } else {
      sb.append(this.queueMeta);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueMeta == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueMeta' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (queueMeta != null) {
      queueMeta.validate();
    }
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

  private static class CopyQueueRequestStandardSchemeFactory implements SchemeFactory {
    public CopyQueueRequestStandardScheme getScheme() {
      return new CopyQueueRequestStandardScheme();
    }
  }

  private static class CopyQueueRequestStandardScheme extends StandardScheme<CopyQueueRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, CopyQueueRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_META
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.queueMeta = new QueueMeta();
              struct.queueMeta.read(iprot);
              struct.setQueueMetaIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, CopyQueueRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueMeta != null) {
        oprot.writeFieldBegin(QUEUE_META_FIELD_DESC);
        struct.queueMeta.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CopyQueueRequestTupleSchemeFactory implements SchemeFactory {
    public CopyQueueRequestTupleScheme getScheme() {
      return new CopyQueueRequestTupleScheme();
    }
  }

  private static class CopyQueueRequestTupleScheme extends TupleScheme<CopyQueueRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CopyQueueRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.queueMeta.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CopyQueueRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueMeta = new QueueMeta();
      struct.queueMeta.read(iprot);
      struct.setQueueMetaIsSet(true);
    }
  }

}

