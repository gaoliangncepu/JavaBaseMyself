package com.learn.adapter;

/**
 * 适配器1
 * @author Administrator
 * 以继承的方式实现
 * 	直接拥有父类的方法，可以直接调用
 */
public class Adapter1 extends Adaptee implements Target {

	@Override
	public void active() {
		super.businessMethod();

	}

}
