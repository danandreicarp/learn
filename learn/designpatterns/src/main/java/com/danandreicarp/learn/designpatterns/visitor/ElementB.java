package com.danandreicarp.learn.designpatterns.visitor;

public class ElementB implements IElement {

	@Override
	public void accept(final IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Integer operation() {
		System.out.println("operation B in progress");
		return Integer.valueOf(2);
	}

}
