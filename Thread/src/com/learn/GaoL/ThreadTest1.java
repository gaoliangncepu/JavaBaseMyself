package com.learn.GaoL;

/**
 * Java�̲߳���
 * @author Administrator</br>
 * 
 * һ���̳�Thread��</br>
 * 1.����һ���࣬�̳���Thread��</br>
 * 2.��дrun()�����������߳�Ҫִ�еĹ��ܣ��߳�ִ���壩</br>
 * 3.���������У������߳����ʵ���������߳�
 */
public class ThreadTest1 {
	class MusicThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);//���߳�˯��0.5s
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("��������" + i);
			}
		}
	}
	
	// ͨ�������������߳�˯��ʱ�䣬�����߳�ִ��˳�򣺲��������߳�ִ�н��������̲߳�ִ�У�������ͬʱ���е�
	public static void main(String[] args) {
		ThreadTest1 test = new ThreadTest1();
		for (int i = 0; i < 5; i++) {
			System.out.println("���߳�" + i);
			
			if (3 == i) {
				MusicThread musivThread = test.new MusicThread();// ʵ�����ڲ������
				musivThread.start();//�������߳�
			}
			
			try {
				Thread.sleep(1000);//���߳�˯��0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
