package com.danandreicarp.learn.designpatterns.singleton;

/**
 * University of Maryland Computer Science researcher Bill Pugh has written about the code issues underlying the
 * Singleton pattern when implemented in Java. Pugh’s efforts on the “Double-checked locking” idiom led to changes in
 * the Java memory model in Java 5 and to what is generally regarded as the standard method to implement Singletons in
 * Java. The technique is known as the initialization on demand holder idiom, is as lazy as possible, and works in all
 * known versions of Java. It takes advantage of language guarantees about class initialization, and will therefore work
 * correctly in all Java-compliant compilers and virtual machines.
 * 
 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than the moment that
 * getInstance() is called. Thus, this solution is thread-safe without requiring special language constructs (i.e.
 * volatile or synchronized).
 * 
 * Alternatively, the inner class SingletonHolder can be also substituted by implementing a Property which provides also
 * access to the static final/read-only class members. Just like the lazy object in C#, whenever the Singleton.INSTANCE
 * property is called, this singleton is instantiated for the very first time.
 */

public class SingletonPugh {

	private SingletonPugh() {

	}

	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance()
	 * or the first access to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final SingletonPugh INSTANCE = new SingletonPugh();
	}

	public static SingletonPugh getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
