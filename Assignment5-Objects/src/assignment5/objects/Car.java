/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.objects;

/**
 * A Car that has a year model and make. Can accelerate or brake to adjust
 * speed.
 * @author Tehold
 */
public class Car {
    /**
     * Declared fields for the Car class. Speed, yearModel, and make.
     */
    private int speed;
    private int yearModel;
    private String make;
    /**
     *  Constructor which takes the make and year model of the car.
     *  It also sets the speed of the car to 0.
     * @param make Make of the car
     * @param year Year model of the car
     */
    public Car(String make, int year){
        this.yearModel = year;
        this.make = make;
        this.speed = 0;
    }
    /**
     * Accessor used to get the current speed of the car
     * @return Speed of the Car
     */
    public int getSpeed() {
        return this.speed;
    }
   /**
    * Accessor used to get the current year model of the car
    * @return Year Model of the Car
    */
    public int getYearModel() {
        return this.yearModel;
    }
   /**
    * Accessor used to get the make of the Car
    * @return  Make of the Car
    */
    public String getMake() {
        return this.make;
    }
   
    /**
     * Accelerate Method use to increase speed by 5
     */
    public void accelerate() {
        this.speed += 5;
    }
    /**
     * Brake Method used to lower speed by 5
     */
    public void brake() {
        this.speed -= 5;
    }
            
}
