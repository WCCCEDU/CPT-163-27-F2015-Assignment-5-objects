/*
 * Assignment 5 Objects
 * Chapter 6, Programming Challenges 2 and 4
 */
package gan_assignment5objects;
import java.util.Scanner;   // import Scanner

/**
 * Selection menu for Programming Challenge 2 and 4
 * @author Gary A. Newsome
 */
public class GAN_Assignment5Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Initialize Scanner

        // Declarations
        int intSelection;
        String strContinue;
        char charContinue;

        // Welcome Message
        println("Welcome to Assignment 5 Objects");
        
        // Menu
        do{
        println("Please select 2 for Programming Challenge #2, "
                + "or select 4 for Programming Challenge #4.\n");
        print("Selection: ");
        
        intSelection = keyboard.nextInt();
        
        if (intSelection == 2){
           carMethod();
        }else if (intSelection == 4){
           retailItemMethod(); 
        }else{
            println("Invalid Entry");
        }
        
        print("Continue? (Y for yes and other key to exit): ");
        strContinue = keyboard.next();
        charContinue = strContinue.charAt(0);
                
        }while(charContinue == 'Y' || charContinue == 'y');  
        
        println("\nHave a pleasant day.");
    } // end main
    /**
     * Replaces System.out.print()
     * Accepts a string and prints it to the console
     * without a CR return
     * @param str 
     */
    public static void print(String str){
        System.out.print(str);
    } // end print
    
    /**
     * Replaces System.out.println()
     * Accepts a string and prints it to the console
     * with a CR return
     * @param str 
     */
    public static void println(String str){
        System.out.println(str);
    } // end println
    
    /**
     * Car Method run the code for Programming Challenge #2
     */
    public static void carMethod(){
        Scanner keyboard = new Scanner(System.in); // Initialize Scanner
        
        // Declarations
        int intYearModel;
        String strMake;
           
           print("Please enter your car's model year: ");
           intYearModel = keyboard.nextInt();
           print("Please enter you car's make or model: ");
           strMake = keyboard.next();
           
           println(""); // for spacing
           
           /**
            * Creates a new Car entitled yourCar
            */
           Car yourCar = new Car(intYearModel, strMake);
           
           println("GOOOOOOOOOOOO!!!!\n"
                   + "Your " + yourCar.getYearModel() + " "
                       + yourCar.getCarMake()
                       + " is now traveling at a rate of...");
           for (int i = 0; i < 5; i++){
               yourCar.accelerate();
               print(yourCar.getCarSpeed() +  " mph!!!\t");
           } // end accelerate for loop
           
           println ("STOP!!!\n\n"
                    + "Your " + yourCar.getYearModel()+ " "
                        + yourCar.getCarMake()
                        + " in now slowing to a speed of...");
           for (int i= 0; i < 5; i++){
               yourCar.brake();
               print(yourCar.getCarSpeed() + " mph.\t");
           } // end brake for loop
           println("Whew!, that's better.\n");
    } // end carMethod
    
    /**
     * RetailItem Method for Programming Challenge #4
     */
    public static void retailItemMethod(){
        Scanner keyboard = new Scanner(System.in);  // initialize Scanner
        
        // Declarations
        String strDescription;
        int intUnitsOnHand;
        double dblPrice;
        
        println("This program will accept data for three retail items,\n"
                + "collect, and display them for your viewing pleasure.\n");
                    
        println("Please enter the following data for item number 1.");           
        print("Enter a brief description of the item (ex. Designer Jeans): ");
        strDescription = keyboard.nextLine();
        print("Enter the number of units on hand: ");
        intUnitsOnHand = keyboard.nextInt();
        print("Enter the price of the item: ");
        dblPrice = keyboard.nextDouble();
        keyboard.nextLine(); // to clear buffer
        println("");
        
        /**
         * Create first instance of RetailItem
         */
        RetailItem item1 = new RetailItem(strDescription,
                intUnitsOnHand, dblPrice);
                    
        println("Please enter the following data for item number 2.");           
        print("Enter a brief description of the item (ex. Designer Jeans): ");
        strDescription = keyboard.nextLine();
        print("Enter the number of units on hand: ");
        intUnitsOnHand = keyboard.nextInt();
        print("Enter the price of the item: ");
        dblPrice = keyboard.nextDouble();
        keyboard.nextLine(); // to clear buffer
        println("");
                
        /**
         * Create second instance of RetailItem
         */
        RetailItem item2 = new RetailItem(strDescription,
            intUnitsOnHand, dblPrice);
                          
        println("Please enter the following data for item number 3.");           
        print("Enter a brief description of the item (ex. Designer Jeans): ");
        strDescription = keyboard.nextLine();
        print("Enter the number of units on hand: ");
        intUnitsOnHand = keyboard.nextInt();
        print("Enter the price of the item: ");
        dblPrice = keyboard.nextDouble();
        keyboard.nextLine(); // to clear buffer
        println("");
        
        /**
         * Create third instance of RetailItem
         */
        RetailItem item3 = new RetailItem(strDescription,
            intUnitsOnHand, dblPrice);
        
        println("Item number 1: " + item1.getDescription() + (" has ")
                + item1.getUnitsOnHand() + " unit(s) on hand,");
        System.out.printf(" at a cost of $%.2f per unit.\n", item1.getPrice());
        
        println("Item number 2: " + item2.getDescription() + (" has ")
                + item2.getUnitsOnHand() + " units(s) on hand,");
        System.out.printf(" at a cost of $%.2f per unit.\n", item2.getPrice());
        
        println("Item number 3: " + item3.getDescription() + (" has ")
                + item3.getUnitsOnHand() + " unit(s) on hand,");
        System.out.printf(" at a cost of $%.2f per unit.\n", item3.getPrice());
       
        println("");
        
        } // end RetailItemMethod
    
} // end GAN_Assignment5Objects
