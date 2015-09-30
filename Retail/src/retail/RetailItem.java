
package retail;

/**
 *The RetailItem class contains the methods used in the Retail Class.
 * @author mkavic
 */
public class RetailItem {
 
    
    private String description;
    private int unitsOnHand;
    private double price;
    
    /**
     * Constructor
     * @param desc The description of the item.
     * @param units The number of units on hand.
     * @param pri The price of the item.
     */
    public RetailItem(String desc, int units, double pri)
    {
        description = desc;
        unitsOnHand = units;
        price = pri;
        
    }
    /**
     * The setDescription method stores a value in the description field.
     * @param desc The value to store in the description field.
     */
    public void setDescription(String desc)
    {
        description = desc;
    }
    /**
     * The setUnitsOnHand method stores a value in the unitsOnHand field.
     * @param units The value to store in the description field.
     */
    public void setUnitsOnHand(int units)
    {
        unitsOnHand = units;
    }
    /**
     * The setPrice method stores a value in the unitsOnHand field.
     * @param pri The value to store in the unitsOnHand field.
     */
    public void setPrice(double pri)
    {
        price = pri;
    }
    /**
     * getDescription method 
     * @return The item's description.
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * getUnitsOnHand method
     * @return The number of units on hand.
     */
    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }
    /**
     * getPrice method
     * @return The price of the item.
     */
    public double getPrice()
    {
        return price;
    }
}

