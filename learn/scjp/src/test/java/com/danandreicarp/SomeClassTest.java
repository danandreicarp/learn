package com.danandreicarp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SomeClassTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public SomeClassTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(SomeClassTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testSomeClass() {
		assertTrue(true);
	}
}
