package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS-11-MessageService")
public interface GetMsg {

	@GetMapping("/msg")
	public String msg();
}
