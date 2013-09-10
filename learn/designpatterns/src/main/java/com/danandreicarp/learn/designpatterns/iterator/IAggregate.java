package com.danandreicarp.learn.designpatterns.iterator;

public interface IAggregate<E> {
	IIterator<E> getIterator();

	IIterator<E> getIterator(int loops);
}
