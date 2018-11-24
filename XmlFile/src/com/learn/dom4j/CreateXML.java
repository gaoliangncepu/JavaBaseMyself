package com.learn.dom4j;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class CreateXML {
	
	public static void main(String[] args) {
		//创建了一个xml文档 
		Document doc=DocumentHelper.createDocument(); 
		
		//添加注释
		doc.addComment("这里是注释");
		
		//创建了一个名为students节点，因为是第一个创建，所以是根节点,再通过doc创建一个则会报错。 
		Element root=doc.addElement("students"); 
		//在root节点下创建一个名为student的节点
		Element stuEle=root.addElement("student"); 
		
		//给student节点添加属性 
		stuEle.addAttribute("id", "1000"); 
		
		//给student节点添加一个子节点 
		Element nameEle=stuEle.addElement("name"); 
		//设置子节点的文本 
		nameEle.setText("张三"); 
		
		//用于格式化xml内容和设置头部标签
		OutputFormat format = OutputFormat.createPrettyPrint(); 
		//设置xml文档的编码为gbk 
		format.setEncoding("gbk"); 
		//字符流写出器
		Writer out; 
		
		try {
			//创建一个输出流对象 
			out=new FileWriter("src/student.xml"); 
			//创建xml文件 
			XMLWriter writer = new XMLWriter(out, format); 
			//调用write方法将doc文档写到指定路径 
			writer.write(doc); 
			writer.close(); 
			System.out.print("生成XML文件成功");
		 } catch (IOException e) { 
			 System.out.print("生成XML文件失败");
			 e.printStackTrace(); 
		 }
	 }
}
