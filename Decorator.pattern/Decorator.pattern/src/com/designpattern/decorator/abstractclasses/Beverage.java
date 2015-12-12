/*
 * Beverage.java
 * 
 * Dec 12, 2015
 * 
 * Object oriented design patterns in java 
 */
package com.designpattern.decorator.abstractclasses;

/**
 * This class is the supper class of all the components. 
 * 
 * @author Chamara Madusanka Jayalath
 *
 */
public abstract class Beverage {

	protected String description = "Unkown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
