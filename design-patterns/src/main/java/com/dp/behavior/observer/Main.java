package com.dp.behavior.observer;

public class Main {

	public static void main(String[] args) {
		NewsAgency agency = new NewsAgency();
		agency.addObserver(new BBCNewsChannel());
		agency.addObserver(new CNNNewsChannel());

		System.out.println("Number of observers: " + agency.countObservers());
		agency.publish("Test News");
		agency.publish("Happy New Year");
	}
}