/**
 * FlyNoWay.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.flybehavior.impl;

import com.designpattern.stratergy.flybehavior.FlyBehavior;

/**
 * This class provides an implementation to FlyBehavior.
 */
public class FlyNoWay implements FlyBehavior {

	/* 
	 * @see com.designpattern.stratergy.flybehavior.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}
