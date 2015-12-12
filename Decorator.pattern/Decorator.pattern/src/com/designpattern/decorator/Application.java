/*
 * Application.java
 *  
 * Dec 12, 2015
 *  
 * Object oriented design patterns in java
 */

package com.designpattern.decorator;

import com.designpattern.decorator.abstractclasses.Beverage;
import com.designpattern.decorator.concrete.cofees.Decaf;
import com.designpattern.decorator.concrete.condiments.Milk;
import com.designpattern.decorator.concrete.condiments.Whip;

/**
 * @author Chamara Madusanka Jayalath
 *
 */
public class Application {

	public static void main(String[] args) {
		Beverage decafe = new Decaf();
		decafe = new Milk(decafe);
		decafe = new Whip(decafe);
		System.out.println(decafe.getDescription());
		System.out.println(decafe.cost());
	}

}
