/*
On a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets are as follows: 
Pocket 0 is green. For pockets 1 through 10, the odd numbered pockets are red and the even numbered 
pockets are black. For pockets 11 through 18, the odd numbered pockets are black and the even numbered 
pockets are red. For pockets 19 through 28, the odd numbered pockets are red and the even numbered
 pockets are black. For pockets 29 through 36, the odd numbered pockets are black and the even numbered
  pockets are red. Write a class named RoulettePocket. The class’s constructor should accept a pocket
   number. The class should have a method named getPocketColor that returns the pocket’s color, as a 
   string. Demonstrate the class in a program that asks the user to enter a pocket number, and displays
   Whether the pocket is green, red, or black. The program should display an error message if the user
    enters a number that is outside the range of 0 through 36.
*/
public class RoulettePocket{
private String pocketColor;
private int pocketNumber;
    public RoulettePocket(int a){
        pocketNumber = a;
        pocketColor = "";
    }
    public String getPocketColor(){
        int a = pocketNumber;
        if(a>0&&a<11){
            if(a%2==0)
            pocketColor = "black";
            else
            pocketColor = "red";
        }
        else if(a>10&&a<19){
            if(a%2==0)
            pocketColor = "red";
            else
            pocketColor = "black";
        }
        else if(a>18&&a<29){
            if(a%2==0)
            pocketColor = "black";
            else
            pocketColor = "red";
        }
        else if(a>28&&a<37){
            if( a%2==0)
            pocketColor = "red";
            else
            pocketColor = "black";
        }
        else{
            System.out.println("That number is not on the wheel...");
        }
            return pocketColor;
    }
}