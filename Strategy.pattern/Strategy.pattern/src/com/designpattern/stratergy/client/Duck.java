/**
 * Duck.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.client;

import com.designpattern.stratergy.flybehavior.FlyBehavior;
import com.designpattern.stratergy.quackbehavior.QuackBehavior;

/**
 * This class is the supper class for all the duck subclasses.
 */
public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public abstract void display();

	public void swim() {
		System.out.println("All the ducks can swim. This is an unchanged behavior for all ducks");
	}

	public void performQuck() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
