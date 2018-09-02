package com.learn.state;

public class BookedState implements HouseState {

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间已被预订");
	}

}
