package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Ms17PaymentServiceMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms17PaymentServiceMonitoringApplication.class, args);
	}

}
