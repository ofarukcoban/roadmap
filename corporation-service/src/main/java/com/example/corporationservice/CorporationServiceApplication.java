package com.example.corporationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CorporationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorporationServiceApplication.class, args);
	}

}
