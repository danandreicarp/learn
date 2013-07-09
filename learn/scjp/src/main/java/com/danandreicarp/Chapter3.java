package com.danandreicarp;

public class Chapter3 {
	private void five() {
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
	
	private void three() {
		System.out.print("three: ");
		System.out.println(16 >>> 3);
	}
	
	public static void main(String[] args) {
		Chapter3 chapter = new Chapter3();
		chapter.three();
		chapter.five();
	}
}
