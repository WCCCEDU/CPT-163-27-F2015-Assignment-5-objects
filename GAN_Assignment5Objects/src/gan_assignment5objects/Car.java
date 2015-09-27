/*
 * Chapter 6 Programming Challenge 2
 */
package gan_assignment5objects;

/**
 * Car class
 * @author Gary A. Newsome
 */
public class Car {
    
    // Fields
    public int intYearModel,    // to hold the year of the car
               intCarSpeed;     // to hold the current speed of the car
    public String strCarMake;   // to hold the make/model of the car
    
    /**
     * Constructor
     * @param intYearModel accepts an integer for the car's model year
     * @param strCarMake accepts a string for the car's make
     */
    public Car(int intYearModel, String strCarMake){
        this.intYearModel = intYearModel;
        this.strCarMake = strCarMake;
        this.intCarSpeed = 0;
    }  // end Car constructor
        
    // Accessors/Mutators
    
    /**
     * Accessors to get and return the year model of the car
     * @return intYearModel 
     */
    public int getYearModel(){return this.intYearModel;}
    
    /**
     * Accessors to get and return the make of the car
     * @return strCarMAke
     */
    public String getCarMake(){return this.strCarMake;}
    
    /**
     * Accessors to get and return the car's speed
     * @return intCarSpeed 
     */
    public int getCarSpeed(){return this.intCarSpeed;}
    
    /**
     * Mutates the car's speed +5
     */
    public void accelerate(){
        this.intCarSpeed += 5;
    } // end accelerate
    
    /**
     * Mutates the car's speed -5
     */
    public void brake(){
        this.intCarSpeed -= 5;
    } // end brake
    
} // end Car
