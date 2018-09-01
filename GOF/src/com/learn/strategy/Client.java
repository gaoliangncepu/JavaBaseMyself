package com.learn.strategy;

public class Client {
	public static void main(String[] args) {
		
		Strategy strategy1 = new OldCustomerFewStrategy();
		Strategy strategy2 = new NewCustomerLotStrategy();
		
		Context context1 = new Context(strategy1);
		context1.pringPrice(100);
		
		Context context2 = new Context(strategy2);
		context2.pringPrice(100);
	}
}
