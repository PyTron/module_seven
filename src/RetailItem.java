/*
RetailItem Class Write a class named RetailItem that holds data about an item in a retail store. 
The class should have the following fields:

description. The description field references a String object that holds a brief description of the item.
units OnHand. The unitsOnHand field is an int variable that holds the number of units currently in inventory.
price. The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, 
and accessor methods that return the values in these fields. Once you have written the class, write a separate program that
 creates three RetailItem objects and stores the following data in them:
*/
public class RetailItem{
    private String description;
    private int unitsOnHand;
    private Double price;
    public RetailItem(String description, int unitsOnHand, Double price){
       this.description = description;
       this.unitsOnHand = unitsOnHand;
       this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public int getUnits(){
        return unitsOnHand;
    }
    public Double getPrice(){
        return price;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setUnits(int unitsOnHand){
        this.unitsOnHand=unitsOnHand;
    }
    public void setPrice(Double price){
        this.price=price;
    }
}