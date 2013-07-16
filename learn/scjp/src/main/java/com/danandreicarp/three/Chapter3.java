package com.danandreicarp.three;

public class Chapter3 {
	
	public static void main(String[] args) {
		Chapter3 chapter = new Chapter3();
		chapter.one();
		chapter.two();
		chapter.three();
		chapter.five();
	}
	
	private void one() {
		System.out.print("one: ");
		System.out.println(4 % 3);
	}
	
	private void two() {
		System.out.println("two: ");
		System.out.println(2 + 4 * 3 - 7);
		System.out.println((2 + 4) * (3 - 7));
		System.out.println(2 + (4 * 3) - 7);
		System.out.println(((2 + 4) * 3) - 7);
	}
	
	private void three() {
		System.out.print("three: ");
		System.out.println(16 >>> 3);
	}
	
	private void five() {
		System.out.println("five: ");
		switch (5) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
		default:
			System.out.println("default");
		case 2:
			System.out.println("two");
		}
	}
	
}
