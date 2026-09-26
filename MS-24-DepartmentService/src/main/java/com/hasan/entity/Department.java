package com.hasan.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "MS_dept")
public class Department implements Serializable{

	@Id
	@SequenceGenerator(name = "dept_seq", sequenceName = "dept_name", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "dept_seq",strategy = GenerationType.SEQUENCE)
	private Integer id;

	@NonNull
	private String name;

	@NonNull
	private String location;
}
