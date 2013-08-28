package com.danandreicarp.learn.designpatterns.flyweight;

public class IntrinsicState {
	String name;
	Integer size;

	public IntrinsicState(final String name, final Integer size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(final Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		final StringBuilder string = new StringBuilder("name: ");
		string.append(name).append(" size: ").append(size);

		return string.toString();
	}
}
