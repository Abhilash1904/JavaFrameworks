package com.example.SpringBootDemoApplicaiton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringBootDemoApplicaitonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplicaitonApplication.class, args);
		System.out.println("Applicaiton started");
	}

}
