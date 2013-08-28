package com.danandreicarp.learn.designpatterns.factorymethod;

public abstract class Client {

	public static void main(final String[] args) {
		final Creator factory = new ConcreteCreatorA();

		System.out.println(factory.factoryMethod().getClass());
	}
}
