package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms23DoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms23DoctorServiceApplication.class, args);
	}

}
