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
 * ԭʼ DOM ���� XML ��ʽ
 */
public class DomDemo {
	
	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DomDemo test = new DomDemo();
        test.deleteElement("src/name.xml", "Ů");
        Vector<Student> stus = test.changeXMLToModel("src/name.xml");
        for (Student stu : stus) {
	        System.out.print(stu.getName() + " " + stu.getSex() + " "
	    		 	+ stu.getAge() + "\n");
        }
        // �����
        // � �� 14
        // ���� �� 16
        test.createDocument("src/name2.xml", stus);
    }
	
    /**
     * show ���� vector �е� student ���󴴽� xml �ĵ�
     *
     * @param filename Ҫ�������ĵ���
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws TransformerException
     */
    public void createDocument(String filename, Vector<Student> stus)
        throws ParserConfigurationException, SAXException, IOException, TransformerException {
        // �õ� DOM �������Ĺ���ʵ��
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // �� DOM ������ȡ DOM ������
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // ���� document ����
        Document doc = builder.newDocument();
        Element root = doc.createElement("ѧ��������");// ������Ԫ��
        doc.appendChild(root);// ��Ӹ�Ԫ��
        for (Student stu : stus) {
            Element stuElement = doc.createElement("ѧ��");
            stuElement.setAttribute("�Ա�", stu.getSex());
            Element nameElement = doc.createElement("����");
            Text nameText = doc.createTextNode(stu.getName());
            nameElement.appendChild(nameText);
            Element ageElement = doc.createElement("����");
            Text ageText = doc.createTextNode(String.valueOf(stu.getAge()));
            ageElement.appendChild(ageText);
            stuElement.appendChild(nameElement);
            stuElement.appendChild(ageElement);
            root.appendChild(stuElement);
        }
        FileOutputStream fos = new FileOutputStream(filename);
        OutputStreamWriter ow = new OutputStreamWriter(fos);
        // ���� xml �ļ�
        DOMSource doms = new DOMSource(doc);
        // ������������
        StreamResult result = new StreamResult(ow);
        // �õ�ת������ʵ��
        TransformerFactory transFac = TransformerFactory.newInstance();
        // �õ�ת����ʵ��
        Transformer trans = transFac.newTransformer();
        // ת������������ĵ��ı��뷽ʽ
        trans.setOutputProperty(OutputKeys.ENCODING, "GB2312");
        //����֧������
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        // ���ĵ�Դת������������
        trans.transform(doms, result);
    }
    
    /**
     * show ��ȡָ�� XML �ĵ����������
     *
     * @param filename
     * @return �洢 Student ����� vector
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public Vector<Student> changeXMLToModel(String filename)
        throws ParserConfigurationException, SAXException, IOException {
        // �õ� DOM �������Ĺ���ʵ��
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // �� DOM ������ȡ DOM ������
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // ���� xml �ĵ������ document ���󣬼� DOM ��
        Document doc = builder.parse(filename);
        // ��ȡ���ڵ�
        Element root = doc.getDocumentElement();
        // ��ȡ���ڵ���ӽڵ�������Ϊ"ѧ��"�Ľڵ��б�
        NodeList stuNodes = root.getElementsByTagName("ѧ��");
        Vector<Student> students = new Vector<Student>();
        // ����<ѧ��>�ڵ�
        for (int i = 0; i < stuNodes.getLength(); i++) {
            // ��ȡһ��ѧ���ڵ�
            Element stuNode = (Element) stuNodes.item(i);
            // ����һ��ѧ������
            Student stu = new Student();
            stu.setSex(stuNode.getAttribute("�Ա�"));
            // ��ȡ<ѧ��>�ڵ���ӽڵ�������Ϊ"����"�Ľڵ��б�
            NodeList nameNodes = stuNode.getElementsByTagName("����");
            // ȡ�õ�һ������
            Element nameNode = (Element) nameNodes.item(0);
            stu.setName(nameNode.getTextContent());
            // ��ȡ<ѧ��>�ڵ���ӽڵ�������Ϊ"����"�Ľڵ��б�
            NodeList ageNodes = stuNode.getElementsByTagName("����");
            // ȡ�õ�һ������
            Element ageNode = (Element) ageNodes.item(0);
            stu.setAge(Integer.parseInt(ageNode.getTextContent()));
            students.add(stu);
        }
        return students;
    }
    
    /**
     * show ɾ��ָ����Ϊ filename �� xml �ĵ���ѧ�������Ա�����Ϊ tagname �Ľ��
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
        // �õ� DOM �������Ĺ���ʵ��
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // �� DOM ������ȡ DOM ������
        DocumentBuilder builder = dbf.newDocumentBuilder();
        // ���� xml �ĵ������ document ���󣬼� DOM ��
        Document doc = builder.parse(filename);
        // �ҵ�ɾ���ڵ�
        NodeList stuNodes = doc.getElementsByTagName("ѧ��");
        for (int i = 0; i < stuNodes.getLength(); i++) {
            Element stuElement = (Element) stuNodes.item(i);
            String sex = stuElement.getAttribute("�Ա�");
            if (sex.equals(tagname)) {
                stuElement.getParentNode().removeChild(stuElement);
            }
        }
        // ���� xml �ļ�
        DOMSource doms = new DOMSource(doc);
        // ������������
        StreamResult result = new StreamResult(new FileOutputStream(filename));
        // �õ�ת������ʵ��
        TransformerFactory transFac = TransformerFactory.newInstance();
        // �õ�ת����ʵ��
        Transformer trans = transFac.newTransformer();
        // ת������������ĵ��ı��뷽ʽ
        trans.setOutputProperty(OutputKeys.ENCODING, "GB2312");
        // ���ĵ�Դת������������
        trans.transform(doms, result);
    }
}
