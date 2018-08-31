package com.charter.provisioning.network.hss.subscriber.spml.schema;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.CollectionUtils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hss {

	private String subscriptionId;
	
	private String profileType;
	
	private String adminBlocked;
	
	private String defaultScscfRequired;
	
	private String ccfPrimary;
	
	private String ccfSecondary;
	
	private String maximumPublicIds;
	
	private List<PrivateUserId> privateUserId;
	
	private List<ImplicitRegisteredSet> implicitRegisteredSet;
	
	private List<PublicUserId> publicUserId;
	
	private List<ServiceProfile> serviceProfile;
	
	public void addImplicitRegisteredSet( ImplicitRegisteredSet implicitRegisteredSet ) {
		
		if (CollectionUtils.isEmpty(this.implicitRegisteredSet)) 
			this.implicitRegisteredSet = Stream.of(implicitRegisteredSet).collect(Collectors.toList());
		else
			this.implicitRegisteredSet.add(implicitRegisteredSet);
	}
	
	public void addServiceProfile( ServiceProfile serviceProfile )
    {
		if (CollectionUtils.isEmpty(this.serviceProfile)) 
			this.serviceProfile = Stream.of(serviceProfile).collect(Collectors.toList());
		else
			this.serviceProfile.add(serviceProfile);
    }
	
	public void addPublicUserId( PublicUserId publicUserId )
    {
		if (CollectionUtils.isEmpty(this.publicUserId)) 
			this.publicUserId = Stream.of(publicUserId).collect(Collectors.toList());
		else
			this.publicUserId.add(publicUserId);
    }
	
}
