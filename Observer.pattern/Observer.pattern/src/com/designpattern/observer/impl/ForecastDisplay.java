/**
 * ForecastDisplay.java
 * 
 * @Author Chamara Madusanka jayalath
 * 
 * Created Date : Nov 27, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.observer.impl;

import com.designpattern.observer.def.Display;
import com.designpattern.observer.def.Observer;
import com.designpattern.observer.def.Subject;

/**
 * This class displays the forecast.
 */
public class ForecastDisplay implements Display, Observer {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*
	 * @see com.designpattern.observer.def.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	/*
	 * @see com.designpattern.observer.def.Display#display()
	 */
	@Override
	public void display() {
		System.out.println("Today weather forecast.");
		
		if ( temperature > 27 ) {
			System.out.println("Today is a sunny day.");
		} else if ( temperature < 25 ) {
			System.out.println("Today is a rainy day.");
		} else {
			System.out.println("Today is a normal day.");
		}
	}

}
