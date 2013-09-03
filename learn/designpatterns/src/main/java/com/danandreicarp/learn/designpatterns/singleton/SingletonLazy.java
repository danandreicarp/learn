package com.danandreicarp.learn.designpatterns.singleton;

/**
 * This method uses double-checked locking, which should not be used prior to J2SE 5.0, as it is vulnerable to subtle
 * bugs. The problem is that an out-of-order write may allow the instance reference to be returned before the Singleton
 * constructor is executed.
 */

public class SingletonLazy {
	private static volatile SingletonLazy instance = null;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy.class) {
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}
		}

		return instance;
	}
}
