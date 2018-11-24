package com.learn.swing.jtable.datepicker;

import java.awt.BorderLayout;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.learn.swing.jtable.TableValues;
import com.learn.swing.jtable.cellrenderer.GenderRenderer;

/**
 * GenderEditor类的工作流程：
	1)、调用TableCellEditor接口中的getTableCellEditorComponent()方法初始化编辑
	2)、编辑当前的单元格，再点击另一个单元格时，调用CellEditor中的stopCellEditing()，通过fireEditingStopped()调用到editingStopped()。
	3)、在editingStopped方法中，JTable调用getCellEditorValue()取回单元格的值，并且把这个值传递给TableValues(TableModel)的setValueAt()
 * @author Administrator
 *	getTableCellEditorComponent-----java.text.SimpleDateFormat@f67a02002017-05-02（已有值的不执行）
 *	getCellEditorValue-----Tue May 02 00:00:00 CST 2017
 *	setValueAt-----2-2
 */
@SuppressWarnings("serial")
public class DatePickerTableTest extends JFrame{
	protected JTable table;
    
    public DatePickerTableTest(){
          Container pane = getContentPane();
          setTitle("表格单元格选取日期");
          pane.setLayout(new BorderLayout());
          
          //添加表格数据
          TableValues tv =  new TableValues();
          table= new JTable(tv);
          
          //设置行宽
          table.setRowHeight(30);
        
          TableColumnModel tcm = table.getColumnModel();
          TableColumn tc = tcm.getColumn(TableValues.getGender());
          
          //设置“性别”列的单元格渲染器（renderer）
          tc.setCellRenderer(new GenderRenderer());
          //设置“性别”列的单元格编辑器（editor）
          tc.setCellEditor(new TableDatePicker(new SimpleDateFormat("yyyy年-MM月-dd日"))); 
        
          //必须把table放入JScrollPane才会有列名出现
          JScrollPane jsp = new JScrollPane(table);
          pane.add(jsp,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
              DatePickerTableTest stt = new DatePickerTableTest();
              stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              stt.setSize(400,200);
              stt.setVisible(true);
              stt.setLocationRelativeTo(null);
    }
}
