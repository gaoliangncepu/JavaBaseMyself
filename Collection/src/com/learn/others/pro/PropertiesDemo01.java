package com.learn.others.pro;

import java.util.Properties;

/**
 * Properties
 * Hashtable 的子类，用于读写资源配置文件（.properties、.xml）
 * 要求：
 * 	key 与 value 只能是字符串
 * 
 * setProperty(String key, String value)
 * getProperty(String key)
 * getProperty(String key, String defaultValue)
 * 
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		// 创建Properties对象
		Properties properties = new Properties();
		
		// 写入
		properties.setProperty("dirver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		
		String url = properties.getProperty("url", "test");
		System.out.println(url);
	}
}
