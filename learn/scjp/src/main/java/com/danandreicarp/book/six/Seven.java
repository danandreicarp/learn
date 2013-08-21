package com.danandreicarp.book.six;

public class Seven {
	public static void main(String args[]) {
		String s = "string 1";
		int i = 5;
		someMethod1(i);
		System.out.println(i);
		someMethod2(s);
		System.out.println(s);
	}

	public static void someMethod1(int i) {
		System.out.println(++i);
	}

	public static void someMethod2(String s) {
		s = "string 2";
		System.out.println(s);
	}
}
