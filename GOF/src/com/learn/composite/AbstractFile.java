package com.learn.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract component
 * @author Administrator
 *
 */
public interface AbstractFile {
	void killVirus();
}

class ImageFile implements AbstractFile {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("---图像文件："+name+",进行查杀！");
	}
}

class TextFile implements AbstractFile {
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("---文本文件："+name+",进行查杀！");
	}
}

class VideoFile implements AbstractFile {
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("---视频文件："+name+",进行查杀！");
	}
}

class Folder implements AbstractFile {
	private String name;
	private List<AbstractFile> contentFiles;
	
	public Folder(String name) {
		super();
		this.name = name;
		contentFiles = new ArrayList<>();
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("---文件夹："+name+",进行查杀");
		
		for (AbstractFile abstractFile : contentFiles) {
			abstractFile.killVirus();
		}
	}
	
	public void addFile(AbstractFile file) {
		contentFiles.add(file);
	}
	
	public void removeFile(AbstractFile file) {
		contentFiles.remove(file);
	}
	
	public AbstractFile getChildFile(int index) {
		return contentFiles.get(index);
	}
}