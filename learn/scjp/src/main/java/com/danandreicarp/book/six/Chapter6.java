package com.danandreicarp.book.six;

public class Chapter6 {
	
	public static void main(String[] args) {
		Chapter6 chapter = new Chapter6();
		// Cannot make a static reference to the non-static method two(String[]) from the type Chapter6
		// two(args);
	}
	
	private void two(String[] parameters) {
		System.out.println(parameters);
	}
	
}
