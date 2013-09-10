package com.danandreicarp.learn.designpatterns.observer;

import java.util.Observer;

public class ObserverClient {

	public static void main(final String[] args) {
		final Subject subject = new Subject();

		subject.setField("data");
		subject.notifyObservers();

		final Observer observerA = new ObserverA();
		final Observer observerB = new ObserverB();

		subject.addObserver(observerA);
		subject.addObserver(observerB);

		subject.setField("new data");
		subject.notifyObservers();

		subject.deleteObserver(observerB);

		subject.setField("newer data");
		subject.notifyObservers();
	}
}
