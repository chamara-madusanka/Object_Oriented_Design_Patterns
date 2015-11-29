 /*
 * WeatherData.java
 *
 * Nov 29, 2015
 *
 * Open source
 */
package com.designpattern.observer.impl;

import java.util.Observable;

/**
 * 
 * @author Chamara Madusanka Jayalath
 */
public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * Default constructor
	 */
	public WeatherData() {
		
	}

	/**
	 * This method is invoked whenever measurements change happens.
	 * 
	 * void
	 */
	public void setChanges(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/*
	 * This method invokes setChanged and notifyObservers methods of the supper class
	 */
	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	/**
	 * @return the tempereture
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

}
