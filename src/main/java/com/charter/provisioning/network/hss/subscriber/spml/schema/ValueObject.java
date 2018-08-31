package com.charter.provisioning.network.hss.subscriber.spml.schema;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValueObject {

	private String originalPublicUserId;
	private String defaultIndication;
	private String barringIndication;
    private String serviceProfileName;
    private String profileName;
    private String irsId;
    private List<GlobalFilterId> globalFilterId;
    private String privateUserId;
    private String httpDigestKey;
    private String globalFilter;
    private SubscribedMediaProfileID subscribedMediaProfileID;
    private String xmlnsXSI;
    private String type;
}
