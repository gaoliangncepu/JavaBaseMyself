package com.learn.GaoL;

/**
 * Java�̲߳���
 * @author Administrator
 * ���������ڲ�Thread��
 */
public class ThreadTest3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("���߳�" + i);
			
			if (3 == i) {
				Thread thread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int j = 0; j < 5; j++) {
							try {
								Thread.sleep(500);//���߳�˯��0.5s
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("��������" + j);
						}
					}
				});
				thread.start();
			}
			
			try {
				Thread.sleep(1000);//���߳�˯��0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
