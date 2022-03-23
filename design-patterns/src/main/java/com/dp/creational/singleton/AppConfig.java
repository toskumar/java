package com.dp.creational.singleton;

public class AppConfig {

	private static AppConfig instance = null;

	public static AppConfig getInstance() {
		if (instance == null) {
			synchronized (AppConfig.class) { // test1 comment this line
				if (instance == null) { // test2 comment this line
					instance = new AppConfig();
					System.out.println("Instance1 created by " + Thread.currentThread().getName());
					return instance;
				}
			}
		}
		return instance;
	}
}
