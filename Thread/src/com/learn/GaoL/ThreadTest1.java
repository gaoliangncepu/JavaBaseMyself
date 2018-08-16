package com.learn.GaoL;

/**
 * Java线程测试
 * @author Administrator</br>
 * 
 * 一、继承Thread类</br>
 * 1.定义一个类，继承于Thread类</br>
 * 2.重写run()方法，即新线程要执行的功能（线程执行体）</br>
 * 3.在主程序中，创建线程类的实例，启动线程
 */
public class ThreadTest1 {
	class MusicThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);//子线程睡眠0.5s
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("播放音乐" + i);
			}
		}
	}
	
	// 通过控制主、子线程睡眠时间，测试线程执行顺序：并不是子线程执行结束，主线程才执行，它俩是同时进行的
	public static void main(String[] args) {
		ThreadTest1 test = new ThreadTest1();
		for (int i = 0; i < 5; i++) {
			System.out.println("主线程" + i);
			
			if (3 == i) {
				MusicThread musivThread = test.new MusicThread();// 实例化内部类对象
				musivThread.start();//开启子线程
			}
			
			try {
				Thread.sleep(1000);//主线程睡眠0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
