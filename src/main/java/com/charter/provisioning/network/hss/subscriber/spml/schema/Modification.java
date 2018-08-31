package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Modification {

	private Match match;
	
    private String name;
    
    private String operation;
    
    private String scope;
    
    private ValueObject valueObject;
}
