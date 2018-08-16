package com.learn.others.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties
 * Hashtable �����࣬���ڶ�д��Դ�����ļ���.properties��.xml��
 * Ҫ��
 * 	key �� value ֻ�����ַ���
 * ��д��
 * 	setProperty(String key, String value)
 * 	getProperty(String key)
 * 	getProperty(String key, String defaultValue)
 * 	(propertyNames() ����key��Enumeration���󣬿����ڱ���)
 * д�����ļ���
 * 	store(OutputStream stream, String comments)
 * 	store(Writer writer, String comments)
 * 	storeToXML(OutputStream stream, String comment)
 * 	storeToXML(OutputStream stream, String comment, String encoding)
 * ���ļ����룺
 * 	load(InputStream stream)
 * 	load(Reader reader)
 * 	loadFromXML(InputStream stream)
 */
public class PropertiesDemo03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// ����Properties����
		Properties properties = new Properties();
		
		// ��ȡ����·��
//		properties.load(new FileInputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")));
//		properties.load(new FileReader(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")));
		
		// ��ȡ���·�����ӹ��̸�Ŀ¼��ʼ����Collection�ļ����
//		properties.load(new FileInputStream(new File("src/com/learn/others/pro/cfg.properties")));
//		properties.load(new FileReader(new File("src/com/learn/others/pro/cfg.properties")));
		
		// ���� ���ֻ���ֽ����ļ���û��Դ���룺ʹ�������·����ȡ�����ļ�
		// ����ֽ����ļ�����·��
//		properties.load(PropertiesDemo03.class.getResourceAsStream("cfg.properties"));
		// ʹ��CLass�ࣺ��/����ʾ bin Ŀ¼����srcĿ¼��
//		properties.load(PropertiesDemo03.class.getResourceAsStream("/com/learn/others/pro/cfg.properties"));
		// ʹ�õ�ǰ��������� ������ʾ bin Ŀ¼
//		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
//		properties.load(PropertiesDemo03.class.getClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
		// ��ǰ����ʵ��������ʱ
//		properties.load(this.getClass().getClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
		System.out.println(properties.getProperty("dirver"));
	}
}
