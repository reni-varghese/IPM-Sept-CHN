package com.cts.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {

//	private int id;
//	private String name;
//	private String gender;
	
	private Course course;
	
	
//	@Autowired
	public Student(Course course) {
		this.course=course;
		
	}
	public Course getCourse() {
		return course;
	}
	@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
