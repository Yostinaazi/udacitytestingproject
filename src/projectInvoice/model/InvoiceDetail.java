/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectInvoice.model;

/**
 *
 * @author SG5530150
 */
public class InvoiceDetail {
 private String itemname;
 private double itemprice;
 private int itemcount;
InvoiceMain header;

    public InvoiceDetail(String itemname, double itemprice, int itemcount, InvoiceMain header) {
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.itemcount = itemcount;
        this.header = header;
    }

    public InvoiceMain getHeader() {
        return header;
    }

    public void setHeader(InvoiceMain header) {
        this.header = header;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public int getItemcount() {
        return itemcount;
    }

    public String  getdatatosave()
    {
       return ""+getHeader().getInvnumber()+","+getItemname()+","+getItemprice()+","+getItemcount(); 
    }
    
    public void setItemcount(int itemcount) {
        this.itemcount = itemcount;
    }

    @Override
    public String toString() {
        return "invoiceline{" + "itemname=" + itemname + ", itemprice=" + itemprice + ", itemcount=" + itemcount + '}';
    }
 
    public double getlinetotal()
    {
        return itemprice*itemcount ;
    }
}
