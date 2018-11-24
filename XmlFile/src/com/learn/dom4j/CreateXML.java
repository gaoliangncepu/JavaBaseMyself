package com.gaoliang.dom4j;

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
		//������һ��xml�ĵ� 
		Document doc=DocumentHelper.createDocument(); 
		//���ע��
		doc.addComment("������ע��");
		//������һ����Ϊstudents�ڵ㣬��Ϊ�ǵ�һ�������������Ǹ��ڵ�,��ͨ��doc����һ����ᱨ�� 
		Element root=doc.addElement("students"); 
		//��root�ڵ��´���һ����Ϊstudent�Ľڵ�
		Element stuEle=root.addElement("student"); 
		//��student�ڵ�������� 
		stuEle.addAttribute("id", "1000"); 
		//��student�ڵ����һ���ӽڵ� 
		Element nameEle=stuEle.addElement("name"); 
		//�����ӽڵ���ı� 
		nameEle.setText("����"); 
		
		//���ڸ�ʽ��xml���ݺ�����ͷ����ǩ
		OutputFormat format = OutputFormat.createPrettyPrint(); 
		//����xml�ĵ��ı���Ϊgbk 
		format.setEncoding("gbk"); 
		//�ַ���д����
		Writer out; 
		
		try {
			//����һ����������� 
			out=new FileWriter("src/student.xml"); 
			//����xml�ļ� 
			XMLWriter writer = new XMLWriter(out, format); 
			//����write������doc�ĵ�д��ָ��·�� 
			writer.write(doc); 
			writer.close(); 
			System.out.print("����XML�ļ��ɹ�");
		 } catch (IOException e) { 
			 System.out.print("����XML�ļ�ʧ��");
			 e.printStackTrace(); 
		 }
	 }
}
