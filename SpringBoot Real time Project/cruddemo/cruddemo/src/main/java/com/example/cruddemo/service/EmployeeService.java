package com.example.cruddemo.service;

import java.util.List;

import com.example.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	
	public Employee getById(int id);
	
	public void saveEmpl(Employee employee);
	
	public void deleteEmpl(int did);
}
