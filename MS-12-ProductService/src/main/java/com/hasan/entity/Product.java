package com.hasan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="MS_Product")
public class Product {

	@Id
	@SequenceGenerator(name="pid",sequenceName = "pid",initialValue = 100, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid")
	private Integer id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String category;
	
	@NonNull
	private Double price;
	
	@NonNull
	private Integer quantity;
	
}
