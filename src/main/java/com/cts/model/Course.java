package com.cts.model;

import org.springframework.stereotype.Component;

@Component
public class Course {

	private String name="Java";
	private int duration=60;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
