 /*
 * CurrentConditionDisplay.java
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
public class CurrentConditionDisplay implements Observer {
	
	private Observable weatherData;

	public CurrentConditionDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		if (observable instanceof WeatherData) {
			display();
		}
	}

	/*
	 * This method shows weather data on the screen.
	 */
	private void display() {
		System.out.println("Temperature : " + ((WeatherData) weatherData).getTemperature());
		System.out.println("Humidity : " + ((WeatherData) weatherData).getHumidity());
		System.out.println("Pressure : " + ((WeatherData) weatherData).getPressure());
	}

}
