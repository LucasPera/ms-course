package com.estudo.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	//singleton de instancia unica para injetar o rest template em outros serviços 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
