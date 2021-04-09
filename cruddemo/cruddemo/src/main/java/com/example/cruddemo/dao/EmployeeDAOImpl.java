package com.example.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManager em;
	@Autowired
	public EmployeeDAOImpl(EntityManager theem) {
		em=theem;
	}
	
	@Override
	public List<Employee> getAll() {
		
		Session currentsession =em.unwrap(Session.class);
		
		Query<Employee> query= currentsession.createQuery("from Employee", Employee.class);
		List<Employee> employee=query.getResultList();
		return employee;
	}

	@Override
	public Employee getById(int id) {
		Session currentsession =em.unwrap(Session.class);
		Employee emp=currentsession.get(Employee.class, id);
		return emp;
	}

	@Override
	public void saveEmpl(Employee employee) {
		Session currentsession =em.unwrap(Session.class);
		currentsession.save(employee);
	}

	@Override
	public void deleteEmpl(int did) {
		Session currentsession =em.unwrap(Session.class);
		Query theQuery = currentsession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", did);
		
		theQuery.executeUpdate();
		
	}

}
