package com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
	
	@LoadBalanced
	@Bean
	public RestTemplate getAllUser() {
		return new RestTemplate();
		
		
	}

}
