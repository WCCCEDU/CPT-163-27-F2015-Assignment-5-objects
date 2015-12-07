package assignment5car;

/**
 *
 * @author Zachary Ordo
 */
public class Assignment5Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car(2012, "Honda"); //Create my car object.
        
        println("This car is a " + myCar.getYearModel() + " " + myCar.getMake());
        println("\nStarting speed is " + myCar.getSpeed() + " mph.\n");
        
        for(int x = 1; x <= 5; x++){
            myCar.accelerate();
            println("Current speed: " + myCar.getSpeed() + " mph.");
        }
        
        println("\nBegin deceleration...");
        
        for(int x = 1; x <= 5; x++){
            myCar.decelerate();
            println("Current speed: " + myCar.getSpeed() + " mph.");
        }
        
        println("\nCar has come to a stop.");
    }
    
    public static void println(String message){
        System.out.println(message);
    }
}
