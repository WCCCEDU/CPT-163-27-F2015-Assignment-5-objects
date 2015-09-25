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
        
        print("Please enter the First Items Description: ");
        description = keyboard.nextLine();//description input
                
        print("Please enter the First Items On Hands: ");
        onHand = keyboard.nextInt();//on hand input
        
        print("Please enter the First Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        
        keyboard.nextLine();//To clear buffer
        
        //new retail item
        RetailItem itemOne = new RetailItem(description, onHand, price);
        
        println(" ");//spacing things out
        
        print("Please enter the Second Items Description: ");
        description = keyboard.nextLine();//description input
        
        
        print("Please enter the Second Items On Hands: ");
        onHand = keyboard.nextInt();//on hand input
        
        print("Please enter the Second Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        
        keyboard.nextLine();//To clear buffer
        
        //new retail item
        RetailItem itemTwo = new RetailItem(description, onHand, price);
        
        println(" ");//spacing things out
        
        print("Please enter the Third Items Description: ");
        description = keyboard.nextLine();//description input
                
        print("Please enter the Third Items On Hands: ");
        onHand = keyboard.nextInt();//onhand input
        
        print("Please enter the Third Items Price Per-unit: ");
        price = keyboard.nextDouble();//price input
        
        keyboard.nextLine();//To clear buffer
        
        //new retail item
        RetailItem itemThree = new RetailItem(description, onHand, price);
        
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
