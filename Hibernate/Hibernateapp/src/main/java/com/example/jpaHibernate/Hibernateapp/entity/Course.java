package com.example.jpaHibernate.Hibernateapp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	//primary key Generatedvalue-jpa will add value
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	protected Course() {
		
	}
	
	public Course(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	
	
	
}
