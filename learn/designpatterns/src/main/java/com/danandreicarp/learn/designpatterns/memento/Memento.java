package com.danandreicarp.learn.designpatterns.memento;

public class Memento implements IMementoToOriginator, IMementoToCaretaker {

	private final State state;

	public Memento(final State state) {
		this.state = state.clone();
	}

	@Override
	public State getState() {
		return state;
	}

}
