package com.gaoliang.file;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// 要想对文件进行操作，必须先构建文件的对象
        if (f1.exists() == false) {
            System.out.println("文件不存在，删除失败!");
        } else {
            if (f1.delete()) {
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败！");
            }
        }
    }
}
