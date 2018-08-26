package com.learn.adapter;

/**
 * 适配器2
 * @author Administrator
 * 以组合的方式实现（推荐）
 * 
 */
public class Adapter2 implements Target {

	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void active() {
		adaptee.businessMethod();;
	}
}
