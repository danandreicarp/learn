package com.danandreicarp.learn.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeClient {

	public static void main(final String[] args) {
		final Composite compositeA = new Composite();
		final Composite compositeB = new Composite();

		final Component leafA = new Leaf();
		final Leaf leafB = new Leaf();

		final List<Component> elements = new ArrayList<Component>();

		compositeA.add(leafA);
		compositeB.add(compositeA);

		elements.add(compositeA);
		elements.add(leafB);

		for (final Component component : elements) {
			component.operation();
			component.simpleOperation();
		}
	}
}
