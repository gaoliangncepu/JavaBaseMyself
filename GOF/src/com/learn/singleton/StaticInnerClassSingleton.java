package com.learn.singleton;

/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * 
 * @author Administrator
 * 	1.��̬�ڲ������ⲿ���ʼ��ʱ�����أ�ʵ������ʱ��ʼ����
 *  2.��̬�ڲ������ʱ����ʵ�������������Ȼ�̰߳�ȫ�ģ�
 *  3.�̰߳�ȫ��Ч�ʸߡ���ʱ���ء����Ƽ����ã�
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
