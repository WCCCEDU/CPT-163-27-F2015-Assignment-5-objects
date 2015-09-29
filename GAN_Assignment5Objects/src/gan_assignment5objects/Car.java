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
    private int modelYear,    // to hold the year of the car
                carSpeed;     // to hold the current speed of the car
    private String carMake;   // to hold the make/model of the car
    
    /**
     * Constructor
     * @param intYearModel accepts an integer for the car's model year
     * @param strCarMake accepts a string for the car's make
     */
    public Car(int modelYear, String carMake){
        this.modelYear = modelYear;
        this.carMake = carMake;
        this.carSpeed = 0;
    }  // end Car constructor
        
    // Accessors/Mutators
    
    /**
     * Accessors to get and return the year model of the car
     * @return intYearModel 
     */
    public int getModelYear(){return this.modelYear;}
    
    /**
     * Accessors to get and return the make of the car
     * @return strCarMAke
     */
    public String getCarMake(){return this.carMake;}
    
    /**
     * Accessors to get and return the car's speed
     * @return intCarSpeed 
     */
    public int getCarSpeed(){return this.carSpeed;}
    
    /**
     * Mutates the car's speed +5
     */
    public void accelerate(){
        this.carSpeed += 5;
    } // end accelerate
    
    /**
     * Mutates the car's speed -5
     */
    public void brake(){
        this.carSpeed -= 5;
    } // end brake
    
} // end Car
