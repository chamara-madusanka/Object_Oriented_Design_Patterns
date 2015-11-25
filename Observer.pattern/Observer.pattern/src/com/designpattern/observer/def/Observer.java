/**
 * Observer.java
 * 
 * @Author Chamara Madusanka jayalath
 * 
 * Created Date : Nov 25, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.observer.def;

/**
 * This interface must be implemented by all the observers.
 */
public interface Observer {

	void update(float temperature, float humidity, float pressure);

}
