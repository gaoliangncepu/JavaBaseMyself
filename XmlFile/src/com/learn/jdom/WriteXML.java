package com.learn.jdom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * ����xml�ĵ�
 * @author Administrator
 *
 */
public class WriteXML {
	public static void main(String[] args) {  
        
		// new Element() �����ڵ�
        Element rootEle = new Element("sys-config");  
        Element provincesEle = new Element("provinces-info");  
          
        Element provinceEle = new Element("province");  
        provinceEle.setAttribute("id","hlj");  
        provinceEle.setAttribute("name","������ʡ");  
          
        Element cityEle1 = new Element("city");  
        cityEle1.setAttribute("id","harb");  
        cityEle1.addContent("������");  
          
        Element cityEle2 = new Element("city");  
        cityEle2.setAttribute("id","nj");  
        cityEle2.addContent("�۽�");  
          
        // element.addContent() ��ӽڵ�
        provinceEle.addContent(cityEle1);  
        provinceEle.addContent(cityEle2);  
        provincesEle.addContent(provinceEle);  
        rootEle.addContent(provincesEle);  
        
        // new Document() �����ĵ�����
        Document doc = new Document(rootEle);  
        
        // XML�ĵ�����������Document����ת��ָ�������ʽ���ֽ������
        XMLOutputter out = new XMLOutputter();  
          
        // ת���ַ������
//      out.setFormat(Format.getCompactFormat().setEncoding("GBK"));//�����ļ����룬Ĭ��ΪUTF-8  
        String xmlStr = out.outputString(doc);  
        System.out.println(xmlStr);  
        
        // ���ɵ�ָ���ļ�
        try {  
//            out.output(doc, new FileOutputStream("./test.xml"));//��srcͬ��Ŀ¼
            out.output(doc, new FileOutputStream("src/test.xml"));//src������
//            out.output(doc, new FileOutputStream("test.xml"));//��srcͬ��Ŀ¼
        } catch (FileNotFoundException e) {  
            // TODO �Զ����� catch ��  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO �Զ����� catch ��  
            e.printStackTrace();  
        }  
          
    }  
}
