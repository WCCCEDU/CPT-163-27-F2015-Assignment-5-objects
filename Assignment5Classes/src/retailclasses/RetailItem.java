
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
    
    /**
     * Accessors to get the values stored in description, unitsOnHand, and price
     * @return getDescription will return the string description
     * @return getUnitsOnHand will return the integer unitsOnHand
     * @return getPrice will return the double price
     */
    public String getDescription(){ return this.description; }
    public int getUnitsOnHand(){ return this.unitsOnHand; }
    public double getPrice(){ return this.price; }
    
    
}
