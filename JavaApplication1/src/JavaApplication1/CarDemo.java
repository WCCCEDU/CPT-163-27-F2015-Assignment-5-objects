/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication1;

import java.util.Scanner;       // Needed for the Scanner class

/**
 * This program demonstrates the Car class methods
 * setYearModel, setMake, getYearModel, accelerate, and brake methods
 * 
 * @author Rhonda R. Marshall
 * Sept 27, 2015
 */
public class CarDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int theYear;        // User input
        String theModel;     // User input
        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user for the model year
        System.out.printf("Enter the Model Year of Your First Car? ");
        theYear = keyboard.nextInt();
        keyboard.nextLine();
        
        // Prompt the user for the model of the car
        System.out.printf("Enter the Model of Your First Car? ");
        theModel = keyboard.nextLine();
        System.out.printf("\n");
        
        // Create a car object
        Car myFirstCar = new Car(theYear, theModel);
        
        System.out.printf("Your first car was a %d %s, speed is %d\n\n",
                            myFirstCar.getYearModel(), myFirstCar.getMake(),
                            myFirstCar.getSpeed());
        
        // Increase the Car object's speed by 5, 5 times
        for (int i = 1; i <= 5; i++){
            myFirstCar.accelerate();
            System.out.printf("The current speed is %d\n", myFirstCar.getSpeed());
            }
        System.out.printf("\n");
        
        // Decrease the Car objects's speed by 5, 5 times
        for (int i = 1; i <= 5; i++){
            myFirstCar.brake();
            System.out.printf("The current speed is %d\n", myFirstCar.getSpeed());
        }
    }
}
