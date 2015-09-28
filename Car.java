/*
Car class
by Curtis Kunkle
*/

package CarPackage;

public class Car {
    
    //fields
    private int yearModel=0;
    private String make = "";
    private int speed;
    
    /**
     * Constructor accepts yearModel and make. Sets speed to zero.
     * @param yearModel: year model of car
     * @param make: make of car
     */
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    
    //Accessors
    public String getMake(){return this.make;}
    public int getYearModel(){return this.yearModel;}
    public int getSpeed(){return this.speed;}
    
    /**
     * Increases car's speed by 5
     * Also outputs a message. This is unnecessary, but makes it 
     * easier to understand on the console
     */
    public void accelerate(){
        this.speed+=5;
        System.out.println("Accelerating...");
    }
    
    /**
     * when brake is applied, if the car's current speed is less than or equal
     * to 5, the car stops.  If it is greater than 5, the brake decreases the 
     * car's speed by 5.
     */
    public void brake(){
        if(this.speed <= 5){
            this.speed = 0;
            System.out.println("Dead stop!");
        }else{
            speed-=5;
            System.out.println("Braking...");
        }
    }
}
