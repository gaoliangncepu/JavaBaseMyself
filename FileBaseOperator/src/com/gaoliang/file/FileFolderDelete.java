package com.gaoliang.file;

import java.io.File;

public class FileFolderDelete {
	
	public static void main(String[] args) {
		File dirs = new File("F:\\EclipseLearnspace\\TestFiles\\Folder");
		
		File[] dirFile = dirs.listFiles();
		
	    for (int i = 0; i < dirFile.length; i++) {
	        if (dirFile[i].isDirectory()) {
	            deleteFolder(dirFile[i]);
	        }
	        dirFile[i].delete();
	    }
	}
    
    public static void deleteFolder(File dirs) {

         File dirFile[] = dirs.listFiles();
         for (int i = 0; i < dirFile.length; i++) {
             if (dirFile[i].isDirectory()) {
                 deleteFolder(dirFile[i]);
             }
             dirFile[i].delete();
         }
    }
}
