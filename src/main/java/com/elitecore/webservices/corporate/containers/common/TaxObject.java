/**
 * TaxObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.common;

public class TaxObject  implements java.io.Serializable {
    private java.lang.String applicableOnServiceType;

    private double taxAmount;

    private java.lang.String taxName;

    private double taxPercentage;

    private com.elitecore.webservices.corporate.containers.common.TaxObject[] taxOnTax;

    private boolean taxOnTaxApplicable;

    public TaxObject() {
    }

    public TaxObject(
           java.lang.String applicableOnServiceType,
           double taxAmount,
           java.lang.String taxName,
           double taxPercentage,
           com.elitecore.webservices.corporate.containers.common.TaxObject[] taxOnTax,
           boolean taxOnTaxApplicable) {
           this.applicableOnServiceType = applicableOnServiceType;
           this.taxAmount = taxAmount;
           this.taxName = taxName;
           this.taxPercentage = taxPercentage;
           this.taxOnTax = taxOnTax;
           this.taxOnTaxApplicable = taxOnTaxApplicable;
    }


    /**
     * Gets the applicableOnServiceType value for this TaxObject.
     * 
     * @return applicableOnServiceType
     */
    public java.lang.String getApplicableOnServiceType() {
        return applicableOnServiceType;
    }


    /**
     * Sets the applicableOnServiceType value for this TaxObject.
     * 
     * @param applicableOnServiceType
     */
    public void setApplicableOnServiceType(java.lang.String applicableOnServiceType) {
        this.applicableOnServiceType = applicableOnServiceType;
    }


    /**
     * Gets the taxAmount value for this TaxObject.
     * 
     * @return taxAmount
     */
    public double getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxObject.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxName value for this TaxObject.
     * 
     * @return taxName
     */
    public java.lang.String getTaxName() {
        return taxName;
    }


    /**
     * Sets the taxName value for this TaxObject.
     * 
     * @param taxName
     */
    public void setTaxName(java.lang.String taxName) {
        this.taxName = taxName;
    }


    /**
     * Gets the taxPercentage value for this TaxObject.
     * 
     * @return taxPercentage
     */
    public double getTaxPercentage() {
        return taxPercentage;
    }


    /**
     * Sets the taxPercentage value for this TaxObject.
     * 
     * @param taxPercentage
     */
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }


    /**
     * Gets the taxOnTax value for this TaxObject.
     * 
     * @return taxOnTax
     */
    public com.elitecore.webservices.corporate.containers.common.TaxObject[] getTaxOnTax() {
        return taxOnTax;
    }


    /**
     * Sets the taxOnTax value for this TaxObject.
     * 
     * @param taxOnTax
     */
    public void setTaxOnTax(com.elitecore.webservices.corporate.containers.common.TaxObject[] taxOnTax) {
        this.taxOnTax = taxOnTax;
    }


    /**
     * Gets the taxOnTaxApplicable value for this TaxObject.
     * 
     * @return taxOnTaxApplicable
     */
    public boolean isTaxOnTaxApplicable() {
        return taxOnTaxApplicable;
    }


    /**
     * Sets the taxOnTaxApplicable value for this TaxObject.
     * 
     * @param taxOnTaxApplicable
     */
    public void setTaxOnTaxApplicable(boolean taxOnTaxApplicable) {
        this.taxOnTaxApplicable = taxOnTaxApplicable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxObject)) return false;
        TaxObject other = (TaxObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicableOnServiceType==null && other.getApplicableOnServiceType()==null) || 
             (this.applicableOnServiceType!=null &&
              this.applicableOnServiceType.equals(other.getApplicableOnServiceType()))) &&
            this.taxAmount == other.getTaxAmount() &&
            ((this.taxName==null && other.getTaxName()==null) || 
             (this.taxName!=null &&
              this.taxName.equals(other.getTaxName()))) &&
            this.taxPercentage == other.getTaxPercentage() &&
            ((this.taxOnTax==null && other.getTaxOnTax()==null) || 
             (this.taxOnTax!=null &&
              java.util.Arrays.equals(this.taxOnTax, other.getTaxOnTax()))) &&
            this.taxOnTaxApplicable == other.isTaxOnTaxApplicable();
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
        if (getApplicableOnServiceType() != null) {
            _hashCode += getApplicableOnServiceType().hashCode();
        }
        _hashCode += new Double(getTaxAmount()).hashCode();
        if (getTaxName() != null) {
            _hashCode += getTaxName().hashCode();
        }
        _hashCode += new Double(getTaxPercentage()).hashCode();
        if (getTaxOnTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxOnTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxOnTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTaxOnTaxApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicableOnServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicableOnServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOnTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxOnTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOnTaxApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxOnTaxApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
