package com.learn.proxy.staticProxy;

public class Client {
	public static void main(String[] args) {
		Star star = new ProxyStar(new RealStar());
		
		star.signContract();
		star.sing();
		star.collectMoney();
	}
}
