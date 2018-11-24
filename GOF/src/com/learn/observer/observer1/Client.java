package com.learn.observer.observer1;

public class Client {
	public static void main(String[] args) {
		ConcreteObserver observer1 = new ConcreteObserver();
		ConcreteObserver observer2 = new ConcreteObserver();

		ConcreteObservable observable = new ConcreteObservable();
		observable.addObservers(observer1);
		observable.addObservers(observer2);

		observable.change(100);
		System.out.println(observer1.getNumber());
		System.out.println(observer2.getNumber());
		observable.change(200);
		System.out.println(observer1.getNumber());
		System.out.println(observer2.getNumber());
	}
}
