package com.dp.creational.abstractfactory;

interface Laptop {
	abstract String getModel();
}

class DellLaptop implements Laptop {

	String model;
	int year;

	DellLaptop(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public String getModel() {
		return "name=Dell" + ", model=" + model + ", year=" + year;
	}
}

class HPLaptop implements Laptop {
	String model;
	int year;

	HPLaptop(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public String getModel() {
		return "name=HP " + ", model=" + model + ", year=" + year;
	}
}

interface AbstractFactory<T> {
	public T create(String model, int year);
}

class DellFactory implements AbstractFactory<Laptop> {

	@Override
	public Laptop create(String model, int year) {
		return new DellLaptop(model, year);
	}

}

class HPFactory implements AbstractFactory<Laptop> {

	@Override
	public Laptop create(String model, int year) {
		return new HPLaptop(model, year);
	}

}

class StoreProvider {
	public static AbstractFactory<Laptop> getFactory(String brand) {

		switch (brand.toLowerCase()) {
		case "dell":
			return new DellFactory();
		case "hp":
			return new HPFactory();
		default:
			return null;
		}

	}
}