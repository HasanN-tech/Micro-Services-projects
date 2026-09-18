package com.hasan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.entity.Review;
import com.hasan.exception.ReviewNotFoundException;
import com.hasan.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository repo;

	@Override
	public Review addReview(Review r) {
		return repo.save(r);
	}

	@Override
	public List<Review> getAll() {
		return repo.findAll();
	}

	@Override
	public Review getById(int id) {
		return repo.findById(id).orElseThrow(() -> new ReviewNotFoundException(id));
	}

	@Override
	public String update(int id, Review r) {
		Review review = getById(id);
		review.setProductName(r.getProductName());
		review.setReviewerName(r.getReviewerName());
		review.setRating(r.getRating());
		review.setComment(r.getComment());

		return repo.save(review).toString();
	}

	@Override
	public String delete(int id) {
		Review r = getById(id);
		repo.delete(r);
		return "Record deleted successfully by id: " + id;
	}

}
