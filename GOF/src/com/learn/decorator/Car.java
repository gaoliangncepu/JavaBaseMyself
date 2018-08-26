package com.learn.decorator;

/**
 * ºËÐÄ½ÇÉ«
 */
public class Car implements ICar {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name + "car is running!");
	}
}
