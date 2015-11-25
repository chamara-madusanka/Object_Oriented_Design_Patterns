/**
 * Subject.java
 * 
 * @Author Chamara Madusanka jayalath
 * 
 * Created Date : Nov 25, 2015
 * 
 * Object oriented design patterns
 */
package com.designpattern.observer.def;

/**
 * This interface must be implemented by all the subjects.
 */
public interface Subject {

	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();

}
