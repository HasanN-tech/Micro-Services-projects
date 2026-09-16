package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MS-17-PaymentServiceMonitoring")
public interface NotificationClient {

	@GetMapping("/payment")
	public String payment();
}
