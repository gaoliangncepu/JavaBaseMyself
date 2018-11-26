package com.learn.GaoL;

/**
 * Java线程测试
 * @author Administrator
 * 三、匿名内部Thread类
 */
public class ThreadTest3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("主线程" + i);
			
			if (3 == i) {
				Thread thread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int j = 0; j < 5; j++) {
							try {
								Thread.sleep(500);//子线程睡眠0.5s
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("播放音乐" + j);
						}
					}
				});
				thread.start();
			}
			
			try {
				Thread.sleep(1000);//主线程睡眠0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
