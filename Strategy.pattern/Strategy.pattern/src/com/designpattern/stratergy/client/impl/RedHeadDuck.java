/**
 * RedHeadDuck.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.client.impl;

import com.designpattern.stratergy.client.Duck;
import com.designpattern.stratergy.flybehavior.impl.FlyWithWings;
import com.designpattern.stratergy.quackbehavior.impl.Quack;

/**
 * This class is an subclass of the Duck supper class.
 */
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("This is a Red Head Duck.");
	}

}
