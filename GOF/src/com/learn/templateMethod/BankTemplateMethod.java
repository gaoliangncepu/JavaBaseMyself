package com.learn.templateMethod;

/**
 * 抽象模板方法类
 * @author Administrator
 *
 */
public abstract class BankTemplateMethod {
	
	/*
	 * 固定的业务逻辑部分
	 */
	private void getNumber() {
		System.out.println("取号排队");
	}
	
	/*
	 * 可变的业务逻辑部分
	 * 定义为抽象方法，交给子类实现
	 */
	public abstract void transact();
	
	/*
	 * 固定的业务逻辑部分
	 */
	private void evaluate(){
		System.out.println("反馈评分");
	}
	
	/*
	 * 规定固定的业务流程
	 * 模板方法
	 */
	public final void process() {
		this.getNumber();
		this.transact();//钩子函数
		this.evaluate();
	}
}
