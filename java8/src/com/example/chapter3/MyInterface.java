package com.example.chapter3;

/**
 * Interface contains abstract method and constants 
 *
 */
public class MyInterface {

	public static void main(String args[]) {
		Wifi wifi1 = new AirtelService();
		Wifi wifi2 = new JioService();

		User user1 = new User(wifi1, "pass1");
		User user2 = new User(wifi2, "pass2");
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

class User {
	
	User(Wifi wifi, String password) {
		wifi.connect(password);
	}
}