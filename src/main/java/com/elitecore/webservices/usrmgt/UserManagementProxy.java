package com.elitecore.webservices.usrmgt;

public class UserManagementProxy implements com.elitecore.webservices.usrmgt.UserManagement {
  private String _endpoint = null;
  private com.elitecore.webservices.usrmgt.UserManagement userManagement = null;
  
  public UserManagementProxy() {
    _initUserManagementProxy();
  }
  
  public UserManagementProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserManagementProxy();
  }
  
  private void _initUserManagementProxy() {
    try {
      userManagement = (new com.elitecore.webservices.usrmgt.UserManagementServiceLocator()).getUserManagementService();
      if (userManagement != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userManagement)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userManagement != null)
      ((javax.xml.rpc.Stub)userManagement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.elitecore.webservices.usrmgt.UserManagement getUserManagement() {
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement;
  }
  
  public int login(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.login(in0);
  }
  
  public int login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.login(in0, in1, in2);
  }
  
  public int logout(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.logout(in0, in1);
  }
  
  public int createUser(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.createUser(in0, in1);
  }
  
  public int createUser(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.createUser(in0, in1);
  }
  
  public int topupUser(java.lang.String in0, java.lang.String[] in1, java.lang.String[] in2, double in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.topupUser(in0, in1, in2, in3, in4);
  }
  
  public int renewUser(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.renewUser(in0, in1, in2);
  }
  
  public int changePackage(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changePackage(in0, in1, in2);
  }
  
  public int changeBandwidthPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changeBandwidthPolicy(in0, in1, in2);
  }
  
  public int changeAccessTimePolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changeAccessTimePolicy(in0, in1, in2);
  }
  
  public int updateMacAddress(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.updateMacAddress(in0, in1, in2);
  }
  
  public int changeDataTransferPolicy(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changeDataTransferPolicy(in0, in1, in2);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UserObject getPersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getPersonalInfo(in0, in1);
  }
  
  public int disconnectLiveUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.disconnectLiveUsers(in0, in1);
  }
  
  public int deactivateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.deactivateUsers(in0, in1);
  }
  
  public int activateUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.activateUsers(in0, in1);
  }
  
  public int deleteUsers(java.lang.String[] in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.deleteUsers(in0, in1);
  }
  
  public int resetMac(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.resetMac(in0, in1);
  }
  
  public int updateBindToMac(java.lang.String in0, boolean in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.updateBindToMac(in0, in1, in2);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getUserSurfingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, int in3, boolean in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getUserSurfingDetails(in0, in1, in2, in3, in4, in5);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.ResourceObject[] getResourceInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getResourceInfo(in0, in1);
  }
  
  public int updatePersonalInfo(java.lang.String in0, com.elitecore.webservices.corporate.containers.usermgt.UserDetailObject in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.updatePersonalInfo(in0, in1, in2);
  }
  
  public int changePassword(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changePassword(in0, in1, in2);
  }
  
  public int changeLoginRestriction(java.lang.String in0, int in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changeLoginRestriction(in0, in1, in2, in3);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getActiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getActiveUsers(in0);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] getDeactiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getDeactiveUsers(in0);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UserObject[] searchUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.searchUsers(in0, in1);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] getLiveUsers(com.elitecore.webservices.corporate.containers.common.AuthenticationObject in0) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getLiveUsers(in0);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.LiveUserObject[] searchLiveUsers(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.searchLiveUsers(in0, in1);
  }
  
  public java.lang.String getUserPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getUserPassword(in0, in1);
  }
  
  public com.elitecore.webservices.corporate.containers.usermgt.UsageDetailObject[] getSystemSurfingDetails(java.util.Calendar in0, java.util.Calendar in1, int in2, boolean in3, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in4) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getSystemSurfingDetails(in0, in1, in2, in3, in4);
  }
  
  public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getUserBillingDetails(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getUserBillingDetails(in0, in1, in2, in3);
  }
  
  public com.elitecore.webservices.corporate.containers.common.InvoiceObject[] getSystemBillingDetails(java.util.Calendar in0, java.util.Calendar in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getSystemBillingDetails(in0, in1, in2);
  }
  
  public int changeZone(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changeZone(in0, in1, in2);
  }
  
  public java.util.HashMap getLiveUserDetailsByUserID(int in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getLiveUserDetailsByUserID(in0, in1);
  }
  
  public int createUserByPin(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in6) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.createUserByPin(in0, in1, in2, in3, in4, in5, in6);
  }
  
  public int renewUserByPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String[] in4, java.lang.String[] in5, boolean in6, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in7) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.renewUserByPin(in0, in1, in2, in3, in4, in5, in6, in7);
  }
  
  public java.util.HashMap getUserTypeList() throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getUserTypeList();
  }
  
  public java.util.HashMap getLiveUserDetailsByUserName(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.getLiveUserDetailsByUserName(in0, in1);
  }
  
  public int forgetPassword(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.forgetPassword(in0, in1);
  }
  
  public java.lang.String validatePhoneno(java.lang.String in0, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in1) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.validatePhoneno(in0, in1);
  }
  
  public java.lang.String validateSecurityCode(java.lang.String in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.validateSecurityCode(in0, in1, in2);
  }
  
  public int activateWalkinPin(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in5) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.activateWalkinPin(in0, in1, in2, in3, in4, in5);
  }
  
  public int createUserForMobile(com.elitecore.webservices.corporate.containers.usermgt.UserObject in0, java.lang.String in1, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in2) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.DuplicateDataException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.createUserForMobile(in0, in1, in2);
  }
  
  public int changePackageForMobile(java.lang.String in0, java.lang.String in1, java.lang.String in2, com.elitecore.webservices.corporate.containers.common.AuthenticationObject in3) throws java.rmi.RemoteException, com.elitecore.webservices.corporate.exception.OperationalException, com.elitecore.webservices.corporate.exception.InvalidDataException, com.elitecore.webservices.corporate.exception.AuthorizationException, com.elitecore.webservices.corporate.exception.InsufficientDataException, com.elitecore.webservices.corporate.exception.AuthenticationException{
    if (userManagement == null)
      _initUserManagementProxy();
    return userManagement.changePackageForMobile(in0, in1, in2, in3);
  }
  
  
}