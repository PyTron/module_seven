import java.util.Scanner;
public class Retail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String in = "";
        String name;
        int units;
        Double price;
        Boolean acceptable=false;
        RetailItem retail[] = new RetailItem[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter Item Name: ");
            name = input.next();
            System.out.print("Enter Units on Hand: ");
            units = input.nextInt();
            System.out.print("Enter a Price: ");
            price = input.nextDouble();
            retail[i]= new RetailItem(name, units, price);
        }
        Boolean inLoop=true;
        while(inLoop){
            Boolean isFound = false;
            System.out.println("Enter an item to check: ");
            name = input.next();
            name = name.toLowerCase();
            for(int i=0;i<3;i++){
                if(name.equals(retail[i].getDescription().toLowerCase())){
                    System.out.println("Item: " + retail[i].getDescription() + "\nUnits on Hand: " + retail[i].getUnits() + "\nPrice: " + retail[i].getUnits());
                    isFound=true;
                }
                if(isFound==false && i==2){
                    System.out.println("That Item was not found in the system.");
                }
            }
            System.out.println("Check another item? yes or no?");
            String cont = input.next();
            cont=cont.toLowerCase();
            if(cont.equals("no"))
                inLoop=false;
        }
    }
}
