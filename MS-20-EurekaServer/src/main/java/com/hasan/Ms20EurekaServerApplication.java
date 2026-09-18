package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms20EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms20EurekaServerApplication.class, args);
	}

}
