package com.learn.proxy.dynamicProxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("真面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("真签合同");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("真订票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("真唱歌");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("真收钱");
	}

}
