
package carclasses;

/**
 * A car that can accelerate and brake
 * @author Seth Frosch
 */
public class Car {
    public int yearModel, speed;
    public String make;
    
    /**
     * Constructor will take yearModel and make arguments and set speed as 0
     * @param yearModel An integer for the year of the car
     * @param speed An integer for the speed of the car initially set to 0
     * @param make A string for the make of the car
     */
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.speed = 0;
        this.make = make;
        }
    
    /**
     * Accessors to get the values stored in yearModel, speed, and make fields
     * @return getYearModel Will return the integer yearModel
     * getSpeed Will return the integer speed
     * getMake Will return the string make
     */
    public int getYearModel(){ return this.yearModel; }
    public int getSpeed(){ return this.speed; }
    public String getMake(){ return this.make; }
    
    /**
     * Public API to increase the speed of the car
     * @param accelerate Will increase speed by 5 
     */
    public void accelerate(){
        this.speed += 5;
    }
    
    /**
     * Public API to decrease the speed of the car
     * @param brake Will decrease speed by 5
     */
    public void brake(){
        this.speed -= 5;
    }
}
