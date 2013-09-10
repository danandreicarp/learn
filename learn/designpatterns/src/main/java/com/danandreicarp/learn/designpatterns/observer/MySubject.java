package com.danandreicarp.learn.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MySubject {
	private final List<IMyObserver> observers = new ArrayList<IMyObserver>();
	private Integer state;

	public void attach(final IMyObserver observer) {
		observers.add(observer);
	}

	public void detach(final IMyObserver observer) {
		observers.remove(observer);
	}

	public void notifyPushObservers() {
		for (final IMyObserver observer : observers) {
			observer.updatePush(this);
		}
	}

	public void notifyPullObservers() {
		for (final IMyObserver observer : observers) {
			observer.updatePull();
		}
	}

	public Integer getState() {
		return state;
	}

	public void setState(final Integer state) {
		this.state = state;
	}

}
