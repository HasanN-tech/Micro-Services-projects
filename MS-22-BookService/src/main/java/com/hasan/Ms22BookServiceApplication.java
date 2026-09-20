package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms22BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms22BookServiceApplication.class, args);
	}

}
