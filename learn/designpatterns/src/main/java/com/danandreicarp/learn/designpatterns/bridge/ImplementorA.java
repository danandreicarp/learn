package com.danandreicarp.learn.designpatterns.bridge;

public class ImplementorA implements IImplementor {

	@Override
	public void operation() {
		System.out.println("operation A");
	}

}
