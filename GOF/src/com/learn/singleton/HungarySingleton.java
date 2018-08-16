package com.learn.singleton;

/**
 * 【单例模式】
 *   1.构造器私有化；
 *   2.静态私有变量；
 *   3.公开获取对象的方法；
 * @author Administrator
 * 饿汉式单例模式
 *   1.装载类初始化时创建对象；
 *   2.天然线程安全；
 *   3.若未使用，会造成资源浪费。
 *   4.线程安全、效率高、非延时加载。
 */
public class HungarySingleton {
	
	// static变量在类装载时初始化，加载类时，天然的是线程安全的。
	private static /*final*/ HungarySingleton instance = new HungarySingleton();

	// 构造器私有化
	private HungarySingleton() {
	}
	
	// 方法不需要同步，调用效率更高
	public static HungarySingleton getInstance() {
		return instance;
	}
}
