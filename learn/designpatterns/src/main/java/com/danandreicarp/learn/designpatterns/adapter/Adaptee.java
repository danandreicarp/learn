package com.danandreicarp.learn.designpatterns.adapter;

public class Adaptee {

	public void specificOperation(final AdapteeObject object) {
		System.out.println("adaptee: " + object);
	}
}
