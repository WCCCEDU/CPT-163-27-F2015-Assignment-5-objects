
package car1;

/**
 *Assignment 5, Car Class
 * @author mkavic
 */
public class Car1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a CarSetup object and assign its address to the car variable.
        CarSetup car = new CarSetup(1950, "Ford", 0);
        
        //Declare a variable for counting in the loops
        int count;
       
        //Loop calls the accelerate method 5 times and diplays the current speed
        //of the car each time the method is called.
        for (count = 1; count <= 5; count ++)
        {
        car.getaccelerate();
        car.setSpeed(car.getaccelerate());
        System.out.println("The current speed of your " + car.getYearModel()+" "
                + car.getMake() + " is " + car.getSpeed());
       }
        //Loop calls the brake method 5 times and diplays the current speed
        //of the car each time the method is called.
         for (count = 1; count <= 5; count ++)
        {
        car.getbrake();
        car.setSpeed(car.getbrake());
        
        System.out.println("The current speed of your " + car.getYearModel()+" "
                + car.getMake() + " is " + car.getSpeed());
       }
     
  }
    
}
