package com.hugo.billing.processingdetails.service;

import java.util.logging.FileHandler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.Order;
import repository.OrderRepository;
import repository.PrepareRequest;
import repository.PrepareRequsetRepository;
import repository.ProcessRequest;
import repository.ProcessRequestRepository;

import com.elitecore.webservices.corporate.containers.common.AuthenticationObject;
import com.elitecore.webservices.corporate.containers.usermgt.UserObject;
import com.elitecore.webservices.usrmgt.UserManagement;
import com.hugo.billing.ProcessingDetailsData;
import com.hugo.billing.data.ConnectToService;
import com.hugo.billing.data.Constants;
import com.hugo.billing.data.TenantIntegrationData;


@Service
public class ProcessingDetailsWritePlatformServiceImpl implements ProcessingDetailsWritePlatformService{
	

	private static final Logger log = Logger.getLogger(ProcessingDetailsWritePlatformServiceImpl.class);
	
	private final PrepareRequsetRepository prepareRequsetRepository; 
	private final ProcessRequestRepository processRequestRepository;
	private final OrderRepository orderRepository;

	
	@Autowired
	public ProcessingDetailsWritePlatformServiceImpl(OrderRepository orderRepository,PrepareRequsetRepository prepareRequsetRepository,
			ProcessRequestRepository processRequestRepository){
		
		this.prepareRequsetRepository=prepareRequsetRepository;
		this.processRequestRepository=processRequestRepository;
		this.orderRepository=orderRepository;
		
	}

	@Override
	public void processingRequestDetails(TenantIntegrationData integrationData,
			ProcessingDetailsData data) {
		
		try {
			FileHandler   fh = new FileHandler("C:/MyLogFile.log");  
		
		//Connect To 24Online
			log.debug("Connect to 24Online Server");
		ConnectToService connectToService=new ConnectToService();
			UserManagement userManagement;
			
				userManagement = connectToService.ConnectToWebService(integrationData.getUrl(),10080);
			
		//Create Authantication Object
				log.debug("creating a authantication Object");
		AuthenticationObject authenticationObject=new AuthenticationObject();
		authenticationObject.setIPAddress(integrationData.getIpAddr());
		authenticationObject.setUserName(integrationData.getUserName());
		authenticationObject.setPassword(integrationData.getUserPassword());
		PrepareRequest prepareRequest=this.prepareRequsetRepository.findOne(data.getPrepareReqId());
		
		//For User Creation
		if(data.getRequestType().equalsIgnoreCase(Constants.connect)){
      	
			
			int result=0;
			UserObject userObject=new UserObject("10.4.4.05","","Y","hyd-1","AP","",false,
                  null , "", "",data.getUserName(), "", "", false, 101,"","",
                     data.getPlanName(),"hugoadmin3","","10.10.101.2", "",data.getUserName(),
                     3, 1,"","CITY BROADBAND",3l, null);
			try{
				log.debug("creating a User");
			result=userManagement.createUser(userObject,authenticationObject);
			}catch(Exception exception){
				log.error("error occured while creating user"+exception.getMessage());
				
			}

          if(result >0){ 
	         log.debug("User created Successfully");
	           ProcessRequest processRequest=this.processRequestRepository.findOne(data.getId());
	           processRequest.update();
	           this.processRequestRepository.saveAndFlush(processRequest);
	
        	//UPdate Order Details
	        Order order=this.orderRepository.findOne(processRequest.getOrderId());
	        order.setStatus(new Long(1));
	        this.orderRepository.saveAndFlush(order);
	
       }else{
    	   log.debug("Unable to create User");
       }

       //For Disconnect
        }else if(data.getRequestType().equalsIgnoreCase(Constants.disconnect)){
			
	        String[] users={data.getUserName()};
	        log.debug("deactivation for"+users.toString());
			int result =userManagement.deactivateUsers(users,authenticationObject);
			if(result > 0){
				log.info("User deactivated Successfully");

				ProcessRequest processRequest=this.processRequestRepository.findOne(data.getId());
				processRequest.update();
				this.processRequestRepository.saveAndFlush(processRequest);
				//UPdate Order Details
				Order order=this.orderRepository.findOne(processRequest.getOrderId());
				order.setStatus(new Long(3));
				this.orderRepository.saveAndFlush(order);
			}
			
			   //For Reconnect
		}else if(data.getRequestType().equalsIgnoreCase(Constants.reconnect)){
			
	        String[] users={data.getUserName()};
	        log.debug("Activation for"+users.toString());
			int result =userManagement.activateUsers(users,authenticationObject);
			
			if(result > 0){
				log.info("User Activated Successfully");

				//Update ProcessRequest Details
				ProcessRequest processRequest=this.processRequestRepository.findOne(data.getId());
				processRequest.update();
				this.processRequestRepository.saveAndFlush(processRequest);
				
				//UPdate Order Details
				Order order=this.orderRepository.findOne(processRequest.getOrderId());
				order.setStatus(new Long(1));
				this.orderRepository.saveAndFlush(order);
			}
		}

		
		prepareRequest.setIsProvisioning('Y');
		prepareRequest.setStatus(Constants.active);
		this.prepareRequsetRepository.save(prepareRequest);
		

			} catch (Exception e) {
				log.equals("Error occured while processing the details "+e.getMessage());
				
			}
		
	}

}
