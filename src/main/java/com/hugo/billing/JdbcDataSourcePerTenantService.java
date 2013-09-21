/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.hugo.billing;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Implementation that returns a new or existing tomcat 7 jdbc connection pool
 * datasource based on the tenant details stored in a {@link ThreadLocal}
 * variable for this request.
 * 
 * {@link ThreadLocalContextUtil} is used to retrieve the
 * {@link MifosPlatformTenant} for the request.
 */
@Service
public class JdbcDataSourcePerTenantService  {

	
    private final Map<Long, ComboPooledDataSource> tenantToDataSourceMap = new ConcurrentHashMap<Long, ComboPooledDataSource>(2);
   // private final DataSource tenantDataSource;
    
    private final ComboPooledDataSource tenantDataSource;
    @Autowired
    public JdbcDataSourcePerTenantService(ComboPooledDataSource tenantDataSource) {
        this.tenantDataSource = tenantDataSource;
    }

  
    public DataSource retrieveTenantAwareDataSource() {

        // default to tenant database datasource
        ComboPooledDataSource tenantDataSource = this.tenantDataSource;

        MifosPlatformTenant tenant = ThreadLocalContextUtil.getTenant();
        if (tenant != null) {
            // if tenant information available switch to appropriate datasource
            // for that tenant.
        	  this.tenantToDataSourceMap.put(tenant.getId(), tenantDataSource);
                tenantDataSource = this.tenantToDataSourceMap.get(tenant.getId());
          
               
              
          
        }

        return tenantDataSource;
    }

   
}