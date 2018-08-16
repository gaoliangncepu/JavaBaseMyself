package com.learn.singleton;

/**
 * ������ģʽ��
 *   1.������˽�л���
 *   2.��̬˽�б�����
 *   3.������ȡ����ķ�����
 * @author Administrator
 * ����ʽ����ģʽ
 *   1.��ʼ��ʱ����������ʵ���õ�ʱ�Ŵ�����
 *   2.�̰߳�ȫ��Ч����͡���ʱ����
 */
public class LazySingleton {
	
	// װ����ʱ����ʼ���ö���Lazy load��
	private static LazySingleton instance = null;

	// ������˽�л�
	private LazySingleton() {
	}
	
	// ÿ�ε��û�ȡ����ʱ��Ҫͬ��������Ч�ʵͣ���Դ�����ʸߡ�
	public static synchronized LazySingleton getInstance() {
		if (null == instance) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
