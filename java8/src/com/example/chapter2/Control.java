package com.example.chapter2;

public class Control {

	public static void main(String args[]) {
		System.out.println("isLeapYear(2021) => " + isLeapYear(2021));
		System.out.println("getMonth(5) => " + getMonth(5));
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
	
}
