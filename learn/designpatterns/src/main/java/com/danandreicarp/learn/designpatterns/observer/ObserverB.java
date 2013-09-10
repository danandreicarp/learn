package com.danandreicarp.learn.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

	@Override
	public void update(final Observable o, final Object arg) {
		System.out.println("observer B notified");
	}

}
