package com.charter.provisioning.network.hss.subscriber.spml;

import com.charter.provisioning.network.hss.subscriber.spml.schema.Base;
import com.charter.provisioning.network.hss.subscriber.spml.schema.Filter;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class SearchRequest extends SpmlRequest {
   
	private String xsi;
	
    private String version; 
    
	private String language;
	
	private Base base;
	
    private Filter filter;

}
