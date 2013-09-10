package com.danandreicarp.learn.designpatterns.visitor;

public class VisitorA implements IVisitor {

	Integer state;

	public VisitorA() {
		state = 0;
	}

	@Override
	public void visit(final IElement element) {
		System.out.println("Visitor A visiting");
		state += element.operation();
	}

	@Override
	public Integer getState() {
		return state;
	}

}
