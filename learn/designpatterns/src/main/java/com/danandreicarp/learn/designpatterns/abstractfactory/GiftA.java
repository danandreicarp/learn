package com.danandreicarp.learn.designpatterns.abstractfactory;

public class GiftA implements IGift {

	@Override
	public void customize(final String colour) {
		System.out.println("customized Gift A with colour " + colour);
	}
}
