package com.example.chapter3;

/**
 * Abstract, final class and inheritance
 * 
 */
public class MyShape {

	public static void main(String args[]) {
		Circle c1 = new Circle(7);
		System.out.println("Area of the circle = " + c1.area());
		System.out.println("Circumference of the circle = " + c1.circumference());
	}
}

abstract class Shape {
	Shape(){
		System.out.println("Shape constructor invoked");
	}
	abstract double area();
	abstract double circumference();
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
	double circumference() {
		return 2 * PI * this.radius;
	}
}