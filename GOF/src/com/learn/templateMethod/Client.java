package com.learn.templateMethod;

public class Client {
	public static void main(String[] args) {
		// 使用匿名内部类的形式
		BankTemplateMethod btm1 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				// TODO Auto-generated method stub
				System.out.println("存钱");
			}
		};
		
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				// TODO Auto-generated method stub
				System.out.println("取钱");
			}
		};
		
		btm1.process();
		btm2.process();
	}
}
