package carPackage;

/**
 *Car class
 * @author Steve
 */
public class Car {
    //fields
    public int yearModel, carSpeed;//year of car & speed of car
    public String carMake;//make of car
    
    //constructor
    public Car(int yearModel, String carMake){
        this.yearModel = yearModel;
        this.carSpeed = 0;
        this.carMake = carMake;
    }
    
    //accessors/mutators
    public int getYearModel(){return this.yearModel;}
    public int getCarSpeed(){return this.carSpeed;}
    public String getCarMake(){return this.carMake;}
    
    /**
     * this takes the car speed and increments it by 5
     * @param 
     */
   public void accelerate(){
       this.carSpeed += 5;
   } 
   
   /**
    * This takes the car speed, and decrements it by 5
    * @param 
    */
   public void brake(){
    this.carSpeed -= 5;
}
   
  
}
