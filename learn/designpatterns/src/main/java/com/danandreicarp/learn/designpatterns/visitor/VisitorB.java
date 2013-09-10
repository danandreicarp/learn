package com.danandreicarp.learn.designpatterns.visitor;

public class VisitorB implements IVisitor {

	Integer state;

	public VisitorB() {
		state = 0;
	}

	@Override
	public void visit(final IElement element) {
		System.out.println("Visitor B visiting");
		state += element.operation();
	}

	@Override
	public Integer getState() {
		return state;
	}

}
