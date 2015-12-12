/*
 * Soy.java
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
public class Soy extends CondimentDecorator {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 6;
	}

}
