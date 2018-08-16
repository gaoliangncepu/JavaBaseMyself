package com.gaoliang.file;

import java.io.File;

public class FileFolderCreate {
	public static void main(String[] args) {
        File dir1 = new File("F:\\EclipseLearnspace\\TestFiles\\Folder");//先创建File对象
        File dirs = new File("F:\\EclipseLearnspace\\TestFiles\\Folder\\Top\\Middle\\Bottom");
        
        if(dir1.exists()){//先判断文件夹是否存在
            System.out.println("文件夹已存在!");
        }else{
            if(dir1.mkdir()){//调用mkdir()方法
                System.out.println("文件夹创建成功");
            }else{
                System.out.println("文件夹创建失败");
            }
        }
        dir1.mkdir();
        dirs.mkdirs();
  }
}
