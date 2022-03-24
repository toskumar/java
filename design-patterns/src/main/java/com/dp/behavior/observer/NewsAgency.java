package com.dp.behavior.observer;

import java.util.Observable;
import java.util.Observer;

class BBCNewsChannel implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("BBC News Channel received a news - " + (String) arg);

	}
}

class CNNNewsChannel implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("CNN News Channel received a news - " + (String) arg);

	}
}

class NewsAgency extends Observable {

	void publish(String news) {
		setChanged();
		notifyObservers(news);
	}
}
