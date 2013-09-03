package com.danandreicarp.learn.designpatterns.memento;

public class Originator {

	private State state;

	public Originator() {
		state = new State("", 0);
	}

	public void setState(final IMementoToCaretaker memento) {
		state = ((IMementoToOriginator) memento).getState();
	}

	public IMementoToCaretaker saveState() {
		return new Memento(state);
	}

	public State getState() {
		return state;
	}

}
