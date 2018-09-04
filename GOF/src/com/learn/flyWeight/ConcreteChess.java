package com.learn.flyWeight;

/**
 * 具体享元对象
 * 包含相似的内部特性
 * @author Administrator
 *
 */
public class ConcreteChess implements ChessFlyWeight {
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void display(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("棋子颜色:" + color);
		System.out.println("棋子位置:(" + c.getX() + "," + c.getY() + ")");
	}
}
