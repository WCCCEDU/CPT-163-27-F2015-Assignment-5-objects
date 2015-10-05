/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Home pc
 */
class ReatailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    Scanner keyboard = new Scanner(System.in);

    public ReatailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    public String getDescription(){
        return this.description;
    }
    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    public double getPrice(){
        return this.price;
    }
    public void setDescription(){
        print("Enter in item Desc. ");
        description = keyboard.nextLine();
        this.getDescription();
    }
    public void setUnitsOnHand(){
        print("Enter how many. ");
        unitsOnHand = keyboard.nextInt();
        this.getUnitsOnHand();
    }
    public void setPrice(){
         print("Enter price. ");
        price = keyboard.nextDouble();
        this.getPrice();
    }
    public void Product(){
        
        setDescription();
        setPrice();
        setUnitsOnHand();

    }
    public void  enterProduct(){
       
        for(int i = 0; i < 3; i++){
            Product();
        }
    }
    public static void print(String msg){
        System.out.print(msg);
    }
    
    
}
