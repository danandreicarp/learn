package com.danandreicarp.book.four;

import java.util.ArrayList;

public class Chapter4 {

	public static void main(String[] args) {
		Chapter4 chapter = new Chapter4();
		chapter.one();
		chapter.two();
		chapter.three();
	}
	
	public void one() {
		int arrayOne[];
		// Syntax error on token "5", delete this token
		// int arrayTwo[5];
		// Syntax error on token "5", delete this token
		// int arrayThree[5] = {1,2,3,4,5};
		int arrayFour[] = {1,2,3,4,5};
	}
	
	public void two() {
		System.out.print("two: ");
		int arrayOne[][] = new int[2][3];
		int arrayTwo[][] = new int[2][];
		// Variable must provide either dimension expressions or an array initializer
		// int arrayThree[][] = new int[][];
		// Cannot specify an array dimension after an empty dimension
		// int arrayFour[][] = new int[][3];
		
		for (int i[] : arrayOne) {
			System.out.println();
			for (int j : i) {
				System.out.print(j);
			}
		}
		System.out.println();
		
		System.out.println("arrayTwo");
		for (int i[] : arrayTwo) {
			System.out.println();
			// null pointer exception
			/*for (int j : i) {
				System.out.print(j);
			}*/
		}
	}
	
	public void three() {
		System.out.println("three: ");
		ArrayList<String> list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("frog");
		System.out.println(list.contains("cat"));
		// The method hasObject(String) is undefined for the type ArrayList<String>
		// list.hasObject("cat");
		System.out.println(list.indexOf("cat"));
		System.out.println(list.indexOf(1.0));
	}
	
}
