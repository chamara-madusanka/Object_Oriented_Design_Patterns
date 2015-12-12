/*
 * DarkRoast.java
 * 
 * Dec 12, 2015
 * 
 * Object oriented design patterns in java 
 */
package com.designpattern.decorator.concrete.cofees;

import com.designpattern.decorator.abstractclasses.Beverage;

/**
 * This is a concrete sub-class of Beverage.
 * 
 * @author Chamara Madusanka Jayalath
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast cofee";
	}

	@Override
	public double cost() {
		return 10;
	}

}
