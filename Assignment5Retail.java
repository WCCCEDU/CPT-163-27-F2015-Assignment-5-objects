/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5retail;

import java.util.Scanner;

/**
 *
 * @author zacharyzordo
 */
public class Assignment5Retail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item[] inventoryArray = new Item[3];
        
        for(int x = 0; x <= 2; x++){
            inventoryArray[x] = new Item(inputUnitsOnHand(), inputDescription(), inputPrice());
        }
        
        for(int x = 0; x <= 2; x++){
            println("\nItem # " + x);
            println("Description: " + inventoryArray[x].getDescription());
            println("Price:       $" + inventoryArray[x].getPrice());
            println("On Hand:     " + inventoryArray[x].getUnitsOnHand()+"\n");
        }
    }    
    
    public static double inputPrice(){
        println("Enter the price of the item:\n");
        Scanner getInput = new Scanner(System.in);
        return getInput.nextDouble();
    }
    
    public static String inputDescription(){
        println("Enter the item's description:\n");
        Scanner getInput = new Scanner(System.in);
        return getInput.nextLine();
    }
    
    public static int inputUnitsOnHand(){
        println("Enter the total on hand:\n");
        Scanner getInput = new Scanner(System.in);
        return getInput.nextInt();
    }
    
    public static void println(String message){
        System.out.println(message);
    }
}

