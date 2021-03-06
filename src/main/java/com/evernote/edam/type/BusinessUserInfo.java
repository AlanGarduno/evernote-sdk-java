/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

/**
 * This structure is used to provide information about an Evernote Business
 * membership, for members who are part of a business.
 * 
 * <dl>
 * <dt>businessId</dt>
 *   <dd>The ID of the Evernote Business account that the user is a member of.
 * <dt>businessName</dt>
 *   <dd>The human-readable name of the Evernote Business account that the user
 *       is a member of.</dd>
 * <dt>role</dt>
 *   <dd>The role of the user within the Evernote Business account that
 *       they are a member of.</dd>
 * <dt>email</dt>
 *   <dd>An e-mail address that will be used by the service in the context of your
 *       Evernote Business activities.  For example, this e-mail address will be used
 *       when you e-mail a business note, when you update notes in the account of
 *       your business, etc.  The business e-mail cannot be used for identification
 *       purposes such as for logging into the service.
 *   </dd>
 * </dl>
 */
public class BusinessUserInfo implements TBase<BusinessUserInfo>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("BusinessUserInfo");

  private static final TField BUSINESS_ID_FIELD_DESC = new TField("businessId", TType.I32, (short)1);
  private static final TField BUSINESS_NAME_FIELD_DESC = new TField("businessName", TType.STRING, (short)2);
  private static final TField ROLE_FIELD_DESC = new TField("role", TType.I32, (short)3);
  private static final TField EMAIL_FIELD_DESC = new TField("email", TType.STRING, (short)4);

  private int businessId;
  private String businessName;
  private BusinessUserRole role;
  private String email;


  // isset id assignments
  private static final int __BUSINESSID_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public BusinessUserInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BusinessUserInfo(BusinessUserInfo other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.businessId = other.businessId;
    if (other.isSetBusinessName()) {
      this.businessName = other.businessName;
    }
    if (other.isSetRole()) {
      this.role = other.role;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
  }

  public BusinessUserInfo deepCopy() {
    return new BusinessUserInfo(this);
  }

  public void clear() {
    setBusinessIdIsSet(false);
    this.businessId = 0;
    this.businessName = null;
    this.role = null;
    this.email = null;
  }

  public int getBusinessId() {
    return this.businessId;
  }

  public void setBusinessId(int businessId) {
    this.businessId = businessId;
    setBusinessIdIsSet(true);
  }

  public void unsetBusinessId() {
    __isset_vector[__BUSINESSID_ISSET_ID] = false;
  }

  /** Returns true if field businessId is set (has been asigned a value) and false otherwise */
  public boolean isSetBusinessId() {
    return __isset_vector[__BUSINESSID_ISSET_ID];
  }

  public void setBusinessIdIsSet(boolean value) {
    __isset_vector[__BUSINESSID_ISSET_ID] = value;
  }

  public String getBusinessName() {
    return this.businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public void unsetBusinessName() {
    this.businessName = null;
  }

  /** Returns true if field businessName is set (has been asigned a value) and false otherwise */
  public boolean isSetBusinessName() {
    return this.businessName != null;
  }

  public void setBusinessNameIsSet(boolean value) {
    if (!value) {
      this.businessName = null;
    }
  }

  /**
   * 
   * @see BusinessUserRole
   */
  public BusinessUserRole getRole() {
    return this.role;
  }

  /**
   * 
   * @see BusinessUserRole
   */
  public void setRole(BusinessUserRole role) {
    this.role = role;
  }

  public void unsetRole() {
    this.role = null;
  }

  /** Returns true if field role is set (has been asigned a value) and false otherwise */
  public boolean isSetRole() {
    return this.role != null;
  }

  public void setRoleIsSet(boolean value) {
    if (!value) {
      this.role = null;
    }
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been asigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BusinessUserInfo)
      return this.equals((BusinessUserInfo)that);
    return false;
  }

  public boolean equals(BusinessUserInfo that) {
    if (that == null)
      return false;

    boolean this_present_businessId = true && this.isSetBusinessId();
    boolean that_present_businessId = true && that.isSetBusinessId();
    if (this_present_businessId || that_present_businessId) {
      if (!(this_present_businessId && that_present_businessId))
        return false;
      if (this.businessId != that.businessId)
        return false;
    }

    boolean this_present_businessName = true && this.isSetBusinessName();
    boolean that_present_businessName = true && that.isSetBusinessName();
    if (this_present_businessName || that_present_businessName) {
      if (!(this_present_businessName && that_present_businessName))
        return false;
      if (!this.businessName.equals(that.businessName))
        return false;
    }

    boolean this_present_role = true && this.isSetRole();
    boolean that_present_role = true && that.isSetRole();
    if (this_present_role || that_present_role) {
      if (!(this_present_role && that_present_role))
        return false;
      if (!this.role.equals(that.role))
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BusinessUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BusinessUserInfo typedOther = (BusinessUserInfo)other;

    lastComparison = Boolean.valueOf(isSetBusinessId()).compareTo(typedOther.isSetBusinessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessId()) {      lastComparison = TBaseHelper.compareTo(this.businessId, typedOther.businessId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBusinessName()).compareTo(typedOther.isSetBusinessName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBusinessName()) {      lastComparison = TBaseHelper.compareTo(this.businessName, typedOther.businessName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRole()).compareTo(typedOther.isSetRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole()) {      lastComparison = TBaseHelper.compareTo(this.role, typedOther.role);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {      lastComparison = TBaseHelper.compareTo(this.email, typedOther.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // BUSINESS_ID
          if (field.type == TType.I32) {
            this.businessId = iprot.readI32();
            setBusinessIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // BUSINESS_NAME
          if (field.type == TType.STRING) {
            this.businessName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ROLE
          if (field.type == TType.I32) {
            this.role = BusinessUserRole.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // EMAIL
          if (field.type == TType.STRING) {
            this.email = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (isSetBusinessId()) {
      oprot.writeFieldBegin(BUSINESS_ID_FIELD_DESC);
      oprot.writeI32(this.businessId);
      oprot.writeFieldEnd();
    }
    if (this.businessName != null) {
      if (isSetBusinessName()) {
        oprot.writeFieldBegin(BUSINESS_NAME_FIELD_DESC);
        oprot.writeString(this.businessName);
        oprot.writeFieldEnd();
      }
    }
    if (this.role != null) {
      if (isSetRole()) {
        oprot.writeFieldBegin(ROLE_FIELD_DESC);
        oprot.writeI32(this.role.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (this.email != null) {
      if (isSetEmail()) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(this.email);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BusinessUserInfo(");
    boolean first = true;

    if (isSetBusinessId()) {
      sb.append("businessId:");
      sb.append(this.businessId);
      first = false;
    }
    if (isSetBusinessName()) {
      if (!first) sb.append(", ");
      sb.append("businessName:");
      if (this.businessName == null) {
        sb.append("null");
      } else {
        sb.append(this.businessName);
      }
      first = false;
    }
    if (isSetRole()) {
      if (!first) sb.append(", ");
      sb.append("role:");
      if (this.role == null) {
        sb.append("null");
      } else {
        sb.append(this.role);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

