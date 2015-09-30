package wk5.objects;

/**
 * CPT 163 Java I
 * Assignment 5 Objects
 * @author Katrina Siffrinn
 */
public class Car {
    
    //Fields
   private int yearModel = 0;
   private String make = "";
   private int speed = 0;
   
   /**
    * Constructor accepts car's yearModel and make fields,
    * assigns speed field to 0.
    * @param yearModel: car's year model 
    * @param make: make of car
    */
   public Car(int yearModel, String make){
           this.yearModel = yearModel;
           this.make = make;
           this.speed = 0; 
           
    }
   
   //Accessors return values to fields
      public int getYearModel()
        {return this.yearModel;}
      
      public String getMake()
        {return this.make;}
      
      public int getSpeed()
        {return this.speed;}
      
   //Increases speed of car by 5 each time it is called.
      public void accelerate(){
          this.speed +=5;
      }
      
   //Decreases speed of car by 5 each time it is called. 
       public void brake(){
           this.speed -=5;
       }   
          
}  //End of Class
 

