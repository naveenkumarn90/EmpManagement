package com.example.employeemanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.entity.Employee;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query =   currentSession.createQuery("select * from Employee ",Employee.class );
		List<Employee> empList = query.getResultList();
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Employee.class, id);
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);


		
	}

	@Override
	public void deleteById(int empId) {
		// TODO Auto-generated method stub
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("delete from Employee where id = :employeeId");
		query.setParameter("employeeId",empId );
		query.executeUpdate();

		
	}

	
	


}
