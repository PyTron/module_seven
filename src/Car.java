/*
Implement a class Car with the following properties. A car has a certain fuel efficiency (measured in miles/gallon)
 and a certain amount of fuel in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. 
 Supply a method drive that simulates driving the car for a cartain distance, reducing the fuel level in the gas tank, 
 and methods getGasLevel, to return the current fuel level and addGas, to tank up. Sample usage:

Car myHybrid = new Car(50); //50 miles per gallon

myHybrid.addGas(20); // Tank 20 gallons

myHybrid.drive(100); // Drive 100 miles

System.out.println(myHybrid>.getGasLevel()); // Print fuel remaining.
*/
public class Car {
    private Double totalFuel;
    private Double mPG;
    public Car(Double a){
        mPG = a;
        totalFuel=0.0;
    }
    public void addGas(int a){
        totalFuel = totalFuel + a;
    }
    public Double drive(int a){
        Double testFuel = totalFuel - (a / mPG);
        if(testFuel>0){
        totalFuel = totalFuel - (a / mPG);
        return totalFuel;
        }
        else{
            System.out.println("You don't have enough gas for that trip...");
        return totalFuel;
        }
    }
    public Double getGasLevel(){
        return totalFuel;
    }
}
