package com.charter.provisioning.network.hss.subscriber.spml.schema;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceProfile {

	private String profileName;
	private List<GlobalFilterId> globalFilterId;
    private SubscribedMediaProfileID subscribedMediaProfileID;
}
