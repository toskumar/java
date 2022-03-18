package com.dp.creational.factory;

public class Main {

	public static void main(String args[]) {
		
		Laptop laptop1 = Factory.getLaptop("business");
		System.out.println(laptop1.getModel());
		
		Laptop laptop2 = Factory.getLaptop("gaming");
		System.out.println(laptop2.getModel());
		
	}
}
