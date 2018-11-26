package common;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.StrokeBorder;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringToolsTest {

	/*
	 * compareTo() 字符串比较
	 */
	@Test
	public void testStringCompare() {
		String curTime = "20170328";
		
		System.out.println(curTime.compareTo("20170328"));
	}
	
	/*
     * 字符串为空判定
     * 
     */
    @Test
    public void testCheckEmpty() {
        String str = " ";
        System.out.println("1" + str);
        System.out.println(StringUtils.isEmpty(str));       //""为空，null为空，空格此处判定为非空
        System.out.println(StringUtils.isBlank(str));       //""为空，null为空，空格此处判定为空
        System.out.println(StringUtils.isEmpty(str.trim()));//""为空，null抛空指针异常，空格此处判定为空
    }
    
    /*
     * 多个字符串为空判定
     * 
     */
    @Test
    public void testCheckMultiEmpty() {
        String str1 = " ";
        String str2 = "123";
        System.out.println("1:" + str1);
        System.out.println("2:" + str2);
        System.out.println(StringUtils.isAnyBlank(str1, str2));       //""为空，null为空，空格此处判定为空
        
    }
    
    /**
     * 正则表达式验证日期格式
     * @param args
     */
    @Test
    public void testCheckMethod1(String[] args)
    {
        String checkValue = "2007-02-29";
        String eL = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$";
//        String eL= "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";

        Pattern p = Pattern.compile(eL);
        Matcher m = p.matcher(checkValue);
        boolean b = m.matches();
        if(b)
        {

            System.out.println("格式正确");
        }
        else
        {
            System.out.println("格式错误");
        }

    }
    
    /**
     * 测试字符串截取函数
     */
    @Test
    public void testSubstr() {
    	String str1 = "COM21";
    	String str2 = "001.label";
    	String str3 = "2017-01-23";
    	String str4 = "012345678";
    	String str5 = "COM3 ";
    	String str6 = "1D47021E011020304050607080112233445566778810203040506"
    			+ "0708011223344556677AA1E041E0110203040506070801122334455667"
    			+ "788102030405060708011223344556677CC1E041E011020304050607080"
    			+ "1122334455667788102030405060708011223344556677AA1E041E01102"
    			+ "03040506070801122334455667788102030405060708011223344556677"
    			+ "CC1E041D47031D48021E011020304050607080112233445566778810203"
    			+ "0405060708011223344556677DD1E041E01102030405060708011223344"
    			+ "55667788102030405060708011223344556677FF1E041E0110203040506"
    			+ "070801122334455667788102030405060708011223344556677DD1E041E011020304"
    			+ "0506070801122334455667788102030405060708011223344556677FF1E041D4803";
    	
    	System.out.println(str1.substring(3));
    	System.out.println(str2.substring(0, str2.length()-6));// 后面要去掉几个，就减去几
    	System.out.println(str4.substring(1, str4.length()-1));
    	System.out.println(str3.replace("-", "").trim());
    	System.out.println(str5.substring(0, 3));
    	String string6 = str6.substring(str6.indexOf("1D4702") + 6, str6.indexOf("1D4703"));
    	System.out.println(string6);
    	String[] strings = string6.split("1E04");
    	System.out.println(strings.length);
    	for(String str : strings) {
    		System.out.println(str);
    	}
    }
    
    /**
     * 字符串与16进制转化
     */
    @Test
    public void testStringHex() {
    	String paraStr = "606-1";
        String str = "";
        for (int i = 0; i < paraStr.length(); i++) {
            int ch = paraStr.charAt(i);
            String s = Integer.toHexString(ch);
            str = str + s;
        }
        System.out.println(paraStr + ":" + str + "\n");
	}
    
    public void testObjectsUtils() {
    	String str1 = "123";
    	String str2 = null;
    	System.out.println(Objects.toString(str1, "aaa"));
    	System.out.println(Objects.toString(str2, "bbb"));
    }
    
    /**
     * Swing界面文本内容的动态添加与显示
     */
    @Test
    public void testSwingTextShow() {
		JFrame jf = new JFrame("Telesis测试");
        jf.setPreferredSize(new Dimension(1000, 500));
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.setLayout(new BorderLayout());

        JPanel mainPnl = new JPanel();
        mainPnl.setPreferredSize(new Dimension(1000, 470));
        mainPnl.setLayout(new BorderLayout());
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setPreferredSize(new Dimension(500, 500));
        
        final JTextArea textArea = new JTextArea();
        final JTextField textField = new JTextField();
        final JTextField textField2 = new JTextField();
        JButton addBtn = new JButton("添加内容");
        
        addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append(textField2.getText() + "\n");
				textField.setText(textField2.getText());;
			}
		});
        
        splitPane.add(textArea, JSplitPane.LEFT);
        splitPane.add(textField, JSplitPane.RIGHT);
        
        mainPnl.add(textField2, BorderLayout.NORTH);
        mainPnl.add(addBtn, BorderLayout.SOUTH);
        mainPnl.add(splitPane, BorderLayout.CENTER);
        jf.getContentPane().add(mainPnl, BorderLayout.CENTER);

        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
	}
    
    public void testStringBuilder() {
    	StringBuilder stringBuilder = new StringBuilder();
    	stringBuilder.append("begin");
    	stringBuilder.append("end");
    	System.out.println(stringBuilder.toString());
    	stringBuilder.delete(0, stringBuilder.length());
    	System.out.println(stringBuilder.toString());
	}
    
    public void testStringToBytes() {
    	StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char) 29);

        stringBuilder.append("M" + "1234文字" + (char) 29);
        stringBuilder.append("W" + "1234文字" + (char) 29);
        stringBuilder.append("P" + "1234文字" + (char) 29);
        stringBuilder.append("S" + "1234文字" + (char) 29);
        stringBuilder.append("V" + "1.1.1.0" + (char) 29);
        stringBuilder.append("A1" + "1234文字" + (char) 29);
        stringBuilder.append("A2" + "1234文字" + (char) 29);
        stringBuilder.append("A3" + "1234文字" + (char) 29);
        stringBuilder.append("A4" + "1234文字" + (char) 29);
        stringBuilder.append("A5" + "1234文字" + (char) 29);
        stringBuilder.append("B1" + "1234文字" + (char) 29);
        stringBuilder.append("B2" + "1234文字" + (char) 29);
        stringBuilder.append("B3" + "1234文字" + (char) 29);
        stringBuilder.append("B4" + "1234文字" + (char) 29);
        stringBuilder.append("C1" + "1234文字" + (char) 29);
        stringBuilder.append("D1" + "1234文字" + (char) 29);
        stringBuilder.append("D2" + "1234文字" + (char) 29);
        stringBuilder.append("D3" + "1234文字" + (char) 29);
        stringBuilder.append("D4" + "1234文字" + (char) 29);
        stringBuilder.append("D5" + "1234文字" + (char) 29);
        stringBuilder.append("E1" + "1234文字" + (char) 29);
        stringBuilder.append("F1" + "1234文字" + (char) 29);
        stringBuilder.append("F2" + "1234文字" + (char) 29);
        stringBuilder.append("F3" + "1234文字" + (char) 29);
        stringBuilder.append("F4" + "1234文字" + (char) 29);
        stringBuilder.append("F5" + "1234文字" + (char) 29);
        stringBuilder.append("F6" + "1234文字" + (char) 29);
        stringBuilder.append("F7" + "1234文字" + (char) 29);
        stringBuilder.append("Q1" + "1234文字" + (char) 29);
        stringBuilder.append("Q2" + "1234文字" + (char) 29);
        stringBuilder.append("Q3" + "1234文字" + (char) 29);
        stringBuilder.append("Q4" + "1234文字" + (char) 29);
        stringBuilder.append("Q5" + "1234文字" + (char) 29);

        stringBuilder.append((char) 30 + (char) 04);
        
        try {
        	System.out.println(stringBuilder.toString() + "\n");
			String hexStr = toHexString(stringBuilder.toString());
			System.out.println(hexStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    private String toHexString(String s) {

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }
    
    public static void main(String[] args) {
		StringToolsTest stringToolsTest = new StringToolsTest();
//		stringToolsTest.testObjectsUtils();
//		stringToolsTest.testSwingTextShow();
		stringToolsTest.testSubstr();
//		stringToolsTest.testStringToBytes();
	}
}
