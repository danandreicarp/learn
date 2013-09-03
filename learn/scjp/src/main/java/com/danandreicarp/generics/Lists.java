package com.danandreicarp.generics;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	public static void main(final String[] args) {
		// Cannot instantiate the type ArrayList<?>
		// final List<?> genList = new ArrayList<?>();
		final List<Object> objList = new ArrayList<Object>();

		final List<Integer> intList = new ArrayList<Integer>();
		// Type mismatch: cannot convert from List<Integer> to List<Number>
		// final List<Number> numList = intList;

		// Cannot instantiate the type ArrayList<? extends Number>
		// final List<? extends Number> extNumList = new ArrayList<? extends Number>();

		final List<? extends Number> extNumList = new ArrayList<Number>();
		// Type mismatch: cannot convert from List<capture#1-of ? extends Number> to List<? extends Integer>
		// final List<? extends Integer> extIntList = extNumList;

		final List<? extends Integer> extIntList = new ArrayList<Integer>();
		final List<? extends Number> extNumList2 = extIntList;
	}
}
