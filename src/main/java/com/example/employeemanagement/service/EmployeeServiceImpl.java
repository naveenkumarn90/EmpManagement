package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		// TODO Auto-generated method stub
		repository.saveOrUpdate(emp);
		
	}

	@Override
	public void deleteById(int empId) {
		// TODO Auto-generated method stub
		repository.deleteById(empId);
		
	}
	
	
}