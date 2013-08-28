package com.danandreicarp.learn.designpatterns.abstractfactory;

public class GiftB implements IGift {

	@Override
	public void customize(final String colour) {
		System.out.println("customized Gift B with colour " + colour);
	}
}
