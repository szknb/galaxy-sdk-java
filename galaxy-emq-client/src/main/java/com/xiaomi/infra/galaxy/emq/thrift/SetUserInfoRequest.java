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
public class SetUserInfoRequest implements libthrift091.TBase<SetUserInfoRequest, SetUserInfoRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetUserInfoRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetUserInfoRequest");

  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField USER_NAME_FIELD_DESC = new libthrift091.protocol.TField("userName", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField EMAIL_FIELD_DESC = new libthrift091.protocol.TField("email", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField SMS_FIELD_DESC = new libthrift091.protocol.TField("sms", libthrift091.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetUserInfoRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetUserInfoRequestTupleSchemeFactory());
  }

  /**
   * The developerId of an EMQ user;
   *  
   */
  public String developerId; // optional
  /**
   * User name;
   *  
   */
  public String userName; // optional
  /**
   * Email address;
   *  
   */
  public String email; // optional
  /**
   * SMS number;
   *  
   */
  public String sms; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The developerId of an EMQ user;
     *  
     */
    DEVELOPER_ID((short)1, "developerId"),
    /**
     * User name;
     *  
     */
    USER_NAME((short)2, "userName"),
    /**
     * Email address;
     *  
     */
    EMAIL((short)3, "email"),
    /**
     * SMS number;
     *  
     */
    SMS((short)4, "sms");

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
        case 1: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // EMAIL
          return EMAIL;
        case 4: // SMS
          return SMS;
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
  private static final _Fields optionals[] = {_Fields.DEVELOPER_ID,_Fields.USER_NAME,_Fields.EMAIL,_Fields.SMS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_NAME, new libthrift091.meta_data.FieldMetaData("userName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new libthrift091.meta_data.FieldMetaData("email", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SMS, new libthrift091.meta_data.FieldMetaData("sms", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetUserInfoRequest.class, metaDataMap);
  }

  public SetUserInfoRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetUserInfoRequest(SetUserInfoRequest other) {
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetSms()) {
      this.sms = other.sms;
    }
  }

  public SetUserInfoRequest deepCopy() {
    return new SetUserInfoRequest(this);
  }

  @Override
  public void clear() {
    this.developerId = null;
    this.userName = null;
    this.email = null;
    this.sms = null;
  }

  /**
   * The developerId of an EMQ user;
   *  
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * The developerId of an EMQ user;
   *  
   */
  public SetUserInfoRequest setDeveloperId(String developerId) {
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
   * User name;
   *  
   */
  public String getUserName() {
    return this.userName;
  }

  /**
   * User name;
   *  
   */
  public SetUserInfoRequest setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  /**
   * Email address;
   *  
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Email address;
   *  
   */
  public SetUserInfoRequest setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  /**
   * SMS number;
   *  
   */
  public String getSms() {
    return this.sms;
  }

  /**
   * SMS number;
   *  
   */
  public SetUserInfoRequest setSms(String sms) {
    this.sms = sms;
    return this;
  }

  public void unsetSms() {
    this.sms = null;
  }

  /** Returns true if field sms is set (has been assigned a value) and false otherwise */
  public boolean isSetSms() {
    return this.sms != null;
  }

  public void setSmsIsSet(boolean value) {
    if (!value) {
      this.sms = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case SMS:
      if (value == null) {
        unsetSms();
      } else {
        setSms((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVELOPER_ID:
      return getDeveloperId();

    case USER_NAME:
      return getUserName();

    case EMAIL:
      return getEmail();

    case SMS:
      return getSms();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case USER_NAME:
      return isSetUserName();
    case EMAIL:
      return isSetEmail();
    case SMS:
      return isSetSms();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetUserInfoRequest)
      return this.equals((SetUserInfoRequest)that);
    return false;
  }

  public boolean equals(SetUserInfoRequest that) {
    if (that == null)
      return false;

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_sms = true && this.isSetSms();
    boolean that_present_sms = true && that.isSetSms();
    if (this_present_sms || that_present_sms) {
      if (!(this_present_sms && that_present_sms))
        return false;
      if (!this.sms.equals(that.sms))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    boolean present_sms = true && (isSetSms());
    list.add(present_sms);
    if (present_sms)
      list.add(sms);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetUserInfoRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSms()).compareTo(other.isSetSms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSms()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sms, other.sms);
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
    StringBuilder sb = new StringBuilder("SetUserInfoRequest(");
    boolean first = true;

    if (isSetDeveloperId()) {
      sb.append("developerId:");
      if (this.developerId == null) {
        sb.append("null");
      } else {
        sb.append(this.developerId);
      }
      first = false;
    }
    if (isSetUserName()) {
      if (!first) sb.append(", ");
      sb.append("userName:");
      if (this.userName == null) {
        sb.append("null");
      } else {
        sb.append(this.userName);
      }
      first = false;
    }
    if (isSetEmail()) {
      if (!first) sb.append(", ");
      sb.append("email:");
      if (this.email == null) {
        sb.append("null");
      } else {
        sb.append(this.email);
      }
      first = false;
    }
    if (isSetSms()) {
      if (!first) sb.append(", ");
      sb.append("sms:");
      if (this.sms == null) {
        sb.append("null");
      } else {
        sb.append(this.sms);
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

  private static class SetUserInfoRequestStandardSchemeFactory implements SchemeFactory {
    public SetUserInfoRequestStandardScheme getScheme() {
      return new SetUserInfoRequestStandardScheme();
    }
  }

  private static class SetUserInfoRequestStandardScheme extends StandardScheme<SetUserInfoRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetUserInfoRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EMAIL
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SMS
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sms = iprot.readString();
              struct.setSmsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetUserInfoRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.developerId != null) {
        if (struct.isSetDeveloperId()) {
          oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
          oprot.writeString(struct.developerId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userName != null) {
        if (struct.isSetUserName()) {
          oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
          oprot.writeString(struct.userName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.email != null) {
        if (struct.isSetEmail()) {
          oprot.writeFieldBegin(EMAIL_FIELD_DESC);
          oprot.writeString(struct.email);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sms != null) {
        if (struct.isSetSms()) {
          oprot.writeFieldBegin(SMS_FIELD_DESC);
          oprot.writeString(struct.sms);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetUserInfoRequestTupleSchemeFactory implements SchemeFactory {
    public SetUserInfoRequestTupleScheme getScheme() {
      return new SetUserInfoRequestTupleScheme();
    }
  }

  private static class SetUserInfoRequestTupleScheme extends TupleScheme<SetUserInfoRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetUserInfoRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDeveloperId()) {
        optionals.set(0);
      }
      if (struct.isSetUserName()) {
        optionals.set(1);
      }
      if (struct.isSetEmail()) {
        optionals.set(2);
      }
      if (struct.isSetSms()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDeveloperId()) {
        oprot.writeString(struct.developerId);
      }
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetSms()) {
        oprot.writeString(struct.sms);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetUserInfoRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.developerId = iprot.readString();
        struct.setDeveloperIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sms = iprot.readString();
        struct.setSmsIsSet(true);
      }
    }
  }

}

