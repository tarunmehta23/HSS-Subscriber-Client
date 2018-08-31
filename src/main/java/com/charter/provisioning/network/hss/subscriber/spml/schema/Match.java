package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Match {

	private String originalPublicUserId;
    private String irsId;
    private String privateUserId;
    private String profileName;
    private String xmlnsXSI;
    private String type;
    private String globalFilterId;
}
