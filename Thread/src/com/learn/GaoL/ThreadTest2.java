package com.learn.GaoL;

/**
 * Java线程测试
 * @author Administrator
 * 
 * 二、实现Runnable接口
 * 1.定义一个类，实现Runnable接口
 * 2.实现run()方法，即新线程要执行的功能（线程执行体）</br>
 * 3.创建线程类对象
 * 4.开启线程
 */
public class ThreadTest2 {
	class MusicImplement implements Runnable {
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
	
	public static void main(String[] args) {
		ThreadTest2 test = new ThreadTest2();
		for (int i = 0; i < 5; i++) {
			System.out.println("主线程" + i);
			
			if (3 == i) {
				MusicImplement musicImplement = test.new MusicImplement(); //实例化内部类对象
				Thread thread = new Thread(musicImplement); //创建线程类对象
				thread.start(); //开启子线程
			}
			
			try {
				Thread.sleep(1000);//主线程睡眠0.5s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
