/**
 * UserObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.usermgt;

public class UserObject  implements java.io.Serializable {
    private java.lang.String IPAddress;

    private java.lang.String accessTimePolicy;

    private java.lang.String activeStatus;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String bandwidthPolicy;

    private boolean bindToMacStatus;

    private java.util.Calendar birthDate;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String customerName;

    private java.lang.String dataTransferPolicy;

    private java.lang.String email;

    private boolean invoiceGenerateStatus;

    private int loginRestrictionType;

    private java.lang.String macAddress;

    private java.lang.String networkAddress;

    private java.lang.String packageName;

    private java.lang.String password;

    private java.lang.String phone;

    private java.lang.String poolName;

    private java.lang.String state;

    private java.lang.String userName;

    private int userType;

    private int vlanTag;

    private java.lang.String zip;

    private java.lang.String zoneName;

    private long allottedSessionTime;

    private java.util.Calendar expireDate;

    public UserObject() {
    }

    public UserObject(
           java.lang.String IPAddress,
           java.lang.String accessTimePolicy,
           java.lang.String activeStatus,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String bandwidthPolicy,
           boolean bindToMacStatus,
           java.util.Calendar birthDate,
           java.lang.String city,
           java.lang.String country,
           java.lang.String customerName,
           java.lang.String dataTransferPolicy,
           java.lang.String email,
           boolean invoiceGenerateStatus,
           int loginRestrictionType,
           java.lang.String macAddress,
           java.lang.String networkAddress,
           java.lang.String packageName,
           java.lang.String password,
           java.lang.String phone,
           java.lang.String poolName,
           java.lang.String state,
           java.lang.String userName,
           int userType,
           int vlanTag,
           java.lang.String zip,
           java.lang.String zoneName,
           long allottedSessionTime,
           java.util.Calendar expireDate) {
           this.IPAddress = IPAddress;
           this.accessTimePolicy = accessTimePolicy;
           this.activeStatus = activeStatus;
           this.address1 = address1;
           this.address2 = address2;
           this.bandwidthPolicy = bandwidthPolicy;
           this.bindToMacStatus = bindToMacStatus;
           this.birthDate = birthDate;
           this.city = city;
           this.country = country;
           this.customerName = customerName;
           this.dataTransferPolicy = dataTransferPolicy;
           this.email = email;
           this.invoiceGenerateStatus = invoiceGenerateStatus;
           this.loginRestrictionType = loginRestrictionType;
           this.macAddress = macAddress;
           this.networkAddress = networkAddress;
           this.packageName = packageName;
           this.password = password;
           this.phone = phone;
           this.poolName = poolName;
           this.state = state;
           this.userName = userName;
           this.userType = userType;
           this.vlanTag = vlanTag;
           this.zip = zip;
           this.zoneName = zoneName;
           this.allottedSessionTime = allottedSessionTime;
           this.expireDate = expireDate;
    }


    /**
     * Gets the IPAddress value for this UserObject.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this UserObject.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the accessTimePolicy value for this UserObject.
     * 
     * @return accessTimePolicy
     */
    public java.lang.String getAccessTimePolicy() {
        return accessTimePolicy;
    }


    /**
     * Sets the accessTimePolicy value for this UserObject.
     * 
     * @param accessTimePolicy
     */
    public void setAccessTimePolicy(java.lang.String accessTimePolicy) {
        this.accessTimePolicy = accessTimePolicy;
    }


    /**
     * Gets the activeStatus value for this UserObject.
     * 
     * @return activeStatus
     */
    public java.lang.String getActiveStatus() {
        return activeStatus;
    }


    /**
     * Sets the activeStatus value for this UserObject.
     * 
     * @param activeStatus
     */
    public void setActiveStatus(java.lang.String activeStatus) {
        this.activeStatus = activeStatus;
    }


    /**
     * Gets the address1 value for this UserObject.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this UserObject.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this UserObject.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this UserObject.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the bandwidthPolicy value for this UserObject.
     * 
     * @return bandwidthPolicy
     */
    public java.lang.String getBandwidthPolicy() {
        return bandwidthPolicy;
    }


    /**
     * Sets the bandwidthPolicy value for this UserObject.
     * 
     * @param bandwidthPolicy
     */
    public void setBandwidthPolicy(java.lang.String bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }


    /**
     * Gets the bindToMacStatus value for this UserObject.
     * 
     * @return bindToMacStatus
     */
    public boolean isBindToMacStatus() {
        return bindToMacStatus;
    }


    /**
     * Sets the bindToMacStatus value for this UserObject.
     * 
     * @param bindToMacStatus
     */
    public void setBindToMacStatus(boolean bindToMacStatus) {
        this.bindToMacStatus = bindToMacStatus;
    }


    /**
     * Gets the birthDate value for this UserObject.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this UserObject.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the city value for this UserObject.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserObject.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this UserObject.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserObject.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the customerName value for this UserObject.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this UserObject.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the dataTransferPolicy value for this UserObject.
     * 
     * @return dataTransferPolicy
     */
    public java.lang.String getDataTransferPolicy() {
        return dataTransferPolicy;
    }


    /**
     * Sets the dataTransferPolicy value for this UserObject.
     * 
     * @param dataTransferPolicy
     */
    public void setDataTransferPolicy(java.lang.String dataTransferPolicy) {
        this.dataTransferPolicy = dataTransferPolicy;
    }


    /**
     * Gets the email value for this UserObject.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserObject.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the invoiceGenerateStatus value for this UserObject.
     * 
     * @return invoiceGenerateStatus
     */
    public boolean isInvoiceGenerateStatus() {
        return invoiceGenerateStatus;
    }


    /**
     * Sets the invoiceGenerateStatus value for this UserObject.
     * 
     * @param invoiceGenerateStatus
     */
    public void setInvoiceGenerateStatus(boolean invoiceGenerateStatus) {
        this.invoiceGenerateStatus = invoiceGenerateStatus;
    }


    /**
     * Gets the loginRestrictionType value for this UserObject.
     * 
     * @return loginRestrictionType
     */
    public int getLoginRestrictionType() {
        return loginRestrictionType;
    }


    /**
     * Sets the loginRestrictionType value for this UserObject.
     * 
     * @param loginRestrictionType
     */
    public void setLoginRestrictionType(int loginRestrictionType) {
        this.loginRestrictionType = loginRestrictionType;
    }


    /**
     * Gets the macAddress value for this UserObject.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this UserObject.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the networkAddress value for this UserObject.
     * 
     * @return networkAddress
     */
    public java.lang.String getNetworkAddress() {
        return networkAddress;
    }


    /**
     * Sets the networkAddress value for this UserObject.
     * 
     * @param networkAddress
     */
    public void setNetworkAddress(java.lang.String networkAddress) {
        this.networkAddress = networkAddress;
    }


    /**
     * Gets the packageName value for this UserObject.
     * 
     * @return packageName
     */
    public java.lang.String getPackageName() {
        return packageName;
    }


    /**
     * Sets the packageName value for this UserObject.
     * 
     * @param packageName
     */
    public void setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
    }


    /**
     * Gets the password value for this UserObject.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserObject.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the phone value for this UserObject.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this UserObject.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the poolName value for this UserObject.
     * 
     * @return poolName
     */
    public java.lang.String getPoolName() {
        return poolName;
    }


    /**
     * Sets the poolName value for this UserObject.
     * 
     * @param poolName
     */
    public void setPoolName(java.lang.String poolName) {
        this.poolName = poolName;
    }


    /**
     * Gets the state value for this UserObject.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserObject.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the userName value for this UserObject.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserObject.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userType value for this UserObject.
     * 
     * @return userType
     */
    public int getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UserObject.
     * 
     * @param userType
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }


    /**
     * Gets the vlanTag value for this UserObject.
     * 
     * @return vlanTag
     */
    public int getVlanTag() {
        return vlanTag;
    }


    /**
     * Sets the vlanTag value for this UserObject.
     * 
     * @param vlanTag
     */
    public void setVlanTag(int vlanTag) {
        this.vlanTag = vlanTag;
    }


    /**
     * Gets the zip value for this UserObject.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this UserObject.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the zoneName value for this UserObject.
     * 
     * @return zoneName
     */
    public java.lang.String getZoneName() {
        return zoneName;
    }


    /**
     * Sets the zoneName value for this UserObject.
     * 
     * @param zoneName
     */
    public void setZoneName(java.lang.String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * Gets the allottedSessionTime value for this UserObject.
     * 
     * @return allottedSessionTime
     */
    public long getAllottedSessionTime() {
        return allottedSessionTime;
    }


    /**
     * Sets the allottedSessionTime value for this UserObject.
     * 
     * @param allottedSessionTime
     */
    public void setAllottedSessionTime(long allottedSessionTime) {
        this.allottedSessionTime = allottedSessionTime;
    }


    /**
     * Gets the expireDate value for this UserObject.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this UserObject.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserObject)) return false;
        UserObject other = (UserObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.accessTimePolicy==null && other.getAccessTimePolicy()==null) || 
             (this.accessTimePolicy!=null &&
              this.accessTimePolicy.equals(other.getAccessTimePolicy()))) &&
            ((this.activeStatus==null && other.getActiveStatus()==null) || 
             (this.activeStatus!=null &&
              this.activeStatus.equals(other.getActiveStatus()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.bandwidthPolicy==null && other.getBandwidthPolicy()==null) || 
             (this.bandwidthPolicy!=null &&
              this.bandwidthPolicy.equals(other.getBandwidthPolicy()))) &&
            this.bindToMacStatus == other.isBindToMacStatus() &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.dataTransferPolicy==null && other.getDataTransferPolicy()==null) || 
             (this.dataTransferPolicy!=null &&
              this.dataTransferPolicy.equals(other.getDataTransferPolicy()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.invoiceGenerateStatus == other.isInvoiceGenerateStatus() &&
            this.loginRestrictionType == other.getLoginRestrictionType() &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.networkAddress==null && other.getNetworkAddress()==null) || 
             (this.networkAddress!=null &&
              this.networkAddress.equals(other.getNetworkAddress()))) &&
            ((this.packageName==null && other.getPackageName()==null) || 
             (this.packageName!=null &&
              this.packageName.equals(other.getPackageName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.poolName==null && other.getPoolName()==null) || 
             (this.poolName!=null &&
              this.poolName.equals(other.getPoolName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.userType == other.getUserType() &&
            this.vlanTag == other.getVlanTag() &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.zoneName==null && other.getZoneName()==null) || 
             (this.zoneName!=null &&
              this.zoneName.equals(other.getZoneName()))) &&
            this.allottedSessionTime == other.getAllottedSessionTime() &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getAccessTimePolicy() != null) {
            _hashCode += getAccessTimePolicy().hashCode();
        }
        if (getActiveStatus() != null) {
            _hashCode += getActiveStatus().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getBandwidthPolicy() != null) {
            _hashCode += getBandwidthPolicy().hashCode();
        }
        _hashCode += (isBindToMacStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getDataTransferPolicy() != null) {
            _hashCode += getDataTransferPolicy().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isInvoiceGenerateStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLoginRestrictionType();
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getNetworkAddress() != null) {
            _hashCode += getNetworkAddress().hashCode();
        }
        if (getPackageName() != null) {
            _hashCode += getPackageName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPoolName() != null) {
            _hashCode += getPoolName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += getUserType();
        _hashCode += getVlanTag();
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getZoneName() != null) {
            _hashCode += getZoneName().hashCode();
        }
        _hashCode += new Long(getAllottedSessionTime()).hashCode();
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTimePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessTimePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindToMacStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindToMacStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTransferPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataTransferPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceGenerateStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceGenerateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginRestrictionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginRestrictionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poolName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlanTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allottedSessionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allottedSessionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
