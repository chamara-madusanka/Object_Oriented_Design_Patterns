/**
 * Application.java
 * 
 * @Author Chamara Madusanka jayalath
 * 
 * Created Date : Nov 25, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.observer;

import com.designpattern.observer.impl.CurrentCondition;
import com.designpattern.observer.impl.ForecastDisplay;
import com.designpattern.observer.impl.WeatherData;

public class Application {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentCondition currentCondition = new CurrentCondition(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(27, 80, 20);
		weatherData.setMeasurements(21, 89, 25);
	}

}
