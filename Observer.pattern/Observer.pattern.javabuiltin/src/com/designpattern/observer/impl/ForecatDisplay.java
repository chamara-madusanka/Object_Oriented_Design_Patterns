 /*
 * ForecatDisplay.java
 *
 * Nov 29, 2015
 *
 * Open source
 */
package com.designpattern.observer.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author Chamara Madusanka Jayalath
 */
public class ForecatDisplay implements Observer {

	private Observable observable;

	public ForecatDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData) {
			display();
		}
	}

	/**
	 * This method displays weather forecast.
	 * 
	 * void
	 */
	private void display() {
		float temperature = ((WeatherData) observable).getTemperature();

		System.out.println("Weather Forecast");

		if (temperature > 27) {
			System.out.println("Sunny Day.");
		} else if (temperature < 23) {
			System.out.println("Rainy day.");
		} else {
			System.out.println("Normal day.");
		}
	}

}
