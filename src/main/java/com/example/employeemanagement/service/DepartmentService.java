package com.example.employeemanagement.service;

import java.util.List;


import com.example.employeemanagement.entity.Department;

public interface DepartmentService {
	public List<Department> findAll();
	public Department findById(int id);
	public void saveOrUpdate(Department dept);
	public void deleteById(int deptId);

}
