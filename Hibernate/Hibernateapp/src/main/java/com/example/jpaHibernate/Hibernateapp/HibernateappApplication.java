package com.example.jpaHibernate.Hibernateapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpaHibernate.Hibernateapp.Repository.CourseRepository;
import com.example.jpaHibernate.Hibernateapp.entity.Course;

@SpringBootApplication
public class HibernateappApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateappApplication.class, args);
		System.out.println("Application started by Abhilash");
		
	}
	
	@Autowired
	private  CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		Course c=repository.coursebyID(100l);
		System.out.println("Under run method");
		//System.out.println(c.getName());
		
		
	}

}
