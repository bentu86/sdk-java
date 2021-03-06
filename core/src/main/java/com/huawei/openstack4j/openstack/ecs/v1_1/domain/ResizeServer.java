package com.huawei.openstack4j.openstack.ecs.v1_1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 标记为云服务器变更规格操作。
 * @author 
 *
 */
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("resize")
public class ResizeServer {

	
	/**
	 * {
		    "resize": {
		        "flavorRef": "2",
		        "dedicated_host_id": "459a2b9d-804a-4745-ab19-a113bb1b4ddc",
		        "extendparam":{
		             "isAutoPay": "true"
		        }
		    }
		}
	 */
	/**
	 *  变更后的云服务器规格ID。
		已上线的规格请参见《弹性云服务器用户指南》的“类型和规格”章节。
		说明：
		变更后的规格（内存、CPU）不能小于变更前的规格。
		不支持变更至同一规格。
	 */
	@JsonProperty("flavorRef")
	private String flavorRef;
	
	/**
	 * 新专属主机ID（仅适用于专属主机上的弹性云服务器）
	 */
	@JsonProperty("dedicated_host_id")
	private String dedicatedHostId;
	
	/**
	 * 	变更云服务器扩展信息。
	 */
	@JsonProperty("extendParam")
	private ResizeExtendParam extendParam;
	
	
}
