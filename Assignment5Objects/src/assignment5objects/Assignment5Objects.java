
package assignment5objects;

/**
 *
 * @author afrom_000
 */
public class Assignment5Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car celica = new Car(1992, "Toyota Celica");
        print("Your vehicle is a " + celica.getModelYear()+ " "
        + celica.getMakeAndModel());
        print("\ncurrent speed: " + celica.getSpeed());
        print("\nbegin acceleration test");
        
        for(int x = 1; x <= 5; x++){
            celica.accelerate();
            print("accelerating...");
            print("current speed is: " + celica.getSpeed());
        }
        
        print("\nbegin braking test");
        print("current speed is: " + celica.getSpeed());
        
        for(int x =1; x<= 5; x++){
            celica.brake();
            print("braking...");
            print("current speed is: " + celica.getSpeed());
        }
        
        print("tests successful. Car now stopped");
        
                
    }
    
    
    /**
     * outputs text to screen
     * @param message the text to be displayed
     */
    public static void print(String message){
        System.out.println(message);
    }
    
}
