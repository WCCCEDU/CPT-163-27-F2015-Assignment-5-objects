package ItemPackage;

public class RetailItem {
    
    //fields
    private String description="";
    private int unitsOnHand = 0;
    private double price = 0.0;
    
    //constructor accepts values for all fields
    public RetailItem(int unitsOnHand, double price, String description){
        this.unitsOnHand = unitsOnHand;
        this.price = price;
        this.description = description;
    }
    
    //Mutators
    public void setUnitsOnHand(int unitsOnHand){this.unitsOnHand = unitsOnHand;}
    public void setPrice(double price){this.price = price;}
    public void setDescription(String descr){this.description = descr;}

    //Accessors
    public int getUnitsOnHand(){return this.unitsOnHand;}
    public double getPrice(){return this.price;}
    public String getDescription(){return this.description;}
    
    
}
