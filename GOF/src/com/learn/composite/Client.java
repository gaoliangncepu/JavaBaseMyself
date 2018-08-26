package com.learn.composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("�ļ���1");
		
		f2 = new ImageFile("ͼƬ.jpg");
		f3 = new TextFile("Hello.txt");
		f1.addFile(f2);
		f1.addFile(f3);
		
		Folder f11 = new Folder("�ļ���2");
		f4 = new VideoFile("��Ƶ.avi");
		f5 = new VideoFile("��Ƭ.avi");
		f11.addFile(f4);
		f11.addFile(f5);
		f1.addFile(f11);
		
		
//		f2.killVirus();
		
		f1.killVirus();
		
		
	}
}
