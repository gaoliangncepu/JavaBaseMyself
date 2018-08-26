package com.learn.bridge;

public class Client {
	public static void main(String[] args) {
		Computer2 computer2 = new NewLaptop(new Lenovo());
		computer2.sale();
		
		Computer2 computer22 = new NewDesktop(new Dell());
		computer22.sale();
	}
}
