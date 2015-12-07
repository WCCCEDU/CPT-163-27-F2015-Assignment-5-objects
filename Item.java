package assignment5retail;

/**
 * An item is a retail product that has a total unitsOnHand, a description, and
 * a price.
 * @author Zachary Z Ordo
 */
public class Item {
    private int unitsOnHand;
    private String description;
    private double price;
    
    public Item(int unitsOnHand, String description, double price){ // Overloaded constructor for a retail item.
        this.unitsOnHand = unitsOnHand;
        this.description = description;
        this.price = price;
    }
    
    public int getUnitsOnHand(){ // Read-only object, gets the unitsOnHand.
        return this.unitsOnHand;
    }
    
    public String getDescription(){ // Read-only object, gets the item description.
        return this.description;
    }
    
    public double getPrice(){ // Read-only object, gets the item's price.
        return this.price;
    }
    
    public Item createItem(int itemID, int unitsOnHand, String description, double price){
        
        return new Item(this.unitsOnHand, this.description, this.price); //Create my item object.
        
    }
}
