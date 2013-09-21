package com.hugo.billing;

public class ProcessingDetailsData {
	
	private final Long id;
	private final String userName;
	private final String planName;
	private final Long prepareReqId;
	private String requestType;

	public ProcessingDetailsData(Long id, String userName, String planName, Long prepareReqId, String requestType) {
          this.id=id;
          this.prepareReqId=prepareReqId;
          this.userName=userName;
          this.planName=planName;
          this.requestType=requestType;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPlanName() {
		return planName;
	}

	public Long getPrepareReqId() {
		return prepareReqId;
	}

	public String getRequestType() {
		return requestType;
	}
	
	

}
