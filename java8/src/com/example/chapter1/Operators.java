package com.example.chapter1;

public class Operators {

	public static void main(String args[]) {
		int a = 0;
		System.out.println("!true =>"+ !true);
		System.out.println("true == true => " + (true == true));
		System.out.println("true != false => " + (true != false));
		System.out.println("10 >= 20 => " + (10 >= 20));
		System.out.println("10 <= 20 => "+ (10 <= 20));
		System.out.println("10 <= 20 && 20 >=10 => " + (10 <= 20 && 20 >=10));
		System.out.println("10 <= 20 || 20 >=10 => " + (10 <= 20 || 20 >=10));
		System.out.println("a=10 => "+(a=10));
		System.out.println("++a =>"+ ++a);
		System.out.println("a++ =>"+ a++);
		System.out.println("a-- =>"+ a--);
		System.out.println("--a =>"+ --a);
		System.out.println("128<<1 => "+(128<<1));
		System.out.println("128>>>1 => "+(128>>1));
		
		int x = 10;
		int y = 20;
		System.out.println("x+y => " + (x+y));
		System.out.println("x-y => " + (x-y));
		System.out.println("x*y => " + (x*y));
		System.out.println("x/y => " + (x/y));
		
		System.out.println("x>y?x:y => " + (x>y?x:y));
	}
}
