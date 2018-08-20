package com.learn.adapter;

/**
 * 适配器2
 * @author Administrator
 * 以组合的方式实现（推荐）
 * 
 */
public class Adapter2 implements Target {

	Adaptee adaptee;
	
	@Override
	public void active() {
		adaptee.businessMethod();;
	}

	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
}
