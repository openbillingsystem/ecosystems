package repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "b_process_request_detail")
public class ProcessRequestDetails extends AbstractPersistable<Long>  {


    @ManyToOne
    @JoinColumn(name="processrequest_id")
	private ProcessRequest processRequest;

	@Column(name = "orderlinbe_id")
	private Long orderlinId;

	@Column(name = "service_id")
	private Long serviceId;

	@Column(name = "sent_message")
	private String sentMessage;
	
	@Column(name = "receive_message")
	private String receiveMessage;
	
	@Column(name = "is_deleted")
	private char isDeleted;
	
	@Column(name = "hardware_id")
	private String hardwareId;

	@Column(name = "service_class")
	private String serviceClass;
	
		@Column(name = "sent_date")
	private Date sentDate;

	@Column(name = "received_date")
	private Date receivedDate;
	
	@Column(name = "start_date")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;

	public ProcessRequestDetails(){
		
	}
	

	public ProcessRequestDetails(Long orderlinId, Long serviceId, String sentMessage,
			String recievedMessage,String serviceClass,String hardwareId,Date startDate,
			Date endDate,Date sentDate,Date recievedDate,char isDeleted) {
         
	          this.orderlinId=orderlinId;
	          this.serviceId=serviceId;
	          this.sentMessage=sentMessage;
	          this.receiveMessage=recievedMessage;
	          this.isDeleted=isDeleted;
	          this.serviceClass=serviceClass;
	          this.hardwareId=hardwareId;
	          this.startDate=startDate;
	          this.endDate=endDate;
	          this.sentDate=sentDate;
	          this.receivedDate=recievedDate;
	
	}


	public void update(ProcessRequest processRequest) {
      
		this.processRequest=processRequest;
		
	}




}
