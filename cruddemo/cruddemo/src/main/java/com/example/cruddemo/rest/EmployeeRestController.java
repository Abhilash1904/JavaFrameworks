package com.example.cruddemo.rest;

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

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	EmployeeService eSer;
	
	@Autowired
	EmployeeRestController(EmployeeService theeSer){
		eSer=theeSer;
	}

	@GetMapping("/employees")
		public List<Employee> getall(){
			return eSer.getAll();
		}
	
	@GetMapping("/employees/{empid}")
	public Employee getById(@PathVariable int empid) {
		return eSer.getById(empid);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		emp.setId(0);
		eSer.saveEmpl(emp);
		return emp;
	}
	
	@PutMapping("/employees")
	public Employee updateEmpl(@RequestBody Employee emp) {
		eSer.saveEmpl(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{empId}")
	public String deleteEmp(@PathVariable int empId) {
		eSer.deleteEmpl(empId);
		return "Employee deleted with id" +empId;
	}
}
