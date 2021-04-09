package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cruddemo.dao.EmployeeDAO;
import com.example.cruddemo.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO eDAO;
	
	@Override
	public List<Employee> getAll() {
		return eDAO.getAll();
	}

	@Override
	public Employee getById(int id) {
		return eDAO.getById(id);
	}

	@Override
	public void saveEmpl(Employee employee) {
		eDAO.saveEmpl(employee);

	}

	@Override
	public void deleteEmpl(int did) {
		eDAO.deleteEmpl(did);

	}

}
