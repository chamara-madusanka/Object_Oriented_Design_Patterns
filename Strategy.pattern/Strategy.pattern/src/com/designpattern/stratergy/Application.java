/**
 * Application.java
 * 
 * @Author: Chamara Madusanka Jayalath
 * 
 * Created Date: Nov 21, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.stratergy;

import com.designpattern.stratergy.client.Duck;
import com.designpattern.stratergy.client.impl.MalardDuck;
import com.designpattern.stratergy.client.impl.RedHeadDuck;
import com.designpattern.stratergy.client.impl.RubberDuck;

public class Application {

	public static void main(String[] args) {
		System.out.println("Strategy patter");
		showResults(new MalardDuck());
		showResults(new RedHeadDuck());

		Duck duck = new RubberDuck();
		showResults(duck);
		((RubberDuck)duck).changeFlyBehavior();
		showResults(duck);
	}

	private static void showResults(Duck duck) {
		System.out.println("");
		duck.display();
		duck.performQuck();
		duck.performFly();
	}

}
