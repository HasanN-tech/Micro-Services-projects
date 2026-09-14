package com.hasan.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class NotificationService {

	@CircuitBreaker(name="notification",fallbackMethod = "fallback")
	public String msg() {
//		throw new RuntimeException("Fallback method.");
		int x=10/0;
		return "You have a notification"+x;
	}
	
	public String fallback(Exception ex) {
	    System.out.println("========== FALLBACK CALLED ==========");
	    return "FALLBACK WORKED: " + ex.getMessage();
	}
}
