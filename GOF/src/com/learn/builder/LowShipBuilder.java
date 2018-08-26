package com.learn.builder;

public class LowShipBuilder implements ShipBuilder {

	@Override
	public ShipEngine buildEngine() {
		System.out.println("建造低氏发动机");
		ShipEngine obj = new ShipEngine();
		obj.setName("低氏引擎");
		return obj;
	}

	@Override
	public EscapeTower buildTower() {
		System.out.println("建造低氏逃逸塔");
		EscapeTower obj = new EscapeTower();
		obj.setName("低氏逃逸塔");
		return obj;
	}

	@Override
	public OrbitalCabin buildOrbital() {
		System.out.println("建造低氏轨道舱");
		OrbitalCabin obj = new OrbitalCabin();
		obj.setName("低氏引擎");
		return obj;
	}

	

}
