package com.learn.builder;

/**
 * 目标对象
 * @author Administrator
 *
 */
public class AirShip {
	private ShipEngine shipEngine;
	private EscapeTower EscapeTower;
	private OrbitalCabin orbitalCabin;
	
	public ShipEngine getShipEngine() {
		return shipEngine;
	}
	public void setShipEngine(ShipEngine shipEngine) {
		this.shipEngine = shipEngine;
	}
	public EscapeTower getEscapeTower() {
		return EscapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		EscapeTower = escapeTower;
	}
	public OrbitalCabin getOrbitalCabin() {
		return orbitalCabin;
	}
	public void setOrbitalCabin(OrbitalCabin orbitalCabin) {
		this.orbitalCabin = orbitalCabin;
	}
	
	@Override
	public String toString() {
		return this.getShipEngine().getName() + ";" + this.getEscapeTower().getName() + ";" + this.getOrbitalCabin().getName();
	}
}

class ShipEngine {
	private String name;
	private String power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
}

class EscapeTower {
	private String name;
	private String power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
}

class OrbitalCabin {
	private String name;
	private String power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
}