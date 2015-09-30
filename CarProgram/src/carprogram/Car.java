/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carprogram;

/**
 *
 * @author Zachary
 */
public class Car {
    private String make= "Ford";
    private int speed = 0;
    private int yearModel = 2000;
    
    /**
     * This is for holding the cars year model from string and int
     * @param n 
     * @param model 
     */
    public Car (String n, int model){
        this.make = n;
        this.yearModel = model;
        
    }
    /**
     * returns the value to get yearModel of car. (returning value to caller
     * method.
     * @return 
     */
    public int getYearModel (){
        return this.yearModel;
    }
    
    /**
     * returns the value make of car after using the get function. 
     * @return 
     */
    public String getmake(){
        return this.make;
    }
    
    /**
     * returns the value of speed after using the get function
     * @return 
     */
    
    public int getspeed(){
        return speed;
    }
    
    /** 
     * to apply the speed part of this program, use void because this
     * doesn't return anything to the computer
     */
    public void accelerate(){
        if (speed !=90){
            speed = speed +5;
        }
    }
    
    /**
     * to apply the brake part of this program, use the void because this doesn't
     * return anything to the computer. 
     * 
     */
    public void brake(){
        if(speed != 0){
            speed = speed -5;
        }
    }
    }

