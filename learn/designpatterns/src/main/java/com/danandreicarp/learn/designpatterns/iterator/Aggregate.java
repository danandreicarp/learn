package com.danandreicarp.learn.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Aggregate<E> implements IAggregate<E> {

	List<E> collection = new ArrayList<E>();

	public Aggregate(final List<E> collection) {
		this.collection = collection;
	}

	@Override
	public IIterator<E> getIterator() {
		return new Iterator(collection);
	}

	@Override
	public IIterator<E> getIterator(final int loops) {
		return new Iterator(collection, loops);
	}

	class Iterator implements IIterator<E> {

		List<E> collection;
		int position;
		int loops;
		int maxLoops;

		public Iterator(final List<E> collection) {
			this(collection, 1);
		}

		public Iterator(final List<E> collection, final int maxLoops) {
			this.collection = collection;
			position = 0;
			loops = 0;
			this.maxLoops = maxLoops - 1;
		}

		@Override
		public E next() {
			if (position < collection.size()) {
				return collection.get(position++);
			}

			if (loops < maxLoops) {
				position = collection.size() - position;
				loops++;

				return collection.get(position++);
			}

			throw new IndexOutOfBoundsException();
		}

		@Override
		public boolean hasNext() {
			if (loops < maxLoops || position < collection.size()) {
				return true;
			}

			return false;
		}

	}

}
