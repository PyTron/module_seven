import java.util.Scanner;
import java.util.Random;
public class Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-36 to check the color on the wheel, or enter 0 to spin the wheel.");
        int a = input.nextInt();
        if(a==0){
        Random ran = new Random();
        int ran1 = ran.nextInt(35);
        a = ran1;
        System.out.println("You generated the number "+a);
        }
        RoulettePocket roulette =  new RoulettePocket(a);
        System.out.println(roulette.getPocketColor());
    }
}
