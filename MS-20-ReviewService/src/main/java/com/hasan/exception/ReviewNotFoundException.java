package com.hasan.exception;

@SuppressWarnings("serial")
public class ReviewNotFoundException extends RuntimeException{

	public ReviewNotFoundException() {
		super();
	}
	
	public ReviewNotFoundException(int id) {
		super("Review not found with id: " + id);
	}
}
