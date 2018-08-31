package com.charter.provisioning.network.hss.subscriber.spml.schema;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Alias
{
 	private String name;
    private String xsiType;
    private String value;
}
