package com.example.employeemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/empList")
	public List<Employee> findAll() {
		return empService.findAll();
	}

	@GetMapping("/emp/{empId}")
	public Employee findById(@PathVariable Integer empId) throws Exception {
		Employee e = empService.findById(empId);

		if (e == null)
			throw new Exception("Emp ID : " + empId + " details not available in Repository..");

		return e;
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		emp.setEmpno(0);
		empService.saveOrUpdate(emp);

		return "Employee details added successfully!!!";
	}

	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee emp) throws Exception {
	
		
		empService.saveOrUpdate(emp);
		
		return "Employee ID : "+ emp.getEmpno() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("emp/{id}")
	public String deleteById(@PathVariable int id) {
		empService.deleteById(id);
		return "Employee ID : " + id +"details  deleted !!!";
	}
}


