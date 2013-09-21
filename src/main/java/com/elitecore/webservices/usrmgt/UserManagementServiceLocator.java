/**
 * UserManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.usrmgt;

public class UserManagementServiceLocator extends org.apache.axis.client.Service implements com.elitecore.webservices.usrmgt.UserManagementService {

    public UserManagementServiceLocator() {
    }


    public UserManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserManagementService
    private java.lang.String UserManagementService_address = "http://182.18.191.50:10080/24online/services/UserManagementService";

    public java.lang.String getUserManagementServiceAddress() {
        return UserManagementService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserManagementServiceWSDDServiceName = "UserManagementService";

    public java.lang.String getUserManagementServiceWSDDServiceName() {
        return UserManagementServiceWSDDServiceName;
    }

    public void setUserManagementServiceWSDDServiceName(java.lang.String name) {
        UserManagementServiceWSDDServiceName = name;
    }

    public com.elitecore.webservices.usrmgt.UserManagement getUserManagementService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserManagementService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserManagementService(endpoint);
    }

    public com.elitecore.webservices.usrmgt.UserManagement getUserManagementService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.elitecore.webservices.usrmgt.UserManagementServiceSoapBindingStub _stub = new com.elitecore.webservices.usrmgt.UserManagementServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserManagementServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserManagementServiceEndpointAddress(java.lang.String address) {
        UserManagementService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.elitecore.webservices.usrmgt.UserManagement.class.isAssignableFrom(serviceEndpointInterface)) {
                com.elitecore.webservices.usrmgt.UserManagementServiceSoapBindingStub _stub = new com.elitecore.webservices.usrmgt.UserManagementServiceSoapBindingStub(new java.net.URL(UserManagementService_address), this);
                _stub.setPortName(getUserManagementServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserManagementService".equals(inputPortName)) {
            return getUserManagementService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "UserManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "UserManagementService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserManagementService".equals(portName)) {
            setUserManagementServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
