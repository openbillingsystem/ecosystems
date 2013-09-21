package com.hugo.billing.processingdetails.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.hugo.billing.JdbcDataSourcePerTenantService;
import com.hugo.billing.JdbcTenantDetailsService;
import com.hugo.billing.MifosPlatformTenant;
import com.hugo.billing.ProcessingDetailsData;
import com.hugo.billing.ThreadLocalContextUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Service
public class ProcessingDetailsReadPlatformServiceImpl implements ProcessingDetailsReadPlatformService{
	
	
private final JdbcTemplate jdbcTemplate;
private  final ComboPooledDataSource dataSource;
private final JdbcTenantDetailsService detailsService; 
private final JdbcDataSourcePerTenantService dataSourcePerTenantService;  
	
	@Autowired
	public ProcessingDetailsReadPlatformServiceImpl(final JdbcTemplate jdbcTemplate,
			final JdbcTenantDetailsService tenantDetailsService,final ComboPooledDataSource dataSource,
			final JdbcDataSourcePerTenantService dataSourcePerTenantService){
		
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		this.dataSource=dataSource;
		this.detailsService=tenantDetailsService;
		this.dataSourcePerTenantService=dataSourcePerTenantService;
		
	}

	@Override
	public List<ProcessingDetailsData> getTheProcessingDetails() {
		
		final MifosPlatformTenant tenant = this.detailsService.loadTenantById("default"); 
		ThreadLocalContextUtil.setTenant(tenant);
	//	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourcePerTenantService.retrieveTenantAwareDataSource());
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mifostenant-default");
		//jdbcTemplate.setDataSource(tenantDataSource);
		
		ServicesMapper mapper = new ServicesMapper();
		String sql = "select " + mapper.schema();
         
		List<ProcessingDetailsData> detailsDatas= jdbcTemplate.query(sql, mapper, new Object[] {});
		
		return detailsDatas;
	}

	protected static final class ServicesMapper implements RowMapper<ProcessingDetailsData> {

		@Override
		public ProcessingDetailsData mapRow(final ResultSet rs, @SuppressWarnings("unused") final int rowNum)
				throws SQLException {
			Long id=rs.getLong("id");
			String userName = rs.getString("userName");
			String planName=rs.getString("planName");
			Long prepareReqId=rs.getLong("prepareRequestId");
			String requestType=rs.getString("requestType");
      
			
          return new ProcessingDetailsData(id,userName,planName,prepareReqId,requestType);

		}
		public String schema() {
			return " p.id AS id, p.user_name AS userName, pr.service_class as planName,p.prepareRequest_id as prepareRequestId, p.request_type AS requestType " +
					"FROM b_process_request p,b_process_request_detail pr WHERE p.id=pr.processrequest_id  and p.provisioing_system = '24Online'" +
					"AND p.is_processed = 'N'";
		}

}


}
