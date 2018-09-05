package com.learn.observer.observer2;

/**
 * 消息发布者
 * 
 * @author Administrator
 *
 */
public class ConcreteObservable extends java.util.Observable {
	private int number;

	public void change(int num) {
		this.number = num;
		// 广播信息
		setChanged();
		notifyObservers(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
