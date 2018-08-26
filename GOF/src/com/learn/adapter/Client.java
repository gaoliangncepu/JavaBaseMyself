package com.learn.adapter;

public class Client {
	/*
	 * 面向接口编程，调用指定方法（也可以是回调）
	 */
	private void test(Target target) {
		target.active();
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		
		Target t1 = new Adapter1();
		
		Adaptee adaptee = new Adaptee();
		Target t2 = new Adapter2(adaptee);
		
		client.test(t1);
	}
}
