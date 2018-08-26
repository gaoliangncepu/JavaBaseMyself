package com.learn.builder;

public class Client {
	public static void main(String[] args) {
		ShipBuilder builder1 = new GaoShipBuilder();
		ShipBuilder builder2 = new LowShipBuilder();
		ShipDirector director = new GaoShipDirector(builder2);
		
		AirShip ship = director.directorShip();
		System.out.println(ship);
	}
}
