/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectInvoice.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SG5530150
 */
public class InvoiceMaintableModel extends AbstractTableModel   {
      
      private List<InvoiceMain> ListOfMains;

    public List<InvoiceMain> getListOfMains() {
        return ListOfMains;
    }
      
      public InvoiceMaintableModel(List<InvoiceMain> ListOfMains)
      {
          this.ListOfMains=ListOfMains;
      }
      

    @Override
    public int getRowCount() {
      return ListOfMains.size();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() 
    {
            return 4;
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        InvoiceMain row=ListOfMains.get(rowIndex);
      //  System.out.println(""+row);
        
        switch(columnIndex)
        {
            case 0:
                return row.getInvnumber();
                case 1:
                return row.getCustomername();
                 case 2:
                return df.format(row.getInvdate());
                case 3:
                return row.getInvtotal();
                default:
                    return"";
                
        }
    }
    

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "NO";
              case 1:
                return "Customer name";
                case 2:
                return "Date";
                 case 3:
                return "Total";
                 default:
                        return "";
        }
        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0:
                return Integer.class;
              case 1:
                return String.class;
                case 2:
                return String.class;
                 case 3:
                return Double.class;
                 default: 
                        return Object.class;
        }
                
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
     return false;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

 
    
}
