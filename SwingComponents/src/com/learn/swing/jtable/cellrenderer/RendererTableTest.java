package com.learn.swing.jtable.cellrenderer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.learn.swing.jtable.abstracttablemodel.TableValues;

@SuppressWarnings("serial")
public class RendererTableTest extends JFrame{
	protected JTable table;
    public RendererTableTest(){
          setTitle("TableCellRenderer");
          
          //添加表格数据
          TableValues tv =  new TableValues();
          JTable table= new JTable(tv);
          table.setRowHeight(30);
        
          TableColumnModel tcm = table.getColumnModel();
          TableColumn tc = tcm.getColumn(TableValues.getGender());
          
          //设置“性别”列的单元格渲染器（renderer）
          tc.setCellRenderer(new GenderRenderer());
        
          //必须把table放入JScrollPane才会有列名出现
          JScrollPane jsp = new JScrollPane(table);
          getContentPane().add(jsp);
    }
    public static void main(String[] args) {
              RendererTableTest stt = new RendererTableTest();
              stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              stt.setSize(400,200);
              stt.setVisible(true);
              stt.setLocationRelativeTo(null);
    }
}
