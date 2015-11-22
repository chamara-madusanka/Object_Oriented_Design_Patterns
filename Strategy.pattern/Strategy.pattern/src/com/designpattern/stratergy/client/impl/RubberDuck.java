/**
 * RubberDuck.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.client.impl;

import com.designpattern.stratergy.client.Duck;
import com.designpattern.stratergy.flybehavior.impl.FlyNoWay;
import com.designpattern.stratergy.flybehavior.impl.FlyWithRocketPower;
import com.designpattern.stratergy.quackbehavior.impl.SQuack;

/**
 * This class is an subclass of the Duck supper class.
 */
public class RubberDuck extends Duck {

	public RubberDuck() {
		setQuackBehavior(new SQuack());
		setFlyBehavior(new FlyNoWay());
	}

	public void changeFlyBehavior() {
		setFlyBehavior(new FlyWithRocketPower());
	}

	@Override
	public void display() {
		System.out.println("This is a RubberDuck.");
	}

}
