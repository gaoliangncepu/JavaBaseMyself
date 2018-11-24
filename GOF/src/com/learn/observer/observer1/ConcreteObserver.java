package com.learn.observer.observer1;

public class ConcreteObserver implements Observer {
	private int number;

	@Override
	public void update(ConcreteObservable subject) {
		// TODO Auto-generated method stub
		this.number = subject.getNumber();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
