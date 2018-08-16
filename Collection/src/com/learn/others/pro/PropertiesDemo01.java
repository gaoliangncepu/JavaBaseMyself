package com.learn.others.pro;

import java.util.Properties;

/**
 * Properties
 * Hashtable �����࣬���ڶ�д��Դ�����ļ���.properties��.xml��
 * Ҫ��
 * 	key �� value ֻ�����ַ���
 * 
 * setProperty(String key, String value)
 * getProperty(String key)
 * getProperty(String key, String defaultValue)
 * 
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		// ����Properties����
		Properties properties = new Properties();
		
		// д��
		properties.setProperty("dirver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		
		String url = properties.getProperty("url", "test");
		System.out.println(url);
	}
}
