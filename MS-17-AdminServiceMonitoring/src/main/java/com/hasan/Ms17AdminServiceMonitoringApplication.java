package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Ms17AdminServiceMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms17AdminServiceMonitoringApplication.class, args);
	}

}
