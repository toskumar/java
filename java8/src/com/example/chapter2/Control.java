package com.example.chapter2;

import java.util.Iterator;

public class Control {

	public static void main(String args[]) {
		System.out.println("isLeapYear(2021) => " + isLeapYear(2021));
		System.out.println("getMonth(5) => " + getMonth(5));
		System.out.print("while loop(5) => "); loop1(5);
		System.out.print("do while (5) => "); loop2(5);
		System.out.print("for loop(5) => "); loop3(5);
		System.out.println("Jump condition =>"); jump();
	}
	
	public static boolean isLeapYear(int year) {
		if(year%4 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String getMonth(int mm) {
		String month = "";
		switch(mm) {
		case 1: month = "January"; break;
		case 2: month = "February"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "Jun"; break;
		case 7: month = "July"; break;
		case 8: month = "August"; break;
		case 9: month = "September"; break;
		case 10: month = "October"; break;
		case 11: month = "November"; break;
		case 12: month = "December"; break;
		default: month = "month not found";		
		}
		return month;
	}
	
	//initialize, condition, increment
	public static void loop1(int count) {
		int i = 1;
		while (i <= count) {
			System.out.print(i++ + " ");
		}
		System.out.println();
	}
	
	//initialize, increment, condition
	public static void loop2(int count) {
		int i = 1;
		do {
			System.out.print(i++ + " ");
		} while (i <= count);

		System.out.println();
	}
	
	//initialize, condition, increment
	public static void loop3(int count) {
		
		//Style1
		for(int i=1;i<=count;i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	
		System.out.print("for-each => ");
		//Style2 
		int a[] = new int[] {1,2,3,4,5};
		
		for (int v : a) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	public static void jump() {
		
		System.out.print("Jump1 => ");
		for(int i=1;i<=5;i++) {
			if(i == 3) break;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.print("Jump2 =>");
		for(int i=1;i<=5;i++) {
			if(i%2 == 0) continue;
			System.out.print(i + " ");
		}
		
	}
}
