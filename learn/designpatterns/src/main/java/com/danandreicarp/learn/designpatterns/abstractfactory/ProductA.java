package com.danandreicarp.learn.designpatterns.abstractfactory;

public class ProductA implements IProduct {

	@Override
	public void activate() {
		System.out.println("activated Product A");
	}
}
