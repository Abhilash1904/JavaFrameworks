package com.example.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
