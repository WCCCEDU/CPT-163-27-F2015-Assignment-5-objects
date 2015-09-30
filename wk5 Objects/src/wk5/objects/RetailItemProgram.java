package wk5.objects;

/**
 * CPT 163 Java I
 * Assignment 5 Objects
 * @author Katrina Siffrinn
 * Program to create 3 RetailItem objects and 
 * store data in them.
 */
public class RetailItemProgram {
    
    public static void main(String[] args){
        
        //Create new retail item objects
        RetailItem roses = new RetailItem("Red Roses", 200, 1.95);
        RetailItem fern = new RetailItem("Potted Fern", 50, 19.95);
        RetailItem orchid = new RetailItem("Orchid", 25, 26.95);
        
       //Display retail items and thier stored data
        System.out.println("Description: " + "\t" + roses.getDescription() + 
               "\t\t" + "Units on hand: " + roses.getUnitsOnHand() 
                + "\t\t" + "Price per unit: " + "\t$" + roses.getPrice());
        
        System.out.println("Description: " + "\t" +  fern.getDescription() + 
                "\t\t" + "Units on hand: " + fern.getUnitsOnHand() + 
                "\t\t" + "Price per unit: " + "\t$" + fern.getPrice());
       
        System.out.println("Description: " + "\t" + orchid.getDescription() + 
                "\t\t\t" + "Units on hand: " + orchid.getUnitsOnHand() + 
                "\t\t" + "Price per unit: " + "\t$" + orchid.getPrice());
       
    }
    
} //End of Program
    
