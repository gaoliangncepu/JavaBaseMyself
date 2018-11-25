package com.learn.swing.jtable.tablemodel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * JTable 的数据模型 实现了 TableModel 接口
 * 
 * @author Administrator
 *
 */
public class MyTableModel implements TableModel {
	// 监听器列表
	List<TableModelListener> listeners = new ArrayList<>();
	// 字段（一维数组）
	private final static String[] columnNames = { "姓名", "性别", "生日" };
	// 数据（二维数组）
	private Object[][] values = { { "Cannel_2020", true, "2012-11-13" }, { "Lucy", false, "2013-11-13" },
			{ "韩梅", false, "2014-11-13" }, { "李雷", true, "2015-11-13" }, { "Jim", true, "2016-11-13" } };

	@Override
	public int getRowCount() {
		System.err.println("getRowCount");
		// 二维数组的长度
		return values.length;
	}

	@Override
	public int getColumnCount() {
		System.err.println("getColumnCount");
		// 二维数组中每个元素的长度（一条记录的长度）
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		System.err.println("getColumnName");
		return columnNames[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		System.err.println("getColumnClass");
		return values[0][columnIndex].getClass();
	}

	/**
	 * 控制字段对应单元格的可编辑性
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		System.err.println("isCellEditable");
		return true;
	}

	/**
	 * 将数组中的数据传入表格
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		System.err.println("getValueAt运行------------------");
		return values[rowIndex][columnIndex];
	}

	/**
	 * 获取前端表格值，保存到TableModel中
	 */
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		System.err.println("getValueAt运行--------------------");
		values[rowIndex][columnIndex] = aValue;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		System.err.println("addTableModelListener");
		listeners.add(l);
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		if (listeners.contains(l)) {
			System.err.println("removeTableModelListener");
			listeners.remove(l);
		}
	}

}
