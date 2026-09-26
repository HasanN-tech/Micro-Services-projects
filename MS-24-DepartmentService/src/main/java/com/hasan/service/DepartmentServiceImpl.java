package com.hasan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hasan.entity.Department;
import com.hasan.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository repo;
	
	@Override
	@CachePut(value="depts", key="#result.id")
	public Department add(Department d) {
		return repo.save(d);
	}

	@Override
	@Cacheable(value = "depts",key="#id")
	public Department getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Department> getAll() {
		return repo.findAll();
	}

	@Override
	@CachePut(value="depts", key="#id")
	public Department update(int id, Department d) {
		Department dept=getById(id);
		dept.setName(d.getName());
		dept.setLocation(d.getLocation());
		return add(dept);
	}

	@Override
	@CacheEvict(value = "depts",key="#id")
	public String delete(int id) {
		repo.deleteById(id);
		return "Department deleted with id: "+id;
	}


}
