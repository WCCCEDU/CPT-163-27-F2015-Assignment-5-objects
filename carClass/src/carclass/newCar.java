/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carclass;

/**
 *
 * @author Jacob
 */
public class newCar {
    
    private int carYear;
    private String carMake;
    private double carSpeed;
    
    public newCar(int carYear, String carMake){
        this.carYear = carYear;
        this.carMake = carMake;
        this.carSpeed = 0;
    }
    
    public void setSpeed(double carSpeed){
        this.carSpeed = carSpeed;
    }
    
    public int getCarYear(){
        return this.carYear;
    }
    
    public String getCarMake(){
        return this.carMake;
    }
    
    public double getCarSpeed(){
        return this.carSpeed;
    }
    
    public double accelerate(){
        return (this.carSpeed + 5);
    }
    
    public double brake(){
        return (this.carSpeed - 5);
    }
}
