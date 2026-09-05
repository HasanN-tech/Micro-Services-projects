package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MS-09-PrimeService")
public interface INumberService {
	@GetMapping("/check/{n}")
	String checkPrime(@PathVariable int n);
}
