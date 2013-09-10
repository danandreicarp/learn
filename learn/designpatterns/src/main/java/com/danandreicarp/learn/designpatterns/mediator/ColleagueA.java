package com.danandreicarp.learn.designpatterns.mediator;

public class ColleagueA implements IColleague {

	Mediator mediator;

	public ColleagueA(final Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void receive(final String message) {
		System.out.println("colleague A received " + message);
	}

	@Override
	public void send(final String message) {
		mediator.sendMessage(this, message);
	}

}
