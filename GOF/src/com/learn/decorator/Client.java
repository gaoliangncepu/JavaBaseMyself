package com.learn.decorator;

public class Client {
	public static void main(String[] args) {
		ICar car1 = new FlyCar(new Car("Benz"));
		car1.move();
		ICar car2 = new WaterCar(new Car("BMW"));
		car2.move();
		ICar car3 = new AICar(new Car("Audi"));
		car3.move();
	}
	
}
