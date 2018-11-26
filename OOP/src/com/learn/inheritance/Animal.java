package com.learn.inheritance;

public class Animal {
	private String name;
	private int age;
	private int state;
	
	public Animal(String name, int age, int state) {
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	public Animal() {
	}
	
	public void eat() {
		System.out.println("����-��");
	}
	public void sleep() {
		System.out.println("����-˯");
	}
	public void run() {
		System.out.println("����-��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
