package com.tcs.ioc;

public class Circle {
	Radius r;
	public void setR(Radius r) {
		this.r = r;
	}
	public void calculateArea() {
		r.calculateRadius(3, 0, 4, 0);
		double area = 3.14 * Math.pow(r.getRadius(), 2);
		System.out.println("Area of the circle is: " + area);
	}
}
