package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms05NotificationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms05NotificationClientApplication.class, args);
	}

}
