/**
 * AncillaryObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.common;

public class AncillaryObject  implements java.io.Serializable {
    private double ancillaryChargeWithTax;

    private double ancillaryChargeWithoutTax;

    private java.lang.String ancillaryServiceName;

    private java.lang.String applicableOnServiceType;

    private int chargeType;

    private double proportionalPackagePrice;

    private boolean taxApplicable;

    private com.elitecore.webservices.corporate.containers.common.TaxObject[] taxesOnService;

    public AncillaryObject() {
    }

    public AncillaryObject(
           double ancillaryChargeWithTax,
           double ancillaryChargeWithoutTax,
           java.lang.String ancillaryServiceName,
           java.lang.String applicableOnServiceType,
           int chargeType,
           double proportionalPackagePrice,
           boolean taxApplicable,
           com.elitecore.webservices.corporate.containers.common.TaxObject[] taxesOnService) {
           this.ancillaryChargeWithTax = ancillaryChargeWithTax;
           this.ancillaryChargeWithoutTax = ancillaryChargeWithoutTax;
           this.ancillaryServiceName = ancillaryServiceName;
           this.applicableOnServiceType = applicableOnServiceType;
           this.chargeType = chargeType;
           this.proportionalPackagePrice = proportionalPackagePrice;
           this.taxApplicable = taxApplicable;
           this.taxesOnService = taxesOnService;
    }


    /**
     * Gets the ancillaryChargeWithTax value for this AncillaryObject.
     * 
     * @return ancillaryChargeWithTax
     */
    public double getAncillaryChargeWithTax() {
        return ancillaryChargeWithTax;
    }


    /**
     * Sets the ancillaryChargeWithTax value for this AncillaryObject.
     * 
     * @param ancillaryChargeWithTax
     */
    public void setAncillaryChargeWithTax(double ancillaryChargeWithTax) {
        this.ancillaryChargeWithTax = ancillaryChargeWithTax;
    }


    /**
     * Gets the ancillaryChargeWithoutTax value for this AncillaryObject.
     * 
     * @return ancillaryChargeWithoutTax
     */
    public double getAncillaryChargeWithoutTax() {
        return ancillaryChargeWithoutTax;
    }


    /**
     * Sets the ancillaryChargeWithoutTax value for this AncillaryObject.
     * 
     * @param ancillaryChargeWithoutTax
     */
    public void setAncillaryChargeWithoutTax(double ancillaryChargeWithoutTax) {
        this.ancillaryChargeWithoutTax = ancillaryChargeWithoutTax;
    }


    /**
     * Gets the ancillaryServiceName value for this AncillaryObject.
     * 
     * @return ancillaryServiceName
     */
    public java.lang.String getAncillaryServiceName() {
        return ancillaryServiceName;
    }


    /**
     * Sets the ancillaryServiceName value for this AncillaryObject.
     * 
     * @param ancillaryServiceName
     */
    public void setAncillaryServiceName(java.lang.String ancillaryServiceName) {
        this.ancillaryServiceName = ancillaryServiceName;
    }


    /**
     * Gets the applicableOnServiceType value for this AncillaryObject.
     * 
     * @return applicableOnServiceType
     */
    public java.lang.String getApplicableOnServiceType() {
        return applicableOnServiceType;
    }


    /**
     * Sets the applicableOnServiceType value for this AncillaryObject.
     * 
     * @param applicableOnServiceType
     */
    public void setApplicableOnServiceType(java.lang.String applicableOnServiceType) {
        this.applicableOnServiceType = applicableOnServiceType;
    }


    /**
     * Gets the chargeType value for this AncillaryObject.
     * 
     * @return chargeType
     */
    public int getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this AncillaryObject.
     * 
     * @param chargeType
     */
    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the proportionalPackagePrice value for this AncillaryObject.
     * 
     * @return proportionalPackagePrice
     */
    public double getProportionalPackagePrice() {
        return proportionalPackagePrice;
    }


    /**
     * Sets the proportionalPackagePrice value for this AncillaryObject.
     * 
     * @param proportionalPackagePrice
     */
    public void setProportionalPackagePrice(double proportionalPackagePrice) {
        this.proportionalPackagePrice = proportionalPackagePrice;
    }


    /**
     * Gets the taxApplicable value for this AncillaryObject.
     * 
     * @return taxApplicable
     */
    public boolean isTaxApplicable() {
        return taxApplicable;
    }


    /**
     * Sets the taxApplicable value for this AncillaryObject.
     * 
     * @param taxApplicable
     */
    public void setTaxApplicable(boolean taxApplicable) {
        this.taxApplicable = taxApplicable;
    }


    /**
     * Gets the taxesOnService value for this AncillaryObject.
     * 
     * @return taxesOnService
     */
    public com.elitecore.webservices.corporate.containers.common.TaxObject[] getTaxesOnService() {
        return taxesOnService;
    }


    /**
     * Sets the taxesOnService value for this AncillaryObject.
     * 
     * @param taxesOnService
     */
    public void setTaxesOnService(com.elitecore.webservices.corporate.containers.common.TaxObject[] taxesOnService) {
        this.taxesOnService = taxesOnService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AncillaryObject)) return false;
        AncillaryObject other = (AncillaryObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ancillaryChargeWithTax == other.getAncillaryChargeWithTax() &&
            this.ancillaryChargeWithoutTax == other.getAncillaryChargeWithoutTax() &&
            ((this.ancillaryServiceName==null && other.getAncillaryServiceName()==null) || 
             (this.ancillaryServiceName!=null &&
              this.ancillaryServiceName.equals(other.getAncillaryServiceName()))) &&
            ((this.applicableOnServiceType==null && other.getApplicableOnServiceType()==null) || 
             (this.applicableOnServiceType!=null &&
              this.applicableOnServiceType.equals(other.getApplicableOnServiceType()))) &&
            this.chargeType == other.getChargeType() &&
            this.proportionalPackagePrice == other.getProportionalPackagePrice() &&
            this.taxApplicable == other.isTaxApplicable() &&
            ((this.taxesOnService==null && other.getTaxesOnService()==null) || 
             (this.taxesOnService!=null &&
              java.util.Arrays.equals(this.taxesOnService, other.getTaxesOnService())));
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
        _hashCode += new Double(getAncillaryChargeWithTax()).hashCode();
        _hashCode += new Double(getAncillaryChargeWithoutTax()).hashCode();
        if (getAncillaryServiceName() != null) {
            _hashCode += getAncillaryServiceName().hashCode();
        }
        if (getApplicableOnServiceType() != null) {
            _hashCode += getApplicableOnServiceType().hashCode();
        }
        _hashCode += getChargeType();
        _hashCode += new Double(getProportionalPackagePrice()).hashCode();
        _hashCode += (isTaxApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTaxesOnService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxesOnService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxesOnService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AncillaryObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AncillaryObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryChargeWithTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancillaryChargeWithTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryChargeWithoutTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancillaryChargeWithoutTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancillaryServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableOnServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicableOnServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proportionalPackagePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proportionalPackagePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxesOnService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxesOnService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject"));
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
