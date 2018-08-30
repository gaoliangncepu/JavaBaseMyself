package com.learn.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator{
	private Map<String, Department> map =  new HashMap<>();

	@Override
	public void register(String departmentName, Department department) {
		// TODO Auto-generated method stub
		map.put(departmentName, department);
	}

	@Override
	public void sendCommand(String departmentName) {
		// TODO Auto-generated method stub
		map.get(departmentName).selfAction();
	}

}
