package com.charter.provisioning.network.hss.subscriber.spml;

import org.springframework.beans.factory.annotation.Value;

public class SpmlRequest {

	@Value("${SpmlRequest.ns2_rrefix}")
    public String NS2_RREFIX;
	
	@Value("${SpmlRequest.spml_prefix}")
    public String SPML_PREFIX;
	
	@Value("${SpmlRequest.spml_namespace}")
    public String SPML_NAMESPACE;
	
	@Value("${SpmlRequest.xsi_rrefix}")
    public String XSI_RREFIX;
	
	@Value("${SpmlRequest.xsi_namespace}")
    public String XSI_NAMESPACE;
	
	@Value("${SpmlRequest.default_subscriber_ns}")
    public String DEFAULT_SUBSCRIBER_NS;
	
	@Value("${SpmlRequest.subscriber_ns_tag}")
    public String SUBSCRIBER_NS_TAG;
	
	@Value("${SpmlRequest.subscriber_version_tag}")
    public String SUBSCRIBER_VERSION_TAG;
	
	@Value("${SpmlRequest.default_subscriber_version}")
    public String DEFAULT_SUBSCRIBER_VERSION;
    
	@Value("${SpmlRequest.object_class}")
    public String OBJECT_CLASS;
	
	@Value("${SpmlRequest.defalult_language}")
    public String DEFALULT_LANGUAGE;
	
	@Value("${SpmlRequest.public_identity_type}")
    public String PUBLIC_IDENTITY_TYPE;
	
	@Value("${SpmlRequest.private_identity_type}")
    public String PRIVATE_IDENTITY_TYPE;
	
	@Value("${SpmlRequest.new_generated}")
    public String NEW_GENERATED;
	
	@Value("${SpmlRequest.return_resulting_object}")
    public String RETURN_RESULTING_OBJECT;
	
	@Value("${SpmlRequest.subscriber_type}")
    public String SUBSCRIBER_TYPE;
	
	@Value("${SpmlRequest.subscriber_id_length}")
    public static int SUBSCRIBER_ID_LENGTH;
	
	@Value("${SpmlRequest.irs_suffix_length}")
    public static int IRS_SUFFIX_LENGTH;
	
	@Value("${SpmlRequest.delete_scope}")
    public String DELETE_SCOPE;
	
	@Value("${SpmlRequest.private_identity_search_name}")
    public String PRIVATE_IDENTITY_SEARCH_NAME;
	
	@Value("${SpmlRequest.public_identity_search_name}")
    public String PUBLIC_IDENTITY_SEARCH_NAME;
	
	@Value("${SpmlRequest.xsi_type}")
    public String XSI_TYPE;

}
