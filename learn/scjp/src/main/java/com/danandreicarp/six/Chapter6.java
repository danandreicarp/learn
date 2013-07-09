package com.danandreicarp.six;

public class Chapter6 {
	
	private void two(String[] parameters) {
		System.out.println(parameters);
	}
	
	private static void seven1(int i) {
		System.out.println(++i);
	}
	
	private static void seven2(String s) {
		s = "string 2";
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Chapter6 chapter = new Chapter6();
		//chapter.two();
		
		String s = "string 1";
		int i = 5;
		seven1(i);
		System.out.println(i);
		seven2(s);
		System.out.println(s);
		
	}
}
