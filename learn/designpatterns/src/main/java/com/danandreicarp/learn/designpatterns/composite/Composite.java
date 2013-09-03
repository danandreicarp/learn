package com.danandreicarp.learn.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	List<Component> elements;

	public Composite() {
		elements = new ArrayList<Component>();
	}

	@Override
	public void operation() {
		System.out.println("composite operation");
	}

	@Override
	public void simpleOperation() {
		for (final Component component : elements) {
			component.simpleOperation();
		}
	}

	public void add(final Component component) {
		elements.add(component);
	}

	public void remove(final Component component) {
		elements.remove(component);
	}

	public Component get(final int index) {
		return elements.get(index);
	}

}
