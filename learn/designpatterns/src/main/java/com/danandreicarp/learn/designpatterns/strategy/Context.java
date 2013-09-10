package com.danandreicarp.learn.designpatterns.strategy;

public class Context {

	private IStrategy strategy;

	public Context(final IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operation() {
		strategy.execute();
	}

	public void setStrategy(final IStrategy strategy) {
		this.strategy = strategy;
	}

}
