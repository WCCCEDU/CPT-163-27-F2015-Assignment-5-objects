package assignment5;

/**
 *
 * @author Adam
 */
public class Assignment5 {

    /**
     * This program is the assignments 2 and 4 from chapter 6 from the 
     * Java book for class CPT163.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Car class challenge
        Car newCar = new Car(1955,"Ford");
        for(int i=0; i<5; i++){
            newCar.accelerate();
            print("Speed: " + newCar.getSpeed());
        }
        for(int i=0; i<5; i++){
            newCar.brake();
            print("Speed: " + newCar.getSpeed());
        }
        // RetailItem challenge
        String itemDescription;
        int itemUnits;
        double itemPrice;
        String item2Description;
        int item2Units;
        double item2Price;
        String item3Description;
        int item3Units;
        double item3Price;
        
        //set item 1
        RetailItem item = new RetailItem("Jacket", 12, 59.95);
        itemDescription = item.getDescription();
        itemUnits = item.getUnits();
        itemPrice = item.getPrice();
        
        //set item 2
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        item2Description = item2.getDescription();
        item2Units = item2.getUnits();
        item2Price = item2.getPrice();
        
        //set item 3
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        item3Description = item3.getDescription();
        item3Units = item3.getUnits();
        item3Price = item3.getPrice();
        
        //display item results
        print("Item #1  "+ itemDescription +"           "+ itemUnits + " "+itemPrice);
        print("Item #2  "+ item2Description +"   "+ item2Units + " "+item2Price);
        print("Item #3  "+ item3Description +"            "+ item3Units + " "+item3Price);
    }
    
    /**
     * Shortcut for println
     * @param message needed printed
     */
    public static void print(String message){
        System.out.println(message);
    }
    
}
