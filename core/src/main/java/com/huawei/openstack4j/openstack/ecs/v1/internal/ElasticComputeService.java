package com.huawei.openstack4j.openstack.ecs.v1.internal;

import com.huawei.openstack4j.api.Apis;
import com.huawei.openstack4j.common.RestService;

/**
 * Huawei ECS Service Entry Point
 *
 * @author QianBiao.NG
 */
public class ElasticComputeService extends BaseElasticComputeServices implements RestService {

	/**
	 * ECS compute Service 
	 * 
	 * @return SMN Topic Service instance
	 */
	public ServerService servers() {
		return Apis.get(ServerService.class);
	}

}
