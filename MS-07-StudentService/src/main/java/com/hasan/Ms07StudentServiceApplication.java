package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ms07StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms07StudentServiceApplication.class, args);
	}

}
