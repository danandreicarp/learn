package com.danandreicarp.learn.designpatterns.bridge;

public class ImplementorB implements IImplementor {

	@Override
	public void operation() {
		System.out.println("operation B");
	}

}
