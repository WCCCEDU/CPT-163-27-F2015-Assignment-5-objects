/* CPT163 Java Programming I
 * Chapter 6
 * Programming Challenge 4, RetailItem Class
 */
package Chapter64;

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
        this.description = "";
        this.unitsOnHand = 0;
        this.price = 0;
    }
    
    public void RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    public String getDescription(){
        return this.description;
    }

    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
        
} // class
