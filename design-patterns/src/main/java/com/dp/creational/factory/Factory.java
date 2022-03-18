package com.dp.creational.factory;

abstract class Laptop {
	String name;
	String model;
	int year;
	
	Laptop(String name, String model, int year) {
		this.name = name;
		this.model = model;
		this.year = year;
	}
	
	abstract String getModel();
}

class BusinessLaptop extends Laptop {

	BusinessLaptop(String name, String model, int year) {
		super(name, model, year);
	}
	
	@Override
	String getModel() {
		return "name=" + name + ", model=" + model + ", year=" + year;
	}
}

class GamingLaptop extends Laptop {
	
	GamingLaptop(String name, String model, int year) {
		super(name, model, year);
	}
	
	@Override
	String getModel() {
		return "name=" + name + ", model=" + model + ", year=" + year;
	}
}

public class Factory {

	public static Laptop getLaptop(String type) {
		
		if(type.equalsIgnoreCase("business")) {
			return new BusinessLaptop("Business", "B001", 2022);
		}
		if(type.equalsIgnoreCase("gaming")) {
			return new GamingLaptop("Gaming", "G001", 2021);
		}
		
		return null;
	}
}
