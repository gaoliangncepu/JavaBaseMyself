package com.learn.builder;

public class GaoShipBuilder implements ShipBuilder {

	@Override
	public ShipEngine buildEngine() {
		System.out.println("������Ϸ�����");
		ShipEngine obj = new ShipEngine();
		obj.setName("��������");
		return obj;
	}

	@Override
	public EscapeTower buildTower() {
		System.out.println("�������������");
		EscapeTower obj = new EscapeTower();
		obj.setName("����������");
		return obj;
	}

	@Override
	public OrbitalCabin buildOrbital() {
		System.out.println("������Ϲ����");
		OrbitalCabin obj = new OrbitalCabin();
		obj.setName("��������");
		return obj;
	}

	

}
