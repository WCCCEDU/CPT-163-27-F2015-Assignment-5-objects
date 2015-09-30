
package RetialStore;

/**
 *
 * @author Zachary
 */
/*
declaration of variables
*/
public class RetailItem {
    private  String description;
    private int unitsOnHand;
    private double retailPrice; 
    
    public RetailItem(String descrpt, int numUnits, double price){
        description= descrpt;
        unitsOnHand = numUnits;
        retailPrice = price;
    }
    
    /*
    returns the variable description
    */
    
    public String getDescription(){
        return this.description;
    }
    
    /*
    returns the variable unitsOnHand
    */
    public int getUnits(){
        return this.unitsOnHand;
    }
    
    public double getPrice(){
        return this.retailPrice;
    }
    
    public void setDescription(String d){
        this.description=d;
    }
    /*
    stes units on hand to units variable
    */
    public void setUnitsOnHand(int units){
        this.unitsOnHand=units;
    }
    
    /*
    stes retail price to P
    */
    public void setPrice(double p){
        this.retailPrice=p;
    }
    
    /*
    this is what the programs logic will output
    */
    public String toString(){
        return "The description of the item is " + description + "\n Units of "
                + "item are " + unitsOnHand + "\n the retail price is " + retailPrice;
    }
}
