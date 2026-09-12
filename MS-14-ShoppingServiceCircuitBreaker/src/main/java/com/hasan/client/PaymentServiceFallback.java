package com.hasan.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallback implements ShoppingClient{

	 @Override
	    public ResponseEntity<String> pay() {
	        return new ResponseEntity<>("Payment Service is currently unavailable. This is the fallback response.",HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
	    }

}
