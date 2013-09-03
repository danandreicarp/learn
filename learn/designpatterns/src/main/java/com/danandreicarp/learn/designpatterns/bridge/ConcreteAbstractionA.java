package com.danandreicarp.learn.designpatterns.bridge;

public class ConcreteAbstractionA extends Abstraction {

	public ConcreteAbstractionA(final IImplementor implementor) {
		super(implementor);
	}

	@Override
	public void useImplementor() {
		implementor.operation();
	}
}
