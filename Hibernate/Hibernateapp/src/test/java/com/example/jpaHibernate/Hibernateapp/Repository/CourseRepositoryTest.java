package com.example.jpaHibernate.Hibernateapp.Repository;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpaHibernate.Hibernateapp.entity.Course;

@SpringBootTest
class CourseRepositoryTest {

	
	
	@Autowired
	CourseRepository cr;
	
	@Test
	void contextLoads() {
		
		Course c=cr.coursebyID(100l);
		assertEquals("Maths",c.getName());
		System.out.println(c.getName());
		
	}

}
