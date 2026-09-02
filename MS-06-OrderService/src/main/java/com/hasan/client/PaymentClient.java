package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS-06-PaymentService")
public interface PaymentClient {
	
	@GetMapping("/payment")
	ResponseEntity<String> pay();
}
