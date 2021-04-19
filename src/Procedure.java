/*

Group 1 and 2 do Patient class
Write a class named Patient that has fields for the following data: 
First name, middle name, and last name Address, city, state, and ZIP code Phone number Name and phone number of emergency contact The Patient class should have a constructor, accessor, and mutator that accept an argument for each field.



Group 3 and 4 do Procedure Class
Next, write a class named Procedure that represents a medical procedure that has been performed on a patient. The Procedure class should have fields for the following data: 

-Name of the procedure 

-Date of the procedure 

-Name of the practitioner who performed the procedure 

-Charges for the procedure 


The Procedure class should have a constructor, accessor, and mutator that accept an argument for each field. 

Next, write a program that creates an instance of the Patient class, initialized with sample data. Then, create three instances of the Procedure class, initialized with the following data:



Add toString method()

*/

public class Procedure {
    //instance variables
    private String nameOfProcedure;
    private String dateOfProcedure;
    private String nameOfPractioner;
    private int charge; //Bill for medicial procedure

    //Constructors
    public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPractioner, int charge)
    {
        this.nameOfProcedure = nameOfProcedure;
        this.dateOfProcedure = dateOfProcedure;
        this.nameOfPractioner = nameOfPractioner;
        this.charge = charge;
    }

    //accesors
    public String getNameOfProcedure()
    {
        return nameOfProcedure;
    }

    public String getDateOfProcedure()
    {
        return dateOfProcedure;
    }

    public String getNameOfPractioner()
    {
        return nameOfPractioner;
    }

    public int getCharge()
    {
        return charge;
    }

    
    //mutators
    public void setNameOfProcedure(String nameOfProcedure)
    {
        this.nameOfProcedure = nameOfProcedure;
    }
    
    public void setDateOfProcedure(String dateOfProcedure)
    {
        this.dateOfProcedure=dateOfProcedure;
    }
    
    public void setNameOfPractioner(String nameOfPractioner)
    {
        this.nameOfPractioner=nameOfPractioner;
    }
    
    public void setCharge(int charge)
    {
        this.charge=charge;
    }
    

    //toString() method
    public String toString()
    {
        return "Name of Practioner: " + nameOfPractioner + "\nName of Procedure: " + nameOfProcedure + "\nDate of Procedure: " + dateOfProcedure + "\nCharge due: " + charge;
    }
    
    
}// end of class Procedure
