package com.learn.runtime;

import java.io.IOException;

public class ExecDemo02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:\\Windows\\notepad.exe");//�򿪼��±����򣬲�����һ������
		Thread.sleep(3000); //�õ�ǰ����ֹͣ3�롣
		process.destroy();// �ر��ӽ���
	}
}
