package com.dp.structural.decorator;

public class Main {

	public static void main(String[] args) {

		Icecream vanilla = new Vanilla();

		System.out.println(vanilla.getName() + "  $ " + vanilla.cost());
		
		Icecream chocolateDecorator = new Chocolate();
		
		chocolateDecorator = new HotFudge(new Sprinkles(chocolateDecorator));
		
		System.out.println(chocolateDecorator.getName() + " $ " + chocolateDecorator.cost());
		
		
		
	}

}
