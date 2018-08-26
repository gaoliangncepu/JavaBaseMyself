package com.learn.builder;

public class GaoShipBuilder implements ShipBuilder {

	@Override
	public ShipEngine buildEngine() {
		System.out.println("建造高氏发动机");
		ShipEngine obj = new ShipEngine();
		obj.setName("高氏引擎");
		return obj;
	}

	@Override
	public EscapeTower buildTower() {
		System.out.println("建造高氏逃逸塔");
		EscapeTower obj = new EscapeTower();
		obj.setName("高氏逃逸塔");
		return obj;
	}

	@Override
	public OrbitalCabin buildOrbital() {
		System.out.println("建造高氏轨道舱");
		OrbitalCabin obj = new OrbitalCabin();
		obj.setName("高氏引擎");
		return obj;
	}

	

}
