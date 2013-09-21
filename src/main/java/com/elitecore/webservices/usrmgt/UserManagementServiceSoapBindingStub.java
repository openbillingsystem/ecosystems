/**
 * UserManagementServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.usrmgt;

public class UserManagementServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.elitecore.webservices.usrmgt.UserManagement {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[45];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"), com.elitecore.webservices.corporate.containers.usermgt.UserObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logoutReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"), com.elitecore.webservices.corporate.containers.usermgt.UserObject.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.DuplicateDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "DuplicateDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.DuplicateDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "DuplicateDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("topupUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "topupUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renewUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "renewUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changePackageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeBandwidthPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeBandwidthPolicyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeAccessTimePolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeAccessTimePolicyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMacAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateMacAddressReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeDataTransferPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeDataTransferPolicyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPersonalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UserObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPersonalInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disconnectLiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "disconnectLiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deactivateUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "activateUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetMac");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "resetMacReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBindToMac");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateBindToMacReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserSurfingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UsageDetailObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserSurfingDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_ResourceObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getResourceInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePersonalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserDetailObject"), com.elitecore.webservices.corporate.containers.usermgt.UserDetailObject.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updatePersonalInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changePasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeLoginRestriction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeLoginRestrictionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getActiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeactiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getDeactiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_LiveUserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchLiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_LiveUserObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchLiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemSurfingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UsageDetailObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSystemSurfingDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserBillingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns4_InvoiceObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.common.InvoiceObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserBillingDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSystemBillingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns4_InvoiceObject"));
        oper.setReturnClass(com.elitecore.webservices.corporate.containers.common.InvoiceObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSystemBillingDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeZoneReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLiveUserDetailsByUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        oper.setReturnClass(java.util.HashMap.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLiveUserDetailsByUserIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUserByPin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"), com.elitecore.webservices.corporate.containers.usermgt.UserObject.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createUserByPinReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.DuplicateDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "DuplicateDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renewUserByPin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "renewUserByPinReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserTypeList");
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        oper.setReturnClass(java.util.HashMap.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserTypeListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLiveUserDetailsByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        oper.setReturnClass(java.util.HashMap.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLiveUserDetailsByUserNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "forgetPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validatePhoneno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validatePhonenoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateSecurityCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validateSecurityCodeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateWalkinPin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "activateWalkinPinReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUserForMobile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject"), com.elitecore.webservices.corporate.containers.usermgt.UserObject.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createUserForMobileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.DuplicateDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "DuplicateDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePackageForMobile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject"), com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changePackageForMobileReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.OperationalException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InvalidDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthorizationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.InsufficientDataException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "fault"),
                      "com.elitecore.webservices.corporate.exception.AuthenticationException",
                      new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException"), 
                      true
                     ));
        _operations[44] = oper;

    }

    public UserManagementServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UserManagementServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UserManagementServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AncillaryObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.AncillaryObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AuthenticationObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.AuthenticationObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "InvoiceObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.InvoiceObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.TaxObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthenticationException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.AuthenticationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "AuthorizationException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.AuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "DuplicateDataException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.DuplicateDataException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InsufficientDataException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.InsufficientDataException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "InvalidDataException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.InvalidDataException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.corporate.webservices.elitecore.com", "OperationalException");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.exception.OperationalException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "LiveUserObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "ResourceObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.ResourceObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UsageDetailObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserDetailObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.UserDetailObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.UserObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_LiveUserObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "LiveUserObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_ResourceObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "ResourceObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UsageDetailObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UsageDetailObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns2_UserObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://usermgt.containers.corporate.webservices.elitecore.com", "UserObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns4_AncillaryObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.AncillaryObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "AncillaryObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns4_InvoiceObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.InvoiceObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "InvoiceObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_tns4_TaxObject");
            cachedSerQNames.add(qName);
            cls = com.elitecore.webservices.corporate.containers.common.TaxObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.containers.corporate.webservices.elitecore.com", "TaxObject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public int login(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int logout(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int createUser(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.DuplicateDataException) {
              throw (com.elitecore.webservices.corporate.exception.DuplicateDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int createUser(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.DuplicateDataException) {
              throw (com.elitecore.webservices.corporate.exception.DuplicateDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int topupUser(java.lang.String in0, java.lang.String[] in1, java.lang.String[] in2, double in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "topupUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Double(in3), in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int renewUser(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "renewUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changePackage(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changeBandwidthPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changeBandwidthPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changeAccessTimePolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changeAccessTimePolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int updateMacAddress(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "updateMacAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changeDataTransferPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changeDataTransferPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UserObject getPersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getPersonalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UserObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int disconnectLiveUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "disconnectLiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deactivateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "deactivateUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int activateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "activateUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int deleteUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "deleteUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int resetMac(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "resetMac"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int updateBindToMac(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "updateBindToMac"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getUserSurfingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, int in3, boolean in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getUserSurfingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Integer(in3), new java.lang.Boolean(in4), in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[] getResourceInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getResourceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int updatePersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.usermgt.UserDetailObject in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "updatePersonalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changePassword(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changeLoginRestriction(java.lang.String in0, int in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changeLoginRestriction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1), in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getActiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getActiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getDeactiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getDeactiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] searchUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "searchUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UserObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UserObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] getLiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getLiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] searchLiveUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "searchLiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getUserPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getUserPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getSystemSurfingDetails(java.util.Calendar in0, java.util.Calendar in1, int in2, boolean in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getSystemSurfingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Boolean(in3), in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getUserBillingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getUserBillingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.common.InvoiceObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.common.InvoiceObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.common.InvoiceObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getSystemBillingDetails(java.util.Calendar in0, java.util.Calendar in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getSystemBillingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.elitecore.webservices.corporate.containers.common.InvoiceObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.elitecore.webservices.corporate.containers.common.InvoiceObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.elitecore.webservices.corporate.containers.common.InvoiceObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changeZone(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changeZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.HashMap getLiveUserDetailsByUserID(int in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getLiveUserDetailsByUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(in0), in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.HashMap) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.HashMap) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.HashMap.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int createUserByPin(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in6) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "createUserByPin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, in4, in5, in6});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.DuplicateDataException) {
              throw (com.elitecore.webservices.corporate.exception.DuplicateDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int renewUserByPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, boolean in6, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in7) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "renewUserByPin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, in4, in5, new java.lang.Boolean(in6), in7});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.HashMap getUserTypeList() throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getUserTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.HashMap) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.HashMap) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.HashMap.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.HashMap getLiveUserDetailsByUserName(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "getLiveUserDetailsByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.HashMap) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.HashMap) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.HashMap.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int forgetPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "forgetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String validatePhoneno(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "validatePhoneno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String validateSecurityCode(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "validateSecurityCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int activateWalkinPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "activateWalkinPin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, in4, in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int createUserForMobile(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "createUserForMobile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.DuplicateDataException) {
              throw (com.elitecore.webservices.corporate.exception.DuplicateDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int changePackageForMobile(java.lang.String in0, java.lang.String in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://usrmgt.webservices.elitecore.com", "changePackageForMobile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.OperationalException) {
              throw (com.elitecore.webservices.corporate.exception.OperationalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InvalidDataException) {
              throw (com.elitecore.webservices.corporate.exception.InvalidDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthorizationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.InsufficientDataException) {
              throw (com.elitecore.webservices.corporate.exception.InsufficientDataException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.elitecore.webservices.corporate.exception.AuthenticationException) {
              throw (com.elitecore.webservices.corporate.exception.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
