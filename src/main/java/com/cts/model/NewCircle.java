package com.cts.model;

public class NewCircle {
	
	private Point center;
	
	
	
	
	public Point getCenter() {
		return center;
	}




	public void setCenter(Point center) {
		this.center = center;
	}




	public void draw() {
		System.out.println("Circle drawn at {"+center.getX()+", "+center.getY()+"}");
	}
	
}
