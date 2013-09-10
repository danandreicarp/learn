package com.danandreicarp.learn.designpatterns.templatemethod;

public abstract class BaseTemplate {

	public final void templateMethod() {
		System.out.println("template method in BaseTemplate");
		preOperations();
		operationA();
		operationB();
	}

	public void preOperations() {
		// empty, optional step
	}

	public abstract void operationA();

	public void operationB() {
		System.out.println("utility method operationB in BaseTemplate");
	}
}
