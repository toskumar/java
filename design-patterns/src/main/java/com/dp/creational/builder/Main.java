package com.dp.creational.builder;

public class Main {
	public static void main(String args[]) {
		UserBuilder userBuilder = new UserBuilder();
		
		userBuilder.addId(1);
		userBuilder.addName("John");
		userBuilder.addAge(25);
		userBuilder.addAddress("Madivala, Bangalore");
		
		System.out.println(userBuilder);
		
		
		MealBuilder mealBuilder = new MealBuilder();
		mealBuilder.addBurger(1);
		mealBuilder.addCake(2);
		mealBuilder.addIcecream(1);
		
		mealBuilder.printBill();
	
	}
}
