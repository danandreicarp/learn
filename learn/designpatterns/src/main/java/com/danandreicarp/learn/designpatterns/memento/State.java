package com.danandreicarp.learn.designpatterns.memento;

public class State {
	String stringField;
	Integer intField;

	public State(final String stringField, final Integer intField) {
		this.stringField = stringField;
		this.intField = intField;
	}

	public String getStringField() {
		return stringField;
	}

	public void setStringField(final String stringField) {
		this.stringField = stringField;
	}

	public Integer getIntField() {
		return intField;
	}

	public void setIntField(final Integer intField) {
		this.intField = intField;
	}

	@Override
	public State clone() {
		return new State(stringField, intField);
	}

	@Override
	public String toString() {
		return stringField + " " + intField;
	}

}
