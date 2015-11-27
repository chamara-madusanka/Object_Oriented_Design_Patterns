/**
 * CurrentCondition.java
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
 * This class displays current condition.
 */
public class CurrentCondition implements Observer, Display {

	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentCondition(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/*
	 * @see com.designpattern.observer.def.Display#display()
	 */
	@Override
	public void display() {
		System.out.println("Temperetur : " + temperature);
		System.out.println("Humidity : " + humidity);
		System.out.println("Pressure : " + pressure);
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

}
