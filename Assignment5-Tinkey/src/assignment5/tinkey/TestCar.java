/* CPT163 Java Programming I
 * Chapter 6
 * Programming Challenge 2, Car Class
 * TestCar: this program tests and uses the Car class (Car.java)
 */
package assignment5.tinkey;

import java.util.Scanner;
/**
 *
 * @author srtinkey
 */
public class TestCar
{
    public static void main(String[] args) {
    
        // create objects
        Car vehicle1 = new Car();
        Scanner keyboard = new Scanner(System.in);
        // variables needed
        String vehMake;             // make of the vehicle
        int vehYear;                // model year of the vehicle
        double vehSpeed;            // initial speed of vehicle

        // display heading and prompt user for make, year, and initial speed
        // set fields in Car class
        System.out.println("Testing the Car Class\n");
        System.out.print("Enter the make of the vehicle: ");
        vehicle1.setMake(keyboard.nextLine());
        System.out.print("Enter the model year of the vehicle: ");
        vehicle1.setYear(keyboard.nextInt());
        System.out.print("Enter the initial speed of the vehicle: ");
        vehicle1.setSpeed(keyboard.nextDouble());
        System.out.println("");
        
        // get values of make, year, and speed from Car class
        vehSpeed = vehicle1.getSpeed();
        vehYear = vehicle1.getYear();
        vehMake = vehicle1.getMake();
        System.out.println(vehYear + " " + vehMake + " is travelling at " +
                           vehSpeed + "MPH.");
        
        // increase the car's speed and display
        System.out.println("Speeding up now.......");
        for (int i = 1; i <= 5; i++) {
            vehSpeed = vehicle1.accelerate();
            System.out.println("The speed of the" + vehYear + " " + vehMake +
                             "is now " + vehSpeed);
            vehicle1.setSpeed(vehSpeed);
        }
        
        // decrease the car's speed and display
        System.out.println("Slowing down now......");
        for (int i = 1; i <= 5; i++) {
            vehSpeed = vehicle1.brake();
            System.out.println("The speed of the " + vehYear + " " + vehMake +
                              " is now " + vehSpeed);
            vehicle1.setSpeed(vehSpeed);
        }
        
        // The end
        System.out.println("\nPhew! We made it!");
        
    } // main
} // class
