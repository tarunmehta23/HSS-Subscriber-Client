package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublicUserId {

	private String originalPublicUserId;
	private String barringIndication;
    private String defaultIndication;
    private String serviceProfileName;
    private String irsId;
    private String publicUserId;
}
