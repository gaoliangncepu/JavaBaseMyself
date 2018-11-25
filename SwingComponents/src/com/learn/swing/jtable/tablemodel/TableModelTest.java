package com.learn.swing.jtable.tablemodel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * 实现 TableModel 接口，创建表格数据模型，创建表格 
 * 1.boolean 值，前端自动对应成 CheckBox
 * 2.
 */
@SuppressWarnings("serial")
public class TableModelTest extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableModelTest frame = new TableModelTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TableModelTest() {
		MyTableModel model = new MyTableModel();
		JTable table = new JTable(model);

		getContentPane().add(new JScrollPane(table));
		table.setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

	}

}
