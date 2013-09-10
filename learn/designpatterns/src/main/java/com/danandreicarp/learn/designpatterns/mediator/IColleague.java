package com.danandreicarp.learn.designpatterns.mediator;

public interface IColleague {
	void receive(String message);

	void send(String message);
}
