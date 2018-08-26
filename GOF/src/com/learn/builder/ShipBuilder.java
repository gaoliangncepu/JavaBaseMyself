package com.learn.builder;

public interface ShipBuilder {
	ShipEngine buildEngine();
	EscapeTower buildTower();
	OrbitalCabin buildOrbital();
}
