package com.gaoliang.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * �ļ��Ĵ���������ָ���ļ����ͺ�׺��������ָ���ļ�������·��
 *
 */
public class FileCreate {
    public static void main(String[] args) {
        File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// Java�е�һ����\���ᱻ������ת���ַ���־�����һ���ַ����ת���ַ������б�ܱ����ǡ�\\������ʾ
        try {

            if(f1.exists()){
                System.out.println("�ļ��Ѵ������봴��!");
            }else{
                if (f1.createNewFile()) {
                    System.out.println("�ļ������ɹ�!");
                }else{
                    System.out.println("�ļ�����ʧ��!");
                }
            }
        } catch (IOException e) {
        	// File λ��java.io���У��ļ���صĲ����쳣������IOException
            e.printStackTrace();
        }

    }
    
    @Test
    public void createFile() {
    	File f1 = new File("F:\\EclipseLearnspace\\TestFiles\\Test");// Java�е�һ����\���ᱻ������ת���ַ���־�����һ���ַ����ת���ַ������б�ܱ����ǡ�\\������ʾ
        try {

            if(f1.exists()){
                System.out.println("�ļ��Ѵ������봴��!");
            }else{
                if (f1.createNewFile()) {
                    System.out.println("�ļ������ɹ�!");
                }else{
                    System.out.println("�ļ�����ʧ��!");
                }
            }
        } catch (IOException e) {
        	// File λ��java.io���У��ļ���صĲ����쳣������IOException
            e.printStackTrace();
        }
    }
}
