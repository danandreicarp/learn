package com.danandreicarp.generics;

import java.util.List;

public class WildcardError {

	/*
	 * void foo(final List<?> i) {
	 * // The method set(int, capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments
	 * // (int, capture#2-of ?)
	 * i.set(0, i.get(0));
	 * }
	 */

	private void foo(final List<?> i) {
		fooHelper(i);
	}

	private <T> void fooHelper(final List<T> i) {
		i.set(0, i.get(0));
	}
}