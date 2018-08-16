package com.gaoliang.file;

import java.io.File;

public class FileFolderTraversal {
	public static void main(String[] args) {

        // 遍历文件夹
        File dir=new File("F:\\EclipseLearnspace\\TestFiles\\TestFiles");
//        File dir=new File("../");
        printFiles(dir,1);

    }

    public static void  printFiles(File dir,int tab){
        if(dir.isDirectory()){
            File next[]=dir.listFiles();
            for (int i = 0; i < next.length; i++) {
                for(int j=0;j<tab;j++){
                    System.out.print("|--");
                }
                System.out.println(next[i].getName());
                if(next[i].isDirectory()){
                    printFiles(next[i],tab+1);

                }
            }
        }else{
            System.out.println("文件路径错误.");
        }
    }
}
