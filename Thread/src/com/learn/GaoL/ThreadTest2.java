package com.learn.GaoL;

/**
 * Java�̲߳���
 * @author Administrator
 * 
 * ����ʵ��Runnable�ӿ�
 * 1.����һ���࣬ʵ��Runnable�ӿ�
 * 2.ʵ��run()�����������߳�Ҫִ�еĹ��ܣ��߳�ִ���壩</br>
 * 3.�����߳������
 * 4.�����߳�
 */
public class ThreadTest2 {
	class MusicImplement implements Runnable {
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
	
	public static void main(String[] args) {
		ThreadTest2 test = new ThreadTest2();
		for (int i = 0; i < 5; i++) {
			System.out.println("���߳�" + i);
			
			if (3 == i) {
				MusicImplement musicImplement = test.new MusicImplement(); //ʵ�����ڲ������
				Thread thread = new Thread(musicImplement); //�����߳������
				thread.start(); //�������߳�
			}
			
			try {
				Thread.sleep(1000);//���߳�˯��0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
