import java.io.IOException;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your vehicles MPG");
        Car car1 = new Car(input.nextDouble());
        Boolean driving = true;
        while(driving){
            System.out.println("Let's add gas, how much gas to add?");
            car1.addGas(input.nextInt());
            System.out.println("Let's drive, how many miles should we travel?");
            car1.drive(input.nextInt());
            System.out.println("You have: " + car1.getGasLevel() + " gallons left in the tank");
            System.out.println("Keep driving? y or n?");
            if(input.next().charAt(0)=='n')
                driving=false;            
        }
    }
}
