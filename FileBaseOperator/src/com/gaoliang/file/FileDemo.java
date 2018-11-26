package com.gaoliang.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class FileDemo {
	 public static void main(String[] args) {

	        // 文件的简单读和写
	        File file = new File("F:\\EclipseLearnspace\\TestFiles\\tangshi.txt");

	        try {
	            FileInputStream fis = new FileInputStream(file);
	            InputStreamReader isr = new InputStreamReader(fis, "GBK");
	            BufferedReader bfr = new BufferedReader(isr);

	            String line;
	            while ((line = bfr.readLine()) != null) {
	                System.out.println(line);
	            }

	            bfr.close();
	            isr.close();
	            fis.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        File file2 = new File("F:\\EclipseLearnspace\\TestFiles\\tangshi2.txt");
	        try {
	            FileOutputStream fos = new FileOutputStream(file2);
	            OutputStreamWriter osq = new OutputStreamWriter(fos);
	            BufferedWriter bfw = new BufferedWriter(osq);

	            bfw.write("登鹳雀楼\n");
	            bfw.write("唐 王之涣\n");
	            bfw.write("白日依山尽，黄河入海流。\n");
	            bfw.write("白日依山尽，黄河入海流。\n");

	            bfw.close();
	            osq.close();
	            fos.close();
	            System.out.println("写入完成!");

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
}
