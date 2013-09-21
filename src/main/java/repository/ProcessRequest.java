package repository;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "b_process_request")
public class ProcessRequest   {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "provisioing_system")
	private String provisioingSystem;

	@Column(name = "is_deleted")
	private char isDeleted;
	@Column(name = "is_processed")
	private char isProcessed;


	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "processRequest", orphanRemoval = true)
	private List<ProcessRequestDetails> processRequestDetails = new ArrayList<ProcessRequestDetails>();

	

	 public ProcessRequest() {
		// TODO Auto-generated constructor stub
			
	}



	public ProcessRequest(Long clientId, Long orderId, 
			 String provisioningSystem, char isDeleted,String userName) {
            this.clientId=clientId;
            this.orderId=orderId;
            this.provisioingSystem=provisioningSystem;
            this.isDeleted=isDeleted;
            this.userName="Obs_"+userName;
	
	
	}



	public void add(ProcessRequestDetails processRequestDetails) {
	     processRequestDetails.update(this);
	     this.processRequestDetails.add(processRequestDetails);
		
		
	}



	public void update() {
		this.isProcessed='Y';
		
		
	}



	public Long getId() {
		return id;
	}



	public Long getClientId() {
		return clientId;
	}



	public Long getOrderId() {
		return orderId;
	}



	public String getUserName() {
		return userName;
	}



	public String getProvisioingSystem() {
		return provisioingSystem;
	}



	public char getIsDeleted() {
		return isDeleted;
	}



	public char getIsProcessed() {
		return isProcessed;
	}



	public List<ProcessRequestDetails> getProcessRequestDetails() {
		return processRequestDetails;
	}
 
	

}
