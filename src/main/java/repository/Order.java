package repository;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "b_orders")
public class Order extends AbstractPersistable<Long> {

	/*@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;*/

	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "plan_id")
	private Long planId;

	@Column(name = "order_status")
	private Long status;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "billing_frequency")
	private String billingFrequency;

	@Column(name = "next_billable_day")
	private Date nextBillableDay;

	@Column(name = "start_date")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "contract_period")
	private Long contarctPeriod;

	@Column(name = "is_deleted")
	private char isDeleted;

	@Column(name = "billing_align")
	private char billingAlign;
	
	@Column(name ="disconnect_reason")
	private String disconnectReason;


	 public Order() {
		// TODO Auto-generated constructor stub
			
	}


	public void setStatus(Long statusId) {
		this.status=statusId;
		
	}
 
	
	

}
