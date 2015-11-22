/**
 * Quack.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.quackbehavior.impl;

import com.designpattern.stratergy.quackbehavior.QuackBehavior;

/**
 * This class provides an implementation to QuackBehavior.
 */
public class Quack implements QuackBehavior {

	/* 
	 * @see com.designpattern.stratergy.quackbehavior.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("I am qucking.");
	}

}
