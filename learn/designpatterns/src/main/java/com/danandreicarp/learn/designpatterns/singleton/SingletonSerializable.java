package com.danandreicarp.learn.designpatterns.singleton;

import java.io.Serializable;

/**
 * When we serialize a class and deserialize it then it creates another instance of the singleton class. Basically as
 * many times as you deserialize the singleton instance it will create multiple instance. Well in this case the best way
 * is to make the singleton as enum. In that way the underlying Java implementation takes care of all the details. If
 * this is not possible then we will need to override the readobject() method to return the same singleton instance.
 */

public class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 8527904342589845344L;

	private SingletonSerializable() {

	}

	private static class SingletonSerializableHolder {
		public static final SingletonSerializable INSTANCE = new SingletonSerializable();
	}

	public static SingletonSerializable getInstance() {
		return SingletonSerializableHolder.INSTANCE;
	}

	/**
	 * This method is called immediately after an object of this class is deserialized.
	 * This method returns the singleton instance.
	 * 
	 * @return
	 */
	protected Object readResolve() {
		return getInstance();
	}
}
