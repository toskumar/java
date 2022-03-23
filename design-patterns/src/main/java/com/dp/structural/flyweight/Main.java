package com.dp.structural.flyweight;

public class Main {

	public static void main(String[] args) {
		RaceCarClient client = new RaceCarClient("Midget");
		client.moveCar(10, 20);
		client.moveCar(15, 30);
	}
}
