package com.hasan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hasan.entity.Department;

@Service
public interface DepartmentService {

	public Department add(Department d);

	public Department getById(int id);

	public List<Department> getAll();

	public Department update(int id, Department d);

	public String delete(int id);

}
