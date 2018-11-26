package com.learn.dom4j;

import java.io.File;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Demo01 {

	@Test
	public void readXml() throws DocumentException {
		SAXReader reader = new SAXReader();

		org.dom4j.Document document = reader.read(new File("src/beans.xml"));
		System.out.println(document);
	}

	/*
	 * public static void main(String[] args) { try { Demo01.readXml(); } catch
	 * (DocumentException e) { e.printStackTrace(); } }
	 */
}
