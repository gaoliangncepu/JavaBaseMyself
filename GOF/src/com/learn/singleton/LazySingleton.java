package com.learn.singleton;

/**
 * 【单例模式】
 *   1.构造器私有化；
 *   2.静态私有变量；
 *   3.公开获取对象的方法；
 * @author Administrator
 * 懒汉式单例模式
 *   1.初始化时不创建对象，实际用到时才创建；
 *   2.线程安全、效率最低、延时加载
 */
public class LazySingleton {
	
	// 装载类时不初始化该对象（Lazy load）
	private static LazySingleton instance = null;

	// 构造器私有化
	private LazySingleton() {
	}
	
	// 每次调用获取方法时都要同步，并发效率低；资源利用率高。
	public static synchronized LazySingleton getInstance() {
		if (null == instance) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
