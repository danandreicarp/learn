package com.danandreicarp.learn.designpatterns.mediator;

public class ColleagueB implements IColleague {

	Mediator mediator;

	public ColleagueB(final Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void receive(final String message) {
		System.out.println("colleague B received " + message);
	}

	@Override
	public void send(final String message) {
		mediator.sendMessage(this, message);
	}

}
