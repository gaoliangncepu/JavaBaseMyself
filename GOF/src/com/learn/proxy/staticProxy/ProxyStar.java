package com.learn.proxy.staticProxy;

/**
 * �����ɫ
 * ��������ʵ��ɫʵ����ͬ�Ľӿڡ�
 * ��̬���������ɫ�ɳ���Ա�ֶ��������޷��ڳ���ִ�й����ж�̬���ɡ�
 * @author Administrator
 *
 */
public class ProxyStar implements Star{
	private Star star = null;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("������̸");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("����̸��ͬ");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("����Ʊ");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("������Ǯ");
	}

}
