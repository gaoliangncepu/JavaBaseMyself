package com.gaoliang.file;

import java.io.File;

public class FileProperties {
	
	public static void main(String[] args) {

        // �ļ����ԵĶ�ȡ
        File file = new File("F:\\EclipseLearnspace\\TestFiles\\TestNew.txt");

        // �ж��ļ��Ƿ����
        System.out.println("�ж��ļ��Ƿ����:" + file.exists());

        // ��ȡ�ļ�����
        System.out.println("��ȡ�ļ�����:" + file.getName());

        // ��ȡ�ļ�·��
        System.out.println("��ȡ�ļ�·��:" + file.getPath());

        // ��ȡ�ļ�����·��
        System.out.println("��ȡ�ļ�����·��:" + file.getAbsolutePath());

        // ��ȡ�ļ�����·��
        System.out.println("�����ļ�·����" + new File(file.getAbsolutePath()).getParent());

        // ��ȡ�ļ���С
        System.out.println("�ļ���С:" + (float) file.length() / 1000 + "Kb");

        // �ļ��Ƿ�����
        System.out.println("�ļ��Ƿ�����:" + file.isHidden());

        // �ļ��Ƿ�ɶ�
        System.out.println("�ļ��Ƿ�ɶ�:" + file.canRead());

        // �ļ��Ƿ��д
        System.out.println("�ļ��Ƿ��д:" + file.canWrite());

        //�ж��Ƿ�Ϊ�ļ���
        System.out.println("�ж��Ƿ�Ϊ�ļ���:"+file.isDirectory());
        
        //���ļ���������Ϊ����д:
        file.setWritable(false);
        System.out.println("���ú��ļ��Ƿ��д:" + file.canWrite());

        //���ļ���������Ϊ���ɶ���
        file.setReadable(false);
        System.out.println("���ú��ļ��Ƿ�ɶ�:" + file.canWrite());
        
        //�趨�ļ�ֻ����
        file.setReadOnly();
	}
}
