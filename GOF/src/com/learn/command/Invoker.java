package com.learn.command;

/**
 * 命令发布者
 * @author Administrator
 *
 */
public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void sendCommand() {
		command.execute();
	}

}
