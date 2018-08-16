package com.learn.others.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
 * 从文件读入：
 * 	load(InputStream stream)
 * 	load(Reader reader)
 * 	loadFromXML(InputStream stream)
 */
public class PropertiesDemo03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 创建Properties对象
		Properties properties = new Properties();
		
		// 读取绝对路径
//		properties.load(new FileInputStream(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")));
//		properties.load(new FileReader(new File("F:/EclipseLearnspace/JavaBaseMyself/cfg.properties")));
		
		// 读取相对路径（从工程根目录开始，即Collection文件夹里）
//		properties.load(new FileInputStream(new File("src/com/learn/others/pro/cfg.properties")));
//		properties.load(new FileReader(new File("src/com/learn/others/pro/cfg.properties")));
		
		// ★★★ 如果只有字节码文件，没有源代码：使用类相对路径读取配置文件
		// 类的字节码文件所在路径
//		properties.load(PropertiesDemo03.class.getResourceAsStream("cfg.properties"));
		// 使用CLass类：“/”表示 bin 目录（即src目录）
//		properties.load(PropertiesDemo03.class.getResourceAsStream("/com/learn/others/pro/cfg.properties"));
		// 使用当前类加载器： “”表示 bin 目录
//		properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
//		properties.load(PropertiesDemo03.class.getClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
		// 当前类有实例化对象时
//		properties.load(this.getClass().getClassLoader().getResourceAsStream("com/learn/others/pro/cfg.properties"));
		System.out.println(properties.getProperty("dirver"));
	}
}
