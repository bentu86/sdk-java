/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.model.gbp;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Direction enum
 * 
 * @author vinod borole
 */
public enum Direction { 
    IN,
    OUT,
    BI,
    UNRECOGNIZED;
    
    @JsonCreator
    public static Direction forValue(String value) {
        if (value != null)
        {
            for (Direction s : Direction.values()) {
                if (s.name().equalsIgnoreCase(value))
                    return s;
            }
        }
        return Direction.UNRECOGNIZED;
    }
    @JsonValue
    public String value() {
        return name().toLowerCase();
    }
}
