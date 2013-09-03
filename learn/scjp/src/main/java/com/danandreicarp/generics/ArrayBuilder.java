package com.danandreicarp.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBuilder {
	public static <T> void addToList(final List<T> listArg, final T... elements) {
		for (final T x : elements) {
			listArg.add(x);
		}
	}

	public static void faultyMethod(final List<String>... l) {
		final Object[] objectArray = l;
		objectArray[0] = Arrays.asList(42);
		// Exception in thread "main" java.lang.ClassCastException: java.lang.Integer
		// cannot be cast to java.lang.String
		final String s = l[0].get(0);
	}

	public static void main(final String[] args) {
		final List<String> stringListA = new ArrayList<String>();
		final List<String> stringListB = new ArrayList<String>();

		ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
		ArrayBuilder.addToList(stringListA, "Ten", "Eleven", "Twelve");

		final List<List<String>> listOfStringLists = new ArrayList<List<String>>();

		ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

		ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
	}
}
