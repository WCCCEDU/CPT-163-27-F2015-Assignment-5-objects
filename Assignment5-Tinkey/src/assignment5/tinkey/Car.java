/* CPT163 Java Programming I
 * Chapter 6
 * Programming Challenge 2, Car Class
 */
package assignment5.tinkey;

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
       
    public void setYear(int yearModel){
        this.yearModel = yearModel;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setSpeed(double speed){
        this.speed = speed;
    }
    
    public int getYear(){
        return this.yearModel;
    }
    
    public String getMake(){
        return this.make;
    }
    
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
