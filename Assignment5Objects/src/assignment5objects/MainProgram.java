/**
 * @author Samantha Shurie
 * Assignment 5: Working with Objects
 */
package assignment5objects;


public class MainProgram {
   
    /**
     * Main method implements both the RetailItem and Car classes. This method
     * creates a new instance of the Car class and increases/decreases it's speed
     * field. It also creates three instances of the RetailItem class and prints
     * their fields.
     * @param args 
     */
    public static void main(String[] args) {
        int currentSpeed = 0;   //used to retrieve speed value of car object
         
        println("EXERCISE 2: CAR CLASS\n");
        
        Car car = new Car(2010, "Honda");

        println("\tAccelerating...");

        for(int i = 0; i < 5; i++) {
            car.accelerate();
            currentSpeed = car.getSpeed();
            println("\t\tSpeed is now " + currentSpeed + ".");
        }

        println("\n\tApplying Brakes...");

        for(int i = 0; i < 5; i++) {
            car.brake();
            currentSpeed = car.getSpeed();
            println("\t\tSpeed is now " + currentSpeed + ".");
        }
        
        println("");
        
        // End of Exercise 2
        
        
        println("EXERCISE 4: RETAIL ITEM CLASS\n");
        
        RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
        RetailItem jeans = new RetailItem("Jeans", 40, 34.95);
        RetailItem shirt = new RetailItem("Shirt", 20, 24.95);
        
        println("\tItem 1:\t\t" + "Description: " + jacket.description + "\tOn"
                + " Hand: " + jacket.unitsOnHand + "\t Price: $" + jacket.price);
        
        println("\tItem 2:\t\t" + "Description: " + jeans.description + "\tOn"
                + " Hand: " + jeans.unitsOnHand + "\t Price: $" +jeans.price);
        
        println("\tItem 3:\t\t" + "Description: " + shirt.description + "\tOn"
                + " Hand: " + shirt.unitsOnHand + "\t Price: $" +shirt.price);
        
    }
     
    /**
     * println accepts a string to output
     * @param msg String value
     */
    public static void println(String msg) {
        System.out.println(msg);
    }   //End of Print Line Method
    
}   // End of Class

