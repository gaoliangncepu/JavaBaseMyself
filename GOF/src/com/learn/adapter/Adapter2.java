package com.learn.adapter;

/**
 * ������2
 * @author Administrator
 * ����ϵķ�ʽʵ�֣��Ƽ���
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
