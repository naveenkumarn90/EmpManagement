package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void saveOrUpdate(Employee emp);
	public void deleteById(int empId);

}
