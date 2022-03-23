package com.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

abstract class RaceCar {

	// Intrinsic state
	String name;
	int maxSpeed;
	int horsePower;

	// Extrinsic state
	abstract void moveCar(int currentX, int currentY, int newX, int newY);
}

class MidgetCar extends RaceCar {

	static int num;

	MidgetCar(String name, int maxSpeed, int horsePower) {
		num++;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.horsePower = horsePower;
	}

	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of " + this.name + " is X" + newX + " - Y" + newY);
	}
}

class SprintCar extends RaceCar {

	static int num;

	SprintCar(String name, int maxSpeed, int horsePower) {
		num++;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.horsePower = horsePower;
	}

	@Override
	void moveCar(int currentX, int currentY, int newX, int newY) {
		System.out.println("New location of " + this.name + " is X" + newX + " - Y" + newY);
	}
}

class CarFactory {
	private static Map<String, RaceCar> flyweights = new HashMap<>();

	public static RaceCar getRaceCar(String key) {
		if (flyweights.containsKey(key)) {
			return flyweights.get(key);
		}
		RaceCar raceCar;
		switch (key) {
		case "Midget":
			raceCar = new MidgetCar("Midget Car", 140, 400);
			break;
		case "Sprint":
			raceCar = new SprintCar("Sprint Car", 160, 1000);

			break;
		default:
			throw new IllegalArgumentException("Unsupported car type.");
		}
		flyweights.put(key, raceCar);
		return raceCar;
	}
}

class RaceCarClient {
	private RaceCar raceCar;

	public RaceCarClient(String name) {
		raceCar = CarFactory.getRaceCar(name);
	}

	// The extrinsic state of the flyweight is maintained by the client
	private int currentX = 0;
	private int currentY = 0;

	public void moveCar(int newX, int newY) {
		// Car movement is handled by the flyweight object
		raceCar.moveCar(currentX, currentY, newX, newY);
		currentX = newX;
		currentY = newY;
	}
}