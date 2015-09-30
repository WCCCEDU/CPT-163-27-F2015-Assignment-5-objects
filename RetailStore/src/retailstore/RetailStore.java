
package RetailStore;

import RetialStore.RetailItem;


public class RetailStore {


    public static void main(String[] args) {
        RetailItem item1= new RetailItem( "Hoodie",9,10.95);
        RetailItem item2=new RetailItem("Sweatpants", 10, 10.6);
        RetailItem item3=new RetailItem("Socks", 20, 10.9);
        
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        
    }
    
    
}
