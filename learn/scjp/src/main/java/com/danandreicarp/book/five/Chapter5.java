package com.danandreicarp.book.five;

public class Chapter5 {
	public static void main(String[] args) {
		Chapter5 chapter = new Chapter5();
		
		chapter.one();
		chapter.two();
		chapter.three();
		chapter.five();
	}

	private void one() {
		int i = 5;
		int j = 10;
		
		while (i < j) {
			i++;
		}
		// Type mismatch: cannot convert from int to boolean
		// while (i) {}
		// Type mismatch: cannot convert from int to boolean
		// while (i = 5) {}
		while ((i = 12) != 5) {
			break;
		}
	}
	
	private void two() {
		int arr[] = {1, 2, 3, 4, 5};
		
		// Can only iterate over an array or an instance of java.lang.Iterable
		/*for (int n : arr[]) {
			System.out.println(n);
		}*/
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// ArrayIndexOutOfBounds
		/*for (int n = 1; n < 6; n++) {
			System.out.println(arr[n] + " ");
		}
		System.out.println();*/
		
		// ArrayIndexOutOfBounds
		/*for (int n = 1; n <= 5; n++) {
			System.out.println(arr[n] + " ");
		}
		System.out.println();*/
	}
	
	private void three() {
		int i = 0;
		do {
			System.out.println(i++);
		} while (i < 5);
		
		int i2 = 0;
		do
			System.out.println(i2++);
		while (i2 < 5);

		// Syntax error, insert ") ;" to complete DoStatement
		/*int i3 = 0;
		do
			System.out.println(i3++);
		while i < 5;*/
		
		// Syntax error, insert "while ( Expression ) ;" to complete DoStatement
		/*int i4 = 0;
		do
			System.out.println(i);
			i++;
		while (i < 5);*/
	}
	
	private void five() {
		int i;
		int j;
		for (i = 1; i < 4; i++) {
			for (j = 2; j < 4; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println("i: " + i + " j: " + j);
			}
		}
	}
}
