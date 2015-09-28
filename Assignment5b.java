/*
Curtis Kunkle
Car class testing
*/
package assignment5b;
import CarPackage.Car;
public class Assignment5b {

    public static void main(String[] args) {
        //Create new car object
        Car maxima = new Car(1999,"Nissan");
        
        //Acceleration
        for(int i = 0; i < 5; i++){
            maxima.accelerate();
            System.out.println("Speed: " + maxima.getSpeed());
        }
        
        //braking
        for(int i = 0; i < 5; i++){
            maxima.brake();
            System.out.println("Speed: " + maxima.getSpeed());
        }
    }
    
}
