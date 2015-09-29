/*
 * To change this license header, choose License Headers in Project 
 * Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication1;

/**
 * Car class
 *
 * @author Rhonda Marshall
 * Sept 27, 2015
 */
public class Car {
    private int yearModel;      // The year model of the car
    private String make;        // The make of the car
    private int speed;          // The speed of the care
    
    /**
     * Constructor for the Car class
     * @param   yearModel   The yearModel of the car
     * @param   make        The make of the car
     */
    
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    
    /**
     *  The mutator method setYearModel stores a value in the Car object's
     * yearModel field
     * @param   yearModel
     */
     
    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }
    
    /** 
     * The mutator method setMake stores a value in the Car object's make field
     * @param make
     */
    
    public void setMake(String make) {
        this.make = make;
    }
    
    /**
     * The mutator method setSpeed sets the Car object's speed field to speed
     * @param   speed
     */
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    /**
     * The accessor method getYearModel returns the value of the Car object's 
     * yearModel field
     * @return  The value in the yearModel field
     */
    
    public int getYearModel(){
        return this.yearModel;
    }
    
    /**
     * The accessor method getMake returns the value in the Car object's
     * make field
     * @return  Then value in the make field
     */
    
    public String getMake()
    {
        return this.make;
    }
    
    /**
     * The accessor method getSpeed returns the value in the Car object's 
     * speed field
     * @return  The value in the speed field
     */
    
    public int getSpeed(){
        return this.speed;
    }
    
    /**
     * The mutator method accelerate adds 5 to the Car object's speed field
     */
    
    public void accelerate(){
        this.speed += 5;
    }
    
    /**
     * The mutator method brake subtracts 5 from the Car object's speed field
     */
    
    public void brake(){
        this.speed -= 5;
    }
}
