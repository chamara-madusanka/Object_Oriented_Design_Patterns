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

	/*
	 * These are the behaviors that varies. So separate those from Duck class and give references to
	 * those behaviors. Expose setter methods to instantiate dynamically.
	 */
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	/**
	 * This is an abstract method which is implemented by all the sub classes.
	 * Display will be defer to each other.
	 */
	public abstract void display();

	/**
	 * This is a common method for all ducks. This is inherited by all sub classes.
	 */
	public void swim() {
		System.out.println("All the ducks can swim. This is an unchanged behavior for all ducks");
	}

	/**
	 * This is a common method for all ducks. This is inherited by all sub classes.
	 */
	public void performQuck() {
		quackBehavior.quack();
	}

	/**
	 * This is a common method for all ducks. This is inherited by all sub classes.
	 */
	public void performFly() {
		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
