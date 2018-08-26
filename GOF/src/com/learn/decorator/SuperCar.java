package com.learn.decorator;

/**
 * 装饰器角色
 * @author Administrator
 *
 */
public abstract class SuperCar implements ICar{
	protected ICar car;

	protected SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		// 整合核心对象的功能
		car.move();
	}
}

//ConcreteDecorator具体装饰角色
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	public void fly(){
		System.out.println("天上飞！");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}

//ConcreteDecorator具体装饰角色
class WaterCar extends SuperCar {
	
	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("水上游！");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
}

//ConcreteDecorator具体装饰角色
class AICar extends SuperCar {
	
	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove(){
		System.out.println("自动跑！");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
}
