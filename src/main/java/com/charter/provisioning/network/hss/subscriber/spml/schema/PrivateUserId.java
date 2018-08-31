package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrivateUserId {

	private String privateUserId;
	
    private String httpDigestKey;
    
    private String httpDigestKeyVersion;
    
    private String preferredAuthenticationScheme;
    
    private String preferredDomain;
}
