
package assignment5objectsretail;

/**
 *
 * @author afrom_000
 */
public class RetailItem {
    
    //fields
    private String description = "";
    private int unitsOnHand = 0;
    private double price = 0;
    
    //constructor for retail items
    public RetailItem(String description, int inStock, double price){
        this.description = description;
        this.unitsOnHand = inStock;
        this.price = price;                
    }
    
    public void setDesc(String desc){//mutator to change description of an item
        this.description = desc;
    }
    
    public void setStock(int stock){//mutator to chang units in stock
        this.unitsOnHand = stock;
    }
    
    public void setPrice(double price){//mutator to change item price
        this.price = price;
    }
    
    public String getDesc(){//gets current item description
        return this.description;
    }
    
    public int getStock(){//gets current number of units in stock of item
        return this.unitsOnHand;
    }
    
    public double getPrice(){//gets current price of item
        return this.price;
    }
}
