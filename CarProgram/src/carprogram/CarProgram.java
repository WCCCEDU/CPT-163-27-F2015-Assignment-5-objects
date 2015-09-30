
package carprogram;

/**
 *
 * @author Zachary
 */
public class CarProgram {


    public static void main(String[] args) {
        Car car1 = new Car ("Chevy", 2000);
        for (int i =1; i <=5; i++){
            car1.accelerate();
            System.out.println("Current speed is: " + car1.getspeed());
            
        }
        for (int j =1; j <=5; j++){
            car1.brake();
            System.out.println("Current speed is: " + car1.getspeed());
        }
    }
    
}

