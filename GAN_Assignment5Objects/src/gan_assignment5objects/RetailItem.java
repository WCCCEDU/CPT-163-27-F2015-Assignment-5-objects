/*
 * Chapter 6 Programming Challenge #4
 */
package gan_assignment5objects;

/**
 * RetailItemClass
 * @author Gary A. Newsome
 */
public class RetailItem {
    
    // Fields
    String strDescription;  // holds a brief description of the item
    int intUnitsOnHand;     // holds to number of units on hand
    double dblPrice;        // holds the price of an item
    
    /**
     * Constructor
     * @param strDescription accepts a string for an items description
     * @param intUnitsOnHand accepts an integer for the number of units on hand
     * @param dblPrice accepts a double for the price of the item
     */
    public RetailItem(String strDescription,
            int intUnitsOnHand, double dblPrice){
        this.strDescription = strDescription;
        this.intUnitsOnHand = intUnitsOnHand;
        this.dblPrice = dblPrice;
    } // end of constructor
    
    // Accessors and Mutators
    /**
     * Accessors to get and return items description
     * @return strDescription
     */
    public String getDescription(){return this.strDescription;}
    /**
     * Accessors to get and return number of units on hand
     * @return intUnitsOnHand
     */
    public int getUnitsOnHand(){return this.intUnitsOnHand;}
    /**
     * Accessors to get and return price of the item
     * @return dblPrice
     */
    public double getPrice(){return this.dblPrice;}
    
} // end RetailItem
