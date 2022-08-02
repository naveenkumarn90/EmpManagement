package com.example.employeemanagement.repository;


import java.util.List;

import com.example.employeemanagement.entity.Employee;

public interface EmployeeRepository {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void saveOrUpdate(Employee emp);
	public void deleteById(int empId);

}
