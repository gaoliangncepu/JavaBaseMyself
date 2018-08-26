package com.learn.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 使用JDK自带的Proxy创建动态代理
 * 要求：被代理角色必须实现一个接口。否则只能通过字节码操作创建，如CGLIB。
 * （代理角色和真实角色必须实现相同的接口，采用相同的类加载器）
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		RealStar star = new RealStar();
		StarHandler realStarHandler = new StarHandler(star);
		
		/**
		 * 面向接口编程
		 * 实际创建使用的是代理对象
		 */
		Star realStarProxy = (Star) Proxy.newProxyInstance(
				star.getClass().getClassLoader(), 
				star.getClass().getInterfaces(), 
				realStarHandler);
		realStarProxy.sing();
	}
}
