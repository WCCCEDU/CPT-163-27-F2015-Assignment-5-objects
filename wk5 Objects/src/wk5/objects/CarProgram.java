package wk5.objects;

/**
 * CPT 163 Java I
 * Assignment 5 Objects
 * @author Katrina Siffrinn
 * 
 * Demonstrating the Car class by calling 
 * the method 5 times, calling and displaying
 * the accelerate and brake methods each time.
  */

public class CarProgram {
    
    public static void main(String[] args){
        
        //Create new car object
        Car impala = new Car(2008, "Chevy");
        
        //Accelerate 
        for(int i = 0; i < 5; i++){
            impala.accelerate();
            System.out.println("Speed is now " + impala.getSpeed());
        }
    
        //Brake
        for(int i = 0; i < 5; i ++){
            impala.brake();
            System.out.println("Speed is now " + impala.getSpeed());
        }
        
    }
    
}   //End of Car Program
