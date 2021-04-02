package com.example.SpringBootDemoApplicaiton;


import org.springframework.stereotype.Service;

@Service
public class UserServices {

	public String getSerVal() {
		System.out.println("Under service class");
		return "service.getSerVal";
	}
}
