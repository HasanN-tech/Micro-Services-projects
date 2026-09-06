package com.hasan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MS-10-PalindromeService")
public interface ClientService {

	@GetMapping("/check/{n}")
	String Palindrome(@PathVariable int n);
	
	@GetMapping("/arm/{n}")
	String Armstrong(@PathVariable int n);
}
