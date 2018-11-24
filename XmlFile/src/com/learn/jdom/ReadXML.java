package com.learn.jdom;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.jaxen.JaxenXPathFactory;

/**
 * 读取并解析XML文档
 * JDom1中可以直接使用XPath来获取由xPath指定的节点
 * JDom2中XPath被废弃，由XPathFactory、XPathExpression合力完成，需要外部jar包：jaxen-1.1.6.jar
 */
public class ReadXML {
	public static void main(String[] args) {
		// new SAXBuilder对象
        SAXBuilder sax = new SAXBuilder();
        XPathFactory factory = JaxenXPathFactory.instance();
        
        try {  
            Document doc = sax.build("src/config.xml");
            Element rootEle = doc.getRootElement();
            
//            Element driverClassNameElement = (Element)XPath.selectSingleNode(rootEle, "//sys-config/jdbc-info/driver-class-name");  
            
            //代替Xpath 方法一
            XPathExpression objs = factory.compile("//sys-config/jdbc-info/driver-class-name");
            Element driverClassNameElement = (Element) objs.evaluateFirst(rootEle);//抓取单个节点及其所有子节点
            String driverClassName = driverClassNameElement.getText();  
            System.out.println("driverClassName = " + driverClassName);  
            
            XPathExpression objs2 = factory.compile("//sys-config/provinces-info/province");
            List provinceList = objs2.diagnose(rootEle, false).getResult();//抓取多个同名节点，得到节点列表
            for(Iterator it = provinceList.iterator(); it.hasNext(); ) {  
                Element provinceEle = (Element)it.next();  
                String proId = provinceEle.getAttributeValue("id");  
                String proName = provinceEle.getAttributeValue("name");  
                System.out.println("provinceId = " + proId + "   provinceName = " + proName);  
                  
                List cityEleList = (List)provinceEle.getChildren("city");//获取子节点
                for(Iterator cityIt = cityEleList.iterator(); cityIt.hasNext(); ){  
                    Element cityEle = (Element)cityIt.next();  
                    String cityId = cityEle.getAttributeValue("id");  
                    String cityName = cityEle.getText();  
                    System.out.println("    cityId = " + cityId + "   cityName = " + cityName);  
                }
            }
            
            //代替Xpath 方法二
    		XPathBuilder xBuilder = new XPathBuilder("//sys-config/provinces-info/province",new ElementFilter());
    		XPathExpression expression2 = xBuilder.compileWith(factory);
    		List provinces = expression2.evaluate(doc);
    		System.out.println(provinces.size());
        } catch (JDOMException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}
