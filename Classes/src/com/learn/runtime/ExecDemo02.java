package com.learn.runtime;

import java.io.IOException;

public class ExecDemo02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:\\Windows\\notepad.exe");//打开记事本程序，并返回一个进程
		Thread.sleep(3000); //让当前程序停止3秒。
		process.destroy();// 关闭子进程
	}
}
