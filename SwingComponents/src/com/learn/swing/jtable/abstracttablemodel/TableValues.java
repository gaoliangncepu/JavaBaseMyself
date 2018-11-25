package com.learn.swing.jtable.abstracttablemodel;

import javax.swing.table.AbstractTableModel;

/** 
 * TableModel 的实现类
 * 注意：一般使用AbstractTableModel创建TableModel的实现，只有少量数据时使用DefaultTableModel，
 */
@SuppressWarnings("serial")
public class TableValues extends AbstractTableModel{

	private final static int NAME = 0;
	private final static int GENDER = 1;
	private final static int BIRTH = 2;
	private final static String[] columnNames = {"姓名", "性别", "生日"};
	private Object[][] values = {
                       {"Cannel_2020",true,"2012-11-13"},
                       {"Lucy",false,"2013-11-13"},
                       {"韩梅",false,"2014-11-13"},
                       {"李雷",true,"2015-11-13"},
                       {"Jim",true,"2016-11-13"}
    };
    
	@Override
	public int getRowCount() {
		return values.length;
	}

	@Override
	public int getColumnCount() {
		return values[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return values[rowIndex][columnIndex];
	}
	
    /**
     * 设置单元格可以编辑
     */
    public boolean isCellEditable(int row, int column){
       return true;
    }
    
    /**
     * 单元格被编辑完后，调用此方法更新值
     */
    public void setValueAt(Object value, int row, int column){
    	values[row][column]= value;
    }

	/**
     * 获取列名
     */
    public String getColumnName(int columIndex){
        return columnNames[columIndex];
    }

	public static int getName() {
		return NAME;
	}

	public static int getGender() {
		return GENDER;
	}
	
	public static int getBirth() {
		return BIRTH;
	}
}
