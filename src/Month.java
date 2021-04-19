/*
Month Class Write a class named Month. The class should have an int field named monthNumber that holds the number of the month. For example, January would be 1, February would be 2, and so forth. In addition, provide the following methods:

A no-arg constructor that sets the monthNumber field to 1.
A constructor that accepts the number of the month as an argument. It should set the monthNumber field to the value passed as the argument. If a value less than 1 or greater than 12 is passed, the constructor should set monthNumber to 1.
A constructor that accepts the name of the month, such as “January” or “February” as an argument. It should set the monthNumber field to the correct corresponding value.
A setMonthNumber method that accepts an int argument, which is assigned to the monthNumber field. If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1.
A getMonthNumber method that returns the value in the monthNumber field.
A getMonthName method that returns the name of the month. For example, if the monthNumber field contains 1, then this method should return “January”.
A toString method that returns the same value as the getMonthName method.
An equals method that accepts a Month object as an argument. If the argument object holds the same data as the calling object, this method should return true. Otherwise, it should return false.
A greaterThan method that accepts a Month object as an argument. If the calling object’s monthNumber field is greater than the argument’s monthNumber field, this method should return true. Otherwise, it should return false.
A lessThan method that accepts a Month object as an argument. If the calling object’s monthNumber field is less than the argument’s monthNumber field, this method should return true. Otherwise, it should return false.
*/
public class Month{
    private int monthNumber;
    private String monthArray[] = new String[]{"january","february","march","april","may","june","july","august","september","october","november","december"};
    public Month(){
        monthNumber=1;
    }
    public Month(int a){
        if(a>12 || a<0)
            monthNumber=1;
        else
            monthNumber = a;
    }
    public Month(String a){
        a = a.toLowerCase();
        Boolean found = false;
        for(int i=0;i<monthArray.length;i++){
            if(monthArray[i].equals(a)){
                monthNumber = (i+1);
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.println("Invalid Input");
        }
    }
    public int getMonthNumber(){
        return monthNumber;
    }
    public void setMonthNumber(int a){
        if(a>12 || a<0)
            monthNumber=1;
        else
            monthNumber = a;
        
    }
    public String getMonthName(){
        return monthArray[(monthNumber-1)];
    }
    public String toString(){
        return monthArray[(monthNumber-1)];
    }
    public Boolean equals(Month a){
        if(a.getMonthNumber()==monthNumber)
            return true;
        else
            return false;
    }
    public Boolean greaterThan(Month a){
        if(a.getMonthNumber()<monthNumber)
            return true;
        else
            return false;
    }
    public Boolean lessThan(Month a){
        if(a.getMonthNumber()>monthNumber)
            return true;
        else
            return false;
    }
}