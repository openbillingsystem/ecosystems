package com.hugo.billing.data;

import java.net.URL;

import com.elitecore.webservices.corporate.exception.AuthenticationException;
import com.elitecore.webservices.usrmgt.UserManagement;
import com.elitecore.webservices.usrmgt.UserManagementServiceLocator;

public class ConnectToService {
	 public boolean connectExtSystem(String wsURL, int wsPort)
	    {
	        try
	        {
	           // logger = getLogWriter();
	            UserManagement OnlineWs = ConnectToWebService(wsURL, wsPort);
	            System.out.println(" [SYSTEM] 24Online Adapter Connected to 24Online server. \n");
	           // logger.printString(" [SYSTEM] Connected to 24Online server ", 1);
	            return true;
	        }
	        catch(Exception e)
	        {
	          //  logger.printString("[SYSTEM] 24Online Adapter failed to Connect 24Online server.", 4);
	            System.out.println(" Exception while Connecting to Server: " + e.getMessage());
	          //  logger.printString("TEST24OnlineAdapter:ConnectExtsystem: " + e.getMessage(), 4);
	            return false;
	        }
	    }

	    public UserManagement ConnectToWebService(String wsURL, int port)
	        throws Exception
	    {
	        try
	        {
	            UserManagement esws = null;
	            String serviceUrl = wsURL;
	            UserManagementServiceLocator wsLocator = new UserManagementServiceLocator();
	            URL location = new URL(serviceUrl);
	            esws = wsLocator.getUserManagementService(location);
	            if(esws == null){
	            	throw new AuthenticationException();
	            }
	            
	            System.out.println("connected");
	            return esws;
	        }
	        catch(AuthenticationException e)
	        {
	            System.out.println(e.getErrorMessage());
	            return null;
	            	
	        }
	    }
	
}
