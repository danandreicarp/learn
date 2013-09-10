package com.danandreicarp.learn.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorClient {

	public static void main(final String[] args) {

		final List<String> collection = new ArrayList<String>();
		collection.addAll(Arrays.asList(new String[] { "one", "two", "three", "four" }));

		final IAggregate<String> aggregate = new Aggregate<String>(collection);
		final IIterator<String> iterator = aggregate.getIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=======");

		final List<Integer> collectionB = new ArrayList<Integer>();
		collectionB.addAll(Arrays.asList(new Integer[] { 0, 1, 2, 4 }));

		final IAggregate<Integer> aggregateB = new Aggregate<Integer>(collectionB);
		final IIterator<Integer> iteratorB = aggregateB.getIterator(2);

		while (iteratorB.hasNext()) {
			System.out.println(iteratorB.next());
		}
	}

}
