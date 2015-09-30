/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5objects;

/**
 * a class that shows a cars model year, the company and model of the car as 
 * well as the cars speed
 * @author Scott Boettger
 */
public class Car {
    private int modelYear, speed;
    private String makeModel;
    
    public Car(int year, String makeModel){//constructo for car
        this.modelYear = year;
        this.makeModel = makeModel;
        this.speed = 0;
    }
    
    public int getModelYear(){//gets the cars model year
        return this.modelYear;
    }
    
    public String getMakeAndModel(){//gets cars make and model
        return this.makeModel;
    }
    
    public int getSpeed(){//gets cars current speed
        return this.speed;
    }
    
    /**
     * increases the cars speed by 5
     */
    public void accelerate(){
        this.speed += 5;
    }
    
    /**
     * decreases cars speed by 5
     */
    public void brake(){
        this.speed -= 5;
    }
    
}
