package com.danandreicarp.learn.designpatterns.visitor;

public interface IElement {
	void accept(IVisitor visitor);

	Integer operation();
}
