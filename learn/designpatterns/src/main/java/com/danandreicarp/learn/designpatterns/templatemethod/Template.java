package com.danandreicarp.learn.designpatterns.templatemethod;

public class Template extends BaseTemplate {

	@Override
	public void operationA() {
		System.out.println("operation A in Template");
	}

	@Override
	public void preOperations() {
		System.out.println("optional step pre operations in Template");
	}
}
