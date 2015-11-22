/**
 * MalardDuck.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 22, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy.client.impl;

import com.designpattern.stratergy.client.Duck;

/**
 * This class is an subclass of the Duck supper class.
 */
public class MalardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("This is a MallardDuck.");
	}

}
