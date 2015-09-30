
package assignment5objectsretail;

/**
 *Program to set and display current description stock and price of items in a 
 * retail store
 * @author Scott Boettger
 */
public class Assignment5ObjectsRetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create new retail items
        RetailItem porkNBeans = new RetailItem("canned baked beans with pork", 
        170, 2.35);
        RetailItem bubblegum = new RetailItem("a pack of bubblegum", 230, 1.25);
        RetailItem nukaCola = new RetailItem("an atomically refreshing soda",
        500, 1.45);
        
        print("Description: " + porkNBeans.getDesc() + "\n units in stock: " 
        + porkNBeans.getStock() + "\n unit price: $" + porkNBeans.getPrice());
        
        print("Description: " + bubblegum.getDesc() + "\n units in stock: "
        + bubblegum.getStock() + "\n unit price: $" + bubblegum.getPrice());
        
        print("Description: " + nukaCola.getDesc() + "\n units in stock: "
        + nukaCola.getStock() + "\n unit price: $" + nukaCola.getPrice());
        
        
    }
    
    public static void print(String message){
        System.out.println(message);
    }
}
