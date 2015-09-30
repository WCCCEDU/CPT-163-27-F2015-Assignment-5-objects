package assignment5;

/**
 *
 * @author Adam
 */
public class Assignment5 {

    /**
     * This program is the assignments 2 and 4 from chapter 6 from the 
     * Java book for class CPT163.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Car class challenge
        Car newCar = new Car();
        newCar.setYearModel(1955);
        newCar.setMake("Ford");
        for(int i=0; i<5; i++){
            newCar.accelerate(5);
            print("Speed: " + newCar.getSpeed());
        }
        for(int i=0; i<5; i++){
            newCar.brake(5);
            print("Speed: " + newCar.getSpeed());
        }
        // RetailItem challenge
        String itemDescription;
        int itemUnits;
        double itemPrice;
        String item2Description;
        int item2Units;
        double item2Price;
        String item3Description;
        int item3Units;
        double item3Price;
        
        //set item 1
        RetailItem item = new RetailItem();
        item.setDescription("Jacket");
        itemDescription = item.getDescription();
        item.setUnits(12);
        itemUnits = item.getUnits();
        item.setPrice(59.95);
        itemPrice = item.getPrice();
        
        //set item 2
        RetailItem item2 = new RetailItem();
        item2.setDescription("Designer Jeans");
        item2Description = item2.getDescription();
        item2.setUnits(40);
        item2Units = item2.getUnits();
        item2.setPrice(34.95);
        item2Price = item2.getPrice();
        
        //set item 3
        RetailItem item3 = new RetailItem();
        item3.setDescription("Jacket");
        item3Description = item3.getDescription();
        item3.setUnits(12);
        item3Units = item3.getUnits();
        item3.setPrice(59.95);
        item3Price = item3.getPrice();
        
        //display item results
        print("Item #1  "+ itemDescription +"           "+ itemUnits + " "+itemPrice);
        print("Item #2  "+ item2Description +"   "+ item2Units + " "+item2Price);
        print("Item #3  "+ item3Description +"           "+ item3Units + " "+item3Price);
    }
    
    /**
     * Shortcut for println
     * @param message needed printed
     */
    public static void print(String message){
        System.out.println(message);
    }
    
    /**
     * Car Class
     */
    public static class Car{
        private int yearModel;
        private String make;
        private int speed = 0;
        
        public void setYearModel(int yearModelIn){
            yearModel = yearModelIn;
        }
        
        public void setMake(String makeIn){
            make = makeIn;
        }
        
        public void accelerate(int gas){
            speed += gas;
        }
        
        public void brake(int gas){
            speed -= gas;
        }
        
        public int getYearModel(){
            return yearModel;
        }
        
        public String getMake(){
            return make;
        }
        
        public int getSpeed(){
            return speed;
        }
    }
    
    /**
     * RetailItem class
     */
    public static class RetailItem{
        String description;
        int unitsOnHand;
        double price;
        
        public void setDescription(String descriptionIn){
            description = descriptionIn;
        }
        
        public void setUnits(int units){
            unitsOnHand = units;
        }
        
        public void setPrice(double priceIn){
            price = priceIn;
        }
        
        public String getDescription(){
            return description;
        }
        
        public int getUnits(){
            return unitsOnHand;
        }
        
        public double getPrice(){
            return price;
        }
    }
}
