package com.example.chapter1;

/**
 * 
 * The primitive data types include boolean, char, byte, short, int, long, float and double.
 * The non-primitive data types include Classes, Interfaces and Arrays
 */
public class DataType {
	
	public static void main(String args[]) {
		boolean b = false;
		char c = '\u0065';
		byte by = 127;
		short s = 12;
		int i = 123;
		long l = 1234L;
		float f = 12345.67f;
		double d = 123456.78;
		
		System.out.println("boolean b=" + b);
		System.out.println("char c="+c);
		System.out.println("byte by="+by);
		System.out.println("short s="+s);
		System.out.println("int i="+i);
		System.out.println("long l="+l);
		System.out.println("float f="+f);
		System.out.println("double d="+d);
		
		String str = "Non premitive datatype";
		System.out.println("String str="+str);
		
	}
}
