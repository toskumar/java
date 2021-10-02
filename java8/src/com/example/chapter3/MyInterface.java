package com.example.chapter3;

/**
 * Interface contains abstract method and constants 
 *
 */
public class MyInterface {

	public static void main(String args[]) {
		Wifi wifi1 = new AirtelService();
		Wifi wifi2 = new JioService();

		Guest guest1 = new Guest(wifi1, "pass1");
		Guest guest2 = new Guest(wifi2, "pass2");
	}
}

interface Wifi {
	static final String PROTOCOL = "wifi";
	void connect(String password);
}

class AirtelService implements Wifi {
	@Override
	public void connect(String password) {
		System.out.println("Conntected through Airtel service using " + PROTOCOL);
	}
}

class JioService implements Wifi {
	@Override
	public void connect(String password) {
		System.out.println("Conntected through Jio service using " + PROTOCOL);
	}
}

class Guest {
	
	Guest(Wifi wifi, String password) {
		wifi.connect(password);
	}
}