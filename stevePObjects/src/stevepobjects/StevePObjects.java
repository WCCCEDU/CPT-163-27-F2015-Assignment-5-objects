package stevepobjects;
import carPackage.carClass;
import java.util.Scanner;


/**
 * Main class used for calling carClass and running the file
 * @author Steve
 */
public class StevePObjects {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        print("Please enter in the year model: ");//asking user for model input     
        int yearModel = keyboard.nextInt();//model input
       
        keyboard.nextLine();//clearig the buffer
        
        print("\nPlease enter the Car Make: ");//asking user for make input
        String carMake = keyboard.nextLine();//make input  
        
        println(" ");//spacing things out
        //creating the car object
        carClass newCarClass = new carClass(yearModel, carMake);
        
        //for loop for printing the accelerated method
        for (int i = 0; i < 5; i++){
            newCarClass.accelerate(newCarClass.carSpeed);
            println("Your " + newCarClass.getYearModel() + " " +
                    newCarClass.getCarMake()
            + " is now going: " + newCarClass.getCarSpeed() );
        }
        
        println(" ");//spacing things out
        
        //for loop for printing the brake method
        for (int i = 0; i < 5; i++){
            newCarClass.brake(newCarClass.carSpeed);
            println("Your " + newCarClass.getYearModel() + " " + 
                    newCarClass.getCarMake()
            + " is now going: " + newCarClass.getCarSpeed() );
        }
        
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
}
