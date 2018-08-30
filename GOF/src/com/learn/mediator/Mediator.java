package com.learn.mediator;

public interface Mediator {
	void register(String departmentName, Department department);
	
	void sendCommand(String departmentName);
}
