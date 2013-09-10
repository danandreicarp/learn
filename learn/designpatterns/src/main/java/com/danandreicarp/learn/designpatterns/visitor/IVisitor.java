package com.danandreicarp.learn.designpatterns.visitor;

public interface IVisitor {
	void visit(IElement element);

	Integer getState();
}
