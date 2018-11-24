package com.learn.others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
 */
public class PropertiesDemo02 {
	public static void main(String[] args) {
		// ����Properties����
		Properties properties = new Properties();
		
		// д��������Ϣ(FILO)
		properties.setProperty("dirver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		
		// д�����ļ�
		try {
			// ָ������·���������̷���·����
			properties.store(new FileOutputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")), "Oracle Database connection info configuration");
			properties.storeToXML(new FileOutputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.xml")), "Oracle Database connection info configuration");
			// ָ�����·�� ����ǰ���̣���Ŀ����
			properties.store(new FileOutputStream(new File("cfg.properties")), "Oracle Database connection info configuration");
			properties.store(new FileOutputStream(new File("src/com/learn/others/pro/cfg.properties")), "Oracle Database connection info configuration");
		} catch (FileNotFoundException e) {// ���ʱ�쳣����Java����������ļ�������ϵʱ
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
