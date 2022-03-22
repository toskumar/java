package com.dp.creational.abstractfactory;

public class Main {

	public static void main(String[] args) {

		Laptop laptop1 = StoreProvider.getFactory("Dell").create("D101", 2020);
		Laptop laptop2 = StoreProvider.getFactory("HP").create("H101", 2020);
		
		System.out.println(laptop1.getModel());
		System.out.println(laptop2.getModel());
	}

}
