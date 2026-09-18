package com.hasan.DTO;

import lombok.Data;

@Data
public class ReviewDTO {

	private Integer id;

	private String reviewerName;

	private String productName;

	private Double rating;

	private String comment;

}
