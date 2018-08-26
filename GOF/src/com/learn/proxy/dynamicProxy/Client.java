package com.learn.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ʹ��JDK�Դ���Proxy������̬����
 * Ҫ�󣺱������ɫ����ʵ��һ���ӿڡ�����ֻ��ͨ���ֽ��������������CGLIB��
 * �������ɫ����ʵ��ɫ����ʵ����ͬ�Ľӿڣ�������ͬ�����������
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		RealStar star = new RealStar();
		StarHandler realStarHandler = new StarHandler(star);
		
		/**
		 * ����ӿڱ��
		 * ʵ�ʴ���ʹ�õ��Ǵ������
		 */
		Star realStarProxy = (Star) Proxy.newProxyInstance(
				star.getClass().getClassLoader(), 
				star.getClass().getInterfaces(), 
				realStarHandler);
		realStarProxy.sing();
	}
}
