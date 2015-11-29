/*
 * Application.java
 * 
 * @version 1.0
 * 
 * Nov 29, 2015
 * 
 * @Author Chamara Madusanka Jayalath
 * 
 * 
 */

package com.designpattern.observer;

import com.designpattern.observer.impl.CurrentConditionDisplay;
import com.designpattern.observer.impl.ForecatDisplay;
import com.designpattern.observer.impl.WeatherData;

public class Application {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecatDisplay forecatDisplay = new ForecatDisplay(weatherData);
		weatherData.setChanges(25, 80, 30);
		weatherData.setChanges(28, 70, 25);
	}

}
