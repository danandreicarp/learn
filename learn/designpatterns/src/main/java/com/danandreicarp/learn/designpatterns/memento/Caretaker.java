package com.danandreicarp.learn.designpatterns.memento;

public class Caretaker {

	private static IMementoToCaretaker memento;

	public Caretaker(final IMementoToCaretaker memento) {
		Caretaker.memento = memento;
	}

	public static void main(final String[] args) {

		final Originator originator = new Originator();
		memento = originator.saveState();

		System.out.println("originator state:" + originator.getState());

		originator.getState().setStringField("changed");
		originator.getState().setIntField(3);

		System.out.println("originator state:" + originator.getState());

		originator.setState(memento);

		System.out.println("originator state:" + originator.getState());
	}

}
