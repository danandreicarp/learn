package com.danandreicarp.learn.designpatterns.factorymethod;

public class ProductA implements IProduct {

	@Override
	public void init() {
		System.out.println("initializing Product");
	}
}
