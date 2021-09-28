package com.example.chapter1;

/*
 * instance variable and static variable
 */
public class Variable {

	int length; // instance variable
	static int count; // static variable

	Variable(int len) {
		length = len;
		count++;
	}

	void display() { // instance method can access both instance and static variable
		System.out.println("Instance Variable(" + count + ") length=" + length);
	}

	static void count() { // static method can access only static variable
		System.out.println("No of instances (static variable) = " + count);
	}

	public static void main(String args[]) {
		
		Variable v1 = new Variable(10); 
		v1.display();
		Variable v2 = new Variable(20); 
		v2.display();
		Variable v3 = new Variable(30); 
		v3.display();
		
		Variable.count(); // static method; use class name to access the static method
	
		int local1 = 100;
		{
			int local2 = 200;
			System.out.println("Local variable 1 = " + local1);
			System.out.println("Local variable 2 = " + local2);
		}
	}
}