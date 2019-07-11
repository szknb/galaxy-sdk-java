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
public class VerifyEMQAdminRoleRequest implements libthrift091.TBase<VerifyEMQAdminRoleRequest, VerifyEMQAdminRoleRequest._Fields>, java.io.Serializable, Cloneable, Comparable<VerifyEMQAdminRoleRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("VerifyEMQAdminRoleRequest");

  private static final libthrift091.protocol.TField GRANTEE_ID_FIELD_DESC = new libthrift091.protocol.TField("granteeId", libthrift091.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VerifyEMQAdminRoleRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VerifyEMQAdminRoleRequestTupleSchemeFactory());
  }

  public String granteeId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    GRANTEE_ID((short)1, "granteeId");

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
        case 1: // GRANTEE_ID
          return GRANTEE_ID;
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
  private static final _Fields optionals[] = {_Fields.GRANTEE_ID};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GRANTEE_ID, new libthrift091.meta_data.FieldMetaData("granteeId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(VerifyEMQAdminRoleRequest.class, metaDataMap);
  }

  public VerifyEMQAdminRoleRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VerifyEMQAdminRoleRequest(VerifyEMQAdminRoleRequest other) {
    if (other.isSetGranteeId()) {
      this.granteeId = other.granteeId;
    }
  }

  public VerifyEMQAdminRoleRequest deepCopy() {
    return new VerifyEMQAdminRoleRequest(this);
  }

  @Override
  public void clear() {
    this.granteeId = null;
  }

  public String getGranteeId() {
    return this.granteeId;
  }

  public VerifyEMQAdminRoleRequest setGranteeId(String granteeId) {
    this.granteeId = granteeId;
    return this;
  }

  public void unsetGranteeId() {
    this.granteeId = null;
  }

  /** Returns true if field granteeId is set (has been assigned a value) and false otherwise */
  public boolean isSetGranteeId() {
    return this.granteeId != null;
  }

  public void setGranteeIdIsSet(boolean value) {
    if (!value) {
      this.granteeId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GRANTEE_ID:
      if (value == null) {
        unsetGranteeId();
      } else {
        setGranteeId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GRANTEE_ID:
      return getGranteeId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GRANTEE_ID:
      return isSetGranteeId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VerifyEMQAdminRoleRequest)
      return this.equals((VerifyEMQAdminRoleRequest)that);
    return false;
  }

  public boolean equals(VerifyEMQAdminRoleRequest that) {
    if (that == null)
      return false;

    boolean this_present_granteeId = true && this.isSetGranteeId();
    boolean that_present_granteeId = true && that.isSetGranteeId();
    if (this_present_granteeId || that_present_granteeId) {
      if (!(this_present_granteeId && that_present_granteeId))
        return false;
      if (!this.granteeId.equals(that.granteeId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_granteeId = true && (isSetGranteeId());
    list.add(present_granteeId);
    if (present_granteeId)
      list.add(granteeId);

    return list.hashCode();
  }

  @Override
  public int compareTo(VerifyEMQAdminRoleRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGranteeId()).compareTo(other.isSetGranteeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGranteeId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.granteeId, other.granteeId);
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
    StringBuilder sb = new StringBuilder("VerifyEMQAdminRoleRequest(");
    boolean first = true;

    if (isSetGranteeId()) {
      sb.append("granteeId:");
      if (this.granteeId == null) {
        sb.append("null");
      } else {
        sb.append(this.granteeId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class VerifyEMQAdminRoleRequestStandardSchemeFactory implements SchemeFactory {
    public VerifyEMQAdminRoleRequestStandardScheme getScheme() {
      return new VerifyEMQAdminRoleRequestStandardScheme();
    }
  }

  private static class VerifyEMQAdminRoleRequestStandardScheme extends StandardScheme<VerifyEMQAdminRoleRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, VerifyEMQAdminRoleRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GRANTEE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.granteeId = iprot.readString();
              struct.setGranteeIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, VerifyEMQAdminRoleRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.granteeId != null) {
        if (struct.isSetGranteeId()) {
          oprot.writeFieldBegin(GRANTEE_ID_FIELD_DESC);
          oprot.writeString(struct.granteeId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VerifyEMQAdminRoleRequestTupleSchemeFactory implements SchemeFactory {
    public VerifyEMQAdminRoleRequestTupleScheme getScheme() {
      return new VerifyEMQAdminRoleRequestTupleScheme();
    }
  }

  private static class VerifyEMQAdminRoleRequestTupleScheme extends TupleScheme<VerifyEMQAdminRoleRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, VerifyEMQAdminRoleRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGranteeId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetGranteeId()) {
        oprot.writeString(struct.granteeId);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, VerifyEMQAdminRoleRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.granteeId = iprot.readString();
        struct.setGranteeIdIsSet(true);
      }
    }
  }

}

