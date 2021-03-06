/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-3-7")
public class Status implements libthrift091.TBase<Status, Status._Fields>, java.io.Serializable, Cloneable, Comparable<Status> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Status");

  private static final libthrift091.protocol.TField STATE_FIELD_DESC = new libthrift091.protocol.TField("state", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField STATE_CHANGE_REASON_FIELD_DESC = new libthrift091.protocol.TField("stateChangeReason", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField TIMELINE_FIELD_DESC = new libthrift091.protocol.TField("timeline", libthrift091.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StatusTupleSchemeFactory());
  }

  /**
   * 
   * @see StateCode
   */
  public StateCode state; // optional
  public String stateChangeReason; // optional
  public Timeline timeline; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see StateCode
     */
    STATE((short)1, "state"),
    STATE_CHANGE_REASON((short)2, "stateChangeReason"),
    TIMELINE((short)3, "timeline");

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
        case 1: // STATE
          return STATE;
        case 2: // STATE_CHANGE_REASON
          return STATE_CHANGE_REASON;
        case 3: // TIMELINE
          return TIMELINE;
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
  private static final _Fields optionals[] = {_Fields.STATE,_Fields.STATE_CHANGE_REASON,_Fields.TIMELINE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new libthrift091.meta_data.FieldMetaData("state", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, StateCode.class)));
    tmpMap.put(_Fields.STATE_CHANGE_REASON, new libthrift091.meta_data.FieldMetaData("stateChangeReason", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMELINE, new libthrift091.meta_data.FieldMetaData("timeline", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Timeline.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Status.class, metaDataMap);
  }

  public Status() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Status(Status other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetStateChangeReason()) {
      this.stateChangeReason = other.stateChangeReason;
    }
    if (other.isSetTimeline()) {
      this.timeline = new Timeline(other.timeline);
    }
  }

  public Status deepCopy() {
    return new Status(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.stateChangeReason = null;
    this.timeline = null;
  }

  /**
   * 
   * @see StateCode
   */
  public StateCode getState() {
    return this.state;
  }

  /**
   * 
   * @see StateCode
   */
  public Status setState(StateCode state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getStateChangeReason() {
    return this.stateChangeReason;
  }

  public Status setStateChangeReason(String stateChangeReason) {
    this.stateChangeReason = stateChangeReason;
    return this;
  }

  public void unsetStateChangeReason() {
    this.stateChangeReason = null;
  }

  /** Returns true if field stateChangeReason is set (has been assigned a value) and false otherwise */
  public boolean isSetStateChangeReason() {
    return this.stateChangeReason != null;
  }

  public void setStateChangeReasonIsSet(boolean value) {
    if (!value) {
      this.stateChangeReason = null;
    }
  }

  public Timeline getTimeline() {
    return this.timeline;
  }

  public Status setTimeline(Timeline timeline) {
    this.timeline = timeline;
    return this;
  }

  public void unsetTimeline() {
    this.timeline = null;
  }

  /** Returns true if field timeline is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeline() {
    return this.timeline != null;
  }

  public void setTimelineIsSet(boolean value) {
    if (!value) {
      this.timeline = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((StateCode)value);
      }
      break;

    case STATE_CHANGE_REASON:
      if (value == null) {
        unsetStateChangeReason();
      } else {
        setStateChangeReason((String)value);
      }
      break;

    case TIMELINE:
      if (value == null) {
        unsetTimeline();
      } else {
        setTimeline((Timeline)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case STATE_CHANGE_REASON:
      return getStateChangeReason();

    case TIMELINE:
      return getTimeline();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case STATE_CHANGE_REASON:
      return isSetStateChangeReason();
    case TIMELINE:
      return isSetTimeline();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Status)
      return this.equals((Status)that);
    return false;
  }

  public boolean equals(Status that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_stateChangeReason = true && this.isSetStateChangeReason();
    boolean that_present_stateChangeReason = true && that.isSetStateChangeReason();
    if (this_present_stateChangeReason || that_present_stateChangeReason) {
      if (!(this_present_stateChangeReason && that_present_stateChangeReason))
        return false;
      if (!this.stateChangeReason.equals(that.stateChangeReason))
        return false;
    }

    boolean this_present_timeline = true && this.isSetTimeline();
    boolean that_present_timeline = true && that.isSetTimeline();
    if (this_present_timeline || that_present_timeline) {
      if (!(this_present_timeline && that_present_timeline))
        return false;
      if (!this.timeline.equals(that.timeline))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_stateChangeReason = true && (isSetStateChangeReason());
    list.add(present_stateChangeReason);
    if (present_stateChangeReason)
      list.add(stateChangeReason);

    boolean present_timeline = true && (isSetTimeline());
    list.add(present_timeline);
    if (present_timeline)
      list.add(timeline);

    return list.hashCode();
  }

  @Override
  public int compareTo(Status other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStateChangeReason()).compareTo(other.isSetStateChangeReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateChangeReason()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.stateChangeReason, other.stateChangeReason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeline()).compareTo(other.isSetTimeline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeline()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.timeline, other.timeline);
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
    StringBuilder sb = new StringBuilder("Status(");
    boolean first = true;

    if (isSetState()) {
      sb.append("state:");
      if (this.state == null) {
        sb.append("null");
      } else {
        sb.append(this.state);
      }
      first = false;
    }
    if (isSetStateChangeReason()) {
      if (!first) sb.append(", ");
      sb.append("stateChangeReason:");
      if (this.stateChangeReason == null) {
        sb.append("null");
      } else {
        sb.append(this.stateChangeReason);
      }
      first = false;
    }
    if (isSetTimeline()) {
      if (!first) sb.append(", ");
      sb.append("timeline:");
      if (this.timeline == null) {
        sb.append("null");
      } else {
        sb.append(this.timeline);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (timeline != null) {
      timeline.validate();
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

  private static class StatusStandardSchemeFactory implements SchemeFactory {
    public StatusStandardScheme getScheme() {
      return new StatusStandardScheme();
    }
  }

  private static class StatusStandardScheme extends StandardScheme<Status> {

    public void read(libthrift091.protocol.TProtocol iprot, Status struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.state = com.xiaomi.infra.galaxy.emr.thrift.StateCode.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE_CHANGE_REASON
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.stateChangeReason = iprot.readString();
              struct.setStateChangeReasonIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMELINE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.timeline = new Timeline();
              struct.timeline.read(iprot);
              struct.setTimelineIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Status struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        if (struct.isSetState()) {
          oprot.writeFieldBegin(STATE_FIELD_DESC);
          oprot.writeI32(struct.state.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.stateChangeReason != null) {
        if (struct.isSetStateChangeReason()) {
          oprot.writeFieldBegin(STATE_CHANGE_REASON_FIELD_DESC);
          oprot.writeString(struct.stateChangeReason);
          oprot.writeFieldEnd();
        }
      }
      if (struct.timeline != null) {
        if (struct.isSetTimeline()) {
          oprot.writeFieldBegin(TIMELINE_FIELD_DESC);
          struct.timeline.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatusTupleSchemeFactory implements SchemeFactory {
    public StatusTupleScheme getScheme() {
      return new StatusTupleScheme();
    }
  }

  private static class StatusTupleScheme extends TupleScheme<Status> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Status struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetState()) {
        optionals.set(0);
      }
      if (struct.isSetStateChangeReason()) {
        optionals.set(1);
      }
      if (struct.isSetTimeline()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetStateChangeReason()) {
        oprot.writeString(struct.stateChangeReason);
      }
      if (struct.isSetTimeline()) {
        struct.timeline.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Status struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.state = com.xiaomi.infra.galaxy.emr.thrift.StateCode.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stateChangeReason = iprot.readString();
        struct.setStateChangeReasonIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeline = new Timeline();
        struct.timeline.read(iprot);
        struct.setTimelineIsSet(true);
      }
    }
  }

}

