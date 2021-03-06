/*
 * Milk.java
 * 
 * Dec 12, 2015
 * 
 * Object oriented design patterns in java 
 */
package com.designpattern.decorator.concrete.condiments;

import com.designpattern.decorator.abstractclasses.Beverage;
import com.designpattern.decorator.abstractclasses.CondimentDecorator;

/**
 * This is a concrete sub-class of CondimentDecorator.
 * 
 * @author Chamara Madusanka Jayalath
 *
 */
public class Milk extends CondimentDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 5;
	}

}
