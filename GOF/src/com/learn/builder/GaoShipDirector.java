package com.learn.builder;

public class GaoShipDirector implements ShipDirector {
	private ShipBuilder builder;

	public GaoShipDirector(ShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directorShip() {
		System.out.println("×°Åä·É´¬");
		AirShip ship = new AirShip();
		ship.setShipEngine(builder.buildEngine());
		ship.setEscapeTower(builder.buildTower());
		ship.setOrbitalCabin(builder.buildOrbital());
		
		return ship;
	}

}
