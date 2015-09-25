
package assignment5objects;

public class Car {
    int yearModel = 0;
    String make = " ";
    int speed = 0;
    
    
    /**
     * Constructor method creates an instance of the Car class
     * @param yearModel Integer value representing the year of the car
     * @param make String value specifying the car type
     */
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    /**
     * Gets value of yearModel field
     * @return integer year value 
     */
    public int getYearModel(){
        return yearModel;
    }
    
    /**
     * Gets value of make field
     * @return String make
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets speed value of car object
     * @return integer speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * increases speed of car by 5 mph
     */
    public void accelerate(){
        this.speed += 5;
    }
    
    /**
     * decreases speed of car by 5 mph
     */
    public void brake() {
        this.speed -= 5;
    }
    
}   // End of Class
