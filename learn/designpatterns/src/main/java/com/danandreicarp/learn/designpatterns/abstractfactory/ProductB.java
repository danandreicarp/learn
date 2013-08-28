package com.danandreicarp.learn.designpatterns.abstractfactory;

public class ProductB implements IProduct {

	@Override
	public void activate() {
		System.out.println("activated Product B");
	}
}
