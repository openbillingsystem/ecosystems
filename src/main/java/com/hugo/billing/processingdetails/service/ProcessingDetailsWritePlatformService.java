package com.hugo.billing.processingdetails.service;

import com.hugo.billing.ProcessingDetailsData;
import com.hugo.billing.data.TenantIntegrationData;

public interface ProcessingDetailsWritePlatformService {

	void processingRequestDetails(TenantIntegrationData integrationData,
			ProcessingDetailsData data);

}
