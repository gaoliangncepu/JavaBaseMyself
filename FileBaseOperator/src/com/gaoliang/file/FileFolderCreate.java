package com.gaoliang.file;

import java.io.File;

public class FileFolderCreate {
	public static void main(String[] args) {
        File dir1 = new File("F:\\EclipseLearnspace\\TestFiles\\Folder");//�ȴ���File����
        File dirs = new File("F:\\EclipseLearnspace\\TestFiles\\Folder\\Top\\Middle\\Bottom");
        
        if(dir1.exists()){//���ж��ļ����Ƿ����
            System.out.println("�ļ����Ѵ���!");
        }else{
            if(dir1.mkdir()){//����mkdir()����
                System.out.println("�ļ��д����ɹ�");
            }else{
                System.out.println("�ļ��д���ʧ��");
            }
        }
        dir1.mkdir();
        dirs.mkdirs();
  }
}
