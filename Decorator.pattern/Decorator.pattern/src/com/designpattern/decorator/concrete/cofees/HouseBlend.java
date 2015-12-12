/*
 * HouseBlend.java
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
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend cofee";
	}

	@Override
	public double cost() {
		return 12;
	}

}
