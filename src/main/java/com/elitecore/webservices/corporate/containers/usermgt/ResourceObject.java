/**
 * ResourceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.usermgt;

public class ResourceObject  implements java.io.Serializable {
    private long allotedResources;

    private java.lang.String resourceName;

    private long usedResources;

    public ResourceObject() {
    }

    public ResourceObject(
           long allotedResources,
           java.lang.String resourceName,
           long usedResources) {
           this.allotedResources = allotedResources;
           this.resourceName = resourceName;
           this.usedResources = usedResources;
    }


    /**
     * Gets the allotedResources value for this ResourceObject.
     * 
     * @return allotedResources
     */
    public long getAllotedResources() {
        return allotedResources;
    }


    /**
     * Sets the allotedResources value for this ResourceObject.
     * 
     * @param allotedResources
     */
    public void setAllotedResources(long allotedResources) {
        this.allotedResources = allotedResources;
    }


    /**
     * Gets the resourceName value for this ResourceObject.
     * 
     * @return resourceName
     */
    public java.lang.String getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ResourceObject.
     * 
     * @param resourceName
     */
    public void setResourceName(java.lang.String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * Gets the usedResources value for this ResourceObject.
     * 
     * @return usedResources
     */
    public long getUsedResources() {
        return usedResources;
    }


    /**
     * Sets the usedResources value for this ResourceObject.
     * 
     * @param usedResources
     */
    public void setUsedResources(long usedResources) {
        this.usedResources = usedResources;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceObject)) return false;
        ResourceObject other = (ResourceObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allotedResources == other.getAllotedResources() &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName()))) &&
            this.usedResources == other.getUsedResources();
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
        _hashCode += new Long(getAllotedResources()).hashCode();
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        _hashCode += new Long(getUsedResources()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "ResourceObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allotedResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allotedResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
