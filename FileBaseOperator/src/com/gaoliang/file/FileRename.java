package com.gaoliang.file;

import java.io.File;

public class FileRename {
    public static void main(String[] args) {
         File f1=new File("F:\\EclipseLearnspace\\TestFiles\\Test.txt");
         File f2=new File("F:\\EclipseLearnspace\\TestFiles\\TestNew.txt");
         f1.renameTo(f2);
         System.out.println("文件重命名完成");
    }
}
