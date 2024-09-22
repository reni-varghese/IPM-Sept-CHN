package com.cts.model;

import java.beans.ConstructorProperties;

public class Triangle {
	
	private String type;
	
	private int height;
	
	
	public int getHeight() {
		return height;
	}
	@ConstructorProperties({"type","height"})
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(type +" Triangle drawn with a height of "+height);
	}

	public Triangle() {
		System.out.println("Constructor of triangle executed");
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	
	

}
