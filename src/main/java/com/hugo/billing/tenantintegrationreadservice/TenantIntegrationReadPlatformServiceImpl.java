package com.hugo.billing.tenantintegrationreadservice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.hugo.billing.data.TenantIntegrationData;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Service
public class TenantIntegrationReadPlatformServiceImpl implements TenantIntegrationReadPlatformService{
	private static final Logger logger = Logger.getLogger(TenantIntegrationReadPlatformServiceImpl.class);
	private final JdbcTemplate jdbcTemplate;
	private final ComboPooledDataSource dataSource;
	
	@Autowired
	public TenantIntegrationReadPlatformServiceImpl(final JdbcTemplate jdbcTemplate,final ComboPooledDataSource dataSource){
		
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		
	}
	
	
	
	
	
	
	@Override
	public TenantIntegrationData getTheIntegrationServiceDetails() {

		try{
		logger.info("Retrieve the Integration Details");
	//	dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mifosplatform-tenants");
		ServicesMapper mapper = new ServicesMapper();
		String sql = "select " + mapper.schema();

		return jdbcTemplate.queryForObject(sql, mapper, new Object[] {});
		}catch(EmptyResultDataAccessException accessException){
			logger.debug("Integration Details are  not available"+accessException.getMessage());
			return null;
		}
		

	}

	protected static final class ServicesMapper implements RowMapper<TenantIntegrationData> {

		@Override
		public TenantIntegrationData mapRow(final ResultSet rs, @SuppressWarnings("unused") final int rowNum)
				throws SQLException {
			Long id=rs.getLong("id");
			Long tenantId=rs.getLong("tenantId");
			String provisioningSystem = rs.getString("provisioningSystem");
			String ipaAddr=rs.getString("ipaAddr");
			String url=rs.getString("url");
			String portNum=rs.getString("portNum");
			String userName=rs.getString("userName");
			String userPassword=rs.getString("userPassword");
			String status=rs.getString("status");
      
			
          return new TenantIntegrationData(id,tenantId,provisioningSystem,ipaAddr,url,portNum,userName,userPassword,status);

		}
		public String schema() {
			return " t.id AS id,t.tenant_id AS tenantId,t.provisioning_system AS provisioningSystem,t.target_ip AS ipaAddr," +
				   " t.target_url AS url,t.target_port AS portNum,t.target_username AS userName,t.target_password AS userPassword,"+
				   " t.status AS status FROM tenant_integrations t  where t.status='Active'";
		}

}


}
