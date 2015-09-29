
package retailclasses;

/**
 * Holds data about an item in a retail store
 * @author Seth Frosch
 */
public class RetailItem {
    public String description;
    public int unitsOnHand;
    public double price;
    
    /**
     * Constructor will take description, unitsOnHand, and price arguments
     * @param description A string field for a description of the item
     * @param unitsOnHand An integer for the amount of an item in the inventory
     * @param price A double for the price of the item
     */
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    // Initializing zero values for constructor fields
    public RetailItem(){
        this.description = " ";
        this.unitsOnHand = 0;
        this.price = 0.0;
    }
    
    /**
     * Accessors to get the values stored in description, unitsOnHand, and price
     * @return getDescription will return the string description
     * getUnitsOnHand will return the integer unitsOnHand
     * getPrice will return the double price
     */
    public String getDescription(){ return this.description; }
    public int getUnitsOnHand(){ return this.unitsOnHand; }
    public double getPrice(){ return this.price; }
    
    /**
     * Mutator to set field value for description
     * @param description Will set the string value for the item description
     */
    public void setDescription(String description){
        this.description = description;
    } 
    
    /**
     * Mutator to set field value for unitsOnHand
     * @param unitsOnHand Will set the integer value for amount of item on hand
     */
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    
    /**
     * Mutator to set field value for price
     * @param price Will set the double value for price of the item
     */
    public void setPrice(double price){
        this.price = price;
    }
}
