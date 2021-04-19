import java.util.Scanner;
public class AddressTest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String in = "";
        Boolean inLoop = true;
        Boolean acceptable=false;
        Address address[] = new Address[0];
        while(inLoop){
            System.out.println("enter 'add' to add an address, enter 'test' to test, enter 'exit' to exit...");
            in = input.next();
            in = in.toLowerCase();
            if((in.equals("add") || in.equals("test") || in.equals("print")))
                acceptable = true;
            else if(in.equals("exit")){
                System.out.println("GOODBYE");
                System.exit(0);
            }
            else{
                acceptable = false;
                System.out.println("You Entered an Invalid Option...");
            }
            while(acceptable){
                if(in.equals("add")){
                    System.out.println("How many Addresses to add?");
                    int numAdd = input.nextInt();
                    int oG = address.length;
                        Address tempArray[] = new Address[address.length+numAdd];
                    for(int k=0;k<address.length;k++){
                            tempArray[k]= address[k];
                    }
                        address = tempArray;
                    for(int i=0;i<numAdd;i++){
                    System.out.println("Address # " + (oG-i+1));
                    address[oG+i] = addAddress();
                    }
                    acceptable=false;
                    }
                else if(in.equals("print")){
                    System.out.println("What Addresse do you want to print?");
                    System.out.print("Address: ");
                    int printMe = input.nextInt()-1;
                    if ((printMe > address.length || printMe < 0)){
                        System.out.print("Those Don't Exist...");
                        acceptable=false;
                    }
                    else{
                        System.out.println(address[printMe].toString());
                        acceptable=false;
                    }
                }
                else{
                    System.out.println("What Addresses do you want to test?");
                    System.out.print("Address 1: ");
                    int compareOne = input.nextInt() - 1;
                    System.out.print("Address 2: ");
                    int compareTwo = input.nextInt() - 1;
                    if(address.length==0){
                        System.out.print("Those Don't Exist...");
                        acceptable=false;
                    }
                    else if ((compareOne >= address.length || compareOne < 0) || (compareTwo >= address.length || compareTwo<0)){
                    System.out.print("Those Don't Exist...");
                    acceptable=false;
                    }
                    else{
                        if(address[compareOne].getPostalCode()>address[compareTwo].getPostalCode()){
                            System.out.println("Address " + (compareOne+1) + ": Postal Code:" + address[compareOne].getPostalCode() + " comes after... \nAddress: " + (compareTwo+1) + " Postal Code: " + address[compareTwo].getPostalCode());
                            acceptable=false;
                        }
                        else{
                            System.out.println("Address " + (compareTwo+1) + ": Postal Code:" + address[compareTwo].getPostalCode() + " comes after... \nAddress: " + (compareOne+1) + " Postal Code: " + address[compareOne].getPostalCode());
                            acceptable=false;
                        }
                    }
                }
            }
        }   
}
    public static Address addAddress(){
        Scanner input = new Scanner(System.in);
        int apartmentNum=0;
        System.out.print("House Number: ");
        int houseNumber = input.nextInt();
        System.out.print("Would you like to add an apartment number? (enter yes or no)");
        
        if (input.next().equals("yes")){
        System.out.print("Apartment Number: ");
        apartmentNum = input.nextInt();
        }
        System.out.print("Street: ");
        String street = input.next();
        System.out.print("City: ");
        String city = input.next();
        System.out.print("State: ");
        String state = input.next();
        System.out.print("Postal Code: ");
        int postalCode = input.nextInt();
        if (apartmentNum==0){
        Address newAddress = new Address(houseNumber, street, city, state, postalCode);
        return newAddress;
        }
        else{
        Address newAddress = new Address(houseNumber, apartmentNum, street, city, state, postalCode);
        return newAddress;
        }
    }
}