
package SalesModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class LinesTableModel extends AbstractTableModel{
           
    private ArrayList<Lines> lines;    
    private String columns []={"No","Item Name","Item Price","Quantity","Item Total"};

    public LinesTableModel(ArrayList<Lines> lines) {
        this.lines = lines;
    }

    public ArrayList<Lines> getLines() {
        return lines;
    }

    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
          return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
           Lines line= lines.get(rowIndex);
           switch(columnIndex){
           
               case 0: {
                   return line.getInvoice().getSonumber();
                   
               }
               case 1: {
                   return line.getProduct();
                   
               }
               case 2: {
                   return line.getPrice() ;
               }
               case 3: {
                   return line.getQty();
                   
               }
               case 4:
               return line.getLineTotalPrice();
               
               default: return "";
           
           }
    }
    
}
