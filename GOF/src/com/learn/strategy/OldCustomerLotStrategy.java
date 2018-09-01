package com.learn.strategy;

public class OldCustomerLotStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打八折");
		return standardPrice * 0.8;
	}

}
