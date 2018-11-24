package com.gaoliang.jdom;

import java.io.InputStream;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import com.gaoliang.dom4j.ParseXML;
public class JDom2Demo {
	public static void main(String[] args) throws Exception{
		//����SAXBuilder����,Dom4j����SAXReader������read()����
		SAXBuilder sb=new SAXBuilder();
    
		//�����ĵ�����
//		InputStream in = Dom4jDemo.class.getResourceAsStream("/beans.xml");
		InputStream in = JDom2Demo.class.getClassLoader().getResourceAsStream("beans.xml");
		Document doc=sb.build(in); 
    
		Element root=doc.getRootElement(); //��ȡ��Ԫ��
		List list=root.getChildren("bean");//ȡ����Ϊbean������Ԫ��
		for(int i=0;i<list.size();i++){
			Element element=(Element)list.get(i);
			String id=element.getAttributeValue("id");
			String clazz=element.getAttributeValue("class");
			System.out.println(id);
			System.out.println(clazz);
			/*
	       	String capacity=element.getChildText("capacity");//ȡdisk��Ԫ��capacity������
	       	String directories=element.getChildText("directories");
	       	String files=element.getChildText("files");
	       	System.out.println("������Ϣ:");
	       	System.out.println("�����̷�:"+name);
	       	System.out.println("��������:"+capacity);
	       	System.out.println("Ŀ¼��:"+directories);
	       	System.out.println("�ļ���:"+files);
	       	System.out.println("-----------------------------------");
			 */
		}  
  	}
} 