package com.danandreicarp.learn.designpatterns.bridge;

public class BridgeMain {

	public static void main(final String[] args) {

		IImplementor implementor = null;

		if (args.length > 0 && args[0].equals("A")) {
			implementor = new ImplementorA();
		} else {
			implementor = new ImplementorB();
		}

		final Abstraction abstraction = new ConcreteAbstractionA(implementor);

		abstraction.useImplementor();
	}
}
