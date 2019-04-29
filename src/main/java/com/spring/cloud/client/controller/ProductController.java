package com.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.client.configuration.ConfigurationProperties;

@RestController
public class ProductController {
	
	@Value("${productAddFlag:defualt}")
	private String profFlag;
	
	@Autowired
	private ConfigurationProperties configurationProperties;
	
	@GetMapping("/profile")
	public ConfigurationProperties getProfile() {
		return configurationProperties;
	}
	
	@GetMapping("/profile/flag")
	public String getFlag() {
		return profFlag;
	}

}
