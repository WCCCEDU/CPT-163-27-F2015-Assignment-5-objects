/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Adam
 */
public class RetailItem {
        String description;
        int unitsOnHand;
        double price;
        
        public RetailItem(String description, int unitsOnHand, 
                double price){
            this.description = description;
            this.unitsOnHand = unitsOnHand;
            this.price = price;
        }
        
        public String getDescription(){
            return description;
        }
        
        public int getUnits(){
            return unitsOnHand;
        }
        
        public double getPrice(){
            return price;
        }
}
