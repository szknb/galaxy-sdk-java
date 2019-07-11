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
public class ListPermissionsResponse implements libthrift091.TBase<ListPermissionsResponse, ListPermissionsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListPermissionsResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListPermissionsResponse");

  private static final libthrift091.protocol.TField PERMISSION_LIST_FIELD_DESC = new libthrift091.protocol.TField("permissionList", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListPermissionsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListPermissionsResponseTupleSchemeFactory());
  }

  public Map<String,Permission> permissionList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    PERMISSION_LIST((short)1, "permissionList");

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
        case 1: // PERMISSION_LIST
          return PERMISSION_LIST;
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
    tmpMap.put(_Fields.PERMISSION_LIST, new libthrift091.meta_data.FieldMetaData("permissionList", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListPermissionsResponse.class, metaDataMap);
  }

  public ListPermissionsResponse() {
  }

  public ListPermissionsResponse(
    Map<String,Permission> permissionList)
  {
    this();
    this.permissionList = permissionList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListPermissionsResponse(ListPermissionsResponse other) {
    if (other.isSetPermissionList()) {
      Map<String,Permission> __this__permissionList = new HashMap<String,Permission>(other.permissionList.size());
      for (Map.Entry<String, Permission> other_element : other.permissionList.entrySet()) {

        String other_element_key = other_element.getKey();
        Permission other_element_value = other_element.getValue();

        String __this__permissionList_copy_key = other_element_key;

        Permission __this__permissionList_copy_value = other_element_value;

        __this__permissionList.put(__this__permissionList_copy_key, __this__permissionList_copy_value);
      }
      this.permissionList = __this__permissionList;
    }
  }

  public ListPermissionsResponse deepCopy() {
    return new ListPermissionsResponse(this);
  }

  @Override
  public void clear() {
    this.permissionList = null;
  }

  public int getPermissionListSize() {
    return (this.permissionList == null) ? 0 : this.permissionList.size();
  }

  public void putToPermissionList(String key, Permission val) {
    if (this.permissionList == null) {
      this.permissionList = new HashMap<String,Permission>();
    }
    this.permissionList.put(key, val);
  }

  public Map<String,Permission> getPermissionList() {
    return this.permissionList;
  }

  public ListPermissionsResponse setPermissionList(Map<String,Permission> permissionList) {
    this.permissionList = permissionList;
    return this;
  }

  public void unsetPermissionList() {
    this.permissionList = null;
  }

  /** Returns true if field permissionList is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissionList() {
    return this.permissionList != null;
  }

  public void setPermissionListIsSet(boolean value) {
    if (!value) {
      this.permissionList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERMISSION_LIST:
      if (value == null) {
        unsetPermissionList();
      } else {
        setPermissionList((Map<String,Permission>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERMISSION_LIST:
      return getPermissionList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERMISSION_LIST:
      return isSetPermissionList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListPermissionsResponse)
      return this.equals((ListPermissionsResponse)that);
    return false;
  }

  public boolean equals(ListPermissionsResponse that) {
    if (that == null)
      return false;

    boolean this_present_permissionList = true && this.isSetPermissionList();
    boolean that_present_permissionList = true && that.isSetPermissionList();
    if (this_present_permissionList || that_present_permissionList) {
      if (!(this_present_permissionList && that_present_permissionList))
        return false;
      if (!this.permissionList.equals(that.permissionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_permissionList = true && (isSetPermissionList());
    list.add(present_permissionList);
    if (present_permissionList)
      list.add(permissionList);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListPermissionsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPermissionList()).compareTo(other.isSetPermissionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissionList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permissionList, other.permissionList);
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
    StringBuilder sb = new StringBuilder("ListPermissionsResponse(");
    boolean first = true;

    sb.append("permissionList:");
    if (this.permissionList == null) {
      sb.append("null");
    } else {
      sb.append(this.permissionList);
    }
    first = false;
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

  private static class ListPermissionsResponseStandardSchemeFactory implements SchemeFactory {
    public ListPermissionsResponseStandardScheme getScheme() {
      return new ListPermissionsResponseStandardScheme();
    }
  }

  private static class ListPermissionsResponseStandardScheme extends StandardScheme<ListPermissionsResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListPermissionsResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERMISSION_LIST
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map34 = iprot.readMapBegin();
                struct.permissionList = new HashMap<String,Permission>(2*_map34.size);
                String _key35;
                Permission _val36;
                for (int _i37 = 0; _i37 < _map34.size; ++_i37)
                {
                  _key35 = iprot.readString();
                  _val36 = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
                  struct.permissionList.put(_key35, _val36);
                }
                iprot.readMapEnd();
              }
              struct.setPermissionListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListPermissionsResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.permissionList != null) {
        oprot.writeFieldBegin(PERMISSION_LIST_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, struct.permissionList.size()));
          for (Map.Entry<String, Permission> _iter38 : struct.permissionList.entrySet())
          {
            oprot.writeString(_iter38.getKey());
            oprot.writeI32(_iter38.getValue().getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListPermissionsResponseTupleSchemeFactory implements SchemeFactory {
    public ListPermissionsResponseTupleScheme getScheme() {
      return new ListPermissionsResponseTupleScheme();
    }
  }

  private static class ListPermissionsResponseTupleScheme extends TupleScheme<ListPermissionsResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListPermissionsResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPermissionList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPermissionList()) {
        {
          oprot.writeI32(struct.permissionList.size());
          for (Map.Entry<String, Permission> _iter39 : struct.permissionList.entrySet())
          {
            oprot.writeString(_iter39.getKey());
            oprot.writeI32(_iter39.getValue().getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListPermissionsResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map40 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, iprot.readI32());
          struct.permissionList = new HashMap<String,Permission>(2*_map40.size);
          String _key41;
          Permission _val42;
          for (int _i43 = 0; _i43 < _map40.size; ++_i43)
          {
            _key41 = iprot.readString();
            _val42 = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
            struct.permissionList.put(_key41, _val42);
          }
        }
        struct.setPermissionListIsSet(true);
      }
    }
  }

}

