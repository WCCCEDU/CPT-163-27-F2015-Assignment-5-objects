package wk5.objects;

/**
 * CPT 163 Java I
 * Assignment 5 Objects
 * @author Katrina Siffrinn
 */

public class RetailItem {
    
    //Fields
    private String description = "";
    private int unitsOnHand = 0;
    private double price = 0;
    
    //Constructor accepts values for each field
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    //Mutators to store values in fields
    public void setDescription(String description)
        {this.description = description;}
    
    public void setUnitsOnHand(int unitsOnHand)
        {this.unitsOnHand = unitsOnHand;}
    
    public void setPrice(double price)
        {this.price = price;}   
    
    //Accessors return values to fields
    public String getDescription()
        {return this.description;}
    
    public int getUnitsOnHand()
        {return this.unitsOnHand;}  
    
    public double getPrice()
        {return this.price;}
           
  } //End of Class
