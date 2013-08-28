package com.danandreicarp.learn.designpatterns.bridge;

public abstract class Abstraction {

	protected IImplementor implementor;

	public Abstraction(final IImplementor implementor) {
		this.implementor = implementor;
	}

	public abstract void useImplementor();
}
