package multilineheader;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel; 
import javax.swing.table.TableColumnModel;

public class TableDemo extends JFrame { 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean DEBUG = true;
    public TableDemo(){
        super("RecorderOfWorkers");
        HeaderRendererHh renderer = new HeaderRendererHh(); 
        TextAreaHeaderRenderer txtrenderer=new TextAreaHeaderRenderer();
        MyTableModel myModel=new MyTableModel();
        JTable table=new JTable(myModel);
        TableColumnModel cmodel = table.getColumnModel();
        for (int i = 0; i < cmodel.getColumnCount(); i++) {   
    	    //cmodel.getColumn(i).setHeaderRenderer(renderer);
    	    cmodel.getColumn(i).setHeaderRenderer(txtrenderer);  
    	}
        table.setPreferredScrollableViewportSize(new Dimension(500,70));
        JScrollPane scrollPane=new JScrollPane(table);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    class MyTableModel extends AbstractTableModel{
        final String[] columnNames ={"First Name","Postion","单件数量","MonthlyPay","Married"};
        final Object[][] data={{"Wangdong","Executive","0106879231",new Integer(5000),new Boolean(false)},
                {"LiHong","Secretay","0106879231",new Integer(3500),new Boolean(true)},
                {"ZhaoXin","Safeguard","0106879231",new Integer(4500),new Boolean(false)},
                {"Chenlei","Saleman","0106879231",new Integer(4000),new Boolean(false)}};
        public int getColumnCount() {
            // TODO Auto-generated method stub
            return columnNames.length;
        } 

        public int getRowCount() {
            // TODO Auto-generated method stub
            return data.length;
        }
        public String getColumnName(int col){
            return columnNames[col];
        }
        public Object getValueAt(int row, int col) {
            // TODO Auto-generated method stub
            return data[row][col];
        }
        public Class getColumnClass(int c){
            return getValueAt(0,c).getClass();
        }
        public boolean isCellEditable(int row,int col){
            if(col<2){
                return false;
            }else{
                return true;
            }
        }
        public void setValueAt(Object value,int row,int col){
            if(DEBUG){
                System.out.println("Setting value at "+row+","+col+" to "+value+"(an instance of "+value.getClass()+")");
            }
            if(data[0][col] instanceof Integer&&!(value instanceof Integer)){
                try{
                    data[row][col]=new Integer(value.toString());
                    fireTableCellUpdated(row,col);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(TableDemo.this,"11111");
                }
            }else{
                data[row][col]=value;
                fireTableCellUpdated(row,col);
            }
            if(DEBUG){
                System.out.println("New value of data:");
                printDebugData();
            }
        }
        private void printDebugData(){
            int numRows=getRowCount();
            int numCols=getColumnCount();
            for(int i=0;i<numRows;i++){
                System.out.print("row"+i+":");
                for(int j=0;j<numCols;j++){
                    System.out.print(" "+data[i][j]);
                }
                System.out.println();
            }
            System.out.println("---------------------------");
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TableDemo frame=new TableDemo();
        frame.pack();
        frame.setVisible(true);
    } 

} 