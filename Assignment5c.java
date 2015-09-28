/*
Curtis Kunkle
RetailItem object testing
*/
package assignment5c;
import ItemPackage.RetailItem;
public class Assignment5c {
    
    public static void main(String[] args) {
        //Creating some retail item objects
        RetailItem bowl = new RetailItem(90,5.99,"Standard issue food storage");
        RetailItem fork = new RetailItem(500,1.99,"Great for stabbing food!");
        RetailItem spoon = new RetailItem(500,1.99,"Like a tiny food shovel.");
        
        //displaying some retail items
        pr("STORE CATALOGUE\n");
        pr("Item\tPrice\tUnits On Hand\tDescription");
        pr("bowl\t$" + bowl.getPrice() + "\t" + bowl.getUnitsOnHand() + "\t\t" +
                bowl.getDescription());
        pr("fork\t$" + fork.getPrice() + "\t" + fork.getUnitsOnHand() + "\t\t" +
        fork.getDescription());
        pr("spoon\t$" + spoon.getPrice() + "\t" + spoon.getUnitsOnHand() + 
           "\t\t" + spoon.getDescription());
    }
    
    public static void pr(String str){
        System.out.println(str);
    }
}
