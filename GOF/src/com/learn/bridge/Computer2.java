package com.learn.bridge;

public abstract class Computer2 {
	protected Brand brand = null;
	
	public Computer2(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}
}

class NewDesktop extends Computer2 {
	
	public NewDesktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("Sale Desktop Computer");
	}
}
class NewLaptop extends Computer2 {
	
	public NewLaptop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("Sale Laptop Computer");
	}
}
class NewPad extends Computer2 {
	
	public NewPad(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("Sale Pad Computer");
	}
}
