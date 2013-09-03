package com.danandreicarp.learn.designpatterns.adapter;

public class AdapterClient {

	public static void main(final String[] args) {
		final Target target = new Adapter(new Adaptee());

		final TargetObject object = new TargetObject("42");

		target.operation(object);
	}
}
