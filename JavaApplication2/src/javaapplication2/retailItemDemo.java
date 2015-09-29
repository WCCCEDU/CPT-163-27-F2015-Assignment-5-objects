/*
 * To change this license header, choose License Headers in Project
 * Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication2;

import java.util.Scanner;       // Need for the Scanner class

/**
 * This program demonstrates the RetailItem class methods
 * 
 * setDescription, setUnitsOnHand, setPrice, getDescription, getUnitsOnHand,
 * and getPrice
 * 
 * @author Rhonda Marshall
 * Sept 27, 2015
 */
public class retailItemDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String theItemDescription;      // For data input
        int theUnitsOnHand;             // For data input
        double thePrice;                // For data input
        String itemNumber;              // For the input prompt
        
        // Create the 3 RetailTItem objects, was NOT the plan
        RetailItem item1 = new RetailItem("", 0, 0.0);
        RetailItem item2 = new RetailItem("", 0, 0.0);
        RetailItem item3 = new RetailItem("", 0, 0.0);
        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
       
        for (int i = 1; i <= 3; i++) {
            if (i == 1) itemNumber = "First";
            else if (i == 2) itemNumber = "Second";
            else itemNumber = "Third";
            
            // Prompt the user for the Item Description
            System.out.printf("Enter the %s Item Description? ", itemNumber);
            theItemDescription = keyboard.nextLine();
        
            System.out.printf("Enter the Units on Hand for %s? ", 
                           theItemDescription);
            theUnitsOnHand = keyboard.nextInt();
        
            System.out.printf("Enter the Price for %s? ", theItemDescription);
            thePrice = keyboard.nextDouble();
            keyboard.nextLine();
       
            /**
                Determine the correct object and assign the fields
                >> I wanted to just create the objects here and pass the values to the constructor
                >> but the complier kept giving me an error item1, item2, item3 not found when I
                >> put the call to new inside the switch
                >> I sure wish I knew why, so I created them above.
            */
            switch(i) {
                case 1:
                    item1.setDescription(theItemDescription);
                    item1.setUnitsOnHand(theUnitsOnHand);
                    item1.setPrice(thePrice);
                    break;
                case 2:
                    item2.setDescription(theItemDescription);
                    item2.setUnitsOnHand(theUnitsOnHand);
                    item2.setPrice(thePrice);
                    break;
                case 3: 
                    item3.setDescription(theItemDescription);
                    item3.setUnitsOnHand(theUnitsOnHand);
                    item3.setPrice(thePrice);
                    break;
                default:
                    break;
                }
            }
        
        // Display the contents of the object
        printTheItem(item1);
        printTheItem(item2);
        printTheItem(item3);
         
        for (int i = 1; i <= 3; i++) {
            if (i == 1) itemNumber = "First";
            else if (i == 2) itemNumber = "Second";
            else itemNumber = "Third";
            
            // Prompt the user for the Item Description
            System.out.printf("Lets Change the %s Item Description? ", itemNumber);
            theItemDescription = keyboard.nextLine();
        
            // Determine the correct object and change the description
            switch(i) {
                case 1: item1.setDescription(theItemDescription); break;
                case 2: item2.setDescription(theItemDescription); break;
                case 3: item3.setDescription(theItemDescription); break;
                default: break;
                }
            }
         
        // Display the contents in the object
        printTheItem(item1);
        printTheItem(item2);
        printTheItem(item3);
        
        for (int i = 1; i <= 3; i++) {
            if (i == 1) itemNumber = "First";
            else if (i == 2) itemNumber = "Second";
            else itemNumber = "Third";
            
            // Prompt the user for the Item 
            System.out.printf("Lets Change the %s Items Units On Hand? ", itemNumber);
            theUnitsOnHand = keyboard.nextInt(); keyboard.nextLine();
        
            // Determine the correct object and change the Units on hand
            switch(i) {
                case 1: item1.setUnitsOnHand(theUnitsOnHand); break;
                case 2: item2.setUnitsOnHand(theUnitsOnHand); break;
                case 3: item3.setUnitsOnHand(theUnitsOnHand); break;
                default: break;
                }
            }
         
        // Display the contents in the objects
        printTheItem(item1);
        printTheItem(item2);
        printTheItem(item3);
        
        for (int i = 1; i <= 3; i++) {
            if (i == 1) itemNumber = "First";
            else if (i == 2) itemNumber = "Second";
            else itemNumber = "Third";
            
            // Prompt the user for the Price
            System.out.printf("Lets Change the %s Items Price? ", itemNumber);
            thePrice= keyboard.nextDouble(); keyboard.nextLine();
        
            // Determine the correct object and change the price
            switch(i) {
                case 1: item1.setPrice(thePrice); break;
                case 2: item2.setPrice(thePrice); break;
                case 3: item3.setPrice(thePrice); break;
                default: break;
                }
            }
         
        // Display the contents in the objects
        printTheItem(item1);
        printTheItem(item2);
        printTheItem(item3);    
    }  
   
    /**
     * The printTheItem methods accepts a RetailItem object and displays the objects fields
     * @param item  A RetailItem object
     */
    public static void printTheItem(RetailItem item){
        System.out.printf("%-30s  %d  %6.2f\n", 
                   item.getDescription(),item.getUnitsOnHand(), item.getPrice());
    }
}
