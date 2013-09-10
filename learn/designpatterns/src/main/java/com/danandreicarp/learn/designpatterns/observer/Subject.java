package com.danandreicarp.learn.designpatterns.observer;

import java.util.Observable;

public class Subject extends Observable {
	String field;

	public String getField() {
		return field;
	}

	public void setField(final String field) {
		this.field = field;
		setChanged();
	}
}
