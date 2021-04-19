import java.io.IOException;
import java.util.Scanner;
public class MonthTest {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name");
        Month month1 = new Month(input.next());
        System.out.println("Enter a month number");
        Month month2 = new Month(input.nextInt());
        System.out.print("The months are equal: ");
        System.out.print(month2.equals(month1)+  "\n");
        System.out.print("The first month you entered comes before the second: ");
        System.out.print(month1.lessThan(month2)+  "\n");
        System.out.print("The first month you entered comes after the second: ");
        System.out.print(month1.greaterThan(month2)+  "\n");       

    }
}
