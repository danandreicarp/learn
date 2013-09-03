package com.danandreicarp.learn.designpatterns.memento;

public class Caretaker {

	public static void main(final String[] args) {
		final Originator originator = new Originator();

		final IMementoToCaretaker memento = originator.saveState();

		System.out.println("originator state:" + originator.getState());

		originator.getState().setStringField("changed");
		originator.getState().setIntField(3);

		System.out.println("originator state:" + originator.getState());

		originator.setState(memento);

		System.out.println("originator state:" + originator.getState());
	}

}
