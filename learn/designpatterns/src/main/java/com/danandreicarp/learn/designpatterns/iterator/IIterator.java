package com.danandreicarp.learn.designpatterns.iterator;

public interface IIterator<E> {
	E next();

	boolean hasNext();
}
