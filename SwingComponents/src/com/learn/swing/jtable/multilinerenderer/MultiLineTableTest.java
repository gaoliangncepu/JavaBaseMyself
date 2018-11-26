package com.learn.swing.jtable.multilinerenderer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class MultiLineTableTest extends JFrame { 
    public MultiLineTableTest() { 
        JTable tbl = new JTable(new String[][]{{ 
                "JTable �ﵥԪ�����ݵ���ʾ���� TableCellRenderer��", 
                "Ĭ�ϵ���ʾ����DefaultTableCellRenderer�� �̳� JLabel ���Բ����������ʾ��", 
                "Ҫ������ʾӦ�ü̳� JTextArea���ο������ TableCellTextAreaRenderer �ࣩ��", 
                "��Ȼ�������˵��� JTable.setDefaultRenderer() �Ǽ������ʾ����"}}, 
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
