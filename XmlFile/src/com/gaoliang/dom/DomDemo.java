package com.gaoliang.dom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * 原始 DOM 解析 XML 方式
 */
public class DomDemo {
	
	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DomDemo test = new DomDemo();
        test.deleteElement("src/name.xml", "女");
        Vector<Student> stus = test.changeXMLToModel("src/name.xml");
        for (Student stu : stus) {
	        System.out.print(stu.getName() + " " + stu.getSex() + " "
	    		 	+ stu.getAge() + "\n");
        }
        // 输出：
        // 李华 男 14
        // 张三 男 16
        test.createDocument("src/name2.xml", stus);
    }
	
    /**
     * show 根据 vector 中的 student 对象创建 xml 文档
     *
     * @param filename 要创建的文档名
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws TransformerException
     */
    public void createDocument(String filename, Vector<Student> stus)
        throws ParserConfigurationException, SAXException, IOException, TransformerException {
        // 得到 DOM 解析器的工厂实例
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 从 DOM 工厂获取 DOM 解析器
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // 创建 document 对象
        Document doc = builder.newDocument();
        Element root = doc.createElement("学生花名册");// 创建根元素
        doc.appendChild(root);// 添加根元素
        for (Student stu : stus) {
            Element stuElement = doc.createElement("学生");
            stuElement.setAttribute("性别", stu.getSex());
            Element nameElement = doc.createElement("姓名");
            Text nameText = doc.createTextNode(stu.getName());
            nameElement.appendChild(nameText);
            Element ageElement = doc.createElement("年龄");
            Text ageText = doc.createTextNode(String.valueOf(stu.getAge()));
            ageElement.appendChild(ageText);
            stuElement.appendChild(nameElement);
            stuElement.appendChild(ageElement);
            root.appendChild(stuElement);
        }
        FileOutputStream fos = new FileOutputStream(filename);
        OutputStreamWriter ow = new OutputStreamWriter(fos);
        // 保存 xml 文件
        DOMSource doms = new DOMSource(doc);
        // 创建结果输出流
        StreamResult result = new StreamResult(ow);
        // 得到转换工厂实例
        TransformerFactory transFac = TransformerFactory.newInstance();
        // 得到转换器实例
        Transformer trans = transFac.newTransformer();
        // 转化器设置输出文档的编码方式
        trans.setOutputProperty(OutputKeys.ENCODING, "GB2312");
        //设置支持缩进
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        // 将文档源转换到结果输出流
        trans.transform(doms, result);
    }
    
    /**
     * show 读取指定 XML 文档并将其对象化
     *
     * @param filename
     * @return 存储 Student 对象的 vector
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public Vector<Student> changeXMLToModel(String filename)
        throws ParserConfigurationException, SAXException, IOException {
        // 得到 DOM 解析器的工厂实例
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 从 DOM 工厂获取 DOM 解析器
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // 解析 xml 文档，获得 document 对象，即 DOM 树
        Document doc = builder.parse(filename);
        // 获取根节点
        Element root = doc.getDocumentElement();
        // 获取根节点的子节点中名字为"学生"的节点列表
        NodeList stuNodes = root.getElementsByTagName("学生");
        Vector<Student> students = new Vector<Student>();
        // 遍历<学生>节点
        for (int i = 0; i < stuNodes.getLength(); i++) {
            // 获取一个学生节点
            Element stuNode = (Element) stuNodes.item(i);
            // 创建一个学生对象
            Student stu = new Student();
            stu.setSex(stuNode.getAttribute("性别"));
            // 获取<学生>节点的子节点中名字为"姓名"的节点列表
            NodeList nameNodes = stuNode.getElementsByTagName("姓名");
            // 取得第一个姓名
            Element nameNode = (Element) nameNodes.item(0);
            stu.setName(nameNode.getTextContent());
            // 获取<学生>节点的子节点中名字为"年龄"的节点列表
            NodeList ageNodes = stuNode.getElementsByTagName("年龄");
            // 取得第一个年龄
            Element ageNode = (Element) ageNodes.item(0);
            stu.setAge(Integer.parseInt(ageNode.getTextContent()));
            students.add(stu);
        }
        return students;
    }
    
    /**
     * show 删除指定名为 filename 的 xml 文档中学生结点的性别属性为 tagname 的结点
     *
     * @param filename
     * @param tagname
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws TransformerException
     */
    public void deleteElement(String filename, String tagname)
        throws ParserConfigurationException, SAXException, IOException, TransformerException {
        // 得到 DOM 解析器的工厂实例
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 从 DOM 工厂获取 DOM 解析器
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // 解析 xml 文档，获得 document 对象，即 DOM 树
        Document doc = builder.parse(filename);
        // 找到删除节点
        NodeList stuNodes = doc.getElementsByTagName("学生");
        for (int i = 0; i < stuNodes.getLength(); i++) {
            Element stuElement = (Element) stuNodes.item(i);
            String sex = stuElement.getAttribute("性别");
            if (sex.equals(tagname)) {
                stuElement.getParentNode().removeChild(stuElement);
            }
        }
        // 保存 xml 文件
        DOMSource doms = new DOMSource(doc);
        // 创建结果输出流
        StreamResult result = new StreamResult(new FileOutputStream(filename));
        // 得到转换工厂实例
        TransformerFactory transFac = TransformerFactory.newInstance();
        // 得到转换器实例
        Transformer trans = transFac.newTransformer();
        // 转化器设置输出文档的编码方式
        trans.setOutputProperty(OutputKeys.ENCODING, "GB2312");
        // 将文档源转换到结果输出流
        trans.transform(doms, result);
    }
}
