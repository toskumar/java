package com.dp.behavior.mediator;

//ATC is Air Traffic Control
interface IATCMediator {

	public void registerRunway(Runway runway);

	public void registerFlight(Flight flight);

	public boolean isLandingOk();

	public void setLandingStatus(boolean status);
}

@SuppressWarnings("unused")
class ATCMediator implements IATCMediator {
	private Flight flight;
	private Runway runway;
	private boolean land;

	public void registerRunway(Runway runway) {
		this.runway = runway;
	}

	public void registerFlight(Flight flight) {
		this.flight = flight;
	}

	public boolean isLandingOk() {
		return land;
	}

	@Override
	public void setLandingStatus(boolean status) {
		land = status;
	}
}

interface Command {
	void land();
}

class Flight implements Command {
	private IATCMediator atcMediator;

	public Flight(IATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	public void land() {
		if (atcMediator.isLandingOk()) {
			System.out.println("Successfully Landed.");
			atcMediator.setLandingStatus(true);
		} else
			System.out.println("Waiting for landing.");
	}

	public void getReady() {
		System.out.println("Ready for landing.");
	}

}

class Runway implements Command {
	private IATCMediator atcMediator;

	public Runway(IATCMediator atcMediator) {
		this.atcMediator = atcMediator;
		atcMediator.setLandingStatus(true);
	}

	@Override
	public void land() {
		System.out.println("Landing permission granted.");
		atcMediator.setLandingStatus(true);
	}

}