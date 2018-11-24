package com.learn.observer.observer2;

import java.util.Observable;

/**
 * ÏûÏ¢¶©ÔÄÕß
 * 
 * @author Administrator
 *
 */
public class ConcreteObserver implements java.util.Observer {
	private int number;

	@Override
	public void update(Observable arg0, Object arg1) {
		this.number = ((ConcreteObservable) arg0).getNumber();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
