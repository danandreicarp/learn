package com.danandreicarp.learn.designpatterns.observer;

public class MyObserverA implements IMyObserver {

	MySubject subject;

	public MyObserverA(final MySubject subject) {
		this.subject = subject;
	}

	@Override
	public void updatePush(final MySubject subject) {
		subject.setState(subject.getState() + 1);
		System.out.println("push updating observer A " + subject.getState());

	}

	@Override
	public void updatePull() {
		subject.setState(subject.getState() + 1);
		System.out.println("pull updating observer A " + subject.getState());
	}
}
