package com.danandreicarp.learn.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {

	private static List<IElement> visitables = new ArrayList<IElement>();

	public static void main(final String[] args) {
		final IVisitor visitorA = new VisitorA();
		final IVisitor visitorB = new VisitorB();

		final IElement elementA = new ElementA();
		final IElement elementB = new ElementB();

		visitables.add(elementA);
		visitables.add(elementB);

		for (final IElement element : visitables) {
			element.accept(visitorA);
			element.accept(visitorB);
		}

		System.out.println(visitorA.getState());
		System.out.println(visitorB.getState());

	}
}
