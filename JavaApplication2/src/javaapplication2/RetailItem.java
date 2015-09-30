/*
 * To change this license header, choose License Headers in Project 
 * Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication2;

/**
 * RetailItem class
 * 
 * @author Rhonda Marshall
 * Sept 27, 2015
 */
public class RetailItem {
    String description;     // A brief description of the item
    int unitsOnHand;        // The number of units currently in the inventory
    double price;           // Theitem's retail price
    
    /**
     *  Constructor for the RetailItem class
     * @param description   The item description
     * @param unitsOnHand   The number of units in inventory
     * @param price         The items retail price
     */
    
    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    /**
     * The mutator method setDescription stores a value in the RetailItem
     * object's description field
     * @param description
     */
    
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * The mutator method setUnitsOnHand stores a value in the RetailItem
     * object's unitsOnHand field
     * @param unitsOnHand
     */
    
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    
    /** The mutator method setPrice stores a value in the RetailItem
     * object's price field
     * @param price
     */
    
    public void setPrice(double price){
        this.price = price;
    }
    
    /**
     * The accessor method getDescription returns the value in the RetailItem
     * object's description field
     */
    
    public String getDescription(){
        return this.description;
    }
    
    /**
     * The accessor method getUnitsOnHand returns the value in the RetailItem
     * object's unitsOnHand field
     */
    
    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    
    /**
     * The accessor method getPrice returns the value in the RetailItem
     * object's price field
     */
    
    public double getPrice(){
        return this.price;
    }
}
