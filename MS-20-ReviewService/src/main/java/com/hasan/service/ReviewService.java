package com.hasan.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hasan.entity.Review;

@Component
public interface ReviewService {

	Review addReview(Review r);

	List<Review> getAll();

	Review getById(int id);

	String update(int id, Review r);

	String delete(int id);

}
