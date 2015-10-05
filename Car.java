/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.pkg2;


import java.util.Scanner;

/**
 *
 * @author Home pc
 */
class Car {
    private String make;
    private int yearModel;
    private int speed = 0;
    Scanner keyboard;
   
    
    
    public Car(String make, int yearModel, int year){
        this.keyboard = new Scanner(System.in);
        this.make = make;
        this.yearModel = yearModel;
        this.speed = 0;
    }
    
    /**
     *  Get feild value for make.
     * @return 
     */
    public String getMake(){
        return this.make;
    }
    /**
     * Get the feild value for model.
     * @return 
     */
    public int getYearModel(){
        return this.yearModel;
    }
    /** 
     * Gets the feild value for speed.
     * @return 
     */
    public int getSpeed(){
        return this.speed;
    }
    public void setMake(){
        this.getMake();
        
    }   
    public void setYearModel(){
        this.getYearModel();
    }
    
    public int setSpeed(){
        this.Accelerate();
        this.Decelerate();
        return this.getSpeed();
    }
    public int Accelerate(){
        speed = speed + 5;
        return this.speed;
    }
    public int Decelerate(){
        speed = speed - 5;
        return this.speed;
    }
     public void carProgram() {
       int i = 0;
       setMake();
       setYearModel();
       for(i = 0; i < 6; i ++){
           Accelerate();
           getSpeed();
          
       }
       for(i = 0; i < 6; i --){
           Decelerate();
           getSpeed();
           
       }
       
       print(getMake()+ getYearModel() + getSpeed());
    }
    
  
    public static void print(String msg){
            System.out.println(msg);
    }

  
    
    
}

