package com.spring.cloud.client.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationProperties {
	
	@Autowired Environment environment;
	
	public String getEnableFlag() {
		return environment.getProperty("enableFlag");
	}
	
	public String getApplicationName() {
		return environment.getProperty("name");
	}
	
	public String getConsumerApplicationNumber() {
		return environment.getProperty("consumerAppNumber");
	}
	
	public String getProductAddFlag() {
		return environment.getProperty("productAddFlag");
	}

}
