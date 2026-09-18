package com.hasan.client;

import java.util.List;

import com.hasan.DTO.ReviewDTO;

public class ClientFallback implements ReviewClient {

	private static final String MESSAGE = "Review Service is currently unavailable. " + "Please try again later.";

	@Override
	public String create(ReviewDTO r) {
		throw new RuntimeException(MESSAGE);
	}

	@Override
	public ReviewDTO getById(int id) {
		throw new RuntimeException(MESSAGE);
	}

	@Override
	public List<ReviewDTO> getAll() {
		throw new RuntimeException(MESSAGE);
	}

	@Override
	public String update(int id, ReviewDTO r) {
		throw new RuntimeException(MESSAGE);
	}

	@Override
	public String delete(int id) {
		throw new RuntimeException(MESSAGE);
	}

}
