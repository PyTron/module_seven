/*
Implement a class Address. An address has a house number, a street, an optional apartment number, 
a city, a state, and a postal code. Supply two constructors: one with an apartment number and one
 without. Supply a print method that prints the address with the street on one line and the city, 
 state, and postal code on the next line. Supply a method public boolean comesBefore (Address other)
  that tests whether this address comes before another when the addresses are compared by postal
   code.7
*/
public class Address{
    private int houseNumber;
    private String street;
    private String city;
    private int apartmentNum;
    private String state;
    private int postalCode;
    public Address(int houseNumber, String street, String city, String state, int postalCode){
    this.houseNumber = houseNumber;
    this.street = street;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;    
    }
    public Address(int houseNumber, int apartmentNum, String street, String city, String state, int postalCode){
        this.houseNumber = houseNumber;
        this.apartmentNum=apartmentNum;
        this.street = street;
        this.state = state;
        this.postalCode = postalCode;    
    }
    public Boolean comesBefore(Address a){
        if (a.getPostalCode()>apartmentNum)
        return true;
        else{
        return false;
        }
    }
    public int getPostalCode(){
        return postalCode;
    }
    public String toString(){
        if(apartmentNum==0){
            return ("House Number: " + houseNumber + " Street: " + street + "\n" +
            "City: "+ city + " State: " + state + " Postal Code: " +  postalCode);    
        }
        else{
        return ("House Number: " + houseNumber + " Apartment Number: " + apartmentNum + " Street: " + street + "\n" +
        "City: "+ city + " State: " + state + " Postal Code: " +  postalCode);    
        }
    }
}