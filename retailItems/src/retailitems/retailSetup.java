package retailitems;

/**
 *
 * @author Jacob
 */
public class retailSetup {
  //fields
  private String itemName = "";
  private int itemAmt = 0;
  private double itemPrice = 0;
  
  //constructors
  public retailSetup(String itemName, int itemAmt, double itemPrice){
    this.itemName = itemName;
    this.itemAmt = itemAmt;
    this.itemPrice = itemPrice;
  }
  
  //Mutators
  public void setItemName(String itemName){
    this.itemName = itemName;
  }  
  public void setItemAmt(int itemAmt){
    this.itemAmt = itemAmt;
  }
  public void setItemName(Double itemPrice){
    this.itemPrice = itemPrice;
  }
  
  //Accessors
  public String getItemName(){return itemName;}
  public int getItemAmt(){return itemAmt;}
  public Double getItemPrice(){return itemPrice;}
  
  //end
}