package com.gaoliang.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * 文件的创建，必须指定文件名和后缀名，可以指定文件的生成路径
 *
 */
public class FileCreate {
    public static void main(String[] args) {
        File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// Java中第一个‘\’会被当做是转义字符标志与后面一个字符组成转义字符，因此斜杠必须是‘\\’来表示
        try {

            if(f1.exists()){
                System.out.println("文件已存在无须创建!");
            }else{
                if (f1.createNewFile()) {
                    System.out.println("文件创建成功!");
                }else{
                    System.out.println("文件创建失败!");
                }
            }
        } catch (IOException e) {
        	// File 位于java.io包中，文件相关的操作异常均返回IOException
            e.printStackTrace();
        }

    }
    
    @Test
    public void createFile() {
    	File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// Java中第一个‘\’会被当做是转义字符标志与后面一个字符组成转义字符，因此斜杠必须是‘\\’来表示
        try {

            if(f1.exists()){
                System.out.println("文件已存在无须创建!");
            }else{
                if (f1.createNewFile()) {
                    System.out.println("文件创建成功!");
                }else{
                    System.out.println("文件创建失败!");
                }
            }
        } catch (IOException e) {
        	// File 位于java.io包中，文件相关的操作异常均返回IOException
            e.printStackTrace();
        }
    }
}
