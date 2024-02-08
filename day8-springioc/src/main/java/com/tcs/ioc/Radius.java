package com.tcs.ioc;

public class Radius {
	private double radius;
	
	Point p;
	
	public void setP(Point p) {
		this.p = p;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void calculateRadius(int x1, int x2, int y1, int y2) {
		double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		this.radius = length;
		System.out.println("Radius of the circle is: " + this.radius);
	}

//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
}
