/**
 * UserManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.elitecore.webservices.usrmgt;

public interface UserManagement extends java.rmi.Remote {
    public int login(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int logout(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int createUser(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int createUser(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int topupUser(java.lang.String in0, java.lang.String[] in1, java.lang.String[] in2, double in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int renewUser(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changePackage(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changeBandwidthPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changeAccessTimePolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int updateMacAddress(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changeDataTransferPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UserObject getPersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int disconnectLiveUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int deactivateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int activateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int deleteUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int resetMac(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int updateBindToMac(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getUserSurfingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, int in3, boolean in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[] getResourceInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int updatePersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.usermgt.UserDetailObject in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changePassword(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changeLoginRestriction(java.lang.String in0, int in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getActiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getDeactiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] searchUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] getLiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] searchLiveUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.lang.String getUserPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getSystemSurfingDetails(java.util.Calendar in0, java.util.Calendar in1, int in2, boolean in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getUserBillingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getSystemBillingDetails(java.util.Calendar in0, java.util.Calendar in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changeZone(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.util.HashMap getLiveUserDetailsByUserID(int in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int createUserByPin(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in6) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int renewUserByPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, boolean in6, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in7) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.util.HashMap getUserTypeList() throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.util.HashMap getLiveUserDetailsByUserName(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int forgetPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.lang.String validatePhoneno(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public java.lang.String validateSecurityCode(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int activateWalkinPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int createUserForMobile(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
    public int changePackageForMobile(java.lang.String in0, java.lang.String in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException;
}