package com.danandreicarp.learn.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	List<IColleague> colleagues = new ArrayList<IColleague>();

	public void sendMessage(final IColleague colleague, final String message) {

		for (final IColleague clg : colleagues) {
			if (!clg.equals(colleague)) {
				clg.receive(message);
			}
		}
	}

	public void add(final IColleague colleague) {
		colleagues.add(colleague);
	}
}
