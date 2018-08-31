package com.charter.provisioning.network.hss.subscriber.spml;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.CollectionUtils;

import com.charter.provisioning.network.hss.subscriber.spml.schema.Modification;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class ModifyRequest extends SpmlRequest {

	private String version;
	
	private String language;
	
	private String xsi;
	
	private String subscriber;
	
    private String objectclass;
    
	private String identifier;
	
    private String schemaLocation;
    
    private List<Modification> modification;
    
    private String returnResultingObject;
    
    public void addModification (Modification modification) {
    	
    	if (CollectionUtils.isEmpty(this.modification)) 
			this.modification = Stream.of(modification).collect(Collectors.toList());
		else
			this.modification.add(modification);
    }
    
}
