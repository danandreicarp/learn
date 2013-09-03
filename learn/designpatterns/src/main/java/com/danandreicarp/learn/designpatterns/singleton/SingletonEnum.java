package com.danandreicarp.learn.designpatterns.singleton;

/**
 * In the second edition of his book Effective Java, Joshua Bloch claims that
 * "a single-element enum type is the best way to implement a singleton" for any Java that supports enums. The use
 * of an enum is very easy to implement and has no drawbacks regarding serializable objects, which have to be
 * circumvented in the other ways.
 * 
 * The public method can be written to take any desired types of arguments; a single String argument is used here as an
 * example.
 * 
 * This approach implements the singleton by taking advantage of Java's guarantee that any enum value is instantiated
 * only once in a Java program. Since Java enum values are globally accessible, so is the singleton. The drawback is
 * that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
 */

public enum SingletonEnum {
	INSTANCE;

	public void execute(final String args) {
		// perform operations here
	}
}
