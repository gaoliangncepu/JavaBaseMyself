package com.learn.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new FreeState());
		context.action();
		// 切换状态
		context.setHouseState(new CheckedInState());
		context.action();
	}
}
