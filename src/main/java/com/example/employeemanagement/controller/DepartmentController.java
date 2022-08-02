package com.example.employeemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.entity.Department;
import com.example.employeemanagement.service.DepartmentService;

@RestController
@RequestMapping("/department")

public class DepartmentController{
@Autowired
private DepartmentService deptService;

@GetMapping("/deptList")
public List<Department> findAll() {
	return deptService.findAll();
}

@GetMapping("/dept/{deptId}")
public Department findById(@PathVariable Integer deptId) throws Exception {
	Department d = deptService.findById(deptId);

	if (d == null)
		throw new Exception("Emp ID : " + deptId + " details not available in Repository..");

	return d;
}

@PostMapping("/saveDepartment")
public String saveDepartment(@RequestBody Department dept) {
	dept.setDeptno(0);
	deptService.saveOrUpdate(dept);

	return "Department details added successfully!!!";
}

@PutMapping("/updateDepartment")
public String updateDepartment(@RequestBody Department dept) throws Exception {

	
	deptService.saveOrUpdate(dept);
	
	return "Department ID : "+ dept.getDeptno() + " Details updated Succesfully !!"; 
}

@DeleteMapping("dept/{id}")
public String deleteById(@PathVariable int id) {
	deptService.deleteById(id);
	return "Department ID : " + id +"details  deleted !!!";
}
}


 
	