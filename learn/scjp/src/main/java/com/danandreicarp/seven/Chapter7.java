package com.danandreicarp.seven;

public class Chapter7 {
	public static void main(String[] args) {
		Chapter7 chapter = new Chapter7();
		chapter.four();
	}
	
	private void four() {
		int num1 = 3;
		float num2 = 4f;
		
		// Type mismatch: cannot convert from float to int
		//num1 = num2;
		num1 = (int)num2;
		num2 = (float)num1;

		// Syntax error on token "int", invalid ArgumentList
		//num1(int) = num2;
	}
	
}
