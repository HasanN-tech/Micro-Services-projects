package com.hasan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PrimeChecker {

	@Value("${server.port}")
	private int port;
	
	public String check(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) return "Not a Prime number: "+port;
		}
		return "Its a prime nummber."+ port;
	}
}
