/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5car;

/**
 * A vehicle that has a model year, a company that makes it, and an initial
 * speed.
 * @author Zachary Z Ordo
 */
public class Car {
    private int yearModel, speed;
    private String make;
    
    public Car(int yearModel, String make){ // Overloaded constructor for a car.
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    public int getYearModel(){ // Read-only object, gets the yearModel.
        return this.yearModel;
    }
    
    public String getMake(){ // Read-only object, gets the make.
        return this.make;
    }
    
    public int getSpeed(){ // Read-only object, gets the speed.
        return this.speed;
    }
    
    /**
     * Increases the current speed by 5.
     */
    public void accelerate(){
        this.speed += 5;
    }
    
    /**
     * Decreases the current speed by 5.
     */
    public void decelerate(){
        this.speed -= 5;
    }
}
