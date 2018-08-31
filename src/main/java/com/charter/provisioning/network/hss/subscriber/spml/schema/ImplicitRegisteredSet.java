package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImplicitRegisteredSet {

	private String irsId;
	
	private String authenticationPending;
	
    private String registrationStatus;
}
