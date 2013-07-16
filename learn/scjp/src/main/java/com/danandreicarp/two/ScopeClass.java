package com.danandreicarp.two;

public class ScopeClass {
	private int i = 35;
	
	public static void main(String argv[]) {
		int i = 45;
		ScopeClass s = new ScopeClass();
		s.someMethod();
	}
	
	public static void someMethod() {
		// Cannot make a static reference to the non-static field i
		// System.out.println(i);
	}
}
