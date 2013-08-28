package com.danandreicarp.learn.designpatterns.factorymethod;

public class ConcreteCreatorA extends Creator {

	@Override
	public IProduct factoryMethod() {
		return new ProductA();
	}
}
