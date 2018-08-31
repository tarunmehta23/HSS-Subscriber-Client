package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Base {
	
    private String objectclass;
    private Alias alias;

}
