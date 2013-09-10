package com.danandreicarp.learn.designpatterns.visitor;

public class ElementA implements IElement {

	@Override
	public void accept(final IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Integer operation() {
		System.out.println("operation A in progress");
		return Integer.valueOf(1);
	}

}
