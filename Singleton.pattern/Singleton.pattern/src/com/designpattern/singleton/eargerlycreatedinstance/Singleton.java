/**
 * 
 */
package com.designpattern.singleton.eargerlycreatedinstance;

/**
 * @author User
 *
 */
public class Singleton {

	private static Singleton uniqeInstance = new Singleton();

	private Singleton() {

	}

	public static Singleton getSingleton() {

		return uniqeInstance;

	}

}
