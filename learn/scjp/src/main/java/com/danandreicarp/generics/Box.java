package com.danandreicarp.generics;

/**
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 */
public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(final T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	private void testNumBox(final Box<Number> numBox) {
		System.out.println(numBox.toString());
	}

	public static void main(final String[] args) {
		Box<Integer> intBox = new Box<Integer>();

		final Box<String> strBox = new Box<String>();

		// Box is a raw type. References to generic type Box<T> should be parameterized
		Box rawBox = new Box();

		// Type safety: The expression of type Box needs unchecked conversion to conform to Box<Integer>
		intBox = rawBox;

		rawBox = strBox;

		// Type safety: The method set(Object) belongs to the raw type Box. References to generic type Box<T> should be
		// parameterized
		rawBox.set(8);

		final Box<Number> numBox = new Box<Number>();

		numBox.set(new Integer(10));
		numBox.set(new Double(10));

		// The method testNumBox(Box<Number>) in the type App is not applicable for the arguments (Box<Integer>)
		// testNumBox(new Box<Integer>());

		// The method testNumBox(Box<Number>) in the type App is not applicable for the arguments (Box<Double>)
		// testNumBox(new Box<Double>());
	}
}
