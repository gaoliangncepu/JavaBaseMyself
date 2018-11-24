package com.learn.others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties
 * Hashtable 的子类，用于读写资源配置文件（.properties、.xml）
 * 要求：
 * 	key 与 value 只能是字符串
 * 读写：
 * 	setProperty(String key, String value)
 * 	getProperty(String key)
 * 	getProperty(String key, String defaultValue)
 * 	(propertyNames() 返回key的Enumeration对象，可用于遍历)
 * 写出到文件：
 * 	store(OutputStream stream, String comments)
 * 	store(Writer writer, String comments)
 * 	storeToXML(OutputStream stream, String comment)
 * 	storeToXML(OutputStream stream, String comment, String encoding)
 */
public class PropertiesDemo02 {
	public static void main(String[] args) {
		// 创建Properties对象
		Properties properties = new Properties();
		
		// 写入配置信息(FILO)
		properties.setProperty("dirver", "oracle.jdbc.driver.OracleDriver");
		properties.setProperty("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		
		// 写出到文件
		try {
			// 指定绝对路径（包含盘符的路径）
			properties.store(new FileOutputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")), "Oracle Database connection info configuration");
			properties.storeToXML(new FileOutputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.xml")), "Oracle Database connection info configuration");
			// 指定相对路径 “当前工程（项目）”
			properties.store(new FileOutputStream(new File("cfg.properties")), "Oracle Database connection info configuration");
			properties.store(new FileOutputStream(new File("src/com/learn/others/pro/cfg.properties")), "Oracle Database connection info configuration");
		} catch (FileNotFoundException e) {// 检查时异常：当Java程序与外界文件存在联系时
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
