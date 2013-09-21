package com.hugo.billing.data;

public class TenantIntegrationData {
	
	private final Long id;
	private final Long tenantId;
	private final String provisioningSystem;
	private final String ipAddr;
	private final String url;
	private final String portNum;
	private final String userName;
	private final String userPassword;
	private final String status;
	

	public TenantIntegrationData(Long id, Long tenantId,
			String provisioningSystem, String ipaAddr, String url,
			String portNum, String userName, String userPassword, String status) {
		this.id=id;
		this.tenantId=tenantId;
		this.provisioningSystem=provisioningSystem;
		this.ipAddr=ipaAddr;
		this.url=url;
		this.portNum=portNum;
		this.userName=userName;
		this.userPassword=userPassword;
		this.status=status;
	}


	public Long getId() {
		return id;
	}


	public Long getTenantId() {
		return tenantId;
	}


	public String getProvisioningSystem() {
		return provisioningSystem;
	}


	public String getIpAddr() {
		return ipAddr;
	}


	public String getUrl() {
		return url;
	}


	public String getPortNum() {
		return portNum;
	}


	public String getUserName() {
		return userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public String getStatus() {
		return status;
	}
	

}
