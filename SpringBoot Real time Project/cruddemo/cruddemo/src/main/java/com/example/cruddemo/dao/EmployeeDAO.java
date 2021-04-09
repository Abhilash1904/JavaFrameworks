package com.example.cruddemo.dao;

import java.util.List;

import com.example.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAll();
	
	public Employee getById(int id);
	
	public void saveEmpl(Employee employee);
	
	public void deleteEmpl(int did);
}
