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
    String discription;
    int onHand;
    double price;
    
    //constructors
    public RetailItem(String discription, int onHand, double price){
        this.discription = discription;
        this.onHand = onHand;
        this.price = price;
    }
    
    //accessors
    public String getDiscription(){return this.discription;}
    public int getOnHand(){return this.onHand;}
    public double getPrice(){return this.price;}
    

}
