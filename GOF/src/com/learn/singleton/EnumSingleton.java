package com.learn.singleton;

/**
 * 枚举类的元素天然是单例模式
 * 
 * @author Administrator
 * 	1.线程安全、效率高、非延时加载。（推荐使用）
 */
public enum EnumSingleton {
	INSTANCE;
	
	private static void otherOperation() {
		// 此处可以添加进行其他相关操作或处理的代码
	}
}
