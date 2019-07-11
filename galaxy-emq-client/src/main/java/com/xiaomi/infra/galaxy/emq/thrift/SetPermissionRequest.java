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
public class SetPermissionRequest implements libthrift091.TBase<SetPermissionRequest, SetPermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetPermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetPermissionRequest");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField PERMISSION_FIELD_DESC = new libthrift091.protocol.TField("permission", libthrift091.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetPermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetPermissionRequestTupleSchemeFactory());
  }

  public String queueName; // required
  public String developerId; // required
  /**
   * 
   * @see Permission
   */
  public Permission permission; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    QUEUE_NAME((short)1, "queueName"),
    DEVELOPER_ID((short)2, "developerId"),
    /**
     * 
     * @see Permission
     */
    PERMISSION((short)3, "permission");

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
        case 2: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 3: // PERMISSION
          return PERMISSION;
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
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERMISSION, new libthrift091.meta_data.FieldMetaData("permission", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetPermissionRequest.class, metaDataMap);
  }

  public SetPermissionRequest() {
  }

  public SetPermissionRequest(
    String queueName,
    String developerId,
    Permission permission)
  {
    this();
    this.queueName = queueName;
    this.developerId = developerId;
    this.permission = permission;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetPermissionRequest(SetPermissionRequest other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetPermission()) {
      this.permission = other.permission;
    }
  }

  public SetPermissionRequest deepCopy() {
    return new SetPermissionRequest(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.developerId = null;
    this.permission = null;
  }

  public String getQueueName() {
    return this.queueName;
  }

  public SetPermissionRequest setQueueName(String queueName) {
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

  public String getDeveloperId() {
    return this.developerId;
  }

  public SetPermissionRequest setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  /**
   * 
   * @see Permission
   */
  public Permission getPermission() {
    return this.permission;
  }

  /**
   * 
   * @see Permission
   */
  public SetPermissionRequest setPermission(Permission permission) {
    this.permission = permission;
    return this;
  }

  public void unsetPermission() {
    this.permission = null;
  }

  /** Returns true if field permission is set (has been assigned a value) and false otherwise */
  public boolean isSetPermission() {
    return this.permission != null;
  }

  public void setPermissionIsSet(boolean value) {
    if (!value) {
      this.permission = null;
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

    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case PERMISSION:
      if (value == null) {
        unsetPermission();
      } else {
        setPermission((Permission)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case DEVELOPER_ID:
      return getDeveloperId();

    case PERMISSION:
      return getPermission();

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
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case PERMISSION:
      return isSetPermission();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetPermissionRequest)
      return this.equals((SetPermissionRequest)that);
    return false;
  }

  public boolean equals(SetPermissionRequest that) {
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

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_permission = true && this.isSetPermission();
    boolean that_present_permission = true && that.isSetPermission();
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (!this.permission.equals(that.permission))
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

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_permission = true && (isSetPermission());
    list.add(present_permission);
    if (present_permission)
      list.add(permission.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(SetPermissionRequest other) {
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
    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPermission()).compareTo(other.isSetPermission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermission()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permission, other.permission);
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
    StringBuilder sb = new StringBuilder("SetPermissionRequest(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("developerId:");
    if (this.developerId == null) {
      sb.append("null");
    } else {
      sb.append(this.developerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("permission:");
    if (this.permission == null) {
      sb.append("null");
    } else {
      sb.append(this.permission);
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
    if (developerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'developerId' was not present! Struct: " + toString());
    }
    if (permission == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'permission' was not present! Struct: " + toString());
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

  private static class SetPermissionRequestStandardSchemeFactory implements SchemeFactory {
    public SetPermissionRequestStandardScheme getScheme() {
      return new SetPermissionRequestStandardScheme();
    }
  }

  private static class SetPermissionRequestStandardScheme extends StandardScheme<SetPermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetPermissionRequest struct) throws libthrift091.TException {
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
          case 2: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERMISSION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.permission = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
              struct.setPermissionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetPermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.developerId != null) {
        oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
        oprot.writeString(struct.developerId);
        oprot.writeFieldEnd();
      }
      if (struct.permission != null) {
        oprot.writeFieldBegin(PERMISSION_FIELD_DESC);
        oprot.writeI32(struct.permission.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetPermissionRequestTupleSchemeFactory implements SchemeFactory {
    public SetPermissionRequestTupleScheme getScheme() {
      return new SetPermissionRequestTupleScheme();
    }
  }

  private static class SetPermissionRequestTupleScheme extends TupleScheme<SetPermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      oprot.writeString(struct.developerId);
      oprot.writeI32(struct.permission.getValue());
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.developerId = iprot.readString();
      struct.setDeveloperIdIsSet(true);
      struct.permission = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
      struct.setPermissionIsSet(true);
    }
  }

}

