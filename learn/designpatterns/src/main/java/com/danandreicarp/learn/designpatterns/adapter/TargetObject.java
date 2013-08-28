package com.danandreicarp.learn.designpatterns.adapter;

public class TargetObject {
	String field;

	public TargetObject(final String field) {
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(final String field) {
		this.field = field;
	}

}
