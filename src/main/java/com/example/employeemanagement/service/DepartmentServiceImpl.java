package com.example.employeemanagement.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentRepository repository;

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Department findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void saveOrUpdate(Department dept) {
		// TODO Auto-generated method stub
		repository.saveOrUpdate(dept);

		
	}

	@Override
	public void deleteById(int deptId) {
		// TODO Auto-generated method stub
		repository.deleteById(deptId);

		
	}

}
