/**
 * 
 */
package com.designpattern.singleton.eagerlycreatedinstance;

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
