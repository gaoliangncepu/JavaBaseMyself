package com.learn.swing.jtable.celleditor;

import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.learn.swing.jtable.abstracttablemodel.TableValues;
import com.learn.swing.jtable.cellrenderer.GenderRenderer;
import com.learn.swing.jtable.datepicker.TableDatePicker;

/**
 * GenderEditor类的工作流程：
	1)、调用TableCellEditor接口中的getTableCellEditorComponent()方法初始化编辑
	2)、编辑当前的单元格，再点击另一个单元格时，调用CellEditor中的stopCellEditing()，通过fireEditingStopped()调用到editingStopped()。
	3)、在editingStopped方法中，JTable调用getCellEditorValue()取回单元格的值，并且把这个值传递给TableValues(TableModel)的setValueAt()
 * @author Administrator
 * 方法调用顺序：
 *	isCellEditable
 *	getTableCellEditorComponent
 *	addCellEditorListener
 *	shouldSelectCell
 *	stopCellEditing
 *	getCellEditorValue --> TableModel.setValueAt()
 *	removeCellEditorListener
 *	fireEditingStopped
 */
@SuppressWarnings("serial")
public class EditorTableTest extends JFrame{
    
    public EditorTableTest(){
          setTitle("TableCellEditor");
          
          //添加表格数据
          TableValues tv =  new TableValues();
          JTable table= new JTable(tv);
          table.setRowHeight(30);
        
          TableColumnModel columnModel = table.getColumnModel();
          //获取“性别”列
          TableColumn genderColumn = columnModel.getColumn(TableValues.getGender());
          //获取“生日”列
          TableColumn birthColumn = columnModel.getColumn(TableValues.getBirth());
          
          //设置“性别”列的单元格渲染器（renderer）
          genderColumn.setCellRenderer(new GenderRenderer());
          //设置“性别”列的单元格编辑器（editor）
          genderColumn.setCellEditor(new GenderEditor()); 
          //设置“生日”列的单元格编辑器（日期格式在初始化时起作用）
          birthColumn.setCellEditor(new TableDatePicker(new SimpleDateFormat("yyyy-MM-dd")));
        
          //必须把table放入JScrollPane才会有列名出现
          JScrollPane jsp = new JScrollPane(table);
          getContentPane().add(jsp);
    }
    public static void main(String[] args) {
              EditorTableTest stt = new EditorTableTest();
              stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              stt.setSize(400,300);
              stt.setVisible(true);
              stt.setLocationRelativeTo(null);
    }
}
