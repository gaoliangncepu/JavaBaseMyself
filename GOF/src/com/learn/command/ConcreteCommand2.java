package com.learn.command;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCommand2 implements Command{
	private List<Receiver> receivers = new ArrayList<>();
	
	public void addReceiver(Receiver receiver) {
		this.receivers.add(receiver);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		if (!receivers.isEmpty()) {
			for (Receiver receiver : receivers) {
				receiver.action();
			}
		}
	}
	
}
