package com.learn.adapter;

public class Client {
	public static void main(String[] args) {
		Adapter1 adapter1 = new Adapter1();
		adapter1.active();
		
		Adaptee adaptee = new Adaptee();
		Adapter2 adapter2 = new Adapter2(adaptee);
		adapter2.active();
	}
}
