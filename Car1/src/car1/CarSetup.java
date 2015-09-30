
package car1;

/**
 *The CarSetup class contains methods that will be used in the Car1 program.
 * @author mkavic
 */
public class CarSetup {
   
   // 
   private int yearModel; // car's year model
   private String make; // car's makes
   private int speed = 0; //car's speed.
  
   /**
    * Constructor
    * @param yearMod car's year model
    * @param mak car's make
    * @param sped car's speed
    */
   public CarSetup(int yearMod, String mak, int sped)
   {
       yearModel =  yearMod;
       make = mak;
       speed = sped;
   }
   
   /**
    * The setYearModel method stores a value in the yearModel field.
    * @param yearMod The value to store in yearModel field.
    */
  
   public void setYearModel(int yearMod)
    {
        yearModel = yearMod;
    }
   
   /**
    * The setMake method stores a value in the make field.
    * @param mak The value to store in make.
    */
    
   public void setMake (String mak)
   {
       make = mak;
   }
   
   /**
    * The setSpeed method stores a value in the speed field.
    * @param sped The value to store in speed.
    */
   public void setSpeed(int sped)
   {
       speed = sped;
   }
   
    /**
     * getYearModel method
     * @return The value of yearModel
     */
   public int getYearModel()
   {
       return yearModel;
   }
   
   /**
    * getMake method
    * @return The value of the make
    */
   public String getMake()
   {
       return make;
   }
   
   /**
    * getSpeed method
    * @return The value of speed.
    */
   public int getSpeed()
   {
       return speed;
   }
 
   /**
    * The accelerate method adds 5 to the speed.
    * @return speed + 5
    */  
   public int  getaccelerate()
{
    return speed + 5;
}
   
   /**
    * The brake method subtracts 5 from the speed.
    * @return speed + 5
    */
public int  getbrake()
{
    return speed - 5;
}
    
}


