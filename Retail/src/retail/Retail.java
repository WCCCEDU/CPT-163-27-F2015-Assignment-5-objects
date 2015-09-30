
package retail;

/**
 *
 * @author mkavic
 */
public class Retail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Create a RetailItem object passing description, number of units and 
        //price as arguments to the constructor.
       RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
       
       //Create a RetailItem object passing description, number of units and 
        //price as arguments to the constructor. 
       RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
       
       //Create a RetailItem object passing description, number of units and 
        //price as arguments to the constructor. 
       RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
       
      //Diplays each item with its description, units on hand and price. 
       System.out.println("Description    Units          Price");
       System.out.println(item1.getDescription()+ "         " + 
               item1.getUnitsOnHand()+ "             "+item1.getPrice());
       
       System.out.println(item2.getDescription()+ " "+ 
               item2.getUnitsOnHand()+ "             "+item2.getPrice());
       
       System.out.println(item3.getDescription()+ "          " + 
               item3.getUnitsOnHand()+ "             "+item3.getPrice());
       
       
    }
    
}
