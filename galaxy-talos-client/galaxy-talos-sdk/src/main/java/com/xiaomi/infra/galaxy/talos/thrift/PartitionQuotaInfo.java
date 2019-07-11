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
public class PartitionQuotaInfo implements libthrift091.TBase<PartitionQuotaInfo, PartitionQuotaInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionQuotaInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PartitionQuotaInfo");

  private static final libthrift091.protocol.TField ORG_ID_FIELD_DESC = new libthrift091.protocol.TField("orgId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TOTAL_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("totalQuota", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField USED_OUOTA_FIELD_DESC = new libthrift091.protocol.TField("usedOuota", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField APPLY_REASON_FIELD_DESC = new libthrift091.protocol.TField("applyReason", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField ORG_NAME_FIELD_DESC = new libthrift091.protocol.TField("orgName", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionQuotaInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionQuotaInfoTupleSchemeFactory());
  }

  /**
   * The Org Id
   * 
   */
  public String orgId; // required
  /**
   * The org apply/old total partition quota, depending on specific request
   * 
   */
  public int totalQuota; // required
  /**
   * The org used partition quota, optional
   * 
   */
  public int usedOuota; // optional
  /**
   * The reason of apply quota
   * 
   */
  public String applyReason; // optional
  /**
   * The Org Name
   * 
   */
  public String orgName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The Org Id
     * 
     */
    ORG_ID((short)1, "orgId"),
    /**
     * The org apply/old total partition quota, depending on specific request
     * 
     */
    TOTAL_QUOTA((short)2, "totalQuota"),
    /**
     * The org used partition quota, optional
     * 
     */
    USED_OUOTA((short)3, "usedOuota"),
    /**
     * The reason of apply quota
     * 
     */
    APPLY_REASON((short)4, "applyReason"),
    /**
     * The Org Name
     * 
     */
    ORG_NAME((short)5, "orgName");

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
        case 1: // ORG_ID
          return ORG_ID;
        case 2: // TOTAL_QUOTA
          return TOTAL_QUOTA;
        case 3: // USED_OUOTA
          return USED_OUOTA;
        case 4: // APPLY_REASON
          return APPLY_REASON;
        case 5: // ORG_NAME
          return ORG_NAME;
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
  private static final int __TOTALQUOTA_ISSET_ID = 0;
  private static final int __USEDOUOTA_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USED_OUOTA,_Fields.APPLY_REASON,_Fields.ORG_NAME};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORG_ID, new libthrift091.meta_data.FieldMetaData("orgId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOTAL_QUOTA, new libthrift091.meta_data.FieldMetaData("totalQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.USED_OUOTA, new libthrift091.meta_data.FieldMetaData("usedOuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.APPLY_REASON, new libthrift091.meta_data.FieldMetaData("applyReason", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORG_NAME, new libthrift091.meta_data.FieldMetaData("orgName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PartitionQuotaInfo.class, metaDataMap);
  }

  public PartitionQuotaInfo() {
  }

  public PartitionQuotaInfo(
    String orgId,
    int totalQuota)
  {
    this();
    this.orgId = orgId;
    this.totalQuota = totalQuota;
    setTotalQuotaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionQuotaInfo(PartitionQuotaInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOrgId()) {
      this.orgId = other.orgId;
    }
    this.totalQuota = other.totalQuota;
    this.usedOuota = other.usedOuota;
    if (other.isSetApplyReason()) {
      this.applyReason = other.applyReason;
    }
    if (other.isSetOrgName()) {
      this.orgName = other.orgName;
    }
  }

  public PartitionQuotaInfo deepCopy() {
    return new PartitionQuotaInfo(this);
  }

  @Override
  public void clear() {
    this.orgId = null;
    setTotalQuotaIsSet(false);
    this.totalQuota = 0;
    setUsedOuotaIsSet(false);
    this.usedOuota = 0;
    this.applyReason = null;
    this.orgName = null;
  }

  /**
   * The Org Id
   * 
   */
  public String getOrgId() {
    return this.orgId;
  }

  /**
   * The Org Id
   * 
   */
  public PartitionQuotaInfo setOrgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  public void unsetOrgId() {
    this.orgId = null;
  }

  /** Returns true if field orgId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgId() {
    return this.orgId != null;
  }

  public void setOrgIdIsSet(boolean value) {
    if (!value) {
      this.orgId = null;
    }
  }

  /**
   * The org apply/old total partition quota, depending on specific request
   * 
   */
  public int getTotalQuota() {
    return this.totalQuota;
  }

  /**
   * The org apply/old total partition quota, depending on specific request
   * 
   */
  public PartitionQuotaInfo setTotalQuota(int totalQuota) {
    this.totalQuota = totalQuota;
    setTotalQuotaIsSet(true);
    return this;
  }

  public void unsetTotalQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALQUOTA_ISSET_ID);
  }

  /** Returns true if field totalQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALQUOTA_ISSET_ID);
  }

  public void setTotalQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALQUOTA_ISSET_ID, value);
  }

  /**
   * The org used partition quota, optional
   * 
   */
  public int getUsedOuota() {
    return this.usedOuota;
  }

  /**
   * The org used partition quota, optional
   * 
   */
  public PartitionQuotaInfo setUsedOuota(int usedOuota) {
    this.usedOuota = usedOuota;
    setUsedOuotaIsSet(true);
    return this;
  }

  public void unsetUsedOuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEDOUOTA_ISSET_ID);
  }

  /** Returns true if field usedOuota is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedOuota() {
    return EncodingUtils.testBit(__isset_bitfield, __USEDOUOTA_ISSET_ID);
  }

  public void setUsedOuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEDOUOTA_ISSET_ID, value);
  }

  /**
   * The reason of apply quota
   * 
   */
  public String getApplyReason() {
    return this.applyReason;
  }

  /**
   * The reason of apply quota
   * 
   */
  public PartitionQuotaInfo setApplyReason(String applyReason) {
    this.applyReason = applyReason;
    return this;
  }

  public void unsetApplyReason() {
    this.applyReason = null;
  }

  /** Returns true if field applyReason is set (has been assigned a value) and false otherwise */
  public boolean isSetApplyReason() {
    return this.applyReason != null;
  }

  public void setApplyReasonIsSet(boolean value) {
    if (!value) {
      this.applyReason = null;
    }
  }

  /**
   * The Org Name
   * 
   */
  public String getOrgName() {
    return this.orgName;
  }

  /**
   * The Org Name
   * 
   */
  public PartitionQuotaInfo setOrgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  public void unsetOrgName() {
    this.orgName = null;
  }

  /** Returns true if field orgName is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgName() {
    return this.orgName != null;
  }

  public void setOrgNameIsSet(boolean value) {
    if (!value) {
      this.orgName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORG_ID:
      if (value == null) {
        unsetOrgId();
      } else {
        setOrgId((String)value);
      }
      break;

    case TOTAL_QUOTA:
      if (value == null) {
        unsetTotalQuota();
      } else {
        setTotalQuota((Integer)value);
      }
      break;

    case USED_OUOTA:
      if (value == null) {
        unsetUsedOuota();
      } else {
        setUsedOuota((Integer)value);
      }
      break;

    case APPLY_REASON:
      if (value == null) {
        unsetApplyReason();
      } else {
        setApplyReason((String)value);
      }
      break;

    case ORG_NAME:
      if (value == null) {
        unsetOrgName();
      } else {
        setOrgName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORG_ID:
      return getOrgId();

    case TOTAL_QUOTA:
      return Integer.valueOf(getTotalQuota());

    case USED_OUOTA:
      return Integer.valueOf(getUsedOuota());

    case APPLY_REASON:
      return getApplyReason();

    case ORG_NAME:
      return getOrgName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORG_ID:
      return isSetOrgId();
    case TOTAL_QUOTA:
      return isSetTotalQuota();
    case USED_OUOTA:
      return isSetUsedOuota();
    case APPLY_REASON:
      return isSetApplyReason();
    case ORG_NAME:
      return isSetOrgName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionQuotaInfo)
      return this.equals((PartitionQuotaInfo)that);
    return false;
  }

  public boolean equals(PartitionQuotaInfo that) {
    if (that == null)
      return false;

    boolean this_present_orgId = true && this.isSetOrgId();
    boolean that_present_orgId = true && that.isSetOrgId();
    if (this_present_orgId || that_present_orgId) {
      if (!(this_present_orgId && that_present_orgId))
        return false;
      if (!this.orgId.equals(that.orgId))
        return false;
    }

    boolean this_present_totalQuota = true;
    boolean that_present_totalQuota = true;
    if (this_present_totalQuota || that_present_totalQuota) {
      if (!(this_present_totalQuota && that_present_totalQuota))
        return false;
      if (this.totalQuota != that.totalQuota)
        return false;
    }

    boolean this_present_usedOuota = true && this.isSetUsedOuota();
    boolean that_present_usedOuota = true && that.isSetUsedOuota();
    if (this_present_usedOuota || that_present_usedOuota) {
      if (!(this_present_usedOuota && that_present_usedOuota))
        return false;
      if (this.usedOuota != that.usedOuota)
        return false;
    }

    boolean this_present_applyReason = true && this.isSetApplyReason();
    boolean that_present_applyReason = true && that.isSetApplyReason();
    if (this_present_applyReason || that_present_applyReason) {
      if (!(this_present_applyReason && that_present_applyReason))
        return false;
      if (!this.applyReason.equals(that.applyReason))
        return false;
    }

    boolean this_present_orgName = true && this.isSetOrgName();
    boolean that_present_orgName = true && that.isSetOrgName();
    if (this_present_orgName || that_present_orgName) {
      if (!(this_present_orgName && that_present_orgName))
        return false;
      if (!this.orgName.equals(that.orgName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_orgId = true && (isSetOrgId());
    list.add(present_orgId);
    if (present_orgId)
      list.add(orgId);

    boolean present_totalQuota = true;
    list.add(present_totalQuota);
    if (present_totalQuota)
      list.add(totalQuota);

    boolean present_usedOuota = true && (isSetUsedOuota());
    list.add(present_usedOuota);
    if (present_usedOuota)
      list.add(usedOuota);

    boolean present_applyReason = true && (isSetApplyReason());
    list.add(present_applyReason);
    if (present_applyReason)
      list.add(applyReason);

    boolean present_orgName = true && (isSetOrgName());
    list.add(present_orgName);
    if (present_orgName)
      list.add(orgName);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionQuotaInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrgId()).compareTo(other.isSetOrgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.orgId, other.orgId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalQuota()).compareTo(other.isSetTotalQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.totalQuota, other.totalQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsedOuota()).compareTo(other.isSetUsedOuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedOuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.usedOuota, other.usedOuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplyReason()).compareTo(other.isSetApplyReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplyReason()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.applyReason, other.applyReason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrgName()).compareTo(other.isSetOrgName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.orgName, other.orgName);
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
    StringBuilder sb = new StringBuilder("PartitionQuotaInfo(");
    boolean first = true;

    sb.append("orgId:");
    if (this.orgId == null) {
      sb.append("null");
    } else {
      sb.append(this.orgId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalQuota:");
    sb.append(this.totalQuota);
    first = false;
    if (isSetUsedOuota()) {
      if (!first) sb.append(", ");
      sb.append("usedOuota:");
      sb.append(this.usedOuota);
      first = false;
    }
    if (isSetApplyReason()) {
      if (!first) sb.append(", ");
      sb.append("applyReason:");
      if (this.applyReason == null) {
        sb.append("null");
      } else {
        sb.append(this.applyReason);
      }
      first = false;
    }
    if (isSetOrgName()) {
      if (!first) sb.append(", ");
      sb.append("orgName:");
      if (this.orgName == null) {
        sb.append("null");
      } else {
        sb.append(this.orgName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (orgId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'orgId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'totalQuota' because it's a primitive and you chose the non-beans generator.
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

  private static class PartitionQuotaInfoStandardSchemeFactory implements SchemeFactory {
    public PartitionQuotaInfoStandardScheme getScheme() {
      return new PartitionQuotaInfoStandardScheme();
    }
  }

  private static class PartitionQuotaInfoStandardScheme extends StandardScheme<PartitionQuotaInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, PartitionQuotaInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORG_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.orgId = iprot.readString();
              struct.setOrgIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.totalQuota = iprot.readI32();
              struct.setTotalQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USED_OUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.usedOuota = iprot.readI32();
              struct.setUsedOuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // APPLY_REASON
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.applyReason = iprot.readString();
              struct.setApplyReasonIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ORG_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.orgName = iprot.readString();
              struct.setOrgNameIsSet(true);
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
      if (!struct.isSetTotalQuota()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'totalQuota' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, PartitionQuotaInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orgId != null) {
        oprot.writeFieldBegin(ORG_ID_FIELD_DESC);
        oprot.writeString(struct.orgId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_QUOTA_FIELD_DESC);
      oprot.writeI32(struct.totalQuota);
      oprot.writeFieldEnd();
      if (struct.isSetUsedOuota()) {
        oprot.writeFieldBegin(USED_OUOTA_FIELD_DESC);
        oprot.writeI32(struct.usedOuota);
        oprot.writeFieldEnd();
      }
      if (struct.applyReason != null) {
        if (struct.isSetApplyReason()) {
          oprot.writeFieldBegin(APPLY_REASON_FIELD_DESC);
          oprot.writeString(struct.applyReason);
          oprot.writeFieldEnd();
        }
      }
      if (struct.orgName != null) {
        if (struct.isSetOrgName()) {
          oprot.writeFieldBegin(ORG_NAME_FIELD_DESC);
          oprot.writeString(struct.orgName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionQuotaInfoTupleSchemeFactory implements SchemeFactory {
    public PartitionQuotaInfoTupleScheme getScheme() {
      return new PartitionQuotaInfoTupleScheme();
    }
  }

  private static class PartitionQuotaInfoTupleScheme extends TupleScheme<PartitionQuotaInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PartitionQuotaInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.orgId);
      oprot.writeI32(struct.totalQuota);
      BitSet optionals = new BitSet();
      if (struct.isSetUsedOuota()) {
        optionals.set(0);
      }
      if (struct.isSetApplyReason()) {
        optionals.set(1);
      }
      if (struct.isSetOrgName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUsedOuota()) {
        oprot.writeI32(struct.usedOuota);
      }
      if (struct.isSetApplyReason()) {
        oprot.writeString(struct.applyReason);
      }
      if (struct.isSetOrgName()) {
        oprot.writeString(struct.orgName);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PartitionQuotaInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.orgId = iprot.readString();
      struct.setOrgIdIsSet(true);
      struct.totalQuota = iprot.readI32();
      struct.setTotalQuotaIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.usedOuota = iprot.readI32();
        struct.setUsedOuotaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.applyReason = iprot.readString();
        struct.setApplyReasonIsSet(true);
      }
      if (incoming.get(2)) {
        struct.orgName = iprot.readString();
        struct.setOrgNameIsSet(true);
      }
    }
  }

}

