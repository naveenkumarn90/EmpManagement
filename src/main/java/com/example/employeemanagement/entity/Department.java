package com.example.employeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id //primarykey
	@Column(name="deptno")
	private int deptno;
	
	@Column(name="departmentname")
	private String departmentName;
	
	@Column(name="location")
	private String location;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department(int deptno, String departmentName, String location) {
		super();
		this.deptno = deptno;
		this.departmentName = departmentName;
		this.location = location;
	}

	

}
