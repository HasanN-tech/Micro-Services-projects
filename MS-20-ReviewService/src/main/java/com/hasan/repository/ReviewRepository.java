package com.hasan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasan.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
