package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MS-14-PaymentServiceCircuitBreaker", fallback = OrderClientImpl.class)
public interface OrderClient {

	@GetMapping("/pay")
	public ResponseEntity<String> pay();
}
