package com.learn.jdom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * 生成xml文档
 * @author Administrator
 *
 */
public class WriteXML {
	public static void main(String[] args) {  
        
		// new Element() 创建节点
        Element rootEle = new Element("sys-config");  
        Element provincesEle = new Element("provinces-info");  
          
        Element provinceEle = new Element("province");  
        provinceEle.setAttribute("id","hlj");  
        provinceEle.setAttribute("name","黑龙江省");  
          
        Element cityEle1 = new Element("city");  
        cityEle1.setAttribute("id","harb");  
        cityEle1.addContent("哈尔滨");  
          
        Element cityEle2 = new Element("city");  
        cityEle2.setAttribute("id","nj");  
        cityEle2.addContent("嫩江");  
          
        // element.addContent() 添加节点
        provinceEle.addContent(cityEle1);  
        provinceEle.addContent(cityEle2);  
        provincesEle.addContent(provinceEle);  
        rootEle.addContent(provincesEle);  
        
        // new Document() 创建文档对象
        Document doc = new Document(rootEle);  
        
        // XML文档生成器，将Document对象转成指定编码格式的字节输出流
        XMLOutputter out = new XMLOutputter();  
          
        // 转成字符串输出
//      out.setFormat(Format.getCompactFormat().setEncoding("GBK"));//设置文件编码，默认为UTF-8  
        String xmlStr = out.outputString(doc);  
        System.out.println(xmlStr);  
        
        // 生成到指定文件
        try {  
//            out.output(doc, new FileOutputStream("./test.xml"));//与src同级目录
            out.output(doc, new FileOutputStream("src/test.xml"));//src下生成
//            out.output(doc, new FileOutputStream("test.xml"));//与src同级目录
        } catch (FileNotFoundException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO 自动生成 catch 块  
            e.printStackTrace();  
        }  
          
    }  
}
