package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EqualityMatch {

	private String name;
    private String value;
}
