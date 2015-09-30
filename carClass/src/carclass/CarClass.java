package carclass;

/**
 *
 * @author Jacob
 */

import java.util.Scanner;

public class CarClass {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String carMake;  //the make of the car
        int carYear;  //the year the car was made
        double carSpeed;   //Given speed
        
        System.out.println("Enter the car's make: ");
        carMake = keyboard.nextLine();
        
        System.out.println("Please enter the year the car was manufactured: ");
        carYear = keyboard.nextInt();
        
        // create the new test car object
        newCar testCar = new newCar(carYear, carMake);
        
        //set the cars speed 
        System.out.println("Please enter the initial speed of the car: ");
        testCar.setSpeed(keyboard.nextDouble());
        System.out.print("\n");
        
        //acquire the cars make, year and initial speed
        carMake = testCar.getCarMake();
        carYear = testCar.getCarYear();
        carSpeed = testCar.getCarSpeed();
        
        System.out.println("The " + carYear + " " + carMake +
                            " is currently going " + carSpeed + "mph. \n");
        
        System.out.println("Let's speed up a little bit.");
        for (int a = 1; a <= 3; a++){
            carSpeed = testCar.accelerate();
            System.out.println("The " + carYear + " " + carMake + 
                               " is now going "+ carSpeed + " mph.");
            testCar.setSpeed(carSpeed);
        }
        
        System.out.println("Now let's try slowing down!");
        for (int a = 1; a <= 3; a++){
            carSpeed = testCar.brake();
            System.out.println("The " + carYear + " " + carMake + 
                               " is now going "+ carSpeed + " mph.");
            testCar.setSpeed(carSpeed);
        }
        
        System.out.println("Now wasn't that a whole lot of fun?");
    }
    
}
