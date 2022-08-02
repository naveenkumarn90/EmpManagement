package com.example.employeemanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.employeemanagement.entity.Department;
@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
	@Autowired
	EntityManager entityManager;


	@Override
	public List<Department> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Department> query =   currentSession.createQuery("select * from Department ",Department.class );
		List<Department> deptList = query.getResultList();

		// TODO Auto-generated method stub
		return deptList;
	}
	@Override
	public Department findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Department.class, id);
	}

	@Override
	public void saveOrUpdate(Department dept) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(dept);


		
	}

	@Override
	public void deleteById(int empId) {
		// TODO Auto-generated method stub
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Department> query = currentSession.createQuery("delete from Department where id = :employeeId");
		query.setParameter("departmentId",empId );
		query.executeUpdate();

		
	}

	
	



}
