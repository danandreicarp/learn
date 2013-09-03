package com.danandreicarp.learn.designpatterns.flyweight;

public class ExtrinsicState {
	Integer counter;

	public ExtrinsicState(final Integer counter) {
		this.counter = counter;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(final Integer counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		final StringBuilder string = new StringBuilder("counter: ");
		string.append(counter);

		return string.toString();
	}
}
