package com.example.jpaHibernate.Hibernateapp.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpaHibernate.Hibernateapp.entity.Course;

@Repository
public class CourseRepository {

	@Autowired
	EntityManager em;
	
	//find course by Id
	public Course coursebyID(long id) {
		return em.find(Course.class, id);
		
	}
	//save course -----Insert or update new course
	//delete course by Id
}
