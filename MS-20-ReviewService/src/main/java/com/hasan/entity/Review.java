package com.hasan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

	@Id
	@SequenceGenerator(name = "review_seq", sequenceName = "review_seq", allocationSize = 1, initialValue = 100)
	@GeneratedValue(generator = "review_seq", strategy = GenerationType.SEQUENCE)
	private Integer id;

	@NonNull
	private String reviewerName;

	@NonNull
	private String productName;

	@NonNull
	private Double rating;

	@NonNull
	private String comment;

}
