package com.charter.provisioning.network.hss.subscriber.spml;

import com.charter.provisioning.network.hss.subscriber.spml.schema.Subscriber;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class SearchResponse extends SpmlResponse {
    
	@Builder
	public SearchResponse(String executionTime, String language, String objectclass, String identifier, Subscriber subscriber,
			String requestID, String result, String searchStatus, String version, String errorMessage) {
		super(executionTime, language, objectclass, identifier, subscriber, requestID, result, searchStatus, version,
				errorMessage);
	}
	
	private String executionTime;
	
    private String language;
    
    private Subscriber subscriber;
    
    private String requestID;
    
    private String result;
    
    private String searchStatus;
    
    private String version;

}
