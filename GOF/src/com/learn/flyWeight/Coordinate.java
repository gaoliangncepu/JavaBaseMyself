package com.learn.flyWeight;

/**
 * 外部特性
 * 建立单独的类表示外部特性，便于进行外部特性修改。
 * @author Administrator
 *
 */
public class Coordinate {
	private int x,y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
