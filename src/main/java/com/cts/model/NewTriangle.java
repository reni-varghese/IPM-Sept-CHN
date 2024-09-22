package com.cts.model;

import java.util.List;

public class NewTriangle {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point point : points) {
			System.out.println("Point 1 {"+point.getX()+","+point.getY()+"}");
		}
	}

}
