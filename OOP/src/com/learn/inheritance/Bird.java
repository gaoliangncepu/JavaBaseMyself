package com.learn.inheritance;

public class Bird extends Animal{
	
	private String location;
	
	@Override
	public void run() {
		super.run();
		System.out.println("Äñ-·É");
	}
	
	@Override
	public String toString() {
		return "Bird [getName()=" + getName() + ", getAge()=" + getAge() + ", getState()=" + getState()
				+ ", getClass()=" + getClass() + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
