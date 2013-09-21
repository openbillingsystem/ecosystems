/**
 * LiveUserObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.usermgt;

public class LiveUserObject  implements java.io.Serializable {
    private java.lang.String IPAddress;

    private java.lang.String SNatIPAddress;

    private long connectedTime;

    private long dataTransferBandwidth;

    private long downloadData;

    private java.lang.String machineName;

    private java.lang.String nasIPAddress;

    private java.lang.String nasPortTypeName;

    private java.util.Calendar startTime;

    private long uploadData;

    private java.lang.String userName;

    public LiveUserObject() {
    }

    public LiveUserObject(
           java.lang.String IPAddress,
           java.lang.String SNatIPAddress,
           long connectedTime,
           long dataTransferBandwidth,
           long downloadData,
           java.lang.String machineName,
           java.lang.String nasIPAddress,
           java.lang.String nasPortTypeName,
           java.util.Calendar startTime,
           long uploadData,
           java.lang.String userName) {
           this.IPAddress = IPAddress;
           this.SNatIPAddress = SNatIPAddress;
           this.connectedTime = connectedTime;
           this.dataTransferBandwidth = dataTransferBandwidth;
           this.downloadData = downloadData;
           this.machineName = machineName;
           this.nasIPAddress = nasIPAddress;
           this.nasPortTypeName = nasPortTypeName;
           this.startTime = startTime;
           this.uploadData = uploadData;
           this.userName = userName;
    }


    /**
     * Gets the IPAddress value for this LiveUserObject.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this LiveUserObject.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the SNatIPAddress value for this LiveUserObject.
     * 
     * @return SNatIPAddress
     */
    public java.lang.String getSNatIPAddress() {
        return SNatIPAddress;
    }


    /**
     * Sets the SNatIPAddress value for this LiveUserObject.
     * 
     * @param SNatIPAddress
     */
    public void setSNatIPAddress(java.lang.String SNatIPAddress) {
        this.SNatIPAddress = SNatIPAddress;
    }


    /**
     * Gets the connectedTime value for this LiveUserObject.
     * 
     * @return connectedTime
     */
    public long getConnectedTime() {
        return connectedTime;
    }


    /**
     * Sets the connectedTime value for this LiveUserObject.
     * 
     * @param connectedTime
     */
    public void setConnectedTime(long connectedTime) {
        this.connectedTime = connectedTime;
    }


    /**
     * Gets the dataTransferBandwidth value for this LiveUserObject.
     * 
     * @return dataTransferBandwidth
     */
    public long getDataTransferBandwidth() {
        return dataTransferBandwidth;
    }


    /**
     * Sets the dataTransferBandwidth value for this LiveUserObject.
     * 
     * @param dataTransferBandwidth
     */
    public void setDataTransferBandwidth(long dataTransferBandwidth) {
        this.dataTransferBandwidth = dataTransferBandwidth;
    }


    /**
     * Gets the downloadData value for this LiveUserObject.
     * 
     * @return downloadData
     */
    public long getDownloadData() {
        return downloadData;
    }


    /**
     * Sets the downloadData value for this LiveUserObject.
     * 
     * @param downloadData
     */
    public void setDownloadData(long downloadData) {
        this.downloadData = downloadData;
    }


    /**
     * Gets the machineName value for this LiveUserObject.
     * 
     * @return machineName
     */
    public java.lang.String getMachineName() {
        return machineName;
    }


    /**
     * Sets the machineName value for this LiveUserObject.
     * 
     * @param machineName
     */
    public void setMachineName(java.lang.String machineName) {
        this.machineName = machineName;
    }


    /**
     * Gets the nasIPAddress value for this LiveUserObject.
     * 
     * @return nasIPAddress
     */
    public java.lang.String getNasIPAddress() {
        return nasIPAddress;
    }


    /**
     * Sets the nasIPAddress value for this LiveUserObject.
     * 
     * @param nasIPAddress
     */
    public void setNasIPAddress(java.lang.String nasIPAddress) {
        this.nasIPAddress = nasIPAddress;
    }


    /**
     * Gets the nasPortTypeName value for this LiveUserObject.
     * 
     * @return nasPortTypeName
     */
    public java.lang.String getNasPortTypeName() {
        return nasPortTypeName;
    }


    /**
     * Sets the nasPortTypeName value for this LiveUserObject.
     * 
     * @param nasPortTypeName
     */
    public void setNasPortTypeName(java.lang.String nasPortTypeName) {
        this.nasPortTypeName = nasPortTypeName;
    }


    /**
     * Gets the startTime value for this LiveUserObject.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this LiveUserObject.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the uploadData value for this LiveUserObject.
     * 
     * @return uploadData
     */
    public long getUploadData() {
        return uploadData;
    }


    /**
     * Sets the uploadData value for this LiveUserObject.
     * 
     * @param uploadData
     */
    public void setUploadData(long uploadData) {
        this.uploadData = uploadData;
    }


    /**
     * Gets the userName value for this LiveUserObject.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this LiveUserObject.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveUserObject)) return false;
        LiveUserObject other = (LiveUserObject) obj;
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
            ((this.SNatIPAddress==null && other.getSNatIPAddress()==null) || 
             (this.SNatIPAddress!=null &&
              this.SNatIPAddress.equals(other.getSNatIPAddress()))) &&
            this.connectedTime == other.getConnectedTime() &&
            this.dataTransferBandwidth == other.getDataTransferBandwidth() &&
            this.downloadData == other.getDownloadData() &&
            ((this.machineName==null && other.getMachineName()==null) || 
             (this.machineName!=null &&
              this.machineName.equals(other.getMachineName()))) &&
            ((this.nasIPAddress==null && other.getNasIPAddress()==null) || 
             (this.nasIPAddress!=null &&
              this.nasIPAddress.equals(other.getNasIPAddress()))) &&
            ((this.nasPortTypeName==null && other.getNasPortTypeName()==null) || 
             (this.nasPortTypeName!=null &&
              this.nasPortTypeName.equals(other.getNasPortTypeName()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.uploadData == other.getUploadData() &&
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
        if (getSNatIPAddress() != null) {
            _hashCode += getSNatIPAddress().hashCode();
        }
        _hashCode += new Long(getConnectedTime()).hashCode();
        _hashCode += new Long(getDataTransferBandwidth()).hashCode();
        _hashCode += new Long(getDownloadData()).hashCode();
        if (getMachineName() != null) {
            _hashCode += getMachineName().hashCode();
        }
        if (getNasIPAddress() != null) {
            _hashCode += getNasIPAddress().hashCode();
        }
        if (getNasPortTypeName() != null) {
            _hashCode += getNasPortTypeName().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += new Long(getUploadData()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveUserObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "LiveUserObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNatIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SNatIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTransferBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataTransferBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downloadData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nasIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nasIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nasPortTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nasPortTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadData"));
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
