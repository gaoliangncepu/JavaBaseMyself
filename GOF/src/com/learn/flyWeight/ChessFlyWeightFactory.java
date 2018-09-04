package com.learn.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工程 创建并管理具体的享元对象，为外界提供服务
 * 
 * @author Administrator
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> chessMap = new HashMap<>();

	public static ChessFlyWeight getChess(String color) {
		if (null == chessMap.get(color)) {
			chessMap.put(color, new ConcreteChess(color));
		}
		return chessMap.get(color);
	}

}
