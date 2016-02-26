package org.openstack4j.api.identity;

import org.openstack4j.common.RestService;

/**
 * Identity v3 Service Operations API
 *
 */
public interface IdentityService extends RestService {

    /**
     * Domain Service API
     *
     * @return the domain service
     */
    DomainService domains();

    /**
     * Projects Service API
     *
     * @return the project service
     */
    ProjectService projects();

    /**
     * Users Service API
     *
     * @return the user service
     */
    UserService users();

    /**
     * Role Service API
     *
     * @return the role service
     */
    RoleService roles();

    /**
     * Group Service API
     *
     * @return the group service
     */
    GroupService groups();
    
    /**
     * Token Service API
     * 
     * @return the token service
     */
    TokenService tokens();

    /**
     * Policy Service API
     *
     * @return the policy service
     */
    PolicyService policies();

    /**
     * ServiceEndpoint Service API
     *
     * @return the service and endpoint service
     */
    ServiceEndpointService serviceEndpoints();

    /**
     * Region Service API
     *
     * @return the region service
     */
    RegionService regions();

}
