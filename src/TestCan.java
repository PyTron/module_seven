import java.util.Scanner;
public class TestCan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Can Height: ");
        Double canHeight = input.nextDouble();
        System.out.print("Can Radius: ");
        Double canRadius = input.nextDouble();
        Can myCan = new Can(canHeight, canRadius);
        String checkMe = "";
        Boolean inLoop= true;
        while(inLoop){
        System.out.println("Enter volume to get the volume, area to get the area, or exit to exit.");
        System.out.print("ENTER: ");
        checkMe = input.next();
        checkMe.toLowerCase();

        if(checkMe.equals("volume"))
            System.out.println(myCan.getVolume());
        else if(checkMe.equals("area"))
            System.out.println(myCan.getSurfaceArea());
        else if(checkMe.equals("exit"))
            System.exit(0);
        else{
            System.out.println("You Entered an invalid option...");
        }
    }
    }
}
