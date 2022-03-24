package com.dp.behavior.mediator;

public class Main {

	public static void main(String[] args) {
		IATCMediator atcMediator = new ATCMediator();
		Flight boeing = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(boeing);
		atcMediator.registerRunway(mainRunway);

		boeing.getReady();
		mainRunway.land();
		boeing.land();

	}

}
