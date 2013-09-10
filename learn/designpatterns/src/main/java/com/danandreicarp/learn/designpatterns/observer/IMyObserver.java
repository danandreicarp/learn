package com.danandreicarp.learn.designpatterns.observer;

public interface IMyObserver {
	void updatePush(MySubject subject);

	void updatePull();
}
