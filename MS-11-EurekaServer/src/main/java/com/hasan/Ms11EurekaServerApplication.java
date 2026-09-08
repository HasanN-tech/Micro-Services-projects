package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms11EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms11EurekaServerApplication.class, args);
	}

}
