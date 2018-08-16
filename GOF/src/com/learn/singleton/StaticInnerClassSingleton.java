package com.learn.singleton;

/**
 * 静态内部类实现单例模式
 * 
 * @author Administrator
 * 	1.静态内部类在外部类初始化时不加载，实现了延时初始化；
 *  2.静态内部类加载时创建实例，类加载是天然线程安全的；
 *  3.线程安全、效率高、延时加载。（推荐试用）
 */
public class StaticInnerClassSingleton {
	
	@SuppressWarnings("unused")
	private static class StaticInnerClass {
		private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
	}
	
	private StaticInnerClassSingleton() {
		
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return StaticInnerClass.instance;
	}
}
