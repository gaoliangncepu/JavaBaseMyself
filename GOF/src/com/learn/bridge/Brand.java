package com.learn.bridge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("Sale Lenovo Computer");
	}
}

class Dell implements Brand {
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("Sale Dell Computer");
	}
}

class Shenzhou implements Brand {
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("Sale Shenzhou Computer");
	}
}
