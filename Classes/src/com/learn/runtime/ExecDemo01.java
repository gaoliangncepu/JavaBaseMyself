package com.learn.runtime;

import java.io.IOException;

public class ExecDemo01 {
	public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p = null; 
        
        try{   
            p = rt.exec("notepad");
        }catch(IOException e)
        {
            System.out.println("Execute error!");
        }
    }
}
