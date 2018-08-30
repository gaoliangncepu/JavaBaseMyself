package com.learn.mediator;

public class Client {
	public static void main(String[] args) {
		President president = new President();
		
		Development development = new Development(president);
		Market market = new Market(president);
		Finacial finacial = new Finacial(president);
		
		president.sendCommand("development");
		market.outAction();
	}
}
