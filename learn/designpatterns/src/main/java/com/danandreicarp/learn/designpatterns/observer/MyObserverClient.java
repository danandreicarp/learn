package com.danandreicarp.learn.designpatterns.observer;

public class MyObserverClient {

	public static void main(final String[] args) {
		final MySubject subject = new MySubject();

		final IMyObserver observer = new MyObserverA(subject);

		subject.setState(1);
		subject.attach(observer);

		subject.setState(3);

		subject.notifyPushObservers();
		subject.notifyPullObservers();
	}

}
