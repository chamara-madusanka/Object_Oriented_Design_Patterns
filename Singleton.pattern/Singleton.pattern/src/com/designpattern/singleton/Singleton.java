/**
 * 
 */
package com.designpattern.singleton;

/**
 * @author Chamara Jayalath
 *
 */
public class Singleton {

	private static Singleton uniqeInstance;

	private Singleton() {

	}

	public static synchronized Singleton getSingleton() {

		if(uniqeInstance == null) {
			uniqeInstance = new Singleton();
		}

		return uniqeInstance;

	}

}
