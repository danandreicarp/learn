package com.danandreicarp.learn.designpatterns.factorymethod;

public abstract class Creator {

	public void anOperation() {
		final IProduct product = factoryMethod();

		// use product here
	}

	public abstract IProduct factoryMethod();
}
