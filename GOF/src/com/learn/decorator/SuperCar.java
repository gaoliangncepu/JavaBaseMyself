package com.learn.decorator;

/**
 * װ������ɫ
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
		// ���Ϻ��Ķ���Ĺ���
		car.move();
	}
}

//ConcreteDecorator����װ�ν�ɫ
class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	public void fly(){
		System.out.println("���Ϸɣ�");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}
}

//ConcreteDecorator����װ�ν�ɫ
class WaterCar extends SuperCar {
	
	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("ˮ���Σ�");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
}

//ConcreteDecorator����װ�ν�ɫ
class AICar extends SuperCar {
	
	public AICar(ICar car) {
		super(car);
	}
	
	public void autoMove(){
		System.out.println("�Զ��ܣ�");
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
}
