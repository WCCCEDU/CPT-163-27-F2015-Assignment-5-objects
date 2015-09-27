/* CPT163 Java Programming I
 * Chapter 6
 * Programming Challenge 4, RetailItem Class
 */
package assignment5.tinkey;

/**
 *
 * @author srtinkey
 */
public class RetailItem {
    
    // class fields
    String description;             // brief description of item
    int unitsOnHand;                // number of units in inventory
    double price;                   // item's retail price
    
    public void RetailItem(){
        description = "";
        unitsOnHand = 0;
        price = 0;
    }
    
    public void setItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
}
