package com.gaoliang.file;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// Ҫ����ļ����в����������ȹ����ļ��Ķ���
        if (f1.exists() == false) {
            System.out.println("�ļ������ڣ�ɾ��ʧ��!");
        } else {
            if (f1.delete()) {
                System.out.println("ɾ���ɹ���");
            }else{
                System.out.println("ɾ��ʧ�ܣ�");
            }
        }
    }
}
