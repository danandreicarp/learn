package com.danandreicarp.book.two;

public class Chapter2 {

	public static void main(String[] args) {
		Chapter2 chapter = new Chapter2();
		chapter.two();
		chapter.four();
		chapter.five();
		chapter.six();
	}
	
	private void two() {
		// Type mismatch: cannot convert from String to char
		// char d = "d";
		// Type mismatch: cannot convert from double to float
		// float f = 3.1415;
		int i = 34;
		// Type mismatch: cannot convert from int to byte
		// byte b = 257;
		boolean isPresent = true;		
	}
	
	private void four() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(34.5);
		// The method deleteCharAt(int) in the type StringBuilder is not applicable for the arguments (double)
		// sb.deleteCharAt(34.5);
		// The method toInteger(int) is undefined for the type StringBuilder
		// sb.toInteger(3);
		sb.toString();
	}
	
	private void five() {
		String s = "banana";

		// The method lastIndexOf(int, String) is undefined for the type Chapter2
		// lastIndexOf(2, s);
		System.out.println(s.indexOf('a'));
		System.out.println(s.charAt(2));
		
		// The method indexOf(String, char) is undefined for the type Chapter2
		// indexOf(s, 'v');
	}
	
	private void six() {
		String s1 = "Java";
		String s2 = "java";
		
		processExpression(s1 == s2);
		// The method matchCase(String) is undefined for the type String
		// processExpression(s1.matchCase(s2));
		processExpression(s1.equalsIgnoreCase(s2));
		processExpression(s1.equals(s2));
	}
	
	private void processExpression(boolean expression) {
		if (expression) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
