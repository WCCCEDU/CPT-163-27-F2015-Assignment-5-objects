/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailitems;

/**
 *
 * @author Jacob
 */
public class RetailItems {

  public static void main(String[] args) {
    
    //creating the retail objects  
    retailSetup jacket = new retailSetup("Jacket", 12, 59.95);
    retailSetup designerJeans = new retailSetup("Designer Jeans", 40, 34.95);
    retailSetup shirt = new retailSetup("Shirt", 20, 24.95);
    
    //Display Setup
    System.out.println("\t" + "Description\t" + "Units on Hand\t" + "Price");
    System.out.println("----------------------------------------------------");
    
    //Display Information
    System.out.println("Item #1 " + jacket.getItemName() + "\t\t" 
                       + jacket.getItemAmt() + "\t\t" + jacket.getItemPrice());
    System.out.println("Item #2 " + designerJeans.getItemName() + "\t" 
                       + designerJeans.getItemAmt() + "\t\t"
                       + designerJeans.getItemPrice());
    System.out.println("Item #3 " + shirt.getItemName() + "\t\t" 
                       + shirt.getItemAmt() + "\t\t" + shirt.getItemPrice());
    
  }
    
}
