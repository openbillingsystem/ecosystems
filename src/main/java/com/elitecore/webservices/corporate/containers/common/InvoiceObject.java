/**
 * InvoiceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.corporate.containers.common;

public class InvoiceObject  implements java.io.Serializable {
    private java.lang.String address1;

    private java.lang.String address2;

    private double allottedDownloadDt;

    private java.lang.String allottedTime;

    private double allottedTotalDt;

    private double allottedUploadDt;

    private boolean ancillaryChargeApplicable;

    private com.elitecore.webservices.corporate.containers.common.AncillaryObject[] ancillaryChargeDetails;

    private double basicInvoiceAmount;

    private java.util.Calendar billingEndDate;

    private java.util.Calendar billingStartDate;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String customerId;

    private java.util.Calendar expiryDate;

    private java.lang.String fullCustomerName;

    private boolean globalTaxApplicable;

    private com.elitecore.webservices.corporate.containers.common.TaxObject[] globalTaxDetails;

    private double grandTotal;

    private java.util.Calendar invoiceDate;

    private java.lang.String invoiceNo;

    private boolean prepaidInvoice;

    private boolean packageAmountTaxApplicable;

    private com.elitecore.webservices.corporate.containers.common.TaxObject[] packageAmountTaxDetails;

    private java.lang.String packageName;

    private java.lang.String pincode;

    private double proportionalInvoiceAmount;

    private java.lang.String serviceName;

    private double serviceProportion;

    private java.lang.String state;

    private java.lang.String userName;

    private boolean proportionalInvoice;

    public InvoiceObject() {
    }

    public InvoiceObject(
           java.lang.String address1,
           java.lang.String address2,
           double allottedDownloadDt,
           java.lang.String allottedTime,
           double allottedTotalDt,
           double allottedUploadDt,
           boolean ancillaryChargeApplicable,
           com.elitecore.webservices.corporate.containers.common.AncillaryObject[] ancillaryChargeDetails,
           double basicInvoiceAmount,
           java.util.Calendar billingEndDate,
           java.util.Calendar billingStartDate,
           java.lang.String city,
           java.lang.String country,
           java.lang.String customerId,
           java.util.Calendar expiryDate,
           java.lang.String fullCustomerName,
           boolean globalTaxApplicable,
           com.elitecore.webservices.corporate.containers.common.TaxObject[] globalTaxDetails,
           double grandTotal,
           java.util.Calendar invoiceDate,
           java.lang.String invoiceNo,
           boolean prepaidInvoice,
           boolean packageAmountTaxApplicable,
           com.elitecore.webservices.corporate.containers.common.TaxObject[] packageAmountTaxDetails,
           java.lang.String packageName,
           java.lang.String pincode,
           double proportionalInvoiceAmount,
           java.lang.String serviceName,
           double serviceProportion,
           java.lang.String state,
           java.lang.String userName,
           boolean proportionalInvoice) {
           this.address1 = address1;
           this.address2 = address2;
           this.allottedDownloadDt = allottedDownloadDt;
           this.allottedTime = allottedTime;
           this.allottedTotalDt = allottedTotalDt;
           this.allottedUploadDt = allottedUploadDt;
           this.ancillaryChargeApplicable = ancillaryChargeApplicable;
           this.ancillaryChargeDetails = ancillaryChargeDetails;
           this.basicInvoiceAmount = basicInvoiceAmount;
           this.billingEndDate = billingEndDate;
           this.billingStartDate = billingStartDate;
           this.city = city;
           this.country = country;
           this.customerId = customerId;
           this.expiryDate = expiryDate;
           this.fullCustomerName = fullCustomerName;
           this.globalTaxApplicable = globalTaxApplicable;
           this.globalTaxDetails = globalTaxDetails;
           this.grandTotal = grandTotal;
           this.invoiceDate = invoiceDate;
           this.invoiceNo = invoiceNo;
           this.prepaidInvoice = prepaidInvoice;
           this.packageAmountTaxApplicable = packageAmountTaxApplicable;
           this.packageAmountTaxDetails = packageAmountTaxDetails;
           this.packageName = packageName;
           this.pincode = pincode;
           this.proportionalInvoiceAmount = proportionalInvoiceAmount;
           this.serviceName = serviceName;
           this.serviceProportion = serviceProportion;
           this.state = state;
           this.userName = userName;
           this.proportionalInvoice = proportionalInvoice;
    }


    /**
     * Gets the address1 value for this InvoiceObject.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this InvoiceObject.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this InvoiceObject.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this InvoiceObject.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the allottedDownloadDt value for this InvoiceObject.
     * 
     * @return allottedDownloadDt
     */
    public double getAllottedDownloadDt() {
        return allottedDownloadDt;
    }


    /**
     * Sets the allottedDownloadDt value for this InvoiceObject.
     * 
     * @param allottedDownloadDt
     */
    public void setAllottedDownloadDt(double allottedDownloadDt) {
        this.allottedDownloadDt = allottedDownloadDt;
    }


    /**
     * Gets the allottedTime value for this InvoiceObject.
     * 
     * @return allottedTime
     */
    public java.lang.String getAllottedTime() {
        return allottedTime;
    }


    /**
     * Sets the allottedTime value for this InvoiceObject.
     * 
     * @param allottedTime
     */
    public void setAllottedTime(java.lang.String allottedTime) {
        this.allottedTime = allottedTime;
    }


    /**
     * Gets the allottedTotalDt value for this InvoiceObject.
     * 
     * @return allottedTotalDt
     */
    public double getAllottedTotalDt() {
        return allottedTotalDt;
    }


    /**
     * Sets the allottedTotalDt value for this InvoiceObject.
     * 
     * @param allottedTotalDt
     */
    public void setAllottedTotalDt(double allottedTotalDt) {
        this.allottedTotalDt = allottedTotalDt;
    }


    /**
     * Gets the allottedUploadDt value for this InvoiceObject.
     * 
     * @return allottedUploadDt
     */
    public double getAllottedUploadDt() {
        return allottedUploadDt;
    }


    /**
     * Sets the allottedUploadDt value for this InvoiceObject.
     * 
     * @param allottedUploadDt
     */
    public void setAllottedUploadDt(double allottedUploadDt) {
        this.allottedUploadDt = allottedUploadDt;
    }


    /**
     * Gets the ancillaryChargeApplicable value for this InvoiceObject.
     * 
     * @return ancillaryChargeApplicable
     */
    public boolean isAncillaryChargeApplicable() {
        return ancillaryChargeApplicable;
    }


    /**
     * Sets the ancillaryChargeApplicable value for this InvoiceObject.
     * 
     * @param ancillaryChargeApplicable
     */
    public void setAncillaryChargeApplicable(boolean ancillaryChargeApplicable) {
        this.ancillaryChargeApplicable = ancillaryChargeApplicable;
    }


    /**
     * Gets the ancillaryChargeDetails value for this InvoiceObject.
     * 
     * @return ancillaryChargeDetails
     */
    public com.elitecore.webservices.corporate.containers.common.AncillaryObject[] getAncillaryChargeDetails() {
        return ancillaryChargeDetails;
    }


    /**
     * Sets the ancillaryChargeDetails value for this InvoiceObject.
     * 
     * @param ancillaryChargeDetails
     */
    public void setAncillaryChargeDetails(com.elitecore.webservices.corporate.containers.common.AncillaryObject[] ancillaryChargeDetails) {
        this.ancillaryChargeDetails = ancillaryChargeDetails;
    }


    /**
     * Gets the basicInvoiceAmount value for this InvoiceObject.
     * 
     * @return basicInvoiceAmount
     */
    public double getBasicInvoiceAmount() {
        return basicInvoiceAmount;
    }


    /**
     * Sets the basicInvoiceAmount value for this InvoiceObject.
     * 
     * @param basicInvoiceAmount
     */
    public void setBasicInvoiceAmount(double basicInvoiceAmount) {
        this.basicInvoiceAmount = basicInvoiceAmount;
    }


    /**
     * Gets the billingEndDate value for this InvoiceObject.
     * 
     * @return billingEndDate
     */
    public java.util.Calendar getBillingEndDate() {
        return billingEndDate;
    }


    /**
     * Sets the billingEndDate value for this InvoiceObject.
     * 
     * @param billingEndDate
     */
    public void setBillingEndDate(java.util.Calendar billingEndDate) {
        this.billingEndDate = billingEndDate;
    }


    /**
     * Gets the billingStartDate value for this InvoiceObject.
     * 
     * @return billingStartDate
     */
    public java.util.Calendar getBillingStartDate() {
        return billingStartDate;
    }


    /**
     * Sets the billingStartDate value for this InvoiceObject.
     * 
     * @param billingStartDate
     */
    public void setBillingStartDate(java.util.Calendar billingStartDate) {
        this.billingStartDate = billingStartDate;
    }


    /**
     * Gets the city value for this InvoiceObject.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this InvoiceObject.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this InvoiceObject.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this InvoiceObject.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the customerId value for this InvoiceObject.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this InvoiceObject.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the expiryDate value for this InvoiceObject.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this InvoiceObject.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the fullCustomerName value for this InvoiceObject.
     * 
     * @return fullCustomerName
     */
    public java.lang.String getFullCustomerName() {
        return fullCustomerName;
    }


    /**
     * Sets the fullCustomerName value for this InvoiceObject.
     * 
     * @param fullCustomerName
     */
    public void setFullCustomerName(java.lang.String fullCustomerName) {
        this.fullCustomerName = fullCustomerName;
    }


    /**
     * Gets the globalTaxApplicable value for this InvoiceObject.
     * 
     * @return globalTaxApplicable
     */
    public boolean isGlobalTaxApplicable() {
        return globalTaxApplicable;
    }


    /**
     * Sets the globalTaxApplicable value for this InvoiceObject.
     * 
     * @param globalTaxApplicable
     */
    public void setGlobalTaxApplicable(boolean globalTaxApplicable) {
        this.globalTaxApplicable = globalTaxApplicable;
    }


    /**
     * Gets the globalTaxDetails value for this InvoiceObject.
     * 
     * @return globalTaxDetails
     */
    public com.elitecore.webservices.corporate.containers.common.TaxObject[] getGlobalTaxDetails() {
        return globalTaxDetails;
    }


    /**
     * Sets the globalTaxDetails value for this InvoiceObject.
     * 
     * @param globalTaxDetails
     */
    public void setGlobalTaxDetails(com.elitecore.webservices.corporate.containers.common.TaxObject[] globalTaxDetails) {
        this.globalTaxDetails = globalTaxDetails;
    }


    /**
     * Gets the grandTotal value for this InvoiceObject.
     * 
     * @return grandTotal
     */
    public double getGrandTotal() {
        return grandTotal;
    }


    /**
     * Sets the grandTotal value for this InvoiceObject.
     * 
     * @param grandTotal
     */
    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }


    /**
     * Gets the invoiceDate value for this InvoiceObject.
     * 
     * @return invoiceDate
     */
    public java.util.Calendar getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this InvoiceObject.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.util.Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the invoiceNo value for this InvoiceObject.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this InvoiceObject.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the prepaidInvoice value for this InvoiceObject.
     * 
     * @return prepaidInvoice
     */
    public boolean isPrepaidInvoice() {
        return prepaidInvoice;
    }


    /**
     * Sets the prepaidInvoice value for this InvoiceObject.
     * 
     * @param prepaidInvoice
     */
    public void setPrepaidInvoice(boolean prepaidInvoice) {
        this.prepaidInvoice = prepaidInvoice;
    }


    /**
     * Gets the packageAmountTaxApplicable value for this InvoiceObject.
     * 
     * @return packageAmountTaxApplicable
     */
    public boolean isPackageAmountTaxApplicable() {
        return packageAmountTaxApplicable;
    }


    /**
     * Sets the packageAmountTaxApplicable value for this InvoiceObject.
     * 
     * @param packageAmountTaxApplicable
     */
    public void setPackageAmountTaxApplicable(boolean packageAmountTaxApplicable) {
        this.packageAmountTaxApplicable = packageAmountTaxApplicable;
    }


    /**
     * Gets the packageAmountTaxDetails value for this InvoiceObject.
     * 
     * @return packageAmountTaxDetails
     */
    public com.elitecore.webservices.corporate.containers.common.TaxObject[] getPackageAmountTaxDetails() {
        return packageAmountTaxDetails;
    }


    /**
     * Sets the packageAmountTaxDetails value for this InvoiceObject.
     * 
     * @param packageAmountTaxDetails
     */
    public void setPackageAmountTaxDetails(com.elitecore.webservices.corporate.containers.common.TaxObject[] packageAmountTaxDetails) {
        this.packageAmountTaxDetails = packageAmountTaxDetails;
    }


    /**
     * Gets the packageName value for this InvoiceObject.
     * 
     * @return packageName
     */
    public java.lang.String getPackageName() {
        return packageName;
    }


    /**
     * Sets the packageName value for this InvoiceObject.
     * 
     * @param packageName
     */
    public void setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
    }


    /**
     * Gets the pincode value for this InvoiceObject.
     * 
     * @return pincode
     */
    public java.lang.String getPincode() {
        return pincode;
    }


    /**
     * Sets the pincode value for this InvoiceObject.
     * 
     * @param pincode
     */
    public void setPincode(java.lang.String pincode) {
        this.pincode = pincode;
    }


    /**
     * Gets the proportionalInvoiceAmount value for this InvoiceObject.
     * 
     * @return proportionalInvoiceAmount
     */
    public double getProportionalInvoiceAmount() {
        return proportionalInvoiceAmount;
    }


    /**
     * Sets the proportionalInvoiceAmount value for this InvoiceObject.
     * 
     * @param proportionalInvoiceAmount
     */
    public void setProportionalInvoiceAmount(double proportionalInvoiceAmount) {
        this.proportionalInvoiceAmount = proportionalInvoiceAmount;
    }


    /**
     * Gets the serviceName value for this InvoiceObject.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this InvoiceObject.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceProportion value for this InvoiceObject.
     * 
     * @return serviceProportion
     */
    public double getServiceProportion() {
        return serviceProportion;
    }


    /**
     * Sets the serviceProportion value for this InvoiceObject.
     * 
     * @param serviceProportion
     */
    public void setServiceProportion(double serviceProportion) {
        this.serviceProportion = serviceProportion;
    }


    /**
     * Gets the state value for this InvoiceObject.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this InvoiceObject.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the userName value for this InvoiceObject.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this InvoiceObject.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the proportionalInvoice value for this InvoiceObject.
     * 
     * @return proportionalInvoice
     */
    public boolean isProportionalInvoice() {
        return proportionalInvoice;
    }


    /**
     * Sets the proportionalInvoice value for this InvoiceObject.
     * 
     * @param proportionalInvoice
     */
    public void setProportionalInvoice(boolean proportionalInvoice) {
        this.proportionalInvoice = proportionalInvoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceObject)) return false;
        InvoiceObject other = (InvoiceObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            this.allottedDownloadDt == other.getAllottedDownloadDt() &&
            ((this.allottedTime==null && other.getAllottedTime()==null) || 
             (this.allottedTime!=null &&
              this.allottedTime.equals(other.getAllottedTime()))) &&
            this.allottedTotalDt == other.getAllottedTotalDt() &&
            this.allottedUploadDt == other.getAllottedUploadDt() &&
            this.ancillaryChargeApplicable == other.isAncillaryChargeApplicable() &&
            ((this.ancillaryChargeDetails==null && other.getAncillaryChargeDetails()==null) || 
             (this.ancillaryChargeDetails!=null &&
              java.util.Arrays.equals(this.ancillaryChargeDetails, other.getAncillaryChargeDetails()))) &&
            this.basicInvoiceAmount == other.getBasicInvoiceAmount() &&
            ((this.billingEndDate==null && other.getBillingEndDate()==null) || 
             (this.billingEndDate!=null &&
              this.billingEndDate.equals(other.getBillingEndDate()))) &&
            ((this.billingStartDate==null && other.getBillingStartDate()==null) || 
             (this.billingStartDate!=null &&
              this.billingStartDate.equals(other.getBillingStartDate()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.fullCustomerName==null && other.getFullCustomerName()==null) || 
             (this.fullCustomerName!=null &&
              this.fullCustomerName.equals(other.getFullCustomerName()))) &&
            this.globalTaxApplicable == other.isGlobalTaxApplicable() &&
            ((this.globalTaxDetails==null && other.getGlobalTaxDetails()==null) || 
             (this.globalTaxDetails!=null &&
              java.util.Arrays.equals(this.globalTaxDetails, other.getGlobalTaxDetails()))) &&
            this.grandTotal == other.getGrandTotal() &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            this.prepaidInvoice == other.isPrepaidInvoice() &&
            this.packageAmountTaxApplicable == other.isPackageAmountTaxApplicable() &&
            ((this.packageAmountTaxDetails==null && other.getPackageAmountTaxDetails()==null) || 
             (this.packageAmountTaxDetails!=null &&
              java.util.Arrays.equals(this.packageAmountTaxDetails, other.getPackageAmountTaxDetails()))) &&
            ((this.packageName==null && other.getPackageName()==null) || 
             (this.packageName!=null &&
              this.packageName.equals(other.getPackageName()))) &&
            ((this.pincode==null && other.getPincode()==null) || 
             (this.pincode!=null &&
              this.pincode.equals(other.getPincode()))) &&
            this.proportionalInvoiceAmount == other.getProportionalInvoiceAmount() &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            this.serviceProportion == other.getServiceProportion() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.proportionalInvoice == other.isProportionalInvoice();
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
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        _hashCode += new Double(getAllottedDownloadDt()).hashCode();
        if (getAllottedTime() != null) {
            _hashCode += getAllottedTime().hashCode();
        }
        _hashCode += new Double(getAllottedTotalDt()).hashCode();
        _hashCode += new Double(getAllottedUploadDt()).hashCode();
        _hashCode += (isAncillaryChargeApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAncillaryChargeDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAncillaryChargeDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAncillaryChargeDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getBasicInvoiceAmount()).hashCode();
        if (getBillingEndDate() != null) {
            _hashCode += getBillingEndDate().hashCode();
        }
        if (getBillingStartDate() != null) {
            _hashCode += getBillingStartDate().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFullCustomerName() != null) {
            _hashCode += getFullCustomerName().hashCode();
        }
        _hashCode += (isGlobalTaxApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGlobalTaxDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalTaxDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalTaxDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getGrandTotal()).hashCode();
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        _hashCode += (isPrepaidInvoice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPackageAmountTaxApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPackageAmountTaxDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageAmountTaxDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageAmountTaxDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageName() != null) {
            _hashCode += getPackageName().hashCode();
        }
        if (getPincode() != null) {
            _hashCode += getPincode().hashCode();
        }
        _hashCode += new Double(getProportionalInvoiceAmount()).hashCode();
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        _hashCode += new Double(getServiceProportion()).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += (isProportionalInvoice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "InvoiceObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("allottedDownloadDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allottedDownloadDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allottedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allottedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allottedTotalDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allottedTotalDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allottedUploadDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allottedUploadDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryChargeApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancillaryChargeApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancillaryChargeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancillaryChargeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AncillaryObject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicInvoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basicInvoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingStartDate"));
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
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullCustomerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullCustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalTaxApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTaxApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalTaxDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "globalTaxDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grandTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grandTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaidInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageAmountTaxApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageAmountTaxApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageAmountTaxDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageAmountTaxDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pincode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pincode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proportionalInvoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proportionalInvoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProportion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceProportion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
        elemField.setFieldName("proportionalInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proportionalInvoice"));
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
