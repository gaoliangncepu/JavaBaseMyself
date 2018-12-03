package com.learn.runtime;

public class ExecDemoWait {
	public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p = r.exec("notepad");
            p.waitFor();//等待程序直到打开的子程序结束
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
        //exitValue()方法返回子进程结束时返回的值。如果没有错误，将返回0，否则返回非0。
        System.out.println("Notepad returned " + p.exitValue());
    }
}
