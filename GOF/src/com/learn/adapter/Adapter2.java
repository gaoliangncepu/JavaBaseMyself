package com.learn.adapter;

/**
 * ������2
 * @author Administrator
 * ����ϵķ�ʽʵ�֣��Ƽ���
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
