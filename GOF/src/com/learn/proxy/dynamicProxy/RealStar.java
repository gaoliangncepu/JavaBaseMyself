package com.learn.proxy.dynamicProxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("����̸");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("��ǩ��ͬ");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("�涩Ʊ");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("�泪��");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("����Ǯ");
	}

}
