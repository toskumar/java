package com.dp.structural.decorator;

abstract class Icecream {

	String name;

	public String getName() {
		return name;
	}

	public abstract double cost();
}

class Vanilla extends Icecream {
	public Vanilla() {
		this.name = "Vanilla";
	}

	@Override
	public double cost() {
		return 10.0;
	}
}

class Chocolate extends Icecream {

	public Chocolate() {
		this.name = "Chocolate";
	}

	@Override
	public double cost() {
		return 15.0;
	}
}

abstract class IcecreamDecorator extends Icecream {

}

class Sprinkles extends IcecreamDecorator {
	Icecream icecream;

	public Sprinkles(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String getName() {
		return this.icecream.getName();
	}

	@Override
	public double cost() {
		return this.icecream.cost() + 1.50;
	}
}

class HotFudge extends IcecreamDecorator {
	Icecream icecream;

	public HotFudge(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String getName() {
		return this.icecream.getName();
	}

	@Override
	public double cost() {
		return this.icecream.cost() + 1.60;
	}
}
