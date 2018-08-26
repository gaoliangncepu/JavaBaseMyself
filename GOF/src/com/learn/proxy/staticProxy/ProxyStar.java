package com.learn.proxy.staticProxy;

/**
 * 代理角色
 * 必须与真实角色实现相同的接口。
 * 静态代理：代理角色由程序员手动创建，无法在程序执行过程中动态生成。
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
		System.out.println("代理面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("代理谈合同");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("代理订票");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("代理收钱");
	}

}
