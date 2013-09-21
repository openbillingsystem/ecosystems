package repository;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "b_prepare_request")
public class PrepareRequest  {
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "status")
	private String status;

	@Column(name = "request_type")
	private String requestType;

	
	

	@Column(name = "is_provisioning")
	private char isProvisioning;
	
	@Column(name = "provisioning_sys")
	private String provisioningSystem;
	
	
	 public  PrepareRequest() {
		// TODO Auto-generated constructor stub
	}


	public PrepareRequest(Long clientId, Long orderId, String requstStatus,	String provisioningSystem, char isProvisioning, String generateRequest) {
		this.clientId=clientId;
		this.orderId=orderId;
		this.status="ACTIVE";
		this.isProvisioning=provisioningSystem.equalsIgnoreCase("NONE")?'Y':'N';
		this.requestType=requstStatus;
		//this.generateRequest=generateRequest;
		this.provisioningSystem=provisioningSystem;
		
		
              
	}



	public Long getClientId() {
		return clientId;
	}


	public Long getOrderId() {
		return orderId;
	}


	public String getStatus() {
		return status;
	}


	public String getRequestType() {
		return requestType;
	}




	public char getIsProvisioning() {
		return isProvisioning;
	}


	public void updateProvisioning() {
		this.isProvisioning='Y';
		
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}





	public void setIsProvisioning(char isProvisioning) {
		this.isProvisioning = isProvisioning;
	}


	public void setProvisioningSystem(String provisioningSystem) {
		this.provisioningSystem = provisioningSystem;
	}
	
	

		
	 
	 
			
	}
 
	
	
