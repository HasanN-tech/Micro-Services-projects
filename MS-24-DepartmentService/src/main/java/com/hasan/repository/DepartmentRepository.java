package com.hasan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hasan.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
