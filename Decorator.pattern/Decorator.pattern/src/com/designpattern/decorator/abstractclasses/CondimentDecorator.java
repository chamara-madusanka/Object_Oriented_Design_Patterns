/*
 * CondimentDecorator.java
 * 
 * Dec 12, 2015
 * 
 * Object oriented design patterns in java 
 */
package com.designpattern.decorator.abstractclasses;

/**
 * This is the supper class of all  condiments.
 * This is also an sub-class of the Beverage.
 * 
 * @author Chamara Madusanka Jayalath
 *
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();

}
