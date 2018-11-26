package com.learn.swing.jtable.multilinerenderer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class MultiLineTableTest extends JFrame { 
    public MultiLineTableTest() { 
        JTable tbl = new JTable(new String[][]{{ 
                "JTable 里单元格内容的显示器是 TableCellRenderer。", 
                "默认的显示器（DefaultTableCellRenderer） 继承 JLabel 所以不方便多行显示。", 
                "要多行显示应该继承 JTextArea（参看下面的 TableCellTextAreaRenderer 类）。", 
                "当然，别忘了调用 JTable.setDefaultRenderer() 登记你的显示器。"}}, 
                "A B C D".split(" ")); 
        tbl.setDefaultRenderer(Object.class, new MultiLineCellRenderer()); 
        add(new JScrollPane(tbl)); 
        setSize(600, 200); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    } 
    public static void main(String[] args) {
    	new MultiLineTableTest();
    } 
}
