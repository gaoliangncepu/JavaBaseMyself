package com.gaoliang.file;

import java.io.File;

public class FileProperties {
	
	public static void main(String[] args) {

        // 文件属性的读取
        File file = new File("F:\\EclipseLearnspace\\TestFiles\\TestNew.txt");

        // 判断文件是否存在
        System.out.println("判断文件是否存在:" + file.exists());

        // 读取文件名称
        System.out.println("读取文件名称:" + file.getName());

        // 读取文件路径
        System.out.println("读取文件路径:" + file.getPath());

        // 读取文件绝对路径
        System.out.println("读取文件绝对路径:" + file.getAbsolutePath());

        // 读取文件父级路径
        System.out.println("父级文件路径：" + new File(file.getAbsolutePath()).getParent());

        // 读取文件大小
        System.out.println("文件大小:" + (float) file.length() / 1000 + "Kb");

        // 文件是否被隐藏
        System.out.println("文件是否被隐藏:" + file.isHidden());

        // 文件是否可读
        System.out.println("文件是否可读:" + file.canRead());

        // 文件是否可写
        System.out.println("文件是否可写:" + file.canWrite());

        //判断是否为文件夹
        System.out.println("判断是否为文件夹:"+file.isDirectory());
        
        //将文件属性设置为不可写:
        file.setWritable(false);
        System.out.println("设置后文件是否可写:" + file.canWrite());

        //将文件属性设置为不可读：
        file.setReadable(false);
        System.out.println("设置后文件是否可读:" + file.canWrite());
        
        //设定文件只读：
        file.setReadOnly();
	}
}
