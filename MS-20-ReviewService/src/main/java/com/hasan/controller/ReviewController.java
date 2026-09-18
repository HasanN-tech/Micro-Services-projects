package com.hasan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.entity.Review;
import com.hasan.service.ReviewService;

@RestController
public class ReviewController {

	@Autowired
	private ReviewService service;

	@PostMapping("/add")
	public ResponseEntity<String> create(@RequestBody Review r) {
		return new ResponseEntity<>(service.addReview(r).toString(), HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Review> getById(@PathVariable int id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Review>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}

	@PatchMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Review r) {
		return new ResponseEntity<>(service.update(id, r), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}

}
