package com.learn.state;


public class Context {
	private HouseState houseState;

	public Context(HouseState houseState) {
		super();
		this.houseState = houseState;
	}

	public Context() {
		super();
	}

	public void setHouseState(HouseState houseState) {
		this.houseState = houseState;
	}
	
	public void action() {
		houseState.handle();
	}
}
