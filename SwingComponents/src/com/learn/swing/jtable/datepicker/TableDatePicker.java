package com.learn.swing.jtable.datepicker;

import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;

import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

import org.jdesktop.swingx.JXDatePicker;

/**
 * @description: <p> 数据采集表格内的日期选择控件</p>
 * @copyright: Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
@SuppressWarnings("serial")
public class TableDatePicker extends AbstractCellEditor implements TableCellEditor {

        private JXDatePicker datePicker;

        public TableDatePicker(DateFormat dateFormat) {
            datePicker = new JXDatePicker(Locale.CHINA);
            datePicker.setFormats(dateFormat);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            try {
            	// 日期格式在初始化时起作用
                datePicker.setDate(datePicker.getFormats()[0].parse(String.valueOf(value)));
                System.out.println("创建组件" + "-----" + datePicker.getFormats()[0] + String.valueOf(value));
            } catch (ParseException ignored) {
            }
            return datePicker;
        }

        /**
         * 获取选择值，设置并返回前端显示
         */
        @Override
        public Object getCellEditorValue() {
            if (null == datePicker.getDate()) {
                return null;
            } else {
                if (checkDateFormat(datePicker.getDate())) {
                	// 日期格式在前端显示值时起作用
                    System.out.println("getCellEditorValue" + "-----" + String.valueOf(datePicker.getDate()));
                    return new SimpleDateFormat("yyyy年MM月dd日").format(datePicker.getDate());
                }
                return null;
            }
        }

        /**
         * 判断日期格式和范围
         */
        public boolean checkDateFormat(Date date) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = simpleDateFormat.format(date);

            String rexp = "^(([1-9]\\d(([02468][048])|([13579][26]))[\\-]((((0?[13578])|(1[02]))" +
                    "[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))" +
                    "[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2" +
                    "[\\-]((0?[1-9])|([1-2][0-9])))))|([1-9]\\d(([02468][1235679])|([13579][01345789]))" +
                    "[\\-]((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))" +
                    "[\\-]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|(1[0-9])|(2[0-8]))))))";

            java.util.regex.Pattern pat = java.util.regex.Pattern.compile(rexp);

            Matcher mat = pat.matcher(dateStr);

            boolean dateType = mat.matches();
            return dateType;
        }
}

