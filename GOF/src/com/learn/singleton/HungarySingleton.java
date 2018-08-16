package com.learn.singleton;

/**
 * ������ģʽ��
 *   1.������˽�л���
 *   2.��̬˽�б�����
 *   3.������ȡ����ķ�����
 * @author Administrator
 * ����ʽ����ģʽ
 *   1.װ�����ʼ��ʱ��������
 *   2.��Ȼ�̰߳�ȫ��
 *   3.��δʹ�ã��������Դ�˷ѡ�
 *   4.�̰߳�ȫ��Ч�ʸߡ�����ʱ���ء�
 */
public class HungarySingleton {
	
	// static��������װ��ʱ��ʼ����������ʱ����Ȼ�����̰߳�ȫ�ġ�
	private static /*final*/ HungarySingleton instance = new HungarySingleton();

	// ������˽�л�
	private HungarySingleton() {
	}
	
	// ��������Ҫͬ��������Ч�ʸ���
	public static HungarySingleton getInstance() {
		return instance;
	}
}
