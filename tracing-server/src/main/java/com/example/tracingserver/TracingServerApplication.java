package com.example.tracingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TracingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TracingServerApplication.class, args);
	}

}
