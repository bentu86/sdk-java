package com.huawei.openstack4j.openstack.vpc.v2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.vpc.v2.contants.PublicIpStatus;
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("publicip")
public class VirtualPublicIp implements ModelEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6776710501544914385L;
	/**
	 * 
	 * 
	 * {
			"publicip": {
				"id": "f588ccfa-8750-4d7c-bf5d-2ede24414706",
				"status": "PENDING_CREATE",
				"type": "5_bgp",
				"public_ip_address": "161.17.101.7",
				"tenant_id": "8b7e35ad379141fc9df3e178bd64f55c",
				"create_time": "2015-07-16 04:10:52",
				"bandwidth_size": 0
			}
		}
	 */
	@JsonProperty("id")
	private String id;
	@JsonProperty("status")
	private PublicIpStatus status;
	@JsonProperty("type")
	private String type;
	@JsonProperty("public_ip_address")
	private String publicIpAddress;
	@JsonProperty("tenant_id")
	private String tenantId;
	@JsonProperty("create_time")
	private String createTime;
	@JsonProperty("bandwidth_size")
	private Integer bandwidthSize;
	
}
