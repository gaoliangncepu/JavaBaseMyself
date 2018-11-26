package com.learn.swing.jtable.multilinerenderer;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

/**
 * ���Ը��������Զ������иߣ����������е�JTable
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer{

	public MultiLineCellRenderer() {
		setLineWrap(true);//����JTextArea���Զ����з���
		setWrapStyleWord(true);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// ���㵱���е���Ѹ߶�   
        int maxPreferredHeight = 0;   
        for (int i = 0; i < table.getColumnCount(); i++) {   
            setText("" + table.getValueAt(row, i));   
            setSize(table.getColumnModel().getColumn(column).getWidth(), 0);   
            maxPreferredHeight = Math.max(maxPreferredHeight, getPreferredSize().height);   
        }   
   
        if (table.getRowHeight(row) != maxPreferredHeight)  // ��������������Ϲæ   
            table.setRowHeight(row, maxPreferredHeight);   
   
        setText(value == null ? "" : value.toString());   
        return this;
	}

}
