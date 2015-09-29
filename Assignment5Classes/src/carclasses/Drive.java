
package carclasses;

import java.util.Scanner;

/**
 * Program to drive the Car class
 * @author Seth Frosch
 */
public class Drive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @param keyboard Will accept user input
         * @param yearModel An integer for the year of the car
         * @param make A string for the make of the car
         */
        Scanner keyboard = new Scanner(System.in);
        int yearModel;
        String make;
        
        //Outputs prompts for user to enter year and make of the car and saves
        //those values in yearModel and make
        System.out.println("Please enter the year of the car:");
        yearModel = keyboard.nextInt();
        System.out.println("Please enter the make of the car:");
        make = keyboard.next();
        
        /**
         * @param newCar Creates a new Car class
         */
        Car newCar = new Car(yearModel, make);
        
        //A for loop to accelerate the car by 5 during each loop and output
        //the results
        for(int x = 0; x < 5; x++){
            newCar.accelerate();
            System.out.println(newCar.getYearModel() + " " + newCar.getMake() + 
            " acceleration speed: " + newCar.getSpeed() + " mph");
        }
        
        //A for loop to decelerate the car by 5 during each loop and output
        //the results
        for(int y = 0; y < 5; y++){
            newCar.brake();
            System.out.println(newCar.getYearModel() + " " + newCar.getMake() + 
            " brake speed: " + newCar.getSpeed() + " mph");
        }
    }
            
    
}
