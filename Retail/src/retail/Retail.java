package retail;
import java.util.Scanner;
import retailPackage.RetailItem;

public class Retail {

    /**
     * Main program that calls the retail class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //variable init
        String description;
        int onHand;
        double price;
        
        //new retail item
        RetailItem itemOne = new RetailItem();

        print("Please enter the First Items Description: ");
        description = keyboard.nextLine();//description input
         itemOne.setDescription(description);//Using mutator to set variable 
         
        print("Please enter the First Items On Hands: ");
        onHand = keyboard.nextInt();//on hand input
        itemOne.setOnHand(onHand);//Using mutator to set variable
        
        print("Please enter the First Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        itemOne.setPrice(price);//Using mutator to set variable
        
        keyboard.nextLine();//To clear buffer
        println(" ");//spacing things out
        
        //new retail item
        RetailItem itemTwo = new RetailItem();
        
        print("Please enter the Second Items Description: ");
        description = keyboard.nextLine();//description input
        itemTwo.setDescription(description);//Using mutator to set variable
        
        print("Please enter the Second Items On Hands: ");
        onHand = keyboard.nextInt();//on hand input
        itemTwo.setOnHand(onHand);//Using mutator to set variable
        
        print("Please enter the Second Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        itemTwo.setPrice(price);//Using mutator to set variable
        
        keyboard.nextLine();//To clear buffer
        
        //new retail item
        RetailItem itemThree = new RetailItem();
        
        println(" ");//spacing things out
        
        print("Please enter the Third Items Description: ");
        description = keyboard.nextLine();//description input
        itemThree.setDescription(description);//Using mutator to set variable
        
        print("Please enter the Third Items On Hands: ");
        onHand = keyboard.nextInt();//onhand input
        itemThree.setOnHand(onHand);//Using mutator to set variable
        
        print("Please enter the Third Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        itemThree.setPrice(price);//Using mutator to set variable
        
        keyboard.nextLine();//To clear buffer
        
        
        
        println("\n");//really spacing things out
        
        //prints itemOne
        println("First Item: " + itemOne.getDiscription() + ", "
        + itemOne.getOnHand()+ " on hand, $"+ itemOne.getPrice() +" Per-unit");
        
        //prints itemTwo
        println("Second Item: " + itemTwo.getDiscription() + ", "
        + itemTwo.getOnHand()+ " on hand, $"+ itemTwo.getPrice() +" Per-unit");
        
        //prints itemThree
        println("Third Item: " + itemThree.getDiscription() + ", "
        + itemThree.getOnHand()+ " on hand, $"+ itemThree.getPrice() 
                                                                +" Per-unit");
    }
    
    
    //Print string method
    public static void print(String str){
     System.out.print(str);
    }
    
    //print int mehtod
    public static void print(int num){
     System.out.print(num);
    }
    
    //println string method
    public static void println(String str){
     System.out.println(str);
    }
    
    //println num method
    public static void println(int num){
     System.out.println(num);
    }
    
    //print num double method
    public static void print(double num){
     System.out.print(num);
    }
}
