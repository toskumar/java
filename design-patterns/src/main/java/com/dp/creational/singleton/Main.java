package com.dp.creational.singleton;

public class Main {

	public static void main(String args[]) {
		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				AppConfig.getInstance();
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++) {
				AppConfig.getInstance();
			}
		};

		Thread t1 = new Thread(r1, "Thread-1");
		Thread t2 = new Thread(r2, "Thread-2");

		t1.start();
		t2.start();
	}
}
