package com.hasan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.DTO.ReviewDTO;
import com.hasan.client.ReviewClient;
import com.hasan.exception.ReviewNotFoundException;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ReviewClientService {

    @Autowired
    private ReviewClient client;

    @CircuitBreaker(name = "reviewService", fallbackMethod = "createFallback")
    public String create(ReviewDTO r) {
        return client.create(r).toString();
    }

    @CircuitBreaker(name = "reviewService", fallbackMethod = "getAllFallback")
    public List<ReviewDTO> getAll() {
        return client.getAll();
    }

    @CircuitBreaker(name = "reviewService", fallbackMethod = "getByIdFallback")
    public ReviewDTO getById(int id) {
        return client.getById(id);
    }

    @CircuitBreaker(name = "reviewService", fallbackMethod = "updateFallback")
    public String update(int id, ReviewDTO r) {
        return client.update(id, r);
    }

    @CircuitBreaker(name = "reviewService", fallbackMethod = "deleteFallback")
    public String delete(int id) {
        return client.delete(id);
    }


    private String createFallback(ReviewDTO r, Throwable throwable) {
        return "Review service is currently unavailable";
    }

    private List<ReviewDTO> getAllFallback(Throwable throwable) {
        return List.of();
    }

    private ReviewDTO getByIdFallback(int id, Throwable throwable) {
        throw new ReviewNotFoundException();
    }

    private String updateFallback(int id, ReviewDTO r, Throwable throwable) {
        return "Review service is currently unavailable";
    }

    private String deleteFallback(int id, Throwable throwable) {
        return "Review service is currently unavailable";
    }
}
