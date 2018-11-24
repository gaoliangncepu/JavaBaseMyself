package com.learn.swing.jtable.cellrenderer;

import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * 使表格“性别”一列的单元格出现JComboBox组件
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class GenderRenderer extends JComboBox<String> implements TableCellRenderer{

	// 添加下拉选项
	public GenderRenderer(){
        super();
        addItem("男");
        addItem("女");
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		if(isSelected){
            setForeground(table.getForeground());
            super.setBackground(table.getBackground());
	   }else{
	        setForeground(table.getForeground());
	        setBackground(table.getBackground());
	   }
	   boolean isMale = ((Boolean)value).booleanValue();
	   setSelectedIndex(isMale? 0 : 1);
	   return this;
	}

}
