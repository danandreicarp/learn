package com.danandreicarp;

import java.util.ArrayList;

public class Chapter4 {

	public void one() {
		int arrayOne[];
		//int arrayTwo[5];
		//int arrayThree[5] = {1,2,3,4,5};
		int arrayFour[] = {1,2,3,4,5};
	}
	
	public void two() {
		int arrayOne[][] = new int[2][3];
		int arrayTwo[][] = new int[2][];
		//int arrayThree[][] = new int[][];
		//int arrayFour[][] = new int[][3];
		for (int i[] : arrayOne) {
			System.out.println();
			for (int j : i) {
				System.out.print(j);
			}
		}
		
		System.out.println("arrayTwo");
		for (int i[] : arrayTwo) {
			System.out.println();
			/*for (int j : i) {
				System.out.print(j);
			}*/
		}
	}
	
	public void three() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("frog");
		System.out.println(list.contains("cat"));
		//list.hasObject("cat");
		System.out.println(list.indexOf("cat"));
		System.out.println(list.indexOf(1.0));
	}
	
	public static void main(String[] args) {
		Chapter4 chapter = new Chapter4();
		chapter.one();
		chapter.two();
		chapter.three();
	}
}
