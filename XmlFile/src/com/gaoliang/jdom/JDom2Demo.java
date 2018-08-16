package com.gaoliang.jdom;

import java.io.InputStream;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import com.gaoliang.dom4j.ParseXML;
public class JDom2Demo {
	public static void main(String[] args) throws Exception{
		//创建SAXBuilder对象,Dom4j中是SAXReader并调用read()方法
		SAXBuilder sb=new SAXBuilder();
    
		//构造文档对象
//		InputStream in = Dom4jDemo.class.getResourceAsStream("/beans.xml");
		InputStream in = JDom2Demo.class.getClassLoader().getResourceAsStream("beans.xml");
		Document doc=sb.build(in); 
    
		Element root=doc.getRootElement(); //获取根元素
		List list=root.getChildren("bean");//取名字为bean的所有元素
		for(int i=0;i<list.size();i++){
			Element element=(Element)list.get(i);
			String id=element.getAttributeValue("id");
			String clazz=element.getAttributeValue("class");
			System.out.println(id);
			System.out.println(clazz);
			/*
	       	String capacity=element.getChildText("capacity");//取disk子元素capacity的内容
	       	String directories=element.getChildText("directories");
	       	String files=element.getChildText("files");
	       	System.out.println("磁盘信息:");
	       	System.out.println("分区盘符:"+name);
	       	System.out.println("分区容量:"+capacity);
	       	System.out.println("目录数:"+directories);
	       	System.out.println("文件数:"+files);
	       	System.out.println("-----------------------------------");
			 */
		}  
  	}
} 