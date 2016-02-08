package com.designpattern.singleton;
/**
 * 
 */

/**
 * @author Chamara Jayalath
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton singletonA = Singleton.getSingleton();
		Singleton singletonB = Singleton.getSingleton();

		System.out.println("singletonA : " + singletonA.toString());
		System.out.println("singletonB : " + singletonB.toString());

		System.out.println("singletonA && sigletonB same ? " + (singletonA == singletonB));

	}

}
