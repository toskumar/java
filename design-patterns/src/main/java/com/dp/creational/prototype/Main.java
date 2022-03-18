package com.dp.creational.prototype;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String args[]) throws Exception {
		
		Date date1 = new GregorianCalendar(2000, 0, 1).getTime();
	
		Document d1 = new Document(1, "GOF", "Peter", date1, new BarCode("111"));
		Document d2 = (Document) d1.clone();
		Document d3 = (Document) d1.deepClone();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
