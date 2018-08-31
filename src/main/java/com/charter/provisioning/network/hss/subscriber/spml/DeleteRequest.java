package com.charter.provisioning.network.hss.subscriber.spml;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class DeleteRequest extends SpmlRequest {
    
	private String deleteScope;
	
	private String execution;
	
    private String language;
    
    private String returnResultingObject;
    
    private String version;	
    
    private String objectclass;
    
    private String identifier;

}
