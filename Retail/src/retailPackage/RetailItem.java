/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailPackage;

/**
 *Retail class. This allows you to enter a items, description, onhand
 * and price
 * @author Steve
 */
public class RetailItem {
    
    //Fields
    String description;
    int onHand;
    double price;
    
    //constructors
    public RetailItem(String description, int onHand, double price){
        this.description = description;
        this.onHand = onHand;
        this.price = price;
    }
    
    public RetailItem(){
        this.description = " ";
        this.onHand = 0;
        this.price = 0.0;
    }
    //accessors
    public String getDiscription(){return this.description;}
    public int getOnHand(){return this.onHand;}
    public double getPrice(){return this.price;}
    
    //mutators
    public void setDescription(String description){
        this.description = description;
        
    }
    public void setOnHand(int onHand){
        this.onHand = onHand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    
}
