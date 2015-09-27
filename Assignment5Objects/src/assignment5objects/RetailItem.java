/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5objects;

/**
 *
 * @author Samantha
 */
public class RetailItem {
    
    String description = " ";
    int unitsOnHand = 0;
    double price = 0;
    
    /**
     * Constructor method creates an instance of the RetailItem class
     * @param description String value describing object
     * @param unitsOnHand Integer value representing quantity on hand
     * @param price Double value price of item object
     */
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    /**
     * Sets description of item object
     * @param desc string value
     */
    public void setDescription(String desc) {
        this.description = desc;
    }
    
    /**
     * Sets units of item object
     * @param units integer value
     */
    public void setUnitsOnHand(int units) {
        this.unitsOnHand = units;
    }
    
    /**
     * Sets price of item object
     * @param price double
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * gets description of item object
     * @return description string
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * gets units of item object
     * @return unitsOnHand integer
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    
    /**
     * gets price of item object
     * @return price double
     */
    public double getPrice() {
        return price;
    }
        
}
