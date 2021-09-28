package com.example.chapter2;

public class MyShape {

	public static void main(String args[]) {
		Circle c1 = new Circle(7);
		System.out.println("Area of circle = " + c1.area());
	}
}

abstract class Shape {
	Shape(){
		System.out.println("Shape constructor invoked");
	}
	abstract double area();
}

final class Circle extends Shape {
	final static double PI = 3.1415;
	int radius;
	Circle(int radius) {
		System.out.println("Circle constructor invoked");
		this.radius = radius;
	}
	double area() {
		return PI * this.radius * this.radius;
	}
}