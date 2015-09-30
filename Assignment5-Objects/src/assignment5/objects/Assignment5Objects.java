/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.objects;

import java.util.Scanner;

/**
 * Program used to test the Car and RetailItem classes
 * @author Tehold
 */
public class Assignment5Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variable to test for Do While loop 
        int exitP = 0;
        do{
            Scanner keyboard = new Scanner(System.in);
            // Selection Menu for testing both classes
            print("-----------------------------------");
            print("Which class would you like to test?");
            print("1. Car Class");
            print("2. RetailItem Class");
            print("3. Exit");
            print("-----------------------------------");
            exitP = keyboard.nextInt();
            
            // Switch statement to determine menu item selected
            switch (exitP)
                    {
                case 1:
                    //Test Car Class
                    //Declare variables
                    int year = 2015;
                    String make = "Tesla Model S";                   
                    Car car = new Car(make, year);                   
                    // Print the make and year
                    print("You are driving a " + car.getYearModel() + " "
                    + car.getMake() + " going... " + car.getSpeed() + " MPH.");
                    // Accelerate 5 times
                    for(int i = 0;i < 5;i++){
                        print("Accelerating...");
                        car.accelerate();
                        print("You are now going " + car.getSpeed() + " MPH.");
                    }
                    // Brake 5 times
                    for(int i = 0;i < 5;i++){
                        print("Braking...");
                        car.brake();
                        print("You are now going " + car.getSpeed() + " MPH.");
                    }
                    // End message
                    print("Now get out of my car.");
                    break;
                case 2:
                    //Test RetailItem Class
                    //Declare parameters for Item #1 and declare it
                    double item1Price = 49.99;
                    int item1Units = 25;
                    String item1Desc = "Camping Cot";
                    RetailItem item1 = new RetailItem(item1Desc, item1Units,
                            item1Price);
                    //Print out information for Item #1
                    print("Item #1 is a " +  item1.getDescription() + " for $" + 
                            item1.getPrice() + ", there are " + 
                            item1.getUnitsOnHand() + " units in stock.");
                    //Declare parameters for Item #2 and declare it
                    double item2Price = 19.99;
                    int item2Units = 50;
                    String item2Desc = "Sleeping Bag";
                    RetailItem item2 = new RetailItem(item2Desc, item2Units, 
                            item2Price);
                    //Print out information for Item #2
                    print("Item #2 is a " +  item2.getDescription() + " for $" + 
                            item2.getPrice() + ", there are " + 
                            item2.getUnitsOnHand() + " units in stock.");
                    //Declare parameters for Item #3 and declare it
                    double item3Price = 79.99;
                    int item3Units = 30;
                    String item3Desc = "Hiking Boots";
                    RetailItem item3 = new RetailItem(item3Desc, item3Units, 
                            item3Price);
                    //Print out information for Item #3
                    print("Item #3 is " +  item3.getDescription() + " for $" + 
                            item3.getPrice() + ", there are " + 
                            item3.getUnitsOnHand() + " units in stock.");
                    break;
                case 3:
                    //Print Goodbye and exit program
                    print("Goodbye!");
                    break;                      
                    }
            
    }while(exitP != 3);
        
        
    }
    
    /**
     * Method to print a String
     * @param str Message to print
     */
    public static void print(String str){
        System.out.println(str);
    }
    
}
