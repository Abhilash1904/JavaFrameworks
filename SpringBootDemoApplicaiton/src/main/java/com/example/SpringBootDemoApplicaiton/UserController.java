package com.example.SpringBootDemoApplicaiton;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import JsonDemo.Fruit;

@RestController
public class UserController {

	@Autowired
	UserServices usr;
	
	//fetch from browser
	@GetMapping("/users")
	public String getVal() {
		System.out.println("under controller class");
		return usr.getSerVal();
	}
	
	@GetMapping("/fruit")
	public List<Fruit> getstudents() {
		List<Fruit> fr= new ArrayList<Fruit>();
		fr.add(new Fruit("Apple", "Red"));
		fr.add(new Fruit("Banana", "Yellow"));
		fr.add(new Fruit("Grapes", "Green"));
		return fr;
	}
	
	
//	@PostMapping("/postUser")
//	public String getUsers(@RequestBody String xmlStr){
//		return "post user"; }
	
}
