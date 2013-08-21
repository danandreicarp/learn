package com.danandreicarp.book.eight;

import java.io.IOException;

public class Chapter8 {
	public static void main(String[] args) {
		Chapter8 chapter = new Chapter8();
		// chapter.one();
		chapter.five();
	}

	// private void one() throws RuntimeException {

	// Unhandled exception type Throwable
	// private void one() throws Throwable {
	// Unhandled exception type Exception
	// private void one() throws Exception {
	// Unhandled exception type IOException
	// private void one() throws IOException {
	// }

	private void five() {
		String s = null;
		int i = 5;
		i = i/0;
		s += "next";
			
	}
}
