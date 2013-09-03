package com.danandreicarp.book.two;

public class SomeClass {
	public int i;
	public static void main(String argv[]) {
		SomeClass sc = new SomeClass();
		// Cannot make a static reference to the non-static field i
		// System.out.println(i);
		System.out.println(sc.i);
		// Cannot make a static reference to the non-static field SomeClass.i
		// System.out.println(SomeClass.i);
		System.out.println((new SomeClass()).i);
	}
}
