
package retailclasses;

import java.util.Scanner;

/**
 * Program to store item information for RetailItem
 * @author Seth Frosch
 */
public class Store {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @param description A string field for a description of the item
         * @param unitsOnHand An integer for the amount of an item in the 
         * inventory
         * @param price A double for the price of the item
         * @param keyboard Will accept user input
         */
        String description;
        int unitsOnHand;
        double price;
        Scanner keyboard = new Scanner(System.in);
        
        /**
         * @param item1 Creates a new item for the RetailItem class
         */
        RetailItem item1 = new RetailItem();
        
        //Outputs prompts for user to enter description, amount on hand, and
        //price for item 1
        System.out.println("Enter the description for item 1:");
        description = keyboard.nextLine();
        item1.setDescription(description);
        System.out.println("Enter the amount on hand for item 1:");
        unitsOnHand = keyboard.nextInt();
        item1.setUnitsOnHand(unitsOnHand);
        System.out.println("Enter the price for item 1:");
        price = keyboard.nextDouble();
        item1.setPrice(price);
        keyboard.nextLine();
        
        /**
         * @param item2 Creates a new item for the RetailItem class
         */
        RetailItem item2 = new RetailItem(description, unitsOnHand, price);
        
        //Outputs prompts for user to enter description, amount on hand, and
        //price for item 2
        System.out.println("Enter the description for item 2:");
        description = keyboard.nextLine();
        item2.setDescription(description);
        System.out.println("Enter the amount on hand for item 2:");
        unitsOnHand = keyboard.nextInt();
        item2.setUnitsOnHand(unitsOnHand);
        System.out.println("Enter the price for item 2:");
        price = keyboard.nextDouble();
        item2.setPrice(price);
        keyboard.nextLine();
        
        /**
         * @param item3 Creates a new item for the RetailItem class
         */
        RetailItem item3 = new RetailItem(description, unitsOnHand, price);
        
        //Outputs prompts for user to enter description, amount on hand, and
        //price for item 3
        System.out.println("Enter the description for item 3:");
        description = keyboard.nextLine();
        item3.setDescription(description);
        System.out.println("Enter the amount on hand for item 3:");
        unitsOnHand = keyboard.nextInt();
        item3.setUnitsOnHand(unitsOnHand);
        System.out.println("Enter the price for item 3:");
        price = keyboard.nextDouble();
        item3.setPrice(price);
        keyboard.nextLine();
        
        //Outputs the descriptions, amounts on hand, and price for each of the
        //three items
        System.out.println("Item 1: " + item1.getDescription() + ", " + 
        item1.getUnitsOnHand() + " on hand and costs $" + item1.getPrice());
        System.out.println("Item 2: " + item2.getDescription() + ", " + 
        item2.getUnitsOnHand() + " on hand and costs $" + item2.getPrice());
        System.out.println("Item 3: " + item3.getDescription() + ", " + 
        item3.getUnitsOnHand() + " on hand and costs $" + item3.getPrice());
    }
}
