package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subscriber {

	private String identifier;
	private String type;
	private Hss hss;
	private String xsi;
}
