package com.charter.provisioning.network.hss.subscriber.spml;

import com.charter.provisioning.network.hss.subscriber.spml.schema.Subscriber;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class AddRequest extends SpmlRequest {

	private String version;
	
	private String language;
	
	private String subscriber;
	
	private Subscriber object;
	
    private String newGenerated;
    
    private String returnResultingObject;
}
