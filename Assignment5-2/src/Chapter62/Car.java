/* CPT163 Java Programming I
 * Chapter 6
 * Programming Challenge 2, Car Class
 */
package Chapter62;

/**
 * Car  public class
 * 
 * @author srtinkey
 */
public class Car {
    // class fields
    private int yearModel;          // model year of the car
    private String make;            // make of car   
    private double speed;           // car's current speed
    
    /**
     * car class, public void, constructor
     * @param yearModel  model year of the car, initialized to user input
     * @param make       make of the car, initialized to user input
     * speed             car's current speed, initialized to 0
     */
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
}  
    
    /**
     * setSpeed   sets the initial speed of the car
     * @param speed initial speed of the car
     */
    public void setSpeed(double speed){
        this.speed = speed;
    }    
    
    /**
     * getYear  gets the year of the car
     * @return  the year of the car
     */
    public int getYear(){
        return this.yearModel;
    }
    
    
    /**
     * getMake  gets the make of the car
     * @return  returns the make of the car
     */
    public String getMake(){
        return this.make;
    }
    
    /** 
     * getSpeed  gets the speed of the car
     * @return   returns the speed of the car
     */
    
    public double getSpeed(){
        return this.speed;
    }
    
    /**
     * accelerate  increases the speed by 5
     * @return  the speed after increasing by 5
     */
    public double accelerate() {
        return this.speed + 5;        
    }
    
    /**
     * brake    decreases the speed by 5
     * @return  the speed after decreasing by 5
     */
    public double brake() {
        return this.speed - 5;
    }
}
