package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS-08-InventoryService")
public interface InventoryClient {

	@GetMapping("/inventory")
	ResponseEntity<String> invent();
}
