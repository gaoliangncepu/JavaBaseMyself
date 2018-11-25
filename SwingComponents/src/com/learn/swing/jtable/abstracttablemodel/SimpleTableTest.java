package com.learn.swing.jtable.abstracttablemodel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * 继承 AbstractTableModel类，创建表格数据模型，创建表格 
 * 1.boolean 值，前端显示成字符串
 * 2.
 */
@SuppressWarnings("serial")
public class SimpleTableTest extends JFrame {

	public SimpleTableTest() {
		TableValues tv = new TableValues();
		JTable table = new JTable(tv);

		// 设置行高
		table.setRowHeight(30);
		// 必须把table放入JScrollPane才会有列名出现
		JScrollPane jsp = new JScrollPane(table);
		getContentPane().add(jsp);
	}

	public static void main(String[] args) {
		SimpleTableTest stt = new SimpleTableTest();
		stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stt.setSize(400, 300);
		stt.setVisible(true);
		stt.setLocationRelativeTo(null);
	}
}
