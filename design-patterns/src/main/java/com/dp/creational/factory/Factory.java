package com.dp.creational.factory;

interface Laptop {
	abstract String getModel();
}

class BusinessLaptop implements Laptop {

	String name;
	String model;
	int year;

	BusinessLaptop(String name, String model, int year) {
		this.name = name;
		this.model = model;
		this.year = year;
	}

	@Override
	public String getModel() {
		return "name=" + name + ", model=" + model + ", year=" + year;
	}
}

class GamingLaptop implements Laptop {
	String name;
	String model;
	int year;

	GamingLaptop(String name, String model, int year) {
		this.name = name;
		this.model = model;
		this.year = year;
	}

	@Override
	public String getModel() {
		return "name=" + name + ", model=" + model + ", year=" + year;
	}
}

public class Factory {

	public static Laptop getLaptop(String type) {

		if (type.equalsIgnoreCase("business")) {
			return new BusinessLaptop("Business", "B001", 2022);
		}
		if (type.equalsIgnoreCase("gaming")) {
			return new GamingLaptop("Gaming", "G001", 2021);
		}

		return null;
	}
}
