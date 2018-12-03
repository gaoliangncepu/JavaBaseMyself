package com.learn.runtime;

public class ExecDemoWait {
	public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p = r.exec("notepad");
            p.waitFor();//�ȴ�����ֱ���򿪵��ӳ������
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
        //exitValue()���������ӽ��̽���ʱ���ص�ֵ�����û�д��󣬽�����0�����򷵻ط�0��
        System.out.println("Notepad returned " + p.exitValue());
    }
}
