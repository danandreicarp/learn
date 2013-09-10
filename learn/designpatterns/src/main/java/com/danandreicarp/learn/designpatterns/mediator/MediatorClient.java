package com.danandreicarp.learn.designpatterns.mediator;

public class MediatorClient {

	public static void main(final String[] args) {
		final Mediator mediator = new Mediator();

		final IColleague colleagueA = new ColleagueA(mediator);
		final IColleague colleagueB = new ColleagueB(mediator);

		colleagueA.send("colleague A broadcast 1");

		mediator.add(colleagueA);
		colleagueA.send("colleague A broadcast 2");

		mediator.add(colleagueB);
		colleagueA.send("colleague A broadcast 3");
		colleagueB.send("colleague B broadcast 1");

	}
}
