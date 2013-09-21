/**
 * UsageDetailObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.usermgt;

public class UsageDetailObject  implements java.io.Serializable {
    private java.lang.String IPAddress;

    private long downloadData;

    private long effectiveSessionTime;

    private java.util.Calendar startTime;

    private java.util.Calendar stopTime;

    private long totalDataTransfer;

    private long uploadData;

    private long usedTime;

    private java.lang.String userName;

    public UsageDetailObject() {
    }

    public UsageDetailObject(
           java.lang.String IPAddress,
           long downloadData,
           long effectiveSessionTime,
           java.util.Calendar startTime,
           java.util.Calendar stopTime,
           long totalDataTransfer,
           long uploadData,
           long usedTime,
           java.lang.String userName) {
           this.IPAddress = IPAddress;
           this.downloadData = downloadData;
           this.effectiveSessionTime = effectiveSessionTime;
           this.startTime = startTime;
           this.stopTime = stopTime;
           this.totalDataTransfer = totalDataTransfer;
           this.uploadData = uploadData;
           this.usedTime = usedTime;
           this.userName = userName;
    }


    /**
     * Gets the IPAddress value for this UsageDetailObject.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this UsageDetailObject.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the downloadData value for this UsageDetailObject.
     * 
     * @return downloadData
     */
    public long getDownloadData() {
        return downloadData;
    }


    /**
     * Sets the downloadData value for this UsageDetailObject.
     * 
     * @param downloadData
     */
    public void setDownloadData(long downloadData) {
        this.downloadData = downloadData;
    }


    /**
     * Gets the effectiveSessionTime value for this UsageDetailObject.
     * 
     * @return effectiveSessionTime
     */
    public long getEffectiveSessionTime() {
        return effectiveSessionTime;
    }


    /**
     * Sets the effectiveSessionTime value for this UsageDetailObject.
     * 
     * @param effectiveSessionTime
     */
    public void setEffectiveSessionTime(long effectiveSessionTime) {
        this.effectiveSessionTime = effectiveSessionTime;
    }


    /**
     * Gets the startTime value for this UsageDetailObject.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this UsageDetailObject.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the stopTime value for this UsageDetailObject.
     * 
     * @return stopTime
     */
    public java.util.Calendar getStopTime() {
        return stopTime;
    }


    /**
     * Sets the stopTime value for this UsageDetailObject.
     * 
     * @param stopTime
     */
    public void setStopTime(java.util.Calendar stopTime) {
        this.stopTime = stopTime;
    }


    /**
     * Gets the totalDataTransfer value for this UsageDetailObject.
     * 
     * @return totalDataTransfer
     */
    public long getTotalDataTransfer() {
        return totalDataTransfer;
    }


    /**
     * Sets the totalDataTransfer value for this UsageDetailObject.
     * 
     * @param totalDataTransfer
     */
    public void setTotalDataTransfer(long totalDataTransfer) {
        this.totalDataTransfer = totalDataTransfer;
    }


    /**
     * Gets the uploadData value for this UsageDetailObject.
     * 
     * @return uploadData
     */
    public long getUploadData() {
        return uploadData;
    }


    /**
     * Sets the uploadData value for this UsageDetailObject.
     * 
     * @param uploadData
     */
    public void setUploadData(long uploadData) {
        this.uploadData = uploadData;
    }


    /**
     * Gets the usedTime value for this UsageDetailObject.
     * 
     * @return usedTime
     */
    public long getUsedTime() {
        return usedTime;
    }


    /**
     * Sets the usedTime value for this UsageDetailObject.
     * 
     * @param usedTime
     */
    public void setUsedTime(long usedTime) {
        this.usedTime = usedTime;
    }


    /**
     * Gets the userName value for this UsageDetailObject.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UsageDetailObject.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageDetailObject)) return false;
        UsageDetailObject other = (UsageDetailObject) obj;
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
            this.downloadData == other.getDownloadData() &&
            this.effectiveSessionTime == other.getEffectiveSessionTime() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.stopTime==null && other.getStopTime()==null) || 
             (this.stopTime!=null &&
              this.stopTime.equals(other.getStopTime()))) &&
            this.totalDataTransfer == other.getTotalDataTransfer() &&
            this.uploadData == other.getUploadData() &&
            this.usedTime == other.getUsedTime() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        _hashCode += new Long(getDownloadData()).hashCode();
        _hashCode += new Long(getEffectiveSessionTime()).hashCode();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStopTime() != null) {
            _hashCode += getStopTime().hashCode();
        }
        _hashCode += new Long(getTotalDataTransfer()).hashCode();
        _hashCode += new Long(getUploadData()).hashCode();
        _hashCode += new Long(getUsedTime()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageDetailObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UsageDetailObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveSessionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveSessionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stopTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDataTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDataTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
