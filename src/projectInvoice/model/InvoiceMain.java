/*``
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectInvoice.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SG5530150
 */
public class InvoiceMain {
    private int invnumber;
    private String customername;  
    private Date invdate;
    ArrayList<InvoiceDetail> lines;
        double invtotal;
        private DateFormat date1=new SimpleDateFormat("dd-MM-yyyy");

    public double getInvtotal() {
        double totla=0.0;
        for (InvoiceDetail li:getLines())
        {
        totla+=li.getlinetotal();
        }
        return totla;
    }

    public void setInvtotal(double invtotal) {
        this.invtotal = invtotal;
    }


    public ArrayList<InvoiceDetail> getLines() {
        if (lines==null)
            lines=new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceDetail> lines) {
        this.lines = lines;
    }
    
    public InvoiceMain(int invnumber, String customername, Date invdate) {
        this.invnumber = invnumber;
        this.customername = customername;
        this.invdate = invdate;
     //   this.lines=new ArrayList<>();
    }

    public Date getInvdate() {
        return invdate;
    }
 public String  getdatatosave()
    {
       return ""+getInvnumber()+","+date1.format(getInvdate())+","+","+getCustomername(); 
    }
    public void setInvdate(Date invdate) {
        this.invdate = invdate;
    }

    public int getInvnumber() {
        return invnumber;
    }

    public void setInvnumber(int invnumber) {
        this.invnumber = invnumber;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
       
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invnumber=" + invnumber + ", customername=" + customername + ", invdate=" + invdate + '}';
    }
    
     public void addiveline(InvoiceDetail le) 
     {
         getLines().add(le);
     }
   
}
