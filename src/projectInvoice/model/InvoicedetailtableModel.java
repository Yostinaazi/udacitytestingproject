/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectInvoice.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SG5530150
 */
public class InvoicedetailtableModel extends AbstractTableModel {
    private List<InvoiceDetail> items;

    public List<InvoiceDetail> getItems() {
        return items;
    }

    public InvoicedetailtableModel(List<InvoiceDetail> items) {
        this.items=items;
       }
    

    @Override
    public int getRowCount() {
        
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0:
                return "NO";
              case 1:
                return "ItemName";
                case 2:
                return "ItemPrice";
                 case 3:
                return "Item count";
                case 4:
                return "Item Total";
                 default:
                        return "";
        }
        
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceDetail row=items.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                return row.getHeader().getInvnumber();
                case 1:
                return row.getItemname();
                 case 2:
                return row.getItemprice();
                case 3:
                return row.getItemcount();
                case 4:
                return row.getlinetotal();
                default:
                    return"";
                
        }
    }
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
     return false;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        switch(columnIndex){
            case 0:
                return Integer.class;
              case 1:
                return String.class;
                case 2:
                return Double.class;
                 case 3:
                return Integer.class;
                case 4:
                return Double.class;
                 default: 
                        return Object.class;
        }
                
    }
   
  
    
    
}
