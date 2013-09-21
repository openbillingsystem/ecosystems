package com.hugo.billing;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.billing.data.TenantIntegrationData;
import com.hugo.billing.processingdetails.service.ProcessingDetailsReadPlatformService;
import com.hugo.billing.processingdetails.service.ProcessingDetailsWritePlatformService;
import com.hugo.billing.tenantintegrationreadservice.TenantIntegrationReadPlatformService;

@Service
public class ProcessRequestSheduledJob {
	
	private static final Logger logger = Logger.getLogger(ProcessRequestSheduledJob.class);
	private final TenantIntegrationReadPlatformService tenantIntegrationReadPlatformService;
	private final ProcessingDetailsReadPlatformService processingDetailsReadPlatformService;
	private final ProcessingDetailsWritePlatformService processingDetailsWritePlatformService;
	private  TenantIntegrationData integrationData;
	
	@Autowired
	public ProcessRequestSheduledJob(TenantIntegrationReadPlatformService integrationReadPlatformService,
			 ProcessingDetailsReadPlatformService processingDetailsReadPlatformService,			 
			 final ProcessingDetailsWritePlatformService processingDetailsWritePlatformService){
		
		this.tenantIntegrationReadPlatformService=integrationReadPlatformService;
		this.processingDetailsReadPlatformService=processingDetailsReadPlatformService;
		this.processingDetailsWritePlatformService=processingDetailsWritePlatformService;
	}
	

		
	

	public void execute() {
		try {
			logger.info("Job is started at"+new Date());
			  this.integrationData=this.tenantIntegrationReadPlatformService.getTheIntegrationServiceDetails();
			  
 		      List<ProcessingDetailsData>  detailsData=this.processingDetailsReadPlatformService.getTheProcessingDetails();
		          if(detailsData.size() == 0){
		        	  logger.debug("No Records are found for processing");
		          }
 		      
		    for(ProcessingDetailsData data:detailsData){
		  
			this.processingDetailsWritePlatformService.processingRequestDetails(integrationData,data); 
			
		 }
		    logger.info("Job is finished at"+new Date());
	} catch (Exception e) {
		logger.error("error occured while proccessing the details"+e.getMessage());
			//System.out.println(e.getMessage());
		
	}
}
}
