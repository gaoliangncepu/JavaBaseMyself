package com.learn.observer.observer1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable {
	private int number;
	private List<Observer> observers = new ArrayList<>();

	public void change(int num) {
		this.number = num;

		notifyObservers();
	}

	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public void addObservers(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
