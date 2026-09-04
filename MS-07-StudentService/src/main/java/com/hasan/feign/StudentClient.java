package com.hasan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS-07-NotificationService")
public interface StudentClient {

	@GetMapping("/notification")
	public ResponseEntity<String> notifies();
}
