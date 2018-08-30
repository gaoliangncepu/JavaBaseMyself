package com.learn.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver1 = new ConcreteReceiver1();
		Receiver receiver2 = new ConcreteReceiver2();
		
		Command command1 = new ConcreteCommand1(receiver1);
		ConcreteCommand2 command2 = new ConcreteCommand2();
		ConcreteCommand2 command3 = new ConcreteCommand2();
		command2.addReceiver(receiver1);
		command2.addReceiver(receiver2);
		
		Invoker invoker1 = new Invoker(command1);
		Invoker invoker2 = new Invoker(command2);
		Invoker invoker3 = new Invoker(command3);
		
		invoker1.sendCommand();
		invoker2.sendCommand();
		invoker3.sendCommand();
	}
}
