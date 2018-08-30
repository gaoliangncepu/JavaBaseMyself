package com.learn.command;

public class ConcreteCommand1 implements Command{
	private Receiver receiver = null;

	public ConcreteCommand1(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}
	
}
