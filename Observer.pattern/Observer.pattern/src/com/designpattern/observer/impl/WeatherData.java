/**
 * WeatherData.java
 * 
 * @Author Chamara Madusanka jayalath
 * 
 * Created Date : Nov 25, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.observer.def.Observer;
import com.designpattern.observer.def.Subject;

/**
 * This is the weather data class and it updates all the
 * observers whenever its states changed.
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	/**
	 * This method is used to register observers.
	 * 
	 * @see com.designpattern.observer.def.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * This method is used to remove observers.
	 * 
	 * @see com.designpattern.observer.def.Subject#removeObserver()
	 */
	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(observer);
		}
	}

	/**
	 * This method is used to notify all the observers.
	 * 
	 * @see com.designpattern.observer.def.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * This method sets all the weather data.
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/**
	 * This method calls notify method whenever changes happen.
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * @return the temperature
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
