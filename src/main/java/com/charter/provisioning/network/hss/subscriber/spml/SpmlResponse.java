package com.charter.provisioning.network.hss.subscriber.spml;

import com.charter.provisioning.network.hss.subscriber.spml.schema.Subscriber;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SpmlResponse {

	private String executionTime;
    private String language;
    private String objectclass;
    private String identifier;
    private Subscriber subscriber;
    private String requestID;
    private String result;
    private String searchStatus;
    private String version;
    private String errorMessage;

}
