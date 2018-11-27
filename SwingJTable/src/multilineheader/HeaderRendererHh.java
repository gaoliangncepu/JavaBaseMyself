package multilineheader;

import java.awt.Component;   
import java.awt.Dimension;   
import java.awt.FontMetrics;   
  
import javax.swing.JLabel;   
import javax.swing.JTable;   
import javax.swing.UIManager;   
import javax.swing.table.DefaultTableCellRenderer;   
import javax.swing.table.JTableHeader;   
import javax.swing.table.TableColumnModel;   
  
public class HeaderRendererHh extends DefaultTableCellRenderer {   
  
    /**
	 * ��ΪJLabel���Խ���html�е�br��������������ص㣬
	 * ���Զ�̬������ʾ�ı��⣬�ڻ��д����<br>��ǣ�ʵ�ֻ�����ʾ
	 */
	private static final long serialVersionUID = 1L;

	public Component getTableCellRendererComponent(JTable table, Object value,   
            boolean isSelected, boolean hasFocus, int row, int column) {   
  
        JTableHeader header = table.getTableHeader();   
        setForeground(header.getForeground());   
        setBackground(header.getBackground());   
        setFont(header.getFont());   
        setOpaque(true);   
        setBorder(UIManager.getBorder("TableHeader.cellBorder"));   
  
        // �õ��еĿ��   
        TableColumnModel columnModel = table.getColumnModel();   
        int width = columnModel.getColumn(column).getWidth();   
  
        value = getShowValue(value.toString(), width);   
        setText(value.toString());   
        setSize(new Dimension(width, this.getHeight()));   
  
        setHorizontalAlignment(JLabel.CENTER);   
  
        return this;   
    }   
  
    private Object getShowValue(String value, int colWidth) {   
        // ���ݵ�ǰ���������ʾֵ�õ���Ҫ��ʾ�Ŀ��   
        FontMetrics fm = this.getFontMetrics(this.getFont());   
        int width = fm.stringWidth(value.toString());   
        int test = fm.stringWidth("��");   
        System.out.println(test * value.length());   
        System.out.println(width);   
        if (width < colWidth) {   
            return value;   
        }   
        StringBuffer sb = new StringBuffer("<html>");   
        char str;   
        int tempW = 0;   
        for (int i = 0; i < value.length(); i++) {   
            str = value.charAt(i);   
            tempW += fm.charWidth(str);   
            if (tempW > colWidth) {   
                sb.append("<br>");   
                tempW = 0;   
            }   
            sb.append(str);   
        }   
        sb.append("</html>");   
        return sb.toString();   
    }   
}