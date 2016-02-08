/**
 * 
 */
package com.designpattern.singleton.doublechecked;

/**
 * @author User
 *
 */
public class Singleton {

	private static Singleton uniqeInstance;

	private Singleton() {

	}

	public static Singleton getSingleton() {

		if(uniqeInstance == null) {

			synchronized (Singleton.class) {
				if(uniqeInstance == null) {
					uniqeInstance = new Singleton();
				}
			}

		}

		return uniqeInstance;

	}

}
