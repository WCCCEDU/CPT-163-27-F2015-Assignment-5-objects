/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.objects;

/**
 *
 * @author Tehold
 */
public class RetailItem {
    /**
     * Fields of RetailItem
     * A string for the description, a integer for units on hand, and a double
     * for the price
     */
    private String description;
    private int unitsOnHand;
    private double price;
    /**
     * Constructor that takes @params for a units cost, units on hand, and
     * description
     * @param desc Description of Item
     * @param units Units on Hand
     * @param cost Cost of Item
     */
    public RetailItem(String desc, int units, double cost){
        this.price = cost;
        this.unitsOnHand = units;
        this.description = desc;
    }
    /**
     * Accessor used to get the description of the item
     * @return Description of Item
     */
    public String getDescription(){
        return this.description;
    }
    /**
     * Accessor used to get the number of units on hand
     * @return Units on Hand
     */
    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    /**
     * Accessor used to get the price of the item
     * @return Price of Item
     */
    public double getPrice(){
        return this.price;
    }
   /**
    * Mutator that accepts a string to set as the item's description
    * @param desc Description of Item
    */
    public void setDescription(String desc){
        this.description = desc;
    }
    /**
     * Mutator that accepts a integer to set as the item's "units on hand"
     * @param units Units on Hand
     */
    public void setUnits(int units){
        this.unitsOnHand = units;
    }
    /**
     * Mutator that accepts a double to set as the item's price
     * @param cost Price of Item
     */
    public void setPrice(double cost){
        this.price = cost;
    } 
    
}
