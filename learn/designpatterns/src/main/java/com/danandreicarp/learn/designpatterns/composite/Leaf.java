package com.danandreicarp.learn.designpatterns.composite;

public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("leaf operation");
	}

	@Override
	public void simpleOperation() {
		System.out.println("simple leaf operation");
	}

}
